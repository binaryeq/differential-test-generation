#!/bin/sh

DB=$HOME/code/craw-redhat-oss/sqlite/crawl.sqlite
sqlite3 -tabs $DB "select groupId, artifactId, version, provider1, provider2 from comparison_results where not failed and comparisonId = 'bin.differentcontent.jnorm2' and provider1 not like 'rh%' and provider2 not like 'rh%' and provider1 < provider2 order by 1, 2, 3, 4, 5;" > jnorm2_distinct_gavs.tsv
