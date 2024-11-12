#!/usr/bin/perl

use strict;
use warnings;

# Pipe the results of `git diff -U0` into this to extract the lines that were added.
# Deliberately dies if any lines were changed or removed.

while (<>) {
	last if /^\@\@/;
}

while (<>) {
	if (s/^\+//) {
		print;
	} elsif (/^\@\@/) {
		# Ignore
	} else {
		die "Unrecognised line '$_' on line $."
	}
}
