#!/usr/bin/perl

my @expect;

if ($ARGV[0] eq '--from-script') {
	#@expect = grep { length } map { s/.* mvn .*/expect_mvn/s or s/.* \| tee evosuite.*/expect_evo/s or $_ = ''; $_ } `cat generate_all_tests.sh`;
	# It turns out that EvoSuite seems to disregard any part of a classname after a '$', meaning that among other things it's probably rerun a bunch of analyses unnecessarily
	#@expect = grep { length } map { s/.* mvn .*/expect_mvn/s or s/.* -class (\S+) .* \| tee evosuite.*/expect_evo $1/s or $_ = ''; $_ } `cat generate_all_tests.sh`;
	@expect = grep { length } map { s/.* mvn .*/expect_mvn/s or s/.* -class ([A-Za-z0-9_\.]+).* \| tee evosuite.*/expect_evo $1/s or $_ = ''; $_ } `cat generate_all_tests.sh`;
} elsif ($ARGV[0] eq '--from-logs') {
	@expect = grep { length } map { s/^\[INFO\] Scanning for projects\.\.\.\s*$/expect_mvn/s or s/^\* Going to generate test cases for class: (.*)\n/expect_evo $1/ or $_ = ''; $_ } `cat scraped_full_log_for_evosuite_test_generation.txt`;
} else {
	die "Must specify which.";
}

print map { "$_\n" } @expect;
