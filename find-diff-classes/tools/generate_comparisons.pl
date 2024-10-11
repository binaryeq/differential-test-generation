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

my %providerPathFor = (
	mvnc => "repo1.maven.org/maven2",
	gaoss => "google-aoss",
	rh1 => "maven.repository.redhat.com/ga",
	obfs => "bfs-dataset/maven-artifacts"		# Though actually this could also be maven.oracle.com/public
);

sub providerPath($) {
	return "$BASE/$providerPathFor{$_[0]}";
}

while (<>) {
	chomp;
	my ($g, $a, $v, $p1, $p2) = split /\t/ or die;
	my $jarPath = gavToJarPath($g, $a, $v);
	my $jarPath1 = providerPath($p1) . "/" . $jarPath;
	my $jarPath2 = providerPath($p2) . "/" . $jarPath;
	my $outDir = "results/$jarPath.compare";
	my $mkdirCmd = "mkdir -p $outDir";

	my $cmd = "$mkdirCmd && $COMPAREJARS -eq jnorm2,javap -j1 $jarPath1 -j2 $jarPath2 -out $outDir/$p1.vs.$p2.json";
	print $cmd, "\n";
}
