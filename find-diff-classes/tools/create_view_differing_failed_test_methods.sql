CREATE VIEW differing_failed_test_methods AS
SELECT
    c1.provider AS provider1,
    c2.provider AS provider2,
    c1.groupId,
    c1.artifactId,
    c1.version,
    c1.testClass,
    f1.testMethodSuffix
FROM test_classes c1
JOIN test_classes c2 ON (c2.groupId, c2.artifactId, c2.version, c2.testClass) = (c1.groupId, c1.artifactId, c1.version, c1.testClass) AND c1.provider <> c2.provider
JOIN failed_test_methods f1 ON (f1.provider, f1.groupId, f1.artifactId, f1.version, f1.testClass) = (c1.provider, c1.groupId, c1.artifactId, c1.version, c1.testClass)
WHERE NOT EXISTS (
    SELECT 1
    FROM failed_test_methods f2
    WHERE (f2.provider, f2.groupId, f2.artifactId, f2.version, f2.testClass, f2.testMethodSuffix) = (c2.provider, f1.groupId, f1.artifactId, f1.version, f1.testClass, f1.testMethodSuffix)
)
--ORDER BY 1, 2, 3, 4, 5, 6, 7
;
