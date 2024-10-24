#!/usr/bin/perl

use strict;
use warnings;

my $ROOT = "$ENV{HOME}/code";       # Change as necessary
my $BASE = "$ROOT/craw-redhat-oss/wget/crawl";
my $CLASSPATH = "$ROOT/tooling/target/bineq-1.0.0-jar-with-dependencies.jar";
my $COMPAREJARS = "java -cp $CLASSPATH io.github.bineq.cli.CompareJars";
my $EVOSUITEJAR = "$ROOT/regression-test-generation/evosuite/evosuite-1.2.0.jar";

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

sub generateOrRunTests($$) {
	my ($shouldGenerateTests, $shouldRunTests) = @_;

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
			if ($shouldGenerateTests) {
				# Just build tests on Maven Central for now
				my $p = 'mvnc';
				#print join("\t", $jarPath, $p1, $p2), "\n";		#DEBUG
				#print join("\t", providerPath($p, $g, $a, $v), $p1, $p2), "\n";		#DEBUG
				my @classes = @{$interestingClasses{$jarPath}};
				print "# Generate tests on the " . scalar(@classes) . " classes in the $p version of $jarPath\n";		#TODO

				# Copy all dependencies just once for the project
				my $testGenPath = evosuiteGenDir($p, $g, $a, $v);
				my $pomPath = providerPath($p, $g, $a, $v) =~ s/\.jar$/.pom/r;
				my $basePath = $pomPath =~ s|/[^/]+$||r;
				my $mvnCopyDepsCmd = "( mkdir -p '$testGenPath' && cd '$testGenPath' && mvn -f $pomPath dependency:copy-dependencies && ln -s $basePath/target t";	# Symlink to make classpath shorter
				print $mvnCopyDepsCmd, "\n";
				my $classOwnCP = providerPath($p, $g, $a, $v);
				#my $projectCP = "$classOwnCP:\$(echo target/dependency/*|perl -lpe 's/ /:/g')";
				my $projectCP = "$classOwnCP:\$(echo t/dependency/*|perl -lpe 's/ /:/g')";

				# Generate tests for each class
				foreach my $class (@classes) {
					my $dottedClass = $class =~ s|/|.|gr;
					$dottedClass =~ s/\.class$// or die;
					my $evosuiteGenTestsCmd = "time java -jar $EVOSUITEJAR -class '$dottedClass' -projectCP $projectCP 2>&1 | tee 'evosuite.$dottedClass.log'";
					print $evosuiteGenTestsCmd, "\n";
				}

				print ")\n";		# Drops us back to original subdir
			}

			if ($shouldRunTests) {
				#TODO: Do per-provider-pair work
				foreach my $providerPair (@{$providersForJar{$jarPath}}) {
					my ($p1, $p2) = @{$providerPair};
					print "# Compare $p1 to $p2 on $jarPath\n";
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
my $mode = shift;
if (!defined $mode) {
	die "Must specify a mode.";
} elsif ($mode eq '--generate-comparisons') {
	generateComparisons();
} elsif ($mode eq '--generate-tests') {
	generateOrRunTests(1, 0);
} elsif ($mode eq '--run-tests') {
	generateOrRunTests(0, 1);
} elsif ($mode eq '--generate-and-run-tests') {
	generateOrRunTests(1, 1);
} else {
	die "Unrecognised option '$mode'";
}
