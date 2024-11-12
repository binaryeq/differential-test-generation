#!/bin/sh

DB=$HOME/code/craw-redhat-oss/sqlite/crawl.sqlite
#HACK: In this worktree, consider only *non*-source-equivalent GAV pairs
sqlite3 -tabs $DB "select groupId, artifactId, version, provider1, provider2 from (select * from comparison_results EXCEPT select * from comparison_results_same_sources_only) where not failed and comparisonId = 'bin.differentcontent.jnorm2' and provider1 not like 'rh%' and provider2 not like 'rh%' and provider1 < provider2 order by 1, 2, 3, 4, 5;" > jnorm2_distinct_gavs.tsv
