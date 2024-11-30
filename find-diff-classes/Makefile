# Goal: Reproduce the workings of tools/run_all.sh, but with more flexibility (e.g., allow starting from already-generated tests).

#TODO: Update following comment in light of .env:
# This script assumes that the tooling and craw-redhat-oss git repos are already checked out below $HOME/code.
# If that isn't the case, you'll need to change the definitions of $ROOT in generate.pl and
# find_jnorm2_distinct_gavs.sh in tools/.

all: test_results.done compile_and_run_all_mvn_tests.done

BUILDS := mvnc obfs gaoss

clean-full: clean-distinct-gavs
	rm -f fix-timestamps.sh

clean-distinct-gavs: clean-compare
	rm -rf \
		jnorm2_distinct_gavs.tsv

clean-compare: clean-generate
	rm -rf \
		comparisons/ \
		compare.sh \
		compare.sh.done \
		convert_json_to_tsv.sh \
		convert_json_to_tsv.sh.done \
		filter_all_diffs.sh \
		filter_all_diffs.sh.done \
		filtered_top_level_classes.tsv

clean-generate: clean-compile
	rm -rf \
		testgen/ \
		generate_all_tests.sh \
		generate_all_tests.sh.done

# This is a good place to start, if you want to reproduce the results in the paper without making EvoSuite generate tests (which is time-consuming)
clean-compile: clean-run
	rm -rf \
		compile/ \
		$(foreach b,$(BUILDS), \
			compile_and_run_mvn_tests_for_$b.sh{,.done} \
			compile_tests_for_$b.sh{,.done} \
		) \
		compile_and_run_all_mvn_tests.done

clean-run:
	rm -rf \
		run/ \
		$(foreach b,$(BUILDS), \
			run_all_tests_for_$b.sh{,.done} \
			tests_results_$b.tsv \
		) \
		run_all_tests.done \
		test_results.done

# git doesn't care about file modification timestamps, but make does. Run this after a fresh git clone or git checkout
# to set timestamps appropriately (i.e., to mark every already-existing file as "later than" all of its prerequisites),
# before running plain make.
fix-timestamps:
	make -n -t --always-make --no-print-directory | perl -lpe 's/^touch /touch --no-create / or die' > fix-timestamps.sh
	bash ./fix-timestamps.sh

SHELL := /bin/bash
# Fail fast
.SHELLFLAGS := -eo pipefail $(.SHELLFLAGS)

# Read absolute paths and export them to child processes
include .env
export DB
export JARROOT
export BINEQ_CLASSPATH
export EVOSUITEJAR
export EVOSUITERUNTIMEJAR
export JUNIT4JAR
export HAMCRESTJAR

# Read the set of GAVs that differ at the jnorm2 level between pairs of non-RedHat providers from the SQLite DB that
# was already prepared by tools in the craw-redhat-oss repo, and write it to jnorm2_distinct_gavs.tsv.
jnorm2_distinct_gavs.tsv:
	tools/find_jnorm2_distinct_gavs.sh > $@

# Download jNorm if it's not already present. It's GPLed, but this is OK to do provided we don't publicly distribute this repo.
#TODO: Fix this
tools/jnorm-jar-with-dependencies.jar:
	curl -L -o $@ https://github.com/stschott/jnorm-tool/releases/download/v1.0.0/jnorm-cli-1.0.0.jar

# Create a shell script to run CompareJars from the tooling repo to find the individual differing classes in each such GAV.
# Running it creates a comparisons/ subdirectory hierarchy with a <provider1>.vs.<provider2>.json file per
# (GAV, provider pair), listing the specific classes that differ in that GAV between those providers.
compare.sh: jnorm2_distinct_gavs.tsv
	tools/generate.pl --generate-comparisons < $< > $@

# jNorm isn't needed until the generated compare.sh script is run. This dep is in addition to the implicit dep on compare.sh.
compare.sh.done: tools/jnorm-jar-with-dependencies.jar

# If compare.sh.done already exists, we don't want to bother downloading jNorm. Also, if we *do* download it, don't delete it afterwards.
.SECONDARY: tools/jnorm-jar-with-dependencies.jar

# Create a shell script to convert the information about different individual classes from JSON to TSV.
#TODO: Move this work inside the compare.sh run in the previous step
convert_json_to_tsv.sh: compare.sh.done
	tools/json_to_tsv.pl $$(find comparisons -name '*.vs.*.json') > $@

# Create a shell script to filter out all "uninteresting" differences (e.g., invokeinterface <-> invokevirtual).
filter_all_diffs.sh: convert_json_to_tsv.sh.done
	tools/keep_if_any_diffs_remain.pl $(find comparisons -name '*.vs.*.tsv') > $@

# Just for convenience (the same info is extractable from the generate_all_tests.sh produced by the following step)
filtered_top_level_classes.tsv: filter_all_diffs.sh.done
	tools/extract_filtered_top_level_classes_to_tsv.pl | sort -u > $@

# Create a shell script to run EvoSuite against the Maven Central version of each class identified by convert_json_to_tsv.sh.
# It creates a testgen/ subdirectory with a mvnc/ subdirectory inside it.
generate_all_tests.sh: convert_json_to_tsv.sh.done
	tools/generate.pl --generate-tests > $@

# Create shell scripts to compile and run tests against each provider using Maven.
# Generating the scripts immediately creates pom.xml files and t/ subdirs with dependencies below the compile/ directory.
# Running the scripts produces compiled test classes below compile/<provider>/<gav-path>/target/test-classes/ and Surefire test results below run-mvn/.
compile_and_run_mvn_tests_for_%.sh: generate_all_tests.sh.done
	tools/generate.pl --compile-and-run-tests-mvn $* > $@

compile_and_run_all_mvn_tests.done: $(foreach b,$(BUILDS),compile_and_run_mvn_tests_for_$b.sh.done)
	touch $@

# Test results can be written to a different location by setting $RUNDIR to an absolute path, e.g.:
# RUNDIR=`pwd`/other/test/results time bash compile_and_run_mvn_tests_for_obfs.sh

# Also compile and then run the tests the old way, using raw JUnit4 runners, in order to parse it.

# First generate scripts to compile the tests the old way.
# Running the scripts creates compiled test classes directly below compile/<provider>/<gav-path>/.
compile_tests_for_%.sh: generate_all_tests.sh.done
	tools/generate.pl --compile-tests $* > $@

# Generate scripts to run the tests the old way.
# Running the scripts creates raw JUnit4 runner test results below run/<provider>/<gav-path>/.
run_all_tests_for_%.sh: compile_tests_for_%.sh.done
	tools/generate.pl --run-tests $* > $@

# Parse the results into TSV format in test_results_obfs.tsv, etc.
test_results_%.tsv: run_all_tests_for_%.sh.done
	tools/summarise_test_results_to_tsv.sh $* > $@

test_results.done: $(foreach b,$(BUILDS),test_results_$b.tsv)
	touch $@



# Pattern rule to run any shell script and produce a .sh.done file afterwards if it succeeded, logging stdout + stderr
# and timing info to a .sh.pid$$.log file, as well as to stdout.
# NOTE: "time" behaves differently in Bourne sh vs bash :-/
%.sh.done: %.sh
	( ( time bash $< ) 2>&1 ) | tee $<.pid$$$$.log
	touch $@

# Don't automatically delete intermediate files like *.sh.done at the end
# (Specialness of .NOTINTERMEDIATE not added until GNU Make 4.4, so explicitly specify all relevant targets)
.NOTINTERMEDIATE: \
	compare.sh.done \
	convert_json_to_tsv.sh.done \
	filter_all_diffs.sh.done \
	generate_all_tests.sh.done \
	$(foreach b,$(BUILDS), \
		compile_and_run_mvn_tests_for_$b.sh.done \
		compile_tests_for_$b.sh.done \
		run_all_tests_for_$b.sh.done \
		test_results_$b.tsv \
	)
