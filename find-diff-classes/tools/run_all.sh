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

# Set up a symlink needed by the tools in the tooling repo
#TODO: Fix this
[ -e tools/jnorm-jar-with-dependencies.jar ] || ln -s $HOME/code/tooling/tools/jnorm-jar-with-dependencies.jar tools/jnorm-jar-with-dependencies.jar

# Run the script. Creates a results/ subdirectory hierarchy with a <provider1>.vs.<provider2>.json file per
# (GAV, provider pair), listing the specific classes that differ in that GAV between those providers.
time bash compare.sh

# Create a shell script to convert the information about different individual classes from JSON to TSV.
#TODO: Move this work inside the compare.sh run in the previous step
tools/json_to_tsv.pl $(find results -name '*.vs.*.json') > convert_json_to_tsv.sh

# Run the script.
bash convert_json_to_tsv.sh

# Create a shell script to run EvoSuite against the Maven Central version of each class identified in the previous step.
tools/generate.pl --generate-tests > generate_all_tests.sh

# Run the script. Creates a testgen/ subdirectory with a mvnc/ subdirectory inside it.
time bash generate_all_tests.sh
