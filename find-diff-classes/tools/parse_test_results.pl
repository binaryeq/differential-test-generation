#!/usr/bin/perl

use strict;
use warnings;

my $shouldIncludeFailedTestNumbers = 0;

sub slurp($) {
	return scalar(`cat '$_[0]'`);	# Yuck
}

# Try to remove known noise lines sometimes emitted by EvoSuite instrumentation using tight regexes
sub removeCruft($) {
    #11:46:18.669 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader -- Seeing class for first time: org.apache.commons.logging.impl.Slf4jLogFactory_ESTest
    #11:46:18.673 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader -- Instrumenting class 'org.apache.commons.logging.impl.Slf4jLogFactory_ESTest'.
    #11:46:18.691 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader -- Seeing class for first time: org.apache.commons.logging.impl.Slf4jLogFactory_ESTest_scaffolding
    #11:46:18.691 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader -- Instrumenting class 'org.apache.commons.logging.impl.Slf4jLogFactory_ESTest_scaffolding'.
    #11:46:18.694 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader -- Keeping class: org.apache.commons.logging.impl.Slf4jLogFactory_ESTest_scaffolding
    #11:46:18.694 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader -- Keeping class: org.apache.commons.logging.impl.Slf4jLogFactory_ESTest
    #11:46:18.778 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager -- Adding privileged thread: "Reference Handler"
    #11:46:18.778 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager -- Adding privileged thread: "Finalizer"
    #11:46:18.778 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager -- Adding privileged thread: "Signal Dispatcher"
    #11:46:18.778 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager -- Adding privileged thread: "Java2D Disposer"
    #11:46:18.778 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager -- Adding privileged thread: "AWT-XAWT"
    #11:46:18.778 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager -- Adding privileged thread: "process reaper"
    #11:46:18.778 [main] DEBUG org.evosuite.runtime.sandbox.MSecurityManager -- Adding privileged thread: "main"
    #11:46:18.792 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader -- Seeing class for first time: org.apache.commons.logging.impl.Slf4jLogFactory$Slf4jLocationAwareLog
    #11:46:18.792 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader -- Instrumenting class 'org.apache.commons.logging.impl.Slf4jLogFactory$Slf4jLocationAwareLog'.
    #11:46:18.796 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter -- Adding mock interface to class org/apache/commons/logging/impl/Slf4jLogFactory$Slf4jLocationAwareLog
    #11:46:18.846 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter -- Found static initializer in class org/apache/commons/logging/impl/Slf4jLogFactory$Slf4jLocationAwareLog
    #11:46:18.847 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader -- Keeping class: org.apache.commons.logging.impl.Slf4jLogFactory$Slf4jLocationAwareLog
    #11:46:18.848 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader -- Seeing class for first time: org.apache.commons.logging.impl.Slf4jLogFactory$Slf4jLog
    #11:46:18.848 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader -- Instrumenting class 'org.apache.commons.logging.impl.Slf4jLogFactory$Slf4jLog'.
    #11:46:18.848 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter -- Adding mock interface to class org/apache/commons/logging/impl/Slf4jLogFactory$Slf4jLog
    #11:46:18.849 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter -- Creating brand-new static initializer in class org/apache/commons/logging/impl/Slf4jLogFactory$Slf4jLog
    #11:46:18.849 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader -- Keeping class: org.apache.commons.logging.impl.Slf4jLogFactory$Slf4jLog
    #11:46:18.849 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader -- Seeing class for first time: org.apache.commons.logging.impl.Slf4jLogFactory
    #11:46:18.849 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader -- Instrumenting class 'org.apache.commons.logging.impl.Slf4jLogFactory'.
    #11:46:18.850 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter -- Adding mock interface to class org/apache/commons/logging/impl/Slf4jLogFactory
    #11:46:18.852 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter -- Found static initializer in class org/apache/commons/logging/impl/Slf4jLogFactory
    #11:46:18.852 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader -- Keeping class: org.apache.commons.logging.impl.Slf4jLogFactory
    #.11:46:18.861 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader -- Seeing class for first time: org.apache.commons.logging.impl.Jdk14Logger
    #11:46:18.862 [main] INFO org.evosuite.runtime.instrumentation.EvoClassLoader -- Instrumenting class 'org.apache.commons.logging.impl.Jdk14Logger'.
    #11:46:18.862 [main] INFO org.evosuite.runtime.instrumentation.MethodCallReplacementClassAdapter -- Adding mock interface to class org/apache/commons/logging/impl/Jdk14Logger
    #11:46:18.864 [main] INFO org.evosuite.runtime.instrumentation.CreateClassResetClassAdapter -- Found static initializer in class org/apache/commons/logging/impl/Jdk14Logger
    local ($_) = @_;
    my $nRemoved = 0;
    while (s/\d\d:\d\d:\d\d\.\d\d\d \[main\] (?:INFO|DEBUG) org\.evosuite\.runtime\.\S+ -- (?:Seeing class for first time: \S+[^\.\n]|Instrumenting class '\S+[^\.\n]'|Keeping class: \S+[^\.\n]|Adding privileged thread: "[^\"]*"|Adding mock interface to class \S+[^\.\n]|Found static initializer in class \S+[^\.\n]|Creating brand-new static initializer in class \S+[^\.\n]|Adding bytecode for initializing field \S+[^\.\n]|Defined package \(3\): package \S+[^\.\n], -?\d+)\n?//) {
        ++$nRemoved;
    }

    print STDERR "Removed $nRemoved cruft lines.\n" if $nRemoved;
    return $_;
}

# Use tight regexes to parse JUnit4 default runner (org.junit.runner.JUnitCore) output with confidence
sub process($) {
    my ($fn) = @_;
    local ($_) = slurp($fn);

    $_ = removeCruft($_);

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
