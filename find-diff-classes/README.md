# Generating EvoSuite tests for the altbuilds dataset

To find all `jnorm2`-different classes in the altbuilds dataset (ignoring RedHat providers) and generate EvoSuite tests for them, ensure that:

- the [`tooling`](https://github.com/binaryeq/tooling) repo has been cloned to `$HOME/code/tooling`
- the [`craw-redhat-oss`](https://github.com/binaryeq/craw-redhat-oss) repo has been cloned to `$HOME/code/craw-redhat-oss`, and the `comparison_results` table in its SQLite DB has been populated by running `make sqlite/comparison_results.imported.done` inside its base directory
- the [EvoSuite 1.2.0 binary jar](https://github.com/EvoSuite/evosuite/releases/download/v1.2.0/evosuite-1.2.0.jar) has been downloaded to `evosuite/evosuite-1.2.0.jar` within this repo (`regression-test-generation`)

Then run:

```
cd find-diff-classes
tools/run_all.sh
```

See [tools/run_all.sh](tools/run_all.sh), which has detailed comments explaining each step.

Note that all shell scripts in the current directory are **generated** by `tools/run_all.sh`.
The repo contains a copy of these generated scripts for convenience in case you want to run some of the steps manually, but they will be overwritten by `tools/run_all.sh` -- this is normal.
