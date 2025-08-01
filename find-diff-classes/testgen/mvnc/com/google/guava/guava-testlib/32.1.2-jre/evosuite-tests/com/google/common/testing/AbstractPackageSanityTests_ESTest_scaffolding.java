/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Oct 23 13:52:16 GMT 2024
 */

package com.google.common.testing;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class AbstractPackageSanityTests_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.google.common.testing.AbstractPackageSanityTests"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.dir", "/home/wtwhite/code/regression-test-generation/find-diff-classes/testgen/mvnc/com/google/guava/guava-testlib/32.1.2-jre"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AbstractPackageSanityTests_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.common.collect.ImmutableList$SubList",
      "com.google.common.collect.ObjectArrays",
      "com.google.common.collect.ImmutableAsList",
      "com.google.common.testing.AbstractPackageSanityTests",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.RegularImmutableAsList",
      "com.google.common.collect.Multimap",
      "com.google.common.collect.ImmutableList$1",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.testing.ElementTypesAreNonnullByDefault",
      "com.google.common.collect.ImmutableList",
      "com.google.common.base.Predicate",
      "com.google.common.testing.AbstractPackageSanityTests$Chopper",
      "com.google.common.base.Optional",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.google.common.testing.AbstractPackageSanityTests$Chopper$2",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.testing.AbstractPackageSanityTests$Chopper$1",
      "com.google.common.collect.SingletonImmutableList"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AbstractPackageSanityTests_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.ObjectArrays",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.testing.AbstractPackageSanityTests$Chopper",
      "com.google.common.testing.AbstractPackageSanityTests$Chopper$2",
      "com.google.common.testing.AbstractPackageSanityTests$Chopper$1",
      "com.google.common.testing.AbstractPackageSanityTests",
      "com.google.common.testing.NullPointerTester$Visibility",
      "com.google.common.base.StandardSystemProperty",
      "com.google.common.base.Splitter",
      "com.google.common.base.Preconditions",
      "com.google.common.base.CharMatcher",
      "com.google.common.base.CharMatcher$FastMatcher",
      "com.google.common.base.CharMatcher$Is",
      "com.google.common.base.Splitter$1",
      "com.google.common.base.CharMatcher$NamedFastMatcher",
      "com.google.common.base.CharMatcher$None",
      "com.google.common.reflect.ClassPath",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.RegularImmutableMap"
    );
  }
}
