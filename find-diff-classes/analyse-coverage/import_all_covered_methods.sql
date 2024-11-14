DROP TABLE IF EXISTS covered_methods;
CREATE TABLE covered_methods (provider TEXT, groupId TEXT, artifactId TEXT, version TEXT, test TEXT, package TEXT, class TEXT, method TEXT, descriptor TEXT);
.mode tabs
.import all_covered_methods.tsv covered_methods
