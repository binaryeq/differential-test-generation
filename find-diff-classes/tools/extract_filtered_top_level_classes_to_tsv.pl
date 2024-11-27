#!/usr/bin/perl

use strict;
use warnings;

my @gavs = `find comparisons -name 'classes.filtered'`;
chomp @gavs;

foreach my $path (@gavs) {
	my @lines = `cat $path`;
	chomp @lines;
	my $gav = $path;
	$gav =~ s|^comparisons/|| or die;
	$gav =~ s|\.jar\.compare.*/classes\.filtered$|.jar| or die;
	foreach my $class (@lines) {
		$class =~ s|\$[^\.]*||;
		$class =~ s|\.class$|| or die;
		$class =~ tr|/|.|;
		print join("\t", $gav, $class), "\n";
	}
}
