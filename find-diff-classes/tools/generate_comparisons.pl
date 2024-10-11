#!/bin/perl

use strict;
use warnings;

my $BASE = "/home/wtwhite/code/craw-redhat-oss/wget/crawl";
my $CLASSPATH = "/home/wtwhite/code/tooling/target/bineq-1.0.0-jar-with-dependencies.jar";
my $COMPAREJARS = "java -cp $CLASSPATH io.github.bineq.cli.CompareJars";

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
