#!/usr/bin/perl

use strict;
use warnings;

my $ORIGROOT = '/home/wtwhite/code/regression-test-generation-PRISTINE/find-diff-classes';

die "Must specify root path" if !@ARGV;

my $root = shift;
print "#!/bin/bash\nset -veo pipefail\n";
foreach (`find $root -name '*_ESTest.out.tsv'`) {
    chomp;
    my $origPath = "$ORIGROOT/$_";
    my $cmd = "diff <(cut -f1-4,6-999 < $origPath) <(cut -f1-4,6-999 $_) > $_.diff";
    print $cmd, "\n";
}
