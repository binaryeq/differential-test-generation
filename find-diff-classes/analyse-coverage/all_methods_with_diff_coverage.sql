SELECT
    t1.provider AS provider1,
    t2.provider AS provider2,
    t1.groupId,
    t1.artifactId,
    t1.version,
    t1.test,
    cm1.package,
    cm1.class,
    cm1.method,
    cm1.descriptor
FROM tests t1
JOIN tests t2 ON (t2.groupId, t2.artifactId, t2.version, t2.test) = (t1.groupId, t1.artifactId, t1.version, t1.test)
JOIN covered_methods cm1 ON (cm1.provider, cm1.groupId, cm1.artifactId, cm1.version, cm1.test) = (t1.provider, t1.groupId, t1.artifactId, t1.version, t1.test)
WHERE t1.provider <> t2.provider
AND NOT EXISTS (
    SELECT 1 FROM covered_methods cm2
    WHERE (cm2.provider, cm2.groupId, cm2.artifactId, cm2.version, cm2.test, cm2.package, cm2.class, cm2.method, cm2.descriptor) = (t2.provider, cm1.groupId, cm1.artifactId, cm1.version, cm1.test, cm1.package, cm1.class, cm1.method, cm1.descriptor)
)
ORDER BY 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
;
