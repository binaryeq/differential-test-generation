#!/usr/bin/perl

use strict;
use warnings;

my $ROOT = "$ENV{HOME}/code";

print "#!/bin/bash\nset -evo pipefail\n";

while (<>) {
	chomp;
	my $dir = $_;
	$dir =~ s|/[^/]+$|| or die;
	print "mkdir -p '$dir' && cp -a '$ROOT/regression-test-generation-NON-SOURCE-EQUIV/find-diff-classes/$_' '$dir'\n";
}
