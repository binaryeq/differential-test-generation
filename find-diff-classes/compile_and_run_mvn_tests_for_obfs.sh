#!/bin/bash
set -v
echo "Will write test results under RUNDIR=${RUNDIR:=$(pwd)/run-mvn}"   # Default to '$(pwd)/run-mvn' if not overridden
# Compile and run 34 generated test classes for com/google/guava/guava-testlib/32.1.2-jre/guava-testlib-32.1.2-jre.jar for obfs
mvn -DRUNDIR="${RUNDIR}" -f 'compile/obfs/com/google/guava/guava-testlib/32.1.2-jre/pom.xml' test
# Compile and run 10 generated test classes for commons-io/commons-io/2.15.0/commons-io-2.15.0.jar for obfs
mvn -DRUNDIR="${RUNDIR}" -f 'compile/obfs/commons-io/commons-io/2.15.0/pom.xml' test
# Compile and run 2 generated test classes for commons-logging/commons-logging/1.3.0/commons-logging-1.3.0.jar for obfs
mvn -DRUNDIR="${RUNDIR}" -f 'compile/obfs/commons-logging/commons-logging/1.3.0/pom.xml' test
# Compile and run 2 generated test classes for commons-net/commons-net/3.10.0/commons-net-3.10.0.jar for obfs
mvn -DRUNDIR="${RUNDIR}" -f 'compile/obfs/commons-net/commons-net/3.10.0/pom.xml' test
# Compile and run 2 generated test classes for io/micronaut/kubernetes/micronaut-kubernetes-discovery-client/3.4.1/micronaut-kubernetes-discovery-client-3.4.1.jar for obfs
mvn -DRUNDIR="${RUNDIR}" -f 'compile/obfs/io/micronaut/kubernetes/micronaut-kubernetes-discovery-client/3.4.1/pom.xml' test
# Compile and run 2 generated test classes for junit/junit/4.13.2/junit-4.13.2.jar for obfs
mvn -DRUNDIR="${RUNDIR}" -f 'compile/obfs/junit/junit/4.13.2/pom.xml' test
