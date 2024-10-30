#!/usr/bin/perl

use strict;
use warnings;

# An ugly hack to guess the path to a version of the java or javac executable at a given JDK level
sub findJava($$) {
    my ($cmd, $jdk) = @_;
    my @possiblePaths = grep { -x } map { m| $cmd (.*java-$jdk\b.*/$cmd)$| } `update-java-alternatives -v --list`;
    if (@possiblePaths == 1) {
        return $possiblePaths[0];
    }

    die "Could not find a path to a JDK $jdk version of the java executable (" . scalar(@possiblePaths) . " possibilities).";
}

my $ROOT = "$ENV{HOME}/code";       # Change as necessary
my $BASE = "$ROOT/craw-redhat-oss/wget/crawl";
my $CLASSPATH = "$ROOT/tooling/target/bineq-1.0.0-jar-with-dependencies.jar";
my $JAVA8 = findJava("java", 8);     # EvoSuite prefers JDK 8, sometimes works with JDK 11
my $JAVAC8 = findJava("javac", 8);
my $JAVA17 = findJava("java", 17);   # Code in the tooling repo was compiled with JDK 17
my $COMPAREJARS = "$JAVA17 -cp $CLASSPATH io.github.bineq.cli.CompareJars";
my $EVOSUITEJAR = "$ROOT/regression-test-generation/evosuite/evosuite-1.2.0.jar";

my $keepRunFilter = sub { 1 };      # By default, keep everything

sub gavToPath($$$) {
	$_[0] =~ s|\.|/|g;
	return join("/", @_);
}

sub gavToJarPath($$$) {
	$_[0] =~ s|\.|/|g;
	return gavToPath($_[0], $_[1], $_[2]) . "/" . "$_[1]-$_[2].jar";
}

#HACK: Only works if there's a unique subpatch-level suffix...
sub getDir($$$$) {
	my ($provider, $g, $a, $v) = @_;
	my $path = "$BASE/$provider/$g/$a/$v";
	print STDERR "Trying path=<$path>\n";		#DEBUG
	#my @possibilities = glob "$path*/*.jar";
	my @possibilities = grep { m|/([^/]+)/([^/]+)/\1-\2\.jar$| } glob "$path*/*.jar";	# Exclude *-sources.jar, *-tests.jar, etc.

	# Prefer aspectjrt/1.9.21 to aspectjrt/1.9.21.1 or aspectjrt/1.9.21.2
	my @preferred = grep { m|/\Q$a\E/\Q$v\E/\Q$a\E-\Q$v\E\.jar$| } @possibilities;
	#print STDERR "possibilities=<" . join(", ", @possibilities) . ">.\n";	#DEBUG
	#print STDERR "preferred=<" . join(", ", @preferred) . ">.\n";	#DEBUG
	if (@preferred == 1) {
		return $preferred[0];
	}

	if (@possibilities == 1) {
		return $possibilities[0];
	} else {
		return undef;
	}
}

my %providerPathsFor = (
	mvnc => ["repo1.maven.org/maven2"],
	gaoss => ["google-aoss"],
	rh1 => ["maven.repository.redhat.com/ga"],
	obfs => ["bfs-dataset/maven-artifacts", "maven.oracle.com/public"]
);

sub providerPath($$$$) {
	my ($provider, $g, $a, $v) = @_;
	#return "$BASE/$providerPathFor{$_[0]}";
	foreach (map { getDir($_, $g, $a, $v) } @{$providerPathsFor{$provider}}) {
		return $_ if defined;
	}
	die "Could not find matching dir for provider $_[0] for $g:$a:$v!";
}

sub evosuiteGenDir($$$$) {
	my ($p, $g, $a, $v) = @_;
	#my $providerPath = providerPath($p, $g, $a, $v);
	return join("/", "testgen", $p, $g =~ s|\.|/|gr, $a, $v);
}

sub evosuiteCompileDir($$$$) {
	my ($p, $g, $a, $v) = @_;
	return join("/", "compile", $p, $g =~ s|\.|/|gr, $a, $v);
}

sub evosuiteRunDir($$$$) {
	my ($p, $g, $a, $v) = @_;
	return join("/", '$RUNDIR', $p, $g =~ s|\.|/|gr, $a, $v);       # NOTE: Includes an env var that we intend the shell to expand, so don't single-quote
}

sub generateComparisons() {
	while (<>) {
		chomp;
		my ($g, $a, $v, $p1, $p2) = split /\t/ or die;
		my $jarPath = gavToJarPath($g, $a, $v);
		#my $jarPath1 = providerPath($p1) . "/" . $jarPath;
		#my $jarPath2 = providerPath($p2) . "/" . $jarPath;
		#my $jarPath1 = providerPath($p1, $jarPath);
		#my $jarPath2 = providerPath($p2, $jarPath);
		my $jarPath1 = providerPath($p1, $g, $a, $v);
		my $jarPath2 = providerPath($p2, $g, $a, $v);
		my $outDir = "results/$jarPath.compare";
		my $mkdirCmd = "mkdir -p $outDir";

		my $cmd = "$mkdirCmd && $COMPAREJARS -eq jnorm2,javap -j1 $jarPath1 -j2 $jarPath2 -out $outDir/$p1.vs.$p2.json";
		print $cmd, "\n";
	}
}

sub unique(@) {
    my %seen = map { ($_, 1) } @_;
    return sort keys %seen;
}

sub convertClassNameToDotted($$) {
    my ($compiledClass, $testCompilePath) = @_;
    $compiledClass =~ s|^\Q$testCompilePath/\E|| or die;
    $compiledClass =~ s|\.class$|| or die;
    $compiledClass =~ tr|/|.|;
    return $compiledClass;
}

sub generateOrRunTests($$$;$) {
	my ($shouldGenerateTests, $shouldRunTests, $shouldCompileTests, $targetOtherProvider) = @_;
#	print STDERR "targetOtherProvider=<$targetOtherProvider>\n";   #DEBUG
    die if (($shouldCompileTests || $shouldRunTests) && !defined($targetOtherProvider));

    print <<THE_END;
#!/bin/bash
set -v
THE_END

    if ($shouldRunTests) {
        print "echo \"Will write test results under RUNDIR=\${RUNDIR:=run}\"   # Default to 'run' if not overridden\n";
    }

	my (@classesFiltered) = `find results -name 'classes.filtered'`;
	chomp @classesFiltered;
	#print scalar @classesFiltered;

	my %providersForJar;
	my %jarPathHasMvnc;
	my %interestingClasses;
	foreach my $fn (@classesFiltered) {
		my ($jarPath, $p1, $p2) = $fn =~ m|^results/(.*)\.compare/(\w+)\.vs\.(\w+)/classes.filtered$| or die;
		#my ($g, $a, $v) = $jarPath =~ m|^(.*)/([^/]+)/([^/]+)/[^/]+\.jar$| or die;
		#$g =~ tr|/|.|;
		push @{$providersForJar{$jarPath}}, [$p1, $p2];
		if ($p1 eq 'mvnc' || $p2 eq 'mvnc') {
			$jarPathHasMvnc{$jarPath} = 1;
			my @classes = `cat $fn`;	# Ugh
			chomp @classes;
			push @{$interestingClasses{$jarPath}}, @classes;
		}
	}

    # Only keep unique top-level class names, since EvoSuite can't handle class names with '$' in them
	foreach my $jarPath (keys %interestingClasses) {
	    $interestingClasses{$jarPath} = [ unique(map { s/\$[^\.]*//; $_ } @{$interestingClasses{$jarPath}}) ];
	}

	foreach my $jarPath (sort keys %providersForJar) {
		my ($g, $a, $v) = $jarPath =~ m|^(.*)/([^/]+)/([^/]+)/[^/]+\.jar$| or die;
		#$g =~ tr|/|.|;
		if ($jarPathHasMvnc{$jarPath}) {
            # Just build tests on Maven Central for now
            my $p = 'mvnc';
            my $testGenPath = evosuiteGenDir($p, $g, $a, $v);
            my $genPomPath = providerPath($p, $g, $a, $v) =~ s/\.jar$/.pom/r;
            my $genBasePath = $genPomPath =~ s|/[^/]+$||r;

			if ($shouldGenerateTests) {
				#print join("\t", $jarPath, $p1, $p2), "\n";		#DEBUG
				#print join("\t", providerPath($p, $g, $a, $v), $p1, $p2), "\n";		#DEBUG
				my @classes = @{$interestingClasses{$jarPath}};
				print "# Generate tests on the " . scalar(@classes) . " classes in the $p version of $jarPath\n";		#TODO

				# Copy all dependencies just once for the project
				my $mvnCopyDepsCmd = "( mkdir -p '$testGenPath' && cd '$testGenPath' && mvn -f $genPomPath dependency:copy-dependencies && ln -s $genBasePath/target t";	# Symlink to make classpath shorter
				print $mvnCopyDepsCmd, "\n";
				my $classOwnCP = providerPath($p, $g, $a, $v);
				#my $projectCP = "$classOwnCP:\$(echo target/dependency/*|perl -lpe 's/ /:/g')";
				my $projectCP = "$classOwnCP:\$(echo t/dependency/*|perl -lpe 's/ /:/g')";

				# Generate tests for each class
				foreach my $class (@classes) {
					my $dottedClass = $class =~ s|/|.|gr;
					$dottedClass =~ s/\.class$// or die;
					my $evosuiteGenTestsCmd = "time $JAVA8 -jar $EVOSUITEJAR -class '$dottedClass' -projectCP $projectCP 2>&1 | tee 'evosuite.$dottedClass.log'";
					print $evosuiteGenTestsCmd, "\n";
				}

				print ")\n";		# Drops us back to original subdir
			}

            if ($shouldCompileTests) {
                chomp(my $pwd = `pwd`);

				foreach my $providerPair (@{$providersForJar{$jarPath}}) {
#                    print STDERR "providerPair=<" . join(", ", @{$providerPair}) . ">. otherProvider=<$targetOtherProvider>, shouldBeUndefined=<$shouldBeUndefined>\n";     #DEBUG
					if (grep { $_ eq $targetOtherProvider } @{$providerPair}) {
                        # Find all actually generated test classes (there may be none). This step requires that we have
                        # already run the shell script (generated using --generate-tests) that generates these classes.
                        print STDERR "# Looking for successfully generated test classes for $jarPath for $targetOtherProvider\n";     #DEBUG
                        my @generatedClasses = `find '$testGenPath' -name '*_ESTest*.java'`;
                        chomp @generatedClasses;

                        if (@generatedClasses) {
                            print "# Compile " . scalar(@generatedClasses) . " generated test classes for $jarPath for $targetOtherProvider\n";
                            my $testCompilePath = evosuiteCompileDir($targetOtherProvider, $g, $a, $v);
                            my $pomPath = providerPath($targetOtherProvider, $g, $a, $v) =~ s/\.jar$/.pom/r;
                            my $basePath = $pomPath =~ s|/[^/]+$||r;
                            my $mvnCopyDepsCmd = "( mkdir -p '$testCompilePath' && cd '$testCompilePath' && mvn -f $pomPath dependency:copy-dependencies && ln -s $basePath/target t";	# Symlink to make classpath shorter
                            print $mvnCopyDepsCmd, "\n";

                            my $classOwnCP = providerPath($targetOtherProvider, $g, $a, $v);
                            my $projectCP = "$classOwnCP:\$(echo t/dependency/*|perl -lpe 's/ /:/g')";
                            my $classPath = join(":",
                                "$projectCP",
                                "$ROOT/regression-test-generation/evosuite/evosuite-standalone-runtime-1.2.0.jar",
                                "$testGenPath/evosuite-tests",
                                "$ENV{HOME}/.m2/repository/junit/junit/4.13.2/junit-4.13.2.jar",
                                "$ENV{HOME}/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar"
                            );
                            my %dirsWithClasses = map { $_ => 1 } map { m|(.*)/| } @generatedClasses;
                            my @condensedClasses = map { "$pwd/$_/*_ESTest*.java" } sort keys %dirsWithClasses;
                            my $javacCmd = "CLASSPATH=$classPath $JAVAC8 -d . " . join(" ", @condensedClasses);
                            print $javacCmd, "\n";
                            print ")\n";
                        }
					}
				}
            }

			if ($shouldRunTests) {
				#TODO: Do per-provider-pair work
                chomp(my $pwd = `pwd`);

                # If any of the provider pairs for this jar involve the provider that we are interested in:
                if (grep { $_ eq $targetOtherProvider } map { @$_ } @{$providersForJar{$jarPath}}) {
#                    print STDERR "providerPair=<" . join(", ", @{$providerPair}) . ">. otherProvider=<$targetOtherProvider>, shouldBeUndefined=<$shouldBeUndefined>\n";     #DEBUG
                    # Find all actually generated test classes (there may be none). This step requires that we have
                    # already run the shell script (generated using --generate-tests) that generates these classes.
                    print STDERR "# Looking for successfully compiled test classes for $jarPath for $targetOtherProvider\n";     #DEBUG
                    my $testCompilePath = evosuiteCompileDir($targetOtherProvider, $g, $a, $v);
                    my $testRunPath = evosuiteRunDir($targetOtherProvider, $g, $a, $v);
#                        my @compiledClasses = `find '$testGenPath' -name '*_ESTest.class'`;
                    my $findCompiledClassesCmd = "find '$testCompilePath' -name '*_ESTest.class'";
                    print STDERR "findCompiledClassesCmd=<$findCompiledClassesCmd>\n";     #DEBUG
                    my @compiledClasses = `$findCompiledClassesCmd`;
                    chomp @compiledClasses;

#                        my $pomPath = providerPath($targetOtherProvider, $g, $a, $v) =~ s/\.jar$/.pom/r;
#                        my $basePath = $pomPath =~ s|/[^/]+$||r;
                    if (!@compiledClasses) {
                        print "# No compiled classes found for $testCompilePath so won't create $testRunPath.\n";
                    }

                    my $createdDirYet = 0;

                    foreach my $compiledClass (@compiledClasses) {
                        my $classOwnCP = providerPath($targetOtherProvider, $g, $a, $v);
                        my $projectCP = "$classOwnCP:\$(echo t/dependency/*|perl -lpe 's/ /:/g')";
                        my $classPath = join(":",
                            "$projectCP",
                            "$ROOT/regression-test-generation/evosuite/evosuite-standalone-runtime-1.2.0.jar",
#                                "$testGenPath/evosuite-tests",
                            ".",        # We're running from the compilation directory
                            "$ENV{HOME}/.m2/repository/junit/junit/4.13.2/junit-4.13.2.jar",
                            "$ENV{HOME}/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar"
                        );
#                            my %dirsWithClasses = map { $_ => 1 } map { m|(.*)/| } @generatedClasses;
#                            my @condensedClasses = map { "$pwd/$_/*_ESTest*.java" } sort keys %dirsWithClasses;
#                            my $javacCmd = "CLASSPATH=$classPath $JAVAC8 -d . " . join(" ", @condensedClasses);
                        my $dottedClassName = convertClassNameToDotted($compiledClass, $testCompilePath);
                        my $outBasename = "$pwd/$testRunPath/$dottedClassName";

                        if ($keepRunFilter->("$outBasename.out")) {
                            if (!$createdDirYet) {
                                my $mkdirCmd = "( mkdir -p \"$testRunPath\" && cd '$testCompilePath'";	# Note we *don't* change to the dir we create this time! Symlink should already be there. Double-quote $testRunPath to let shell expand $RUNDIR.
                                print $mkdirCmd, "\n";
                                $createdDirYet = 1;
                            }

                            print "# Run compiled test class $compiledClass for $jarPath for $targetOtherProvider\n";
                            my $javaCmd = "CLASSPATH=\"$classPath\" time $JAVA8 org.junit.runner.JUnitCore \"$dottedClassName\" > \"$outBasename.out\" 2> \"$outBasename.err\"";
                            print $javaCmd, "\n";
                        }
                    }

                    print ")\n" if @compiledClasses && $createdDirYet;
				}
			}
		} else {
			warn "Ignoring $jarPath, which doesn't have any provider pair involving mvnc.\n";
		}
	}
}

# Sanity-check paths
die "Is \$ROOT set correctly?" if !-d $BASE || !-e $CLASSPATH;
die "Expected EvoSuite at $EVOSUITEJAR" if !-e $EVOSUITEJAR;

# Main program
if (@ARGV && $ARGV[0] eq "--keep-run-filter") {
    shift;
    my $filterFunc = shift;
    $keepRunFilter = sub { return eval($filterFunc); };     # It should check the filename in $_[0]
}

my $mode = shift;
if (!defined $mode) {
	die "Must specify a mode.";
} elsif ($mode eq '--generate-comparisons') {
	generateComparisons();
} elsif ($mode eq '--generate-tests') {
	generateOrRunTests(1, 0, 0);
} elsif ($mode eq '--compile-tests') {
    die unless @ARGV == 1;
	generateOrRunTests(0, 0, 1, shift);
} elsif ($mode eq '--run-tests') {
    die unless @ARGV == 1;
	generateOrRunTests(0, 1, 0, shift);
} elsif ($mode eq '--generate-and-run-tests') {
	generateOrRunTests(1, 1, 0);
} else {
	die "Unrecognised option '$mode'";
}
