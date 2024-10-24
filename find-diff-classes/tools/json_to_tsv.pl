#!/usr/bin/perl

use strict;
use warnings;

foreach (@ARGV) {
	chomp;
	my $outFName = $_;
	$outFName =~ s/\.json$/.tsv/ or die;
	my $cmd = q{jq -r '."content-pairwise-comparisons"[0].details."non-equivalent" | .[] | [ .class, .provenance."transformed-class1".cached, .provenance."transformed-class2".cached ] | @tsv'} . " < $_ > $outFName";
	print $cmd, "\n";
}
