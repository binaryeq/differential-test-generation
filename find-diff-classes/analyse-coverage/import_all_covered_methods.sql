DROP INDEX IF EXISTS covered_methods_idx;
DROP TABLE IF EXISTS covered_methods;
CREATE TABLE covered_methods (provider TEXT, groupId TEXT, artifactId TEXT, version TEXT, testClass TEXT, package TEXT, class TEXT, method TEXT, descriptor TEXT);
.mode tabs
.import all_covered_methods.tsv covered_methods
CREATE UNIQUE INDEX covered_methods_idx on covered_methods (provider, groupId, artifactId, version, testClass, package, class, method, descriptor);
