#!/bin/bash

DB=/home/wtwhite/code/craw-redhat-oss/sqlite/crawl.sqlite

sqlite3 "$DB" 'DROP TABLE IF EXISTS test_classes;' 'CREATE TABLE test_classes (provider TEXT, groupId TEXT, artifactId TEXT, version TEXT, testClass TEXT, nTests INTEGER, nTestsSucceeded INTEGER, nTestsFailed INTEGER, elapsedTime REAL);'
sqlite3 "$DB" 'DROP TABLE IF EXISTS failed_test_methods;' 'CREATE TABLE failed_test_methods (provider TEXT, groupId TEXT, artifactId TEXT, version TEXT, testClass TEXT, testMethodSuffix TEXT);'

for f in test_results_{obfs,gaoss,mvnc}.tsv; do
  [ -e $f ] || { echo "Missing $f!" 2>&1 ; exit 1 ; }
  tools/prepare_test_results_for_db_import.pl --test-classes $f | sqlite3 -tabs "$DB" ".import '|cat' test_classes"
  tools/prepare_test_results_for_db_import.pl --failed-test-methods $f | sqlite3 -tabs "$DB" ".import '|cat' failed_test_methods"
done
