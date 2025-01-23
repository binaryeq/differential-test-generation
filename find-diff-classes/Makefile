# Quick start:
#    $ cp .env.template .env
#    $ vi .env               # Manually change absolute paths
#    $ make fix-timestamps
#    $ make clean-compile
#    $ make                  # Produces different_test_outcomes.tsv
#
# See README.md for more details.

all: different_test_outcomes.tsv #compile_and_run_all_mvn_tests.done

BUILDS := mvnc obfs gaoss

clean-full: clean-distinct-gavs clean-symlinks
	rm -f fix-timestamps.sh

clean-symlinks:
	find testgen compile -type l -name t -delete

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
			setup_compile_or_run_deps_for_$b.sh{,.done} \
			compile_and_run_mvn_tests_for_$b.sh{,.done} \
			compile_tests_for_$b.sh{,.done} \
		) \
		compile_and_run_all_mvn_tests.done

clean-run: clean-db
	rm -rf \
		run/ \
		$(foreach b,$(BUILDS), \
			run_all_tests_for_$b.sh{,.done} \
			tests_results_$b.tsv \
			import_test_results_$b.done \
		) \
		different_test_outcomes.tsv

clean-db: drop_table_failed_test_methods.sql.ALWAYS_DO drop_table_test_classes.sql.ALWAYS_DO drop_view_differing_failed_test_methods.sql.ALWAYS_DO

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
	echo 'You need to download the jNorm client jar to $@. The following command should work:'
	echo 'curl -L -o $@ https://github.com/stschott/jnorm-tool/releases/download/v1.0.0/jnorm-cli-1.0.0.jar'
	exit 1

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

# For mvnc, we need to setup deps for all mvnc GAVs that appear in some GAV pair.
setup_test_gen_deps_for_mvnc.sh: convert_json_to_tsv.sh.done
	tools/generate.pl --setup-deps-for-test-gen $* > $@

# Don't do anything just because the setup_deps_for_mvnc_test_gen.sh.done file doesn't exist.
.SECONDARY: setup_test_gen_deps_for_mvnc.sh setup_test_gen_deps_for_mvnc.sh.done

# Create a shell script to run EvoSuite against the Maven Central version of each class identified by convert_json_to_tsv.sh.
# It creates a testgen/ subdirectory with a mvnc/ subdirectory inside it.
#generate_all_tests.sh: convert_json_to_tsv.sh.done
#generate_all_tests.sh: convert_json_to_tsv.sh.done | $(foreach b,$(BUILDS),setup_deps_for_$b.sh.done)
generate_all_tests.sh: convert_json_to_tsv.sh.done | setup_test_gen_deps_for_mvnc.sh.done
	tools/generate.pl --generate-tests > $@

# For all builds, we need to setup deps for the GAVs in that build for which generated tests exist.
# This is redundant for mvnc.
#setup_deps_for_%.sh: generate_all_tests.sh.done
#setup_deps_for_%.sh: convert_json_to_tsv.sh.done
setup_compile_or_run_deps_for_%.sh: generate_all_tests.sh.done
	tools/generate.pl --setup-deps-for-compile-or-run $* > $@

# Don't do anything just because the setup_deps_for_%.sh file doesn't exist.
.SECONDARY: $(foreach b,$(BUILDS),setup_compile_or_run_deps_for_$b.sh setup_compile_or_run_deps_for_$b.sh.done)

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
# The order-only dependency on setup_compile_or_run_deps_for_%.sh.done enables the archive to be distributed
# without all the artifacts' dependencies and with setup_deps_for_%.sh.done absent but compile_tests_for_%.sh.done
# present, enabling the user to run `make clean-run; make` and set up artifacts' dependencies without recompiling.
compile_tests_for_%.sh: generate_all_tests.sh.done | setup_compile_or_run_deps_for_%.sh.done
	tools/generate.pl --compile-tests $* > $@

# Generate scripts to run the tests the old way.
# Running the scripts creates raw JUnit4 runner test results below run/<provider>/<gav-path>/.
run_all_tests_for_%.sh: compile_tests_for_%.sh.done | setup_compile_or_run_deps_for_%.sh.done
	tools/generate.pl --run-tests $* > $@

# Parse the results into TSV format in test_results_obfs.tsv, etc.
test_results_%.tsv: run_all_tests_for_%.sh.done
	tools/summarise_test_results_to_tsv.sh $* > $@

# Load the results into the SQLite DB
import_test_results_%.done: test_results_%.tsv create_table_test_classes.sql.done create_table_failed_test_methods.sql.done
	tools/prepare_test_results_for_db_import.pl --test-classes $< | sqlite3 -tabs "$(DB)" ".import '|cat' test_classes"
	tools/prepare_test_results_for_db_import.pl --failed-test-methods $< | sqlite3 -tabs "$(DB)" ".import '|cat' failed_test_methods"
	touch $@

different_test_outcomes.tsv: $(foreach b,$(BUILDS),import_test_results_$b.done) create_view_differing_failed_test_methods.sql.done
	sqlite3 -tabs "$(DB)" "SELECT * FROM differing_failed_test_methods ORDER BY 1, 2, 3, 4, 5, 6, 7;" > $@

# Pattern rule to run any shell script and produce a .sh.done file afterwards if it succeeded, logging stdout + stderr
# and timing info to a .sh.pid$$.log file, as well as to stdout.
# NOTE: "time" behaves differently in Bourne sh vs bash :-/
%.sh.done: %.sh
	( ( time bash $< ) 2>&1 ) | tee $<.pid$$$$.log
	touch $@

# Before creating a table or view, drop it (if it already exists)
create_%.sql.done: tools/create_%.sql drop_%.sql.ALWAYS_DO
	sqlite3 -tabs "$(DB)" < $< > create_$*.sql.pid$$$$.log 2>&1
	touch $@

# Similar to previous rule but doesn't create the target, so will always run if invoked, and deletes the corresponding create_*.sql.done file.
drop_%.sql.ALWAYS_DO: tools/drop_%.sql
	sqlite3 -tabs "$(DB)" < $< > drop_$*.sql.pid$$$$.log 2>&1
	rm -f create_$*.sql.done

# Don't delete create_*.sql.done files at the end.
.NOTINTERMEDIATE: $(addsuffix .done,$(notdir $(wildcard tools/create_*.sql)))

# Don't do anything just because an .ALWAYS_DO file doesn't exist (they never do).
.SECONDARY: $(addsuffix .ALWAYS_DO,$(notdir $(wildcard tools/drop_*.sql)))

# Don't automatically delete intermediate files like *.sh.done at the end
# (Specialness of .NOTINTERMEDIATE not added until GNU Make 4.4, so explicitly specify all relevant targets)
.NOTINTERMEDIATE: \
	compare.sh \
	compare.sh.done \
	convert_json_to_tsv.sh.done \
	filter_all_diffs.sh.done \
	setup_test_gen_deps_for_mvnc.sh \
	setup_test_gen_deps_for_mvnc.sh.done \
	generate_all_tests.sh \
	generate_all_tests.sh.done \
	$(foreach b,$(BUILDS), \
		setup_compile_or_run_deps_for_$b.sh \
		setup_compile_or_run_deps_for_$b.sh.done \
		compile_and_run_mvn_tests_for_$b.sh \
		compile_and_run_mvn_tests_for_$b.sh.done \
		compile_tests_for_$b.sh \
		compile_tests_for_$b.sh.done \
		run_all_tests_for_$b.sh \
		run_all_tests_for_$b.sh.done \
		test_results_$b.tsv \
	)
