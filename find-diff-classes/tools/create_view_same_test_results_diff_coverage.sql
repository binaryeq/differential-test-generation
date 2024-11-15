DROP VIEW IF EXISTS same_test_results_diff_coverage;
CREATE VIEW same_test_results_diff_coverage AS
SELECT *
FROM differing_coverage_methods c
WHERE NOT EXISTS (
    SELECT 1
    FROM differing_failed_test_methods f
    WHERE (f.provider1, f.provider2, f.groupId, f.artifactId, f.version, f.testClass) = (c.provider1, c.provider2, c.groupId, c.artifactId, c.version, c.testClass)
)
AND NOT EXISTS (
    SELECT 1
    FROM differing_failed_test_methods f
    WHERE (f.provider1, f.provider2, f.groupId, f.artifactId, f.version, f.testClass) = (c.provider2, c.provider1, c.groupId, c.artifactId, c.version, c.testClass)
)
--ORDER BY 1, 2, 3, 4, 5, 6, 7, 8, 9, 10
;
