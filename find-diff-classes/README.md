# Reproducing the results from the paper

Figure 1 in the paper summarises the differing test outcome results from the file `different_test_outcomes.tsv` in this archive.
There are several stages at which these results can be reproduced on a Linux system.
In increasing order of thoroughness (and running time):

0. Look at the existing `different_test_outcomes.tsv` file included in the archive.
1. Run the existing, precompiled tests included in the archive, and generate the above file.
2. Compile the existing, pre-generated tests, then proceed as above.
3. Generate fresh tests using EvoSuite (time-consuming!), then proceed as above.
4. Compare all (*mvnc*, *alternative*) pairs of GAVs to determine which of their classes differ according to the `jNorm` tool, then filter out classes that differ only according to compiler changes introduced in JDK18, then proceed as above.

**We recommend starting at stage 2 above.**
This will take around 40 minutes.

All starting points (except 0) require first downloading several files, then copying `.env.template` to `.env` and changing entries in `.env` to point to their absolute paths:

| Download                                                                                                                                                                                                                               | Setting in `.env` |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------|
| Download and unpack the 31GB `bineq-altbuild-dataset.zip` dataset from https://zenodo.org/records/14037542                                                                                                                             | `JARROOT`                 |
| [EvoSuite 1.2.0 runtime jar](https://github.com/EvoSuite/evosuite/releases/download/v1.2.0/evosuite-standalone-runtime-1.2.0.jar)                                                                                                      | `EVOSUITERUNTIMEJAR`                 |
| [JUnit 4.13.2 jar](https://repo1.maven.org/maven2/junit/junit/4.13.2/junit-4.13.2.jar) (if you use Maven, you may already have this at `${HOME}/.m2/repository/junit/junit/4.13.2/junit-4.13.2.jar`)                                   | `JUNIT4JAR`                 |
| [Hamcrest 1.3 jar](https://repo1.maven.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar) (if you use Maven, you may already have this at `${HOME}/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar`) | `HAMCRESTJAR`                 |

Also set `DB` in `.env` to the absolute path of an SQLite database file, which will be created if it does not already exist.
Results will be written to the table `different_test_outcomes` in this database.

Starting at earlier stages requires additional downloads. TODO

You will also need the following tools installed:
- `sqlite3` 3.37.2 or later
- `jq` 1.6 or later
- GNU `make` 4.3 or later (installed by default on ~all Linux systems)
- `bash` (installed by default on ~all Linux systems)
- `perl` (installed by default on ~all Linux systems)

Then run:

```
cd find-diff-classes
make fix-timestamps        # Fix file modification times after git clone / git checkout
make clean-compile         # Remove prebuilt results from test compilation onwards
make                       # Compile existing EvoSuite-generated tests, run them and summarise results
```

See [Makefile](Makefile), which has detailed comments explaining each step.

Note that all shell scripts in the `find-diff-classes` directory are **generated** by `make`.
