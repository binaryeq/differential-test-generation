# Reproducing the results from the paper

Table 1 in the paper is `data-summary-table-tabular.tex` in this archive.
You can reproduce these results yourself on any Linux system.

## Download external tools and set up environment
First download the following files, then copy `.env.template` to `.env` and change entries in `.env` to point to their absolute paths:

| Download                                                                                                                                                                                                                               | Setting in `.env` |
|----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|------------------|
| Download and unpack the 31GB `bineq-altbuild-dataset.zip` dataset from https://zenodo.org/records/14037542                                                                                                                             | `JARROOT`                 |
| [EvoSuite 1.2.0 runtime jar](https://github.com/EvoSuite/evosuite/releases/download/v1.2.0/evosuite-standalone-runtime-1.2.0.jar)                                                                                                      | `EVOSUITERUNTIMEJAR`                 |
| [JUnit 4.13.2 jar](https://repo1.maven.org/maven2/junit/junit/4.13.2/junit-4.13.2.jar) (if you use Maven, you may already have this at `${HOME}/.m2/repository/junit/junit/4.13.2/junit-4.13.2.jar`)                                   | `JUNIT4JAR`                 |
| [Hamcrest 1.3 jar](https://repo1.maven.org/maven2/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar) (if you use Maven, you may already have this at `${HOME}/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar`) | `HAMCRESTJAR`                 |

Also set `DB` in `.env` to the absolute path of an SQLite database file to store results in, which will be created if it does not already exist.
Results will be written to the table `different_test_outcomes` in this database.

You will also need the following tools installed:
- JDK 8 (*not* later; EvoSuite is less reliable even at JDK 11)
- Maven 3.6.3 or later
- `sqlite3` 3.37.2 or later
- `jq` 1.6 or later
- GNU `make` 4.3 or later (installed by default on ~all Linux systems)
- `bash` (installed by default on ~all Linux systems)
- `perl` (installed by default on ~all Linux systems)

## Compile and run tests and summarise results
Then run:

```
make fix-timestamps        # Fix file modification times after git clone / git checkout
make clean-compile         # Remove prebuilt results from test compilation onwards
make                       # Compile existing EvoSuite-generated tests, run them and summarise results
```

This will take around 40 minutes and produce `data-summary-table-tabular.tex`.
The file `different_test_outcomes.tsv` contains the same results in more detail.

See also the [Makefile](Makefile), which has detailed comments explaining each step.

Note that all shell scripts in the archive root directory are **generated** by `make`.

# Regenerating tests using EvoSuite
The above steps show how to reproduce the results in the paper, starting from EvoSuite-generated tests already present in the archive.
Alternatively, you can first regenerate these tests yourself using EvoSuite.
This will in general produce different results, since EvoSuite test generation is not deterministic.

**NOTE: Regenerating tests is time-consuming!**

## Additional setup

In addition to the steps in "Download tools and set up environment" above, download the [EvoSuite 1.2.0 full jar](https://github.com/EvoSuite/evosuite/releases/download/v1.2.0/evosuite-1.2.0.jar), uncomment the line beginning with `#EVOSUITEJAR=` in `.env` and set it to the downloaded file's absolute path.

## Compile and run tests and summarise results
Then run:

```
make fix-timestamps        # Fix file modification times after git clone / git checkout
make clean-compare         # Remove prebuilt results from test generation onwards
make                       # Generate tests with EvoSuite, compile and run them, and summarise results
```

This will produce `data-summary-table-tabular.tex` and `different_test_outcomes.tsv`, as before.

# Common problems

### Q: I see errors like `java.awt.AWTError: Can't connect to X11 window server using 'localhost:13.0' as the value of the DISPLAY variable.` when running tests -- what can I do?

**A:** Ensure the `$DISPLAY` environment variable is not present in the environment by running `export -n DISPLAY` before running `make`.

Explanation: `$DISPLAY` may be set to an erroneous value, e.g., if using an `ssh` connection with X forwarding turned on but no X server running on the host.

### Q: I got rid of `$DISPLAY`, but now I see errors like `java.awt.AWTError: Assistive Technology not found: org.GNOME.Accessibility.AtkWrapper` when running tests -- what can I do?

**A:** Per [these instructions](https://askubuntu.com/a/723503), before running `make`, turn off AWT assistive technologies by commenting out the line:

```
assistive_technologies=org.GNOME.Accessibility.AtkWrapper
```

in `/etc/java-8-openjdk/accessibility.properties` by prepending a `#`.
This requires root privileges.

Explanation: Seems to be a known issue with "headless" JDK versions, e.g., `openjdk-8-jdk-headless:amd64` for Ubuntu 24.04.1 LTS.
