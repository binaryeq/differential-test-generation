DROP TABLE IF EXISTS tests;
CREATE TABLE tests (provider TEXT, groupId TEXT, artifactId TEXT, version TEXT, test TEXT);
.mode tabs
.import all_tests.tsv tests
