/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Oct 23 14:15:40 GMT 2024
 */

package com.google.common.base;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Splitter_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.google.common.base.Splitter"; 
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
    java.lang.System.setProperty("user.dir", "/home/wtwhite/code/regression-test-generation/find-diff-classes/testgen/mvnc/com/google/guava/guava/31.0.1-jre"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Splitter_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.common.base.CharMatcher$FastMatcher",
      "com.google.common.base.CharMatcher$JavaIsoControl",
      "com.google.common.base.Joiner$1",
      "com.google.common.base.Joiner$2",
      "com.google.common.base.CharMatcher$Whitespace",
      "com.google.common.base.CharMatcher$ForPredicate",
      "com.google.common.base.JdkPattern",
      "com.google.common.base.Platform",
      "com.google.common.base.CharMatcher$JavaDigit",
      "com.google.common.base.Splitter$2$1",
      "com.google.common.base.Splitter$4$1",
      "com.google.common.base.Platform$JdkPatternCompiler",
      "com.google.common.base.CommonMatcher",
      "com.google.common.base.CharMatcher$BitSetMatcher",
      "com.google.common.base.Splitter$MapSplitter",
      "com.google.common.base.CharMatcher$RangesMatcher",
      "com.google.common.base.Splitter",
      "com.google.common.base.CharMatcher$JavaUpperCase",
      "com.google.common.base.CharMatcher$InRange",
      "com.google.common.base.CharMatcher$IsNot",
      "com.google.common.base.CharMatcher$JavaLetter",
      "com.google.common.base.CharMatcher$JavaLetterOrDigit",
      "com.google.common.base.CharMatcher$BreakingWhitespace",
      "com.google.common.base.NullnessCasts",
      "com.google.common.base.CharMatcher$NegatedFastMatcher",
      "com.google.common.base.CharMatcher$NamedFastMatcher",
      "com.google.common.base.CommonPattern",
      "com.google.common.base.Predicate",
      "com.google.common.base.CharMatcher$IsEither",
      "com.google.common.base.CharMatcher$Is",
      "com.google.common.base.CharMatcher$Invisible",
      "com.google.common.base.CharMatcher$SingleWidth",
      "com.google.common.base.CharMatcher$None",
      "com.google.common.base.CharMatcher$JavaLowerCase",
      "com.google.common.base.Splitter$Strategy",
      "com.google.common.base.Joiner",
      "com.google.common.base.CharMatcher$Any",
      "com.google.common.base.AbstractIterator$1",
      "com.google.common.base.JdkPattern$JdkMatcher",
      "com.google.common.base.Strings",
      "com.google.common.base.Splitter$1$1",
      "com.google.common.base.PatternCompiler",
      "com.google.common.base.Splitter$3$1",
      "com.google.common.base.AbstractIterator$State",
      "com.google.common.base.Splitter$3",
      "com.google.common.base.Splitter$4",
      "com.google.common.base.CharMatcher$Negated",
      "com.google.common.base.Splitter$5",
      "com.google.common.base.CharMatcher",
      "com.google.common.base.CharMatcher$Ascii",
      "com.google.common.base.CharMatcher$And",
      "com.google.common.base.CharMatcher$Or",
      "com.google.common.base.Splitter$1",
      "com.google.common.base.Splitter$2",
      "com.google.common.base.ElementTypesAreNonnullByDefault",
      "com.google.common.base.CharMatcher$AnyOf",
      "com.google.common.base.Splitter$SplittingIterator",
      "com.google.common.base.AbstractIterator",
      "com.google.common.base.CharMatcher$Digit",
      "com.google.common.base.Preconditions",
      "com.google.common.base.CharMatcher$1"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Splitter_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.common.base.Splitter",
      "com.google.common.base.Splitter$1",
      "com.google.common.base.Splitter$2",
      "com.google.common.base.Splitter$3",
      "com.google.common.base.Splitter$4",
      "com.google.common.base.Splitter$5",
      "com.google.common.base.Splitter$MapSplitter",
      "com.google.common.base.CharMatcher",
      "com.google.common.base.CharMatcher$FastMatcher",
      "com.google.common.base.CharMatcher$NamedFastMatcher",
      "com.google.common.base.Preconditions",
      "com.google.common.base.CharMatcher$None",
      "com.google.common.base.Platform$JdkPatternCompiler",
      "com.google.common.base.Platform",
      "com.google.common.base.CharMatcher$Whitespace",
      "com.google.common.base.CharMatcher$Is",
      "com.google.common.base.CommonPattern",
      "com.google.common.base.JdkPattern",
      "com.google.common.base.CommonMatcher",
      "com.google.common.base.JdkPattern$JdkMatcher",
      "com.google.common.base.Strings",
      "com.google.common.base.Joiner",
      "com.google.common.base.AbstractIterator",
      "com.google.common.base.Splitter$SplittingIterator",
      "com.google.common.base.Splitter$1$1",
      "com.google.common.base.AbstractIterator$State",
      "com.google.common.base.AbstractIterator$1",
      "com.google.common.base.NullnessCasts",
      "com.google.common.base.CharMatcher$Negated",
      "com.google.common.base.CharMatcher$NegatedFastMatcher",
      "com.google.common.base.CharMatcher$IsNot",
      "com.google.common.base.Splitter$3$1",
      "com.google.common.base.CharMatcher$Ascii",
      "com.google.common.base.Predicates$ObjectPredicate",
      "com.google.common.base.Splitter$2$1",
      "com.google.common.base.CharMatcher$AnyOf",
      "com.google.common.base.CharMatcher$JavaIsoControl",
      "com.google.common.base.SmallCharMatcher",
      "com.google.common.base.CharMatcher$BreakingWhitespace",
      "com.google.common.base.Splitter$4$1",
      "com.google.common.hash.BloomFilter",
      "com.google.common.base.CharMatcher$Any",
      "com.google.common.hash.BloomFilterStrategies",
      "com.google.common.base.CharMatcher$ForPredicate",
      "com.google.common.hash.BloomFilterStrategies$LockFreeBitArray",
      "com.google.common.math.LongMath",
      "com.google.common.math.LongMath$1",
      "com.google.common.primitives.IntsMethodsForWeb",
      "com.google.common.primitives.Ints",
      "com.google.common.hash.Striped64$1",
      "com.google.common.hash.Striped64",
      "com.google.common.hash.LongAdder",
      "com.google.common.hash.LongAddables$1",
      "com.google.common.hash.LongAddables",
      "com.google.common.base.CharMatcher$And",
      "com.google.common.base.CharMatcher$InRange",
      "com.google.common.base.CharMatcher$Or",
      "com.google.common.base.CharMatcher$IsEither",
      "com.google.common.hash.Hashing",
      "com.google.common.hash.AbstractHashFunction",
      "com.google.common.hash.Murmur3_128HashFunction",
      "com.google.common.hash.AbstractHasher",
      "com.google.common.hash.AbstractStreamingHasher",
      "com.google.common.hash.Murmur3_128HashFunction$Murmur3_128Hasher",
      "com.google.common.hash.Java8Compatibility",
      "com.google.common.hash.HashCode",
      "com.google.common.hash.HashCode$BytesHashCode",
      "com.google.common.primitives.Longs",
      "com.google.common.base.CharMatcher$1"
    );
  }
}
