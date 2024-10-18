the main class is `io.github.bineq.featurecomp.CompareFeatures`, 
expected arguments are the locations of the alternative build index files, like:
`gav_mvnc.tsv gav_gaoss.tsv gav_obfs.tsv`. Results are saved in `results`. 

The script requires a pre-populated `.same_sources.json` file containing the results for every provider specified on the command line.
This repo already includes a `.same_sources.json` file with results for the altbuilds providers (`mvnc`, `obfs`, `rh1`, etc.).
In order to use the script with other providers (e.g., for testing), you'll need to generate a `.same_sources.json` file yourself using the [`CompareBuildsFromSameSources`](https://github.com/binaryeq/tooling/blob/main/src/main/java/io/github/bineq/experiments/altbuilds/CompareBuildsFromSameSources.java) tool.

Only results for "interesting" combinations are saved (some classes must be different).

The script produces the following files for each pair of jars being compared:

1. `commons-classes.list` -- a list of classes present in both jars
2. `nonequal-classes.list` -- a list of classes present in both jars that are not bitwise equal
3. `different-features1.tsv` -- a table of features found in jar1, but not in jar2, if missing this list is empty
3. `different-features2.tsv` -- a table of features found in jar2, but not in jar1, if missing this list is empty
4. `different-classes1.tsv` -- a list of classes found in jar1, but not in jar2, if missing this list is empty
5. `different-classes2.tsv` -- a list of classes found in jar2, but not in jar1, if missing this list is empty

The `different-features*` tables use the following schema (columns):

1. `className` -- the name of the class owning the feature
2. `memberName` -- the name of the method or field owning the feature
3. `memberDescriptor` -- the descriptor of the method or field owning the feature
4. `type` -- the type of feature (e.g. the kind of method invocation)
5. `value` -- the feature (e.g. the method invoked at a callsite)