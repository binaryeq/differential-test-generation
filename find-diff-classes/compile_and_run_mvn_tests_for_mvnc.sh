#!/bin/bash
set -v
echo "Will write test results under RUNDIR=${RUNDIR:=$(pwd)/run-mvn}"   # Default to '$(pwd)/run-mvn' if not overridden
# Compile and run 22 generated test classes for com/github/oshi/oshi-core/6.4.0/oshi-core-6.4.0.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/com/github/oshi/oshi-core/6.4.0/pom.xml' test
# Compile and run 22 generated test classes for com/github/oshi/oshi-core/6.4.1/oshi-core-6.4.1.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/com/github/oshi/oshi-core/6.4.1/pom.xml' test
# Compile and run 30 generated test classes for com/github/oshi/oshi-core/6.4.2/oshi-core-6.4.2.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/com/github/oshi/oshi-core/6.4.2/pom.xml' test
# Compile and run 2 generated test classes for com/github/zafarkhaja/java-semver/0.9.0/java-semver-0.9.0.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/com/github/zafarkhaja/java-semver/0.9.0/pom.xml' test
# Compile and run 14 generated test classes for com/google/auto/auto-common/1.2.1/auto-common-1.2.1.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/com/google/auto/auto-common/1.2.1/pom.xml' test
# Compile and run 6 generated test classes for com/google/auto/auto-common/1.2.2/auto-common-1.2.2.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/com/google/auto/auto-common/1.2.2/pom.xml' test
# Compile and run 34 generated test classes for com/google/guava/guava-testlib/32.1.2-jre/guava-testlib-32.1.2-jre.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/com/google/guava/guava-testlib/32.1.2-jre/pom.xml' test
# Compile and run 320 generated test classes for com/google/guava/guava/31.0.1-jre/guava-31.0.1-jre.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/com/google/guava/guava/31.0.1-jre/pom.xml' test
# Compile and run 2 generated test classes for com/google/inject/extensions/guice-assistedinject/6.0.0/guice-assistedinject-6.0.0.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/com/google/inject/extensions/guice-assistedinject/6.0.0/pom.xml' test
# Compile and run 2 generated test classes for com/google/inject/extensions/guice-assistedinject/7.0.0/guice-assistedinject-7.0.0.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/com/google/inject/extensions/guice-assistedinject/7.0.0/pom.xml' test
# Compile and run 6 generated test classes for com/google/inject/extensions/guice-servlet/6.0.0/guice-servlet-6.0.0.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/com/google/inject/extensions/guice-servlet/6.0.0/pom.xml' test
# Compile and run 6 generated test classes for com/google/inject/extensions/guice-servlet/7.0.0/guice-servlet-7.0.0.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/com/google/inject/extensions/guice-servlet/7.0.0/pom.xml' test
# Compile and run 44 generated test classes for com/google/jimfs/jimfs/1.2/jimfs-1.2.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/com/google/jimfs/jimfs/1.2/pom.xml' test
# Compile and run 2 generated test classes for com/google/zxing/core/3.5.0/core-3.5.0.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/com/google/zxing/core/3.5.0/pom.xml' test
# Compile and run 2 generated test classes for com/google/zxing/core/3.5.1/core-3.5.1.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/com/google/zxing/core/3.5.1/pom.xml' test
# Compile and run 2 generated test classes for com/google/zxing/core/3.5.3/core-3.5.3.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/com/google/zxing/core/3.5.3/pom.xml' test
# Compile and run 2 generated test classes for com/squareup/okhttp/okhttp/2.7.5/okhttp-2.7.5.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/com/squareup/okhttp/okhttp/2.7.5/pom.xml' test
# Compile and run 2 generated test classes for commons-configuration/commons-configuration/1.10/commons-configuration-1.10.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/commons-configuration/commons-configuration/1.10/pom.xml' test
# Compile and run 2 generated test classes for commons-io/commons-io/2.14.0/commons-io-2.14.0.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/commons-io/commons-io/2.14.0/pom.xml' test
# Compile and run 10 generated test classes for commons-io/commons-io/2.15.0/commons-io-2.15.0.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/commons-io/commons-io/2.15.0/pom.xml' test
# Compile and run 10 generated test classes for commons-io/commons-io/2.15.0/commons-io-2.15.0.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/commons-io/commons-io/2.15.0/pom.xml' test
# Compile and run 2 generated test classes for commons-io/commons-io/2.15.1/commons-io-2.15.1.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/commons-io/commons-io/2.15.1/pom.xml' test
# Compile and run 2 generated test classes for commons-io/commons-io/2.16.0/commons-io-2.16.0.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/commons-io/commons-io/2.16.0/pom.xml' test
# Compile and run 2 generated test classes for commons-logging/commons-logging/1.2/commons-logging-1.2.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/commons-logging/commons-logging/1.2/pom.xml' test
# Compile and run 2 generated test classes for commons-logging/commons-logging/1.3.0/commons-logging-1.3.0.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/commons-logging/commons-logging/1.3.0/pom.xml' test
# Compile and run 2 generated test classes for commons-net/commons-net/3.10.0/commons-net-3.10.0.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/commons-net/commons-net/3.10.0/pom.xml' test
# Compile and run 2 generated test classes for io/micronaut/kubernetes/micronaut-kubernetes-discovery-client/3.4.1/micronaut-kubernetes-discovery-client-3.4.1.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/io/micronaut/kubernetes/micronaut-kubernetes-discovery-client/3.4.1/pom.xml' test
# Compile and run 2 generated test classes for io/netty/netty-buffer/4.1.102.Final/netty-buffer-4.1.102.Final.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/io/netty/netty-buffer/4.1.102.Final/pom.xml' test
# Compile and run 6 generated test classes for io/netty/netty-codec-http/4.1.102.Final/netty-codec-http-4.1.102.Final.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/io/netty/netty-codec-http/4.1.102.Final/pom.xml' test
# Compile and run 4 generated test classes for io/netty/netty-codec/4.1.102.Final/netty-codec-4.1.102.Final.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/io/netty/netty-codec/4.1.102.Final/pom.xml' test
# Compile and run 2 generated test classes for junit/junit/4.13.2/junit-4.13.2.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/junit/junit/4.13.2/pom.xml' test
# Compile and run 2 generated test classes for junit/junit/4.13.2/junit-4.13.2.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/junit/junit/4.13.2/pom.xml' test
# Compile and run 4 generated test classes for org/apache/avro/avro/1.11.1/avro-1.11.1.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/apache/avro/avro/1.11.1/pom.xml' test
# Compile and run 2 generated test classes for org/apache/commons/commons-configuration2/2.7/commons-configuration2-2.7.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/apache/commons/commons-configuration2/2.7/pom.xml' test
# Compile and run 2 generated test classes for org/apache/commons/commons-configuration2/2.8.0/commons-configuration2-2.8.0.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/apache/commons/commons-configuration2/2.8.0/pom.xml' test
# Compile and run 2 generated test classes for org/apache/curator/curator-recipes/5.6.0/curator-recipes-5.6.0.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/apache/curator/curator-recipes/5.6.0/pom.xml' test
# Compile and run 2 generated test classes for org/apache/cxf/cxf-rt-transports-http/3.5.8/cxf-rt-transports-http-3.5.8.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/apache/cxf/cxf-rt-transports-http/3.5.8/pom.xml' test
# Compile and run 10 generated test classes for org/apache/hadoop/hadoop-mapreduce-client-core/3.3.5/hadoop-mapreduce-client-core-3.3.5.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/apache/hadoop/hadoop-mapreduce-client-core/3.3.5/pom.xml' test
# Compile and run 2 generated test classes for org/apache/httpcomponents/core5/httpcore5/5.1.4/httpcore5-5.1.4.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/apache/httpcomponents/core5/httpcore5/5.1.4/pom.xml' test
# Compile and run 2 generated test classes for org/apache/httpcomponents/core5/httpcore5/5.1.5/httpcore5-5.1.5.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/apache/httpcomponents/core5/httpcore5/5.1.5/pom.xml' test
# Compile and run 2 generated test classes for org/apache/logging/log4j/log4j-api/2.17.1/log4j-api-2.17.1.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/apache/logging/log4j/log4j-api/2.17.1/pom.xml' test
# Compile and run 2 generated test classes for org/codehaus/janino/janino/3.1.12/janino-3.1.12.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/codehaus/janino/janino/3.1.12/pom.xml' test
# Compile and run 2 generated test classes for org/codehaus/janino/janino/3.1.9/janino-3.1.9.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/codehaus/janino/janino/3.1.9/pom.xml' test
# Compile and run 4 generated test classes for org/flywaydb/flyway-core/9.15.0/flyway-core-9.15.0.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/flywaydb/flyway-core/9.15.0/pom.xml' test
# Compile and run 4 generated test classes for org/flywaydb/flyway-core/9.16.1/flyway-core-9.16.1.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/flywaydb/flyway-core/9.16.1/pom.xml' test
# Compile and run 4 generated test classes for org/flywaydb/flyway-core/9.16.2/flyway-core-9.16.2.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/flywaydb/flyway-core/9.16.2/pom.xml' test
# Compile and run 4 generated test classes for org/flywaydb/flyway-core/9.17.0/flyway-core-9.17.0.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/flywaydb/flyway-core/9.17.0/pom.xml' test
# Compile and run 4 generated test classes for org/flywaydb/flyway-core/9.18.0/flyway-core-9.18.0.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/flywaydb/flyway-core/9.18.0/pom.xml' test
# Compile and run 4 generated test classes for org/flywaydb/flyway-core/9.19.0/flyway-core-9.19.0.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/flywaydb/flyway-core/9.19.0/pom.xml' test
# Compile and run 4 generated test classes for org/flywaydb/flyway-core/9.19.1/flyway-core-9.19.1.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/flywaydb/flyway-core/9.19.1/pom.xml' test
# Compile and run 4 generated test classes for org/flywaydb/flyway-core/9.19.3/flyway-core-9.19.3.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/flywaydb/flyway-core/9.19.3/pom.xml' test
# Compile and run 4 generated test classes for org/flywaydb/flyway-core/9.19.4/flyway-core-9.19.4.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/flywaydb/flyway-core/9.19.4/pom.xml' test
# Compile and run 4 generated test classes for org/flywaydb/flyway-core/9.20.0/flyway-core-9.20.0.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/flywaydb/flyway-core/9.20.0/pom.xml' test
# Compile and run 4 generated test classes for org/flywaydb/flyway-core/9.20.1/flyway-core-9.20.1.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/flywaydb/flyway-core/9.20.1/pom.xml' test
# Compile and run 2 generated test classes for org/flywaydb/flyway-core/9.21.1/flyway-core-9.21.1.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/flywaydb/flyway-core/9.21.1/pom.xml' test
# Compile and run 4 generated test classes for org/jfree/jfreechart/1.5.4/jfreechart-1.5.4.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/jfree/jfreechart/1.5.4/pom.xml' test
# Compile and run 4 generated test classes for org/threeten/threetenbp/1.6.5/threetenbp-1.6.5.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/threeten/threetenbp/1.6.5/pom.xml' test
# Compile and run 6 generated test classes for org/threeten/threetenbp/1.6.6/threetenbp-1.6.6.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/threeten/threetenbp/1.6.6/pom.xml' test
# Compile and run 6 generated test classes for org/threeten/threetenbp/1.6.7/threetenbp-1.6.7.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/threeten/threetenbp/1.6.7/pom.xml' test
# Compile and run 2 generated test classes for org/threeten/threetenbp/1.6.8/threetenbp-1.6.8.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/threeten/threetenbp/1.6.8/pom.xml' test
# Compile and run 4 generated test classes for org/threeten/threetenbp/1.6.9/threetenbp-1.6.9.jar for mvnc
mvn -DRUNDIR="${RUNDIR}" -f 'compile/mvnc/org/threeten/threetenbp/1.6.9/pom.xml' test
