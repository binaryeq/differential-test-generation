#!/bin/bash
set -veo pipefail	# Exit on first failure

#JAVAC=/usr/lib/jvm/java-8-openjdk-amd64/bin/javac
JAVAC=/usr/lib/jvm/java-11-openjdk-amd64/bin/javac
#JAVA=/usr/lib/jvm/java-8-openjdk-amd64/jre/bin/java
JAVA=/usr/lib/jvm/java-11-openjdk-amd64/bin/java

DEPS="../compile/gaoss/io/undertow/undertow-servlet/2.2.23.Final/t/dependency/commons-codec-1.11.jar:../compile/gaoss/io/undertow/undertow-servlet/2.2.23.Final/t/dependency/commons-logging-1.2.jar:../compile/gaoss/io/undertow/undertow-servlet/2.2.23.Final/t/dependency/hamcrest-core-1.3.jar:../compile/gaoss/io/undertow/undertow-servlet/2.2.23.Final/t/dependency/httpclient-4.5.12.jar:../compile/gaoss/io/undertow/undertow-servlet/2.2.23.Final/t/dependency/httpcore-4.4.13.jar:../compile/gaoss/io/undertow/undertow-servlet/2.2.23.Final/t/dependency/httpmime-4.5.12.jar:../compile/gaoss/io/undertow/undertow-servlet/2.2.23.Final/t/dependency/jboss-annotations-api_1.3_spec-2.0.1.Final.jar:../compile/gaoss/io/undertow/undertow-servlet/2.2.23.Final/t/dependency/jboss-logging-3.4.1.Final.jar:../compile/gaoss/io/undertow/undertow-servlet/2.2.23.Final/t/dependency/jboss-logging-annotations-2.2.1.Final.jar:../compile/gaoss/io/undertow/undertow-servlet/2.2.23.Final/t/dependency/jboss-logging-processor-2.2.1.Final.jar:../compile/gaoss/io/undertow/undertow-servlet/2.2.23.Final/t/dependency/jboss-logmanager-2.1.14.Final.jar:../compile/gaoss/io/undertow/undertow-servlet/2.2.23.Final/t/dependency/jboss-servlet-api_4.0_spec-2.0.0.Final.jar:../compile/gaoss/io/undertow/undertow-servlet/2.2.23.Final/t/dependency/jboss-threads-3.1.0.Final.jar:../compile/gaoss/io/undertow/undertow-servlet/2.2.23.Final/t/dependency/jdeparser-2.0.3.Final.jar:../compile/gaoss/io/undertow/undertow-servlet/2.2.23.Final/t/dependency/junit-4.13.jar:../compile/gaoss/io/undertow/undertow-servlet/2.2.23.Final/t/dependency/netty-all-4.1.50.Final.jar:../compile/gaoss/io/undertow/undertow-servlet/2.2.23.Final/t/dependency/undertow-core-2.2.23.Final.jar:../compile/gaoss/io/undertow/undertow-servlet/2.2.23.Final/t/dependency/undertow-core-2.2.23.Final-tests.jar:../compile/gaoss/io/undertow/undertow-servlet/2.2.23.Final/t/dependency/wildfly-client-config-1.0.1.Final.jar:../compile/gaoss/io/undertow/undertow-servlet/2.2.23.Final/t/dependency/wildfly-common-1.5.4.Final.jar:../compile/gaoss/io/undertow/undertow-servlet/2.2.23.Final/t/dependency/wildfly-openssl-1.0.4.Final.jar:../compile/gaoss/io/undertow/undertow-servlet/2.2.23.Final/t/dependency/xnio-api-3.8.7.Final.jar:../compile/gaoss/io/undertow/undertow-servlet/2.2.23.Final/t/dependency/xnio-nio-3.8.7.Final.jar"

CLASSPATH_TO_USE="/home/wtwhite/code/craw-redhat-oss/wget/crawl/google-aoss/io/undertow/undertow-servlet/2.2.23.Final/undertow-servlet-2.2.23.Final.jar:$DEPS:/home/wtwhite/code/regression-test-generation/evosuite/evosuite-standalone-runtime-1.2.0.jar:.:/home/wtwhite/.m2/repository/junit/junit/4.13.2/junit-4.13.2.jar:/home/wtwhite/.m2/repository/org/hamcrest/hamcrest-core/1.3/hamcrest-core-1.3.jar"

# Clean slate
rm -rf Repro.class

# Compile
CLASSPATH="$CLASSPATH_TO_USE" $JAVAC -source 1.8 -target 1.8 Repro.java

# Run
CLASSPATH="$CLASSPATH_TO_USE" $JAVA Repro > "repro.out" 2> "repro.err"
