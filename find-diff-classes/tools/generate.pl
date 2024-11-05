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
my $JDKVERSION = "8";
my $JAVA8 = findJava("java", 8);     # EvoSuite prefers JDK 8, sometimes works with JDK 11
my $JAVAC8 = findJava("javac", 8);
my $JAVA17 = findJava("java", 17);   # Code in the tooling repo was compiled with JDK 17
my $COMPAREJARS = "$JAVA17 -cp $CLASSPATH io.github.bineq.cli.CompareJars";
my $EVOSUITEJAR = "$ROOT/regression-test-generation/evosuite/evosuite-1.2.0.jar";
my $COMPARISONSDIR = "comparisons"; # Formerly "results"
my $evosuiteRuntimeJarPath = "$ROOT/regression-test-generation/evosuite/evosuite-standalone-runtime-1.2.0.jar";
my $junit4JarPath = "$ENV{HOME}/.m2/repository/junit/junit/4.13.2/junit-4.13.2.jar";
my $hamcrestJarPath = "$ENV{HOME}/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar";

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
	return join("/", '${RUNDIR}', $p, $g =~ s|\.|/|gr, $a, $v);       # NOTE: Includes an env var that we intend the shell to expand, so don't single-quote. Also works as a Maven property!
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
		my $outDir = "$COMPARISONSDIR/$jarPath.compare";
		my $mkdirCmd = "mkdir -p '$outDir'";

		my $cmd = "$mkdirCmd && $COMPAREJARS -eq jnorm2,javap -j1 '$jarPath1' -j2 '$jarPath2' -out '$outDir/$p1.vs.$p2.json'";
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

sub writeFile($$) {
    my ($fn, $contents) = @_;
    open my $F, ">", $fn or die "Could not open $fn: $!";
    print $F $contents;
    close $F;
    print STDERR "writeFile(): Wrote " . length($contents) . " bytes to $fn.\n";    #DEBUG
}

sub writePom($$@) {
    my ($pomFn, $origArtifactId, $evoSuiteTestSourcePath, $outputDirectory, $properties, @depJarPaths) = @_;
    print STDERR "writePom(pomFn=<$pomFn>, evoSuiteTestSourcePath=<$evoSuiteTestSourcePath>, depJarPaths=<" . join(", ", @depJarPaths) . ">.\n";    #DEBUG

    my $genDeps = join("\n", map { my $bn = $_; $bn =~ tr|-A-Za-z0-9|_|c; <<THE_END } @depJarPaths);
    <dependency>
      <groupId>bogus-groupId-for-dep</groupId>
      <artifactId>$bn</artifactId>
      <version>42</version>
      <scope>system</scope>
      <systemPath>$_</systemPath>
    </dependency>
THE_END

    my $genProperties = join("\n", map { "    <$_>${$properties}{$_}</$_>" } sort keys %$properties);

    my $origArtifactIdBn = $origArtifactId;
    $origArtifactIdBn =~ tr|-A-Za-z0-9|_|c;

    writeFile($pomFn, <<THE_END);
<project xmlns="http://maven.apache.org/POM/4.0.0" xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance"
  xsi:schemaLocation="http://maven.apache.org/POM/4.0.0 http://maven.apache.org/xsd/maven-4.0.0.xsd">
  <modelVersion>4.0.0</modelVersion>

  <groupId>regression-test-generation.binaryeq.github.io</groupId>
  <artifactId>evosuite-tests-for-$origArtifactIdBn</artifactId>
  <version>1.0-SNAPSHOT</version>

  <properties>
    <project.build.sourceEncoding>UTF-8</project.build.sourceEncoding>
    <maven.compiler.source>$JDKVERSION</maven.compiler.source>
    <maven.compiler.target>$JDKVERSION</maven.compiler.target>
$genProperties
    <evosuiteRuntimeJarPath>$evosuiteRuntimeJarPath</evosuiteRuntimeJarPath>
  </properties>

  <dependencies>
$genDeps
    <dependency>
      <groupId>bogus-groupId-for-evosuite-jar</groupId>
      <artifactId>evosuite</artifactId>
      <version>1.2.0</version>
      <scope>system</scope>
      <systemPath>\${evosuiteRuntimeJarPath}</systemPath>
    </dependency>

    <dependency>
      <groupId>junit</groupId>
      <artifactId>junit</artifactId>
      <version>4.13.2</version>
      <scope>test</scope>
    </dependency>

    <dependency>
      <groupId>org.hamcrest</groupId>
      <artifactId>hamcrest-core</artifactId>
      <version>1.3</version>
      <scope>test</scope>
    </dependency>
  </dependencies>

  <build>
    <plugins>
      <plugin>
        <!-- Add path to EvoSuite-generated test sources (instead of copying them to src/test/java) -->
        <groupId>org.codehaus.mojo</groupId>
        <artifactId>build-helper-maven-plugin</artifactId>
        <version>3.6.0</version>
        <executions>
          <execution>
            <id>add-test-source</id>
            <phase>generate-test-sources</phase>
            <goals>
              <goal>add-test-source</goal>
            </goals>
            <configuration>
              <sources>
                <source>$evoSuiteTestSourcePath</source>
              </sources>
            </configuration>
          </execution>
        </executions>
      </plugin>

      <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-surefire-plugin</artifactId>
        <version>3.2.5</version>
        <configuration>
          <!-- Specify EvoSuite jars here to guarantee they appear at the end of the classpath -->
          <additionalClasspathElements>
          </additionalClasspathElements>
          <outputDirectory>$outputDirectory</outputDirectory>
        </configuration>
      </plugin>
    </plugins>
  </build>
</project>
THE_END
}

sub generateOrRunTests($) {
	my ($opts) = @_;        # Should be a hashref
#	print STDERR "targetOtherProvider=<$opts->{targetOtherProvider}>\n";   #DEBUG
    die if (($opts->{shouldCompileTests} || $opts->{shouldRunTests}) && !defined($opts->{targetOtherProvider}));
    die "To run Maven tests you must specify compilation at the same time" if ($opts->{shouldRunTests} && $opts->{viaMvn} && !$opts->{shouldCompileTests});

    print <<THE_END;
#!/bin/bash
set -v
THE_END

    if ($opts->{shouldRunTests}) {
        print "echo \"Will write test results under RUNDIR=\${RUNDIR:=run}\"   # Default to 'run' if not overridden\n";
    }

	my (@classesFiltered) = `find '$COMPARISONSDIR' -name 'classes.filtered'`;
	chomp @classesFiltered;
	#print scalar @classesFiltered;

	my %providersForJar;
	my %jarPathHasMvnc;
	my %interestingClasses;
	foreach my $fn (@classesFiltered) {
		my ($jarPath, $p1, $p2) = $fn =~ m|^\Q$COMPARISONSDIR\E/(.*)\.compare/(\w+)\.vs\.(\w+)/classes.filtered$| or die;
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

			if ($opts->{shouldGenerateTests}) {
				#print join("\t", $jarPath, $p1, $p2), "\n";		#DEBUG
				#print join("\t", providerPath($p, $g, $a, $v), $p1, $p2), "\n";		#DEBUG
				my @classes = @{$interestingClasses{$jarPath}};
				print "# Generate tests on the " . scalar(@classes) . " classes in the $p version of $jarPath\n";		#TODO

				# Copy all dependencies just once for the project
				my $mvnCopyDepsCmd = "( mkdir -p '$testGenPath' && cd '$testGenPath' && mvn -f $genPomPath dependency:copy-dependencies && ln -sT $genBasePath/target t";	# Symlink to make classpath shorter
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

            if ($opts->{shouldCompileTests}) {
                chomp(my $pwd = `pwd`);

                my $evoSuiteTestSourcePath = "$testGenPath/evosuite-tests";
                my $testRunPath = evosuiteRunDir($opts->{targetOtherProvider}, $g, $a, $v);
				foreach my $providerPair (@{$providersForJar{$jarPath}}) {
#                    print STDERR "providerPair=<" . join(", ", @{$providerPair}) . ">. otherProvider=<$opts->{targetOtherProvider}>, shouldBeUndefined=<$opts->{shouldBeUndefined}>\n";     #DEBUG
					if (grep { $_ eq $opts->{targetOtherProvider} } @{$providerPair}) {
                        # Find all actually generated test classes (there may be none). This step requires that we have
                        # already run the shell script (generated using --generate-tests) that generates these classes.
                        print STDERR "# Looking for successfully generated test classes for $jarPath for $opts->{targetOtherProvider}\n";     #DEBUG
                        my @generatedClasses = `find '$testGenPath' -name '*_ESTest*.java'`;
                        chomp @generatedClasses;

                        if (@generatedClasses) {
                            my $testCompilePath = evosuiteCompileDir($opts->{targetOtherProvider}, $g, $a, $v);
                            my $pomPath = providerPath($opts->{targetOtherProvider}, $g, $a, $v) =~ s/\.jar$/.pom/r;
                            my $basePath = $pomPath =~ s|/[^/]+$||r;
                            my $classOwnCP = providerPath($opts->{targetOtherProvider}, $g, $a, $v);

                            print "# Compile " . scalar(@generatedClasses) . " generated test classes for $jarPath for $opts->{targetOtherProvider}\n";
                            my $mvnCopyDepsCmd = "mkdir -p '$testCompilePath' && cd '$testCompilePath' && mvn -f $pomPath dependency:copy-dependencies >&2 && ln -sT $basePath/target t";	# Symlink to make classpath shorter
                            my $gatherDepsCmd = "echo t/dependency/*";

                            if ($opts->{viaMvn}) {
                                # Immediately run this command -- we need to see what deps are there to generate pom.xml
                                my $mvnCopyDepsAndGatherDepsCmd = "$mvnCopyDepsCmd";
                                print STDERR "Immediately running: <$mvnCopyDepsAndGatherDepsCmd>\n";
                                system $mvnCopyDepsAndGatherDepsCmd;

                                my $gatherDepBasenamesCmd = "cd '$testCompilePath/t/dependency' && echo *";     # Exclude the t/dependency/ prefix
                                print STDERR "Immediately running: <$gatherDepBasenamesCmd>\n";
                                my $gatheredDepsStr = `$gatherDepBasenamesCmd`;
                                chomp $gatheredDepsStr;
#                                my @gatheredDeps = split /\s+/, $gatheredDepsStr;
                                my @gatheredDeps = map { "\${depRoot}/$_" } split /\s+/, $gatheredDepsStr;     # Maven requires systemPaths to be absolute, and warns if no variable (property) is used
                                my @deps = ('${classUnderTest}', @gatheredDeps);   # Class-under-test should be first in classpath. Note it's a property name for Maven to expand

                                my $pomFn = "$testCompilePath/pom.xml";
                                writePom($pomFn, "$g-$a-$v", "$pwd/$evoSuiteTestSourcePath", $testRunPath, { classUnderTest => $classOwnCP, depRoot => "$pwd/$testCompilePath/t/dependency" }, @deps);
                                my $mvnPhase = ($opts->{shouldRunTests} ? 'test' : 'test-compile');     # Yuck
                                my $runMvnCmd = "mvn -DRUNDIR=\"\${RUNDIR:-run}\" -f '$pomFn' $mvnPhase";
                                print $runMvnCmd, "\n";
                            } else {
                                print "( ", $mvnCopyDepsCmd, "\n";
                                my $projectCP = "$classOwnCP:\$($gatherDepsCmd | perl -lpe 's/ /:/g')";
                                my $classPath = join(":",
                                    "$projectCP",
                                    $evosuiteRuntimeJarPath,
                                    $evoSuiteTestSourcePath,
                                    $junit4JarPath,
                                    $hamcrestJarPath
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
            }

			if ($opts->{shouldRunTests} && !$opts->{viaMvn}) {      # Running Maven-based tests requires shouldCompileTests to also be specified and is handled earlier
				#TODO: Do per-provider-pair work
                chomp(my $pwd = `pwd`);

                # If any of the provider pairs for this jar involve the provider that we are interested in:
                if (grep { $_ eq $opts->{targetOtherProvider} } map { @$_ } @{$providersForJar{$jarPath}}) {
#                    print STDERR "providerPair=<" . join(", ", @{$providerPair}) . ">. otherProvider=<$opts->{targetOtherProvider}>, shouldBeUndefined=<$opts->{shouldBeUndefined}>\n";     #DEBUG
                    # Find all actually generated test classes (there may be none). This step requires that we have
                    # already run the shell script (generated using --generate-tests) that generates these classes.
                    print STDERR "# Looking for successfully compiled test classes for $jarPath for $opts->{targetOtherProvider}\n";     #DEBUG
                    my $testCompilePath = evosuiteCompileDir($opts->{targetOtherProvider}, $g, $a, $v);
                    my $testRunPath = evosuiteRunDir($opts->{targetOtherProvider}, $g, $a, $v);
#                        my @compiledClasses = `find '$testGenPath' -name '*_ESTest.class'`;
                    my $findCompiledClassesCmd = "find '$testCompilePath' -name '*_ESTest.class'";
                    print STDERR "findCompiledClassesCmd=<$findCompiledClassesCmd>\n";     #DEBUG
                    my @compiledClasses = `$findCompiledClassesCmd`;
                    chomp @compiledClasses;

#                        my $pomPath = providerPath($opts->{targetOtherProvider}, $g, $a, $v) =~ s/\.jar$/.pom/r;
#                        my $basePath = $pomPath =~ s|/[^/]+$||r;
                    if (!@compiledClasses) {
                        print "# No compiled classes found for $testCompilePath so won't create $testRunPath.\n";
                    }

                    my $createdDirYet = 0;

                    my $classOwnCP = providerPath($opts->{targetOtherProvider}, $g, $a, $v);
                    my $projectCP = "$classOwnCP:\$(echo t/dependency/*|perl -lpe 's/ /:/g')";
                    my $classPath = join(":",
                        "$projectCP",
                        $evosuiteRuntimeJarPath,
#                                "$testGenPath/evosuite-tests",
                        ".",        # We're running from the compilation directory
                        $junit4JarPath,
                        $hamcrestJarPath
                    );
#                            my %dirsWithClasses = map { $_ => 1 } map { m|(.*)/| } @generatedClasses;
#                            my @condensedClasses = map { "$pwd/$_/*_ESTest*.java" } sort keys %dirsWithClasses;
#                            my $javacCmd = "CLASSPATH=$classPath $JAVAC8 -d . " . join(" ", @condensedClasses);

                    foreach my $compiledClass (@compiledClasses) {
                        my $dottedClassName = convertClassNameToDotted($compiledClass, $testCompilePath);
                        my $outBasename = "$pwd/$testRunPath/$dottedClassName";

                        if ($keepRunFilter->("$outBasename.out")) {
                            if (!$createdDirYet) {
                                my $mkdirCmd = "( mkdir -p \"$testRunPath\" && cd '$testCompilePath'";	# Note we *don't* change to the dir we create this time! Symlink should already be there. Double-quote $testRunPath to let shell expand $RUNDIR.
                                print $mkdirCmd, "\n";
                                $createdDirYet = 1;
                            }

                            print "# Run compiled test class $compiledClass for $jarPath for $opts->{targetOtherProvider}\n";
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
	generateOrRunTests({ shouldGenerateTests => 1 });
} elsif ($mode eq '--compile-tests') {
    die unless @ARGV == 1;
	generateOrRunTests({ shouldCompileTests => 1, targetOtherProvider => shift });
} elsif ($mode eq '--compile-and-run-tests-mvn') {
    die unless @ARGV == 1;
	generateOrRunTests({ shouldCompileTests => 1, shouldRunTests => 1, targetOtherProvider => shift, viaMvn => 1 });
} elsif ($mode eq '--run-tests') {
    die unless @ARGV == 1;
	generateOrRunTests({ shouldRunTests => 1, targetOtherProvider => shift });
} elsif ($mode eq '--compile-and-run-tests') {
    die unless @ARGV == 1;
	generateOrRunTests({ shouldCompileTests => 1, shouldRunTests => 1, targetOtherProvider => shift });
} else {
	die "Unrecognised option '$mode'";
}
