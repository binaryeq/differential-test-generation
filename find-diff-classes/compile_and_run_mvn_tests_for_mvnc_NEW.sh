#!/bin/bash
set -v
echo "Will write test results under RUNDIR=${RUNDIR:=$(pwd)/run-mvn}"   # Default to '$(pwd)/run-mvn' if not overridden
# Compile and run 2 generated test classes for com/google/auto/service/auto-service/1.0.1/auto-service-1.0.1.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/com/google/auto/service/auto-service/1.0.1/pom.xml' test
# Compile and run 32 generated test classes for com/google/truth/truth/1.1.3/truth-1.1.3.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/com/google/truth/truth/1.1.3/pom.xml' test
# Compile and run 6 generated test classes for com/google/truth/truth/1.1.5/truth-1.1.5.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/com/google/truth/truth/1.1.5/pom.xml' test
# Compile and run 6 generated test classes for com/google/truth/truth/1.2.0/truth-1.2.0.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/com/google/truth/truth/1.2.0/pom.xml' test
# Compile and run 18 generated test classes for io/netty/netty/3.10.6.Final/netty-3.10.6.Final.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/io/netty/netty/3.10.6.Final/pom.xml' test
# Compile and run 84 generated test classes for io/rest-assured/rest-assured/5.2.1/rest-assured-5.2.1.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/io/rest-assured/rest-assured/5.2.1/pom.xml' test
# Compile and run 4 generated test classes for io/undertow/undertow-servlet/2.2.23.Final/undertow-servlet-2.2.23.Final.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/io/undertow/undertow-servlet/2.2.23.Final/pom.xml' test
# Compile and run 4 generated test classes for io/undertow/undertow-servlet/2.2.24.Final/undertow-servlet-2.2.24.Final.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/io/undertow/undertow-servlet/2.2.24.Final/pom.xml' test
# Compile and run 4 generated test classes for io/undertow/undertow-servlet/2.2.25.Final/undertow-servlet-2.2.25.Final.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/io/undertow/undertow-servlet/2.2.25.Final/pom.xml' test
# Compile and run 4 generated test classes for io/undertow/undertow-servlet/2.2.26.Final/undertow-servlet-2.2.26.Final.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/io/undertow/undertow-servlet/2.2.26.Final/pom.xml' test
# Compile and run 4 generated test classes for io/undertow/undertow-servlet/2.2.28.Final/undertow-servlet-2.2.28.Final.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/io/undertow/undertow-servlet/2.2.28.Final/pom.xml' test
# Compile and run 4 generated test classes for io/undertow/undertow-servlet/2.2.31.Final/undertow-servlet-2.2.31.Final.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/io/undertow/undertow-servlet/2.2.31.Final/pom.xml' test
# Compile and run 4 generated test classes for io/undertow/undertow-servlet/2.2.32.Final/undertow-servlet-2.2.32.Final.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/io/undertow/undertow-servlet/2.2.32.Final/pom.xml' test
# Compile and run 12 generated test classes for org/apache/hadoop/hadoop-hdfs/3.3.5/hadoop-hdfs-3.3.5.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/apache/hadoop/hadoop-hdfs/3.3.5/pom.xml' test
# Compile and run 12 generated test classes for org/apache/hadoop/hadoop-hdfs/3.3.6/hadoop-hdfs-3.3.6.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/apache/hadoop/hadoop-hdfs/3.3.6/pom.xml' test
# Compile and run 28 generated test classes for org/apache/hadoop/hadoop-hdfs/3.4.0/hadoop-hdfs-3.4.0.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/apache/hadoop/hadoop-hdfs/3.4.0/pom.xml' test
# Compile and run 2 generated test classes for org/glassfish/jersey/connectors/jersey-netty-connector/3.0.12/jersey-netty-connector-3.0.12.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/glassfish/jersey/connectors/jersey-netty-connector/3.0.12/pom.xml' test
# Compile and run 2 generated test classes for org/glassfish/jersey/containers/jersey-container-grizzly2-http/3.0.12/jersey-container-grizzly2-http-3.0.12.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/glassfish/jersey/containers/jersey-container-grizzly2-http/3.0.12/pom.xml' test
# Compile and run 2 generated test classes for org/glassfish/jersey/containers/jersey-container-jdk-http/3.0.12/jersey-container-jdk-http-3.0.12.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/glassfish/jersey/containers/jersey-container-jdk-http/3.0.12/pom.xml' test
# Compile and run 2 generated test classes for org/glassfish/jersey/containers/jersey-container-servlet-core/3.0.12/jersey-container-servlet-core-3.0.12.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/glassfish/jersey/containers/jersey-container-servlet-core/3.0.12/pom.xml' test
# Compile and run 2 generated test classes for org/glassfish/jersey/containers/jersey-container-servlet/3.0.12/jersey-container-servlet-3.0.12.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/glassfish/jersey/containers/jersey-container-servlet/3.0.12/pom.xml' test
# Compile and run 2 generated test classes for org/glassfish/jersey/containers/jersey-container-simple-http/3.0.12/jersey-container-simple-http-3.0.12.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/glassfish/jersey/containers/jersey-container-simple-http/3.0.12/pom.xml' test
# Compile and run 4 generated test classes for org/glassfish/jersey/core/jersey-client/2.37/jersey-client-2.37.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/glassfish/jersey/core/jersey-client/2.37/pom.xml' test
# Compile and run 4 generated test classes for org/glassfish/jersey/core/jersey-client/2.38/jersey-client-2.38.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/glassfish/jersey/core/jersey-client/2.38/pom.xml' test
# Compile and run 4 generated test classes for org/glassfish/jersey/core/jersey-client/2.39.1/jersey-client-2.39.1.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/glassfish/jersey/core/jersey-client/2.39.1/pom.xml' test
# Compile and run 4 generated test classes for org/glassfish/jersey/core/jersey-client/2.39/jersey-client-2.39.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/glassfish/jersey/core/jersey-client/2.39/pom.xml' test
# Compile and run 2 generated test classes for org/glassfish/jersey/core/jersey-client/2.40/jersey-client-2.40.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/glassfish/jersey/core/jersey-client/2.40/pom.xml' test
# Compile and run 2 generated test classes for org/glassfish/jersey/core/jersey-client/2.41/jersey-client-2.41.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/glassfish/jersey/core/jersey-client/2.41/pom.xml' test
# Compile and run 2 generated test classes for org/glassfish/jersey/core/jersey-client/3.0.11/jersey-client-3.0.11.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/glassfish/jersey/core/jersey-client/3.0.11/pom.xml' test
# Compile and run 2 generated test classes for org/glassfish/jersey/core/jersey-client/3.0.12/jersey-client-3.0.12.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/glassfish/jersey/core/jersey-client/3.0.12/pom.xml' test
# Compile and run 2 generated test classes for org/glassfish/jersey/core/jersey-client/3.0.12/jersey-client-3.0.12.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/glassfish/jersey/core/jersey-client/3.0.12/pom.xml' test
# Compile and run 4 generated test classes for org/glassfish/jersey/core/jersey-client/3.0.9/jersey-client-3.0.9.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/glassfish/jersey/core/jersey-client/3.0.9/pom.xml' test
# Compile and run 2 generated test classes for org/glassfish/jersey/core/jersey-server/2.37/jersey-server-2.37.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/glassfish/jersey/core/jersey-server/2.37/pom.xml' test
# Compile and run 2 generated test classes for org/glassfish/jersey/core/jersey-server/2.38/jersey-server-2.38.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/glassfish/jersey/core/jersey-server/2.38/pom.xml' test
# Compile and run 2 generated test classes for org/glassfish/jersey/core/jersey-server/2.39.1/jersey-server-2.39.1.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/glassfish/jersey/core/jersey-server/2.39.1/pom.xml' test
# Compile and run 2 generated test classes for org/glassfish/jersey/core/jersey-server/2.39/jersey-server-2.39.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/glassfish/jersey/core/jersey-server/2.39/pom.xml' test
# Compile and run 2 generated test classes for org/glassfish/jersey/core/jersey-server/2.40/jersey-server-2.40.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/glassfish/jersey/core/jersey-server/2.40/pom.xml' test
# Compile and run 2 generated test classes for org/glassfish/jersey/core/jersey-server/3.0.10/jersey-server-3.0.10.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/glassfish/jersey/core/jersey-server/3.0.10/pom.xml' test
# Compile and run 2 generated test classes for org/glassfish/jersey/core/jersey-server/3.0.11/jersey-server-3.0.11.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/glassfish/jersey/core/jersey-server/3.0.11/pom.xml' test
# Compile and run 2 generated test classes for org/glassfish/jersey/core/jersey-server/3.0.12/jersey-server-3.0.12.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/glassfish/jersey/core/jersey-server/3.0.12/pom.xml' test
# Compile and run 2 generated test classes for org/glassfish/jersey/core/jersey-server/3.0.12/jersey-server-3.0.12.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/glassfish/jersey/core/jersey-server/3.0.12/pom.xml' test
# Compile and run 2 generated test classes for org/glassfish/jersey/core/jersey-server/3.0.9/jersey-server-3.0.9.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/glassfish/jersey/core/jersey-server/3.0.9/pom.xml' test
# Compile and run 2 generated test classes for org/glassfish/jersey/inject/jersey-hk2/3.0.12/jersey-hk2-3.0.12.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/glassfish/jersey/inject/jersey-hk2/3.0.12/pom.xml' test
# Compile and run 2 generated test classes for org/glassfish/jersey/media/jersey-media-jaxb/3.0.12/jersey-media-jaxb-3.0.12.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/glassfish/jersey/media/jersey-media-jaxb/3.0.12/pom.xml' test
