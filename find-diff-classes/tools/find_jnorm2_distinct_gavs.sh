#!/bin/bash

sqlite3 -tabs ${DB:?env var DB not set} "select groupId, artifactId, version, provider1, provider2 from comparison_results where not failed and comparisonId = 'bin.differentcontent.jnorm2' and provider1 not like 'rh%' and provider2 not like 'rh%' and provider1 < provider2 order by 1, 2, 3, 4, 5;"
