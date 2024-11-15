DROP INDEX IF EXISTS jacoco_covered_methods_idx;
DROP TABLE IF EXISTS jacoco_covered_methods;
CREATE TABLE jacoco_covered_methods (provider TEXT, groupId TEXT, artifactId TEXT, version TEXT, testClass TEXT, package TEXT, class TEXT, method TEXT, descriptor TEXT);
.mode tabs
.import all_covered_methods.tsv jacoco_covered_methods
CREATE UNIQUE INDEX jacoco_covered_methods_idx on jacoco_covered_methods (provider, groupId, artifactId, version, testClass, package, class, method, descriptor);
