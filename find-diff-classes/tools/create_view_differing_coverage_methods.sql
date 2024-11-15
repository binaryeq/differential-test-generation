DROP VIEW IF EXISTS differing_coverage_methods;
CREATE VIEW differing_coverage_methods AS
SELECT
    t1.provider AS provider1,
    t2.provider AS provider2,
    t1.groupId,
    t1.artifactId,
    t1.version,
    t1.testClass,
    cm1.package,
    cm1.class,
    cm1.method,
    cm1.descriptor
FROM jacoco_tests t1
JOIN jacoco_tests t2 ON (t2.groupId, t2.artifactId, t2.version, t2.testClass) = (t1.groupId, t1.artifactId, t1.version, t1.testClass)
JOIN jacoco_covered_methods cm1 ON (cm1.provider, cm1.groupId, cm1.artifactId, cm1.version, cm1.testClass) = (t1.provider, t1.groupId, t1.artifactId, t1.version, t1.testClass)
WHERE t1.provider <> t2.provider
AND NOT EXISTS (
    SELECT 1 FROM jacoco_covered_methods cm2
    WHERE (cm2.provider, cm2.groupId, cm2.artifactId, cm2.version, cm2.testClass, cm2.package, cm2.class, cm2.method, cm2.descriptor) = (t2.provider, cm1.groupId, cm1.artifactId, cm1.version, cm1.testClass, cm1.package, cm1.class, cm1.method, cm1.descriptor)
)
--ORDER BY 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
;
