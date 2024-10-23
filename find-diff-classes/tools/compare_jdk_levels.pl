#!/usr/bin/perl

use strict;
use warnings;

my $JDK11DIR = 'testgen_ORIG_FROM_JDK11_WITH_BAD_SHELL_QUOTING';
my $JDK8DIR = 'testgen';

sub getRuns($) {
	my ($subDir) = @_;
	my @raw = `cd '$subDir' && find * -name 'evosuite.*.log'`;
	chomp @raw;

	my @results;
	foreach my $path (@raw) {
		my ($dir, $bn) = $path =~ m|^(.*)/evosuite\.([^/]+)\.log$| or die;
		$bn =~ tr|.|/|;
		push @results, "$dir/$bn";
	}
	return sort @results;
}

sub getTests($) {
	my ($subDir) = @_;
	my @raw = `cd '$subDir' && find * -name '*_ESTest.java'`;
	chomp @raw;

	my @results;
	foreach my $path (@raw) {
		my ($dir, $bn) = $path =~ m|^(.*)/evosuite-tests/(.+)_ESTest\.java$| or die "Couldn't parse '$path'";
		push @results, "$dir/$bn";
	}
	return sort @results;
}

sub intersect($$) {
    my %seen = map { ($_ => 1) } @{$_[0]};
    return [ sort grep { exists $seen{$_} } @{$_[1]} ];
}

sub subtract($$) {
    my %seen = map { ($_ => 1) } @{$_[1]};
    return [ sort grep { !exists $seen{$_} } @{$_[0]} ];
}

# Main program
my %runs;
my %tests;

foreach my $subDir ($JDK8DIR, $JDK11DIR) {
#    print "Runs for $subDir:\n";
#    my @runs = getRuns($subDir);
#    print map { "$_\n" } @runs;

#    print "Tests for $subDir:\n";
#    my @tests = getTests($subDir);
#    print map { "$_\n" } @tests;
    $runs{$subDir} = [ getRuns($subDir) ];
    $tests{$subDir} = [ getTests($subDir) ];
    print "$subDir has " . scalar(@{$tests{$subDir}}) . " tests from " . scalar(@{$runs{$subDir}}) . " runs.\n";
}

my $testsWeWant = intersect($tests{$JDK11DIR}, $runs{$JDK8DIR});
my $testsWeGot = $tests{$JDK8DIR};
my $testsWeLost = subtract($testsWeWant, $testsWeGot);

print "We lost " . scalar(@$testsWeLost) . " tests by going to JDK 8:\n";
print map { "$_\n" } @$testsWeLost;
