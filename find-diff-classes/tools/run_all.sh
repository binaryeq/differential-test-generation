#!/bin/bash

set -evo pipefail     # Fail fast

# This script assumes that the tooling and craw-redhat-oss git repos are already checked out below $HOME/code.
# If that isn't the case, you'll need to change the definitions of $ROOT in generate.pl and
# find_jnorm2_distinct_gavs.sh in tools/.

# Read the set of GAVs that differ at the jnorm2 level between pairs of non-RedHat providers from the SQLite DB that
# was already prepared by tools in the craw-redhat-oss repo, and write it to jnorm2_distinct_gavs.tsv.
tools/find_jnorm2_distinct_gavs.sh

# Create a shell script to run CompareJars from the tooling repo to find the individual differing classes in each such GAV.
tools/generate.pl --generate-comparisons < jnorm2_distinct_gavs.tsv > compare.sh

# Download jNorm if it's not already present. It's GPLed, but this is OK to do provided we don't publicly distribute this repo.
#TODO: Fix this
[ -e tools/jnorm-jar-with-dependencies.jar ] || curl -L -o tools/jnorm-jar-with-dependencies.jar https://github.com/stschott/jnorm-tool/releases/download/v1.0.0/jnorm-cli-1.0.0.jar

# Run the script. Creates a comparisons/ subdirectory hierarchy with a <provider1>.vs.<provider2>.json file per
# (GAV, provider pair), listing the specific classes that differ in that GAV between those providers.
time bash compare.sh

# Create a shell script to convert the information about different individual classes from JSON to TSV.
#TODO: Move this work inside the compare.sh run in the previous step
tools/json_to_tsv.pl $(find comparisons -name '*.vs.*.json') > convert_json_to_tsv.sh

# Run the script.
bash convert_json_to_tsv.sh

# Create a shell script to filter out all "uninteresting" differences (e.g., invokeinterface <-> invokevirtual).
tools/keep_if_any_diffs_remain.pl $(find comparisons -name '*.vs.*.tsv') > filter_all_diffs.sh

# Run the script.
bash filter_all_diffs.sh

# Just for convenience (the same info is extractable from the generate_all_tests.sh produced by the following step)
tools/extract_filtered_classes_to_tsv.pl | sort -u > filtered_classes.tsv

# Create a shell script to run EvoSuite against the Maven Central version of each class identified in the previous step.
tools/generate.pl --generate-tests > generate_all_tests.sh

# Run the script. Creates a testgen/ subdirectory with a mvnc/ subdirectory inside it.
time bash generate_all_tests.sh

# Create shell scripts to compile and run tests against each provider using Maven.
# Immediately creates pom.xml files and t/ subdirs with dependencies below the compile/ directory.
tools/generate.pl --compile-and-run-tests-mvn obfs > compile_and_run_mvn_tests_for_obfs.sh
tools/generate.pl --compile-and-run-tests-mvn mvnc > compile_and_run_mvn_tests_for_mvnc.sh
tools/generate.pl --compile-and-run-tests-mvn gaoss > compile_and_run_mvn_tests_for_gaoss.sh

# Run the scripts. These produce compiled test classes below compile/<provider>/<gav-path>/target/test-classes/ and Surefire test results below run-mvn/.
time bash compile_and_run_mvn_tests_for_obfs.sh
time bash compile_and_run_mvn_tests_for_mvnc.sh
time bash compile_and_run_mvn_tests_for_gaoss.sh
# Test results can be written to a different location by setting $RUNDIR to an absolute path, e.g.:
# RUNDIR=`pwd`/other/test/results time bash compile_and_run_mvn_tests_for_obfs.sh

# Also compile and then run the tests the old way, using raw JUnit4 runners, since that's the only output we can currently parse.

# First generate scripts to compile the tests the old way.
tools/generate.pl --compile-tests obfs > compile_tests_for_obfs.sh
tools/generate.pl --compile-tests mvnc > compile_tests_for_mvnc.sh
tools/generate.pl --compile-tests gaoss > compile_tests_for_gaoss.sh

# Run the scripts. Creates compiled test classes directly below compile/<provider>/<gav-path>/.
time bash compile_tests_for_obfs.sh
time bash compile_tests_for_mvnc.sh
time bash compile_tests_for_gaoss.sh

# Generate scripts to run the tests the old way.
tools/generate.pl --run-tests obfs > run_all_tests_for_obfs.sh
tools/generate.pl --run-tests mvnc > run_all_tests_for_mvnc.sh
tools/generate.pl --run-tests gaoss > run_all_tests_for_gaoss.sh

# Run the scripts. Creates raw JUnit4 runner test results below run/<provider>/<gav-path>/.
time bash run_all_tests_for_obfs.sh
time bash run_all_tests_for_mvnc.sh
time bash run_all_tests_for_gaoss.sh

# Parse the results into TSV format in test_results_obfs.tsv, etc.
tools/summarise_test_results_to_tsv.sh obfs
tools/summarise_test_results_to_tsv.sh mvnc
tools/summarise_test_results_to_tsv.sh gaoss
