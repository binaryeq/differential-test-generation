#!/usr/bin/perl

use strict;
use warnings;

sub slurp($) {
	return scalar(`cat '$_[0]'`);	# Yuck
}

# Use tight regexes to parse JUnit4 default runner (org.junit.runner.JUnitCore) output with confidence
sub process($) {
    my ($fn) = @_;
    local ($_) = slurp($fn);

    my $result;
    my @failures;
    if (s/\AJUnit version 4\.13\.2\n([\.E]*)\nTime: ([^\n]+)\n//) {
        if (s/\AThere were (\d+) failures:\n//) {
            while (s/\A\d+\) (\w+\(.*\))\n([^\t\n][^\n]*\n(?:\t[^\n]*\n)*)//) {
                push @failures, [ $1, $2 ];
            }

            if (s/\A\nFAILURES!!!\nTests run: (\d+),\s*Failures: (\d+)\n\n\z//) {
                die "JUnit listed " . scalar(@failures) . " failures but then reported that $2 failed on the last line." if $2 != @failures;    # Sanity check
                $result = { "tests" => $1, "successes" => ($1 - $2), "failures" => [ @failures ] };
            } else {
                die "Could not parse: <$_>";
            }

        } elsif (s/\A\nOK \((\d+) tests?\)\n\n\z//) {
            $result = { "tests" => $1, "successes" => $1, "failures" => [] };
        } else {
            die "Could not parse: <$_>";
        }
    }

    # TODO: Output the individual failures somehow, not just their count
    print join("\t", $fn, @{$result}{"tests", "successes"}, scalar(@{$result->{"failures"}})), "\n";
}

# Main
process($_) foreach @ARGV;
