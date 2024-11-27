#!/usr/bin/perl

use strict;
use warnings;

my $FILTERCMD = 'tools/filter_diff.pl';
my $prevInFName;

print <<THE_END;
#!/bin/bash
set -evo pipefail    # Echo input and exit at first error
THE_END

while (<>) {
	my $inFName = $ARGV;
	my $baseDir = $inFName;
	$baseDir =~ s/\.tsv$// or die;
	my $outFName = "$baseDir/classes.filtered";
	my $unfilteredClassesOutFName = "$baseDir/classes.unfiltered";

	if (!defined($prevInFName) || $prevInFName ne $inFName) {
		print "# $inFName\n";

		my $mkdirCmd = "mkdir -p '$baseDir'";
		print $mkdirCmd, "\n";

		my $cleanCmd = "rm -f '$outFName' '$unfilteredClassesOutFName'";
		print $cleanCmd, "\n";
	}
	$prevInFName = $inFName;

	chomp;
	my ($classSlashed, $jimpleFName1, $jimpleFName2) = split /\t/;
	my $class = $classSlashed;
	$class =~ s/\.class$// or die;
	$class =~ tr|/|.|;
	my $basename = "$baseDir/$class";

	my $diffCmd = "diff '$jimpleFName1' '$jimpleFName2' > '$basename.diff' || true";		# "|| true" to ignore diff's nonzero exit code under set -e
	print $diffCmd, "\n";

	my $filterCmd = "$FILTERCMD < '$basename.diff' > '$basename.diff.filtered'";
	print $filterCmd, "\n";

	my $ifCmd = "if [ -s '$basename.diff.filtered' ]; then echo '$classSlashed' >> '$outFName'; fi";
	print $ifCmd, "\n";

	my $ifUnfilteredCmd = "if [ -s '$basename.diff' ]; then echo '$classSlashed' >> '$unfilteredClassesOutFName'; fi";
	print $ifUnfilteredCmd, "\n";
}
