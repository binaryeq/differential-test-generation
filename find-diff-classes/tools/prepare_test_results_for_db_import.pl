#!/usr/bin/perl

use warnings;
use strict;

my $mode;
$mode = shift if @ARGV && $ARGV[0] eq '--failed-test-methods';
$mode = shift if @ARGV && $ARGV[0] eq '--test-classes';
die "Must specify --failed-test-methods or --test-classes" if !defined $mode;

sub segmentPath($) {
    my ($provider, $groupId, $artifactId, $version, $testClass) = $_[0] =~ m|^run/([^/]+)/(.+)/([^/]+)/([^/]+)/([^/]+)\.out$| or die "Could not parse '$_[0]'";
    return ($provider, $groupId, $artifactId, $version, $testClass);
}

while (<>) {
    chomp;
    my @F = split /\t/;
    if ($mode eq '--failed-test-methods') {
        # Generate a row for each failed test with FK fields
        if (@F > 5) {
            for (my $i = 5; $i < @F; ++$i) {
                print join("\t", segmentPath($F[0]), $F[$i]), "\n";
            }
        }
    } else {
        # --test-classes. Just truncate off the failed test columns
        print join("\t", segmentPath($F[0]), @F[1 .. 4]), "\n";
    }
}
