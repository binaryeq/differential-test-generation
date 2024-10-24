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

## Regenerating the in-repo `results/` folder

This can be done in order to update the `results/` folder in the repo.

First set `ALTBUILDS_ROOT` to the location of the altbuilds dataset root and then prepare the input folder (needed just once):
```
$ mkdir dataset
```

**NOTE:** If you have the project open in Intellij, before doing anything else, right-click the new `dataset` folder in the Project tab and choose "Mark Directory as", then "Excluded".
This prevents Intellij from trying to perform vast amounts of indexing and hanging (and is the reason to create this subfolder at all).

```
$ cd dataset
$ ln -s $ALTBUILDS_ROOT/repo1.maven.org             # mvnc
$ ln -s $ALTBUILDS_ROOT/google-aoss                 # gaoss
$ ln -s $ALTBUILDS_ROOT/bfs-dataset                 # obfs part 1
$ ln -s $ALTBUILDS_ROOT/maven.oracle.com            # obfs part 2
$ cp $ALTBUILDS_ROOT/gav_{mvnc,gaoss,obfs}.tsv .    # Or symlink them
```

Then run `CompareFeatures` (note that order of arguments is important as it determines subdirectory nesting order). This takes around 90s:
```
$ time java -cp target/bineq-0.0.1-jar-with-dependencies.jar io.github.bineq.featurecomp.CompareFeatures dataset/gav_mvnc.tsv dataset/gav_gaoss.tsv dataset/gav_obfs.tsv
```
