DROP TABLE IF EXISTS jacoco_tests;
CREATE TABLE jacoco_tests (provider TEXT, groupId TEXT, artifactId TEXT, version TEXT, testClass TEXT);
.mode tabs
.import all_tests.tsv jacoco_tests
