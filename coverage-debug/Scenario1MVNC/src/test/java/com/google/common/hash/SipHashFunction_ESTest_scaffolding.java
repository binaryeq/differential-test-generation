/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Oct 23 16:19:39 GMT 2024
 */

package com.google.common.hash;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class SipHashFunction_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) System.getProperties().clone();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.google.common.hash.SipHashFunction"; 
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
    System.setProperties((java.util.Properties) defaultProperties.clone());
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
 
    System.setProperties((java.util.Properties) defaultProperties.clone());
    System.setProperty("user.dir", "/home/wtwhite/code/regression-test-generation/find-diff-classes/testgen/mvnc/com/google/guava/guava/31.0.1-jre");
    System.setProperty("java.io.tmpdir", "/tmp");
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SipHashFunction_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.common.hash.AbstractStreamingHasher",
      "com.google.common.hash.HashCode$LongHashCode",
      "com.google.common.hash.SipHashFunction",
      "com.google.common.hash.Crc32cHashFunction",
      "com.google.common.hash.HashCode",
      "com.google.common.hash.Hashing",
      "com.google.common.hash.SipHashFunction$SipHasher",
      "com.google.common.hash.HashCode$IntHashCode",
      "com.google.common.hash.HashCode$BytesHashCode",
      "com.google.common.hash.Java8Compatibility",
      "com.google.common.hash.Murmur3_32HashFunction",
      "com.google.common.hash.Funnel",
      "com.google.common.base.Strings",
      "com.google.common.hash.AbstractHashFunction",
      "com.google.common.hash.AbstractHasher",
      "com.google.common.hash.ElementTypesAreNonnullByDefault",
      "com.google.errorprone.annotations.Immutable",
      "com.google.common.hash.PrimitiveSink",
      "com.google.common.base.Preconditions",
      "com.google.common.hash.HashFunction",
      "com.google.common.hash.Hasher"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(SipHashFunction_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.common.hash.AbstractHashFunction",
      "com.google.common.base.Preconditions",
      "com.google.common.hash.SipHashFunction",
      "com.google.common.hash.AbstractHasher",
      "com.google.common.hash.AbstractStreamingHasher",
      "com.google.common.hash.SipHashFunction$SipHasher",
      "com.google.common.base.Strings",
      "com.google.common.hash.Java8Compatibility",
      "com.google.common.hash.HashCode",
      "com.google.common.hash.HashCode$LongHashCode",
      "com.google.common.hash.Hashing",
      "com.google.common.hash.Murmur3_32HashFunction",
      "com.google.common.hash.Crc32cHashFunction",
      "com.google.common.hash.AbstractNonStreamingHashFunction",
      "com.google.common.hash.FarmHashFingerprint64",
      "com.google.common.hash.MessageDigestHashFunction",
      "com.google.common.hash.Murmur3_128HashFunction",
      "com.google.common.hash.Crc32cHashFunction$Crc32cHasher",
      "com.google.common.hash.HashCode$IntHashCode",
      "com.google.common.hash.Murmur3_128HashFunction$Murmur3_128Hasher",
      "com.google.common.primitives.UnsignedBytes",
      "com.google.common.hash.HashCode$BytesHashCode",
      "com.google.common.hash.MacHashFunction",
      "com.google.common.hash.LittleEndianByteArray$JavaLittleEndianBytes",
      "com.google.common.hash.LittleEndianByteArray$UnsafeByteArray$3",
      "com.google.common.hash.LittleEndianByteArray$UnsafeByteArray",
      "com.google.common.hash.LittleEndianByteArray"
    );
  }
}
