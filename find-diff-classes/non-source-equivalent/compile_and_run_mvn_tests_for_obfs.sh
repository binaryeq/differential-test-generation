#!/bin/bash
set -v
echo "Will write test results under RUNDIR=${RUNDIR:=$(pwd)/run-mvn}"   # Default to '$(pwd)/run-mvn' if not overridden
# Compile and run 2 generated test classes for io/micronaut/kubernetes/micronaut-kubernetes-discovery-client/3.4.1/micronaut-kubernetes-discovery-client-3.4.1.jar for obfs
mvn -DRUNDIR="${RUNDIR}" -f 'compile/obfs/io/micronaut/kubernetes/micronaut-kubernetes-discovery-client/3.4.1/pom.xml' test
# Compile and run 2 generated test classes for org/glassfish/jersey/connectors/jersey-netty-connector/3.0.12/jersey-netty-connector-3.0.12.jar for obfs
mvn -DRUNDIR="${RUNDIR}" -f 'compile/obfs/org/glassfish/jersey/connectors/jersey-netty-connector/3.0.12/pom.xml' test
# Compile and run 2 generated test classes for org/glassfish/jersey/containers/jersey-container-grizzly2-http/3.0.12/jersey-container-grizzly2-http-3.0.12.jar for obfs
mvn -DRUNDIR="${RUNDIR}" -f 'compile/obfs/org/glassfish/jersey/containers/jersey-container-grizzly2-http/3.0.12/pom.xml' test
# Compile and run 2 generated test classes for org/glassfish/jersey/containers/jersey-container-jdk-http/3.0.12/jersey-container-jdk-http-3.0.12.jar for obfs
mvn -DRUNDIR="${RUNDIR}" -f 'compile/obfs/org/glassfish/jersey/containers/jersey-container-jdk-http/3.0.12/pom.xml' test
# Compile and run 2 generated test classes for org/glassfish/jersey/containers/jersey-container-servlet-core/3.0.12/jersey-container-servlet-core-3.0.12.jar for obfs
mvn -DRUNDIR="${RUNDIR}" -f 'compile/obfs/org/glassfish/jersey/containers/jersey-container-servlet-core/3.0.12/pom.xml' test
# Compile and run 2 generated test classes for org/glassfish/jersey/containers/jersey-container-servlet/3.0.12/jersey-container-servlet-3.0.12.jar for obfs
mvn -DRUNDIR="${RUNDIR}" -f 'compile/obfs/org/glassfish/jersey/containers/jersey-container-servlet/3.0.12/pom.xml' test
# Compile and run 2 generated test classes for org/glassfish/jersey/containers/jersey-container-simple-http/3.0.12/jersey-container-simple-http-3.0.12.jar for obfs
mvn -DRUNDIR="${RUNDIR}" -f 'compile/obfs/org/glassfish/jersey/containers/jersey-container-simple-http/3.0.12/pom.xml' test
# Compile and run 2 generated test classes for org/glassfish/jersey/core/jersey-client/3.0.12/jersey-client-3.0.12.jar for obfs
mvn -DRUNDIR="${RUNDIR}" -f 'compile/obfs/org/glassfish/jersey/core/jersey-client/3.0.12/pom.xml' test
# Compile and run 2 generated test classes for org/glassfish/jersey/core/jersey-server/3.0.12/jersey-server-3.0.12.jar for obfs
mvn -DRUNDIR="${RUNDIR}" -f 'compile/obfs/org/glassfish/jersey/core/jersey-server/3.0.12/pom.xml' test
# Compile and run 2 generated test classes for org/glassfish/jersey/inject/jersey-hk2/3.0.12/jersey-hk2-3.0.12.jar for obfs
mvn -DRUNDIR="${RUNDIR}" -f 'compile/obfs/org/glassfish/jersey/inject/jersey-hk2/3.0.12/pom.xml' test
# Compile and run 2 generated test classes for org/glassfish/jersey/media/jersey-media-jaxb/3.0.12/jersey-media-jaxb-3.0.12.jar for obfs
mvn -DRUNDIR="${RUNDIR}" -f 'compile/obfs/org/glassfish/jersey/media/jersey-media-jaxb/3.0.12/pom.xml' test
