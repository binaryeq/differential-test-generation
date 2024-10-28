#!/usr/bin/perl

use strict;
use warnings;

my $shouldIncludeFailedTestNumbers = 0;

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
        my ($dots, $time) = ($1, $2);
        if (s/\AThere (?:was|were) (\d+) failures?:\n//) {
            while (s/\A\d+\) test(\d+)\(.*\)\n([^\t\n][^\n]*\n(?:\t[^\n]*\n)*)//) {
                push @failures, [ $1, $2 ];
            }

            @failures = sort { $a <=> $b } @failures;

            if (s/\A\nFAILURES!!!\nTests run: (\d+),\s*Failures: (\d+)\n\n\z//) {
                die "JUnit listed " . scalar(@failures) . " failures but then reported that $2 failed on the last line." if $2 != @failures;    # Sanity check
                $result = { "tests" => $1, "successes" => ($1 - $2), "failures" => [ @failures ], "time" => $time };
            } else {
                die "Could not parse: <$_>";
            }
        } elsif (s/\A\nOK \((\d+) tests?\)\n\n\z//) {
            $result = { "tests" => $1, "successes" => $1, "failures" => [], "time" => $time };
        } else {
            die "Could not parse: <$_>";
        }

        # Sanity checks
        my $nTestsFromDots = length($dots =~ s/[^\.]//gr);
        die "JUnit listed $nTestsFromDots tests according to the dots, but then reported that there were " . $result->{"tests"} . " tests on the last line." if $nTestsFromDots != $result->{"tests"};

        my $nFailuresFromDots = length($dots =~ s/[^E]//gr);
        die "JUnit listed $nFailuresFromDots failures according to the dots, but then reported that there were " . scalar(@{$result->{"failures"}}) . " failures on the last line." if $nFailuresFromDots != @{$result->{"failures"}};
    } else {
        die "Could not parse: <$_>";
    }

    # TODO: Output the individual failure details somehow, not just their count and their test sequence numbers
    my @columns = ($fn, @{$result}{"tests", "successes"}, scalar(@{$result->{"failures"}}), $result->{"time"});
    push @columns, map { $_->[0] } @{$result->{"failures"}} if $shouldIncludeFailedTestNumbers;
    print join("\t", @columns), "\n";
}

# Main
if (@ARGV && $ARGV[0] eq '--include-failed-test-numbers') {
    $shouldIncludeFailedTestNumbers = 1;
    shift;
}

process($_) foreach @ARGV;
