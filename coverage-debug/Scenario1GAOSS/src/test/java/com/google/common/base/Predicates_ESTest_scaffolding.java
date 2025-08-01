/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Oct 23 14:12:27 GMT 2024
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
public class Predicates_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) System.getProperties().clone();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.google.common.base.Predicates"; 
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
    System.setProperty("java.io.tmpdir", "/tmp");
    System.setProperty("user.dir", "/home/wtwhite/code/regression-test-generation/find-diff-classes/testgen/mvnc/com/google/guava/guava/31.0.1-jre");
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Predicates_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.common.base.Converter$ConverterComposition",
      "com.google.common.base.Predicates$IsEqualToPredicate",
      "com.google.common.base.JdkPattern",
      "com.google.common.base.Predicates$ObjectPredicate",
      "com.google.common.base.Platform",
      "com.google.common.base.Predicates$SubtypeOfPredicate",
      "com.google.common.base.Predicates$ContainsPatternFromStringPredicate",
      "com.google.common.base.Platform$JdkPatternCompiler",
      "com.google.common.base.CommonMatcher",
      "com.google.common.base.Predicates$ContainsPatternPredicate",
      "com.google.common.base.Converter",
      "com.google.common.base.Predicates$AndPredicate",
      "com.google.common.base.Function",
      "com.google.common.base.Converter$IdentityConverter",
      "com.google.common.collect.Range",
      "com.google.common.base.Predicates$NotPredicate",
      "com.google.common.base.CommonPattern",
      "com.google.common.base.Converter$ReverseConverter",
      "com.google.common.base.Predicate",
      "com.google.common.collect.BoundType",
      "com.google.common.collect.Cut$AboveValue",
      "com.google.common.primitives.Booleans",
      "com.google.common.base.Predicates$InstanceOfPredicate",
      "com.google.common.base.MoreObjects$ToStringHelper$ValueHolder",
      "com.google.common.base.Predicates$ObjectPredicate$1",
      "com.google.common.base.JdkPattern$JdkMatcher",
      "com.google.common.base.MoreObjects$ToStringHelper",
      "com.google.common.collect.Cut$BelowValue",
      "com.google.common.base.PatternCompiler",
      "com.google.common.collect.DiscreteDomain",
      "com.google.common.base.Predicates",
      "com.google.common.base.MoreObjects$ToStringHelper$UnconditionalValueHolder",
      "com.google.common.collect.Cut",
      "com.google.common.collect.RangeGwtSerializationDependencies",
      "com.google.common.collect.Cut$BelowAll",
      "com.google.common.base.CharMatcher",
      "com.google.common.base.MoreObjects",
      "com.google.common.base.Converter$FunctionBasedConverter",
      "com.google.common.base.ElementTypesAreNonnullByDefault",
      "com.google.common.collect.Ordering",
      "com.google.common.base.Predicates$ObjectPredicate$4",
      "com.google.common.base.Predicates$ObjectPredicate$3",
      "com.google.common.base.Predicates$ObjectPredicate$2",
      "com.google.common.base.Predicates$CompositionPredicate",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.ElementTypesAreNonnullByDefault",
      "com.google.common.base.Predicates$OrPredicate",
      "com.google.common.collect.Cut$AboveAll",
      "com.google.common.base.Predicates$InPredicate"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Predicates_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.common.base.Predicates",
      "com.google.common.base.Predicates$ObjectPredicate",
      "com.google.common.base.Predicates$NotPredicate",
      "com.google.common.base.Predicates$AndPredicate",
      "com.google.common.base.Predicates$OrPredicate",
      "com.google.common.base.Predicates$IsEqualToPredicate",
      "com.google.common.base.Predicates$InstanceOfPredicate",
      "com.google.common.base.Predicates$SubtypeOfPredicate",
      "com.google.common.base.Predicates$InPredicate",
      "com.google.common.base.Predicates$CompositionPredicate",
      "com.google.common.base.Predicates$ContainsPatternPredicate",
      "com.google.common.base.Predicates$ContainsPatternFromStringPredicate",
      "com.google.common.hash.BloomFilter",
      "com.google.common.hash.BloomFilterStrategies",
      "com.google.common.base.Preconditions",
      "com.google.common.base.Strings",
      "com.google.common.collect.RangeGwtSerializationDependencies",
      "com.google.common.collect.Cut",
      "com.google.common.collect.Cut$BelowAll",
      "com.google.common.collect.Cut$AboveAll",
      "com.google.common.collect.Range",
      "com.google.common.collect.Cut$AboveValue",
      "com.google.common.collect.Cut$BelowValue",
      "com.google.common.primitives.Booleans",
      "com.google.common.collect.Range$1",
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
      "com.google.common.primitives.SignedBytes",
      "com.google.common.primitives.UnsignedBytes",
      "com.google.common.base.ExtraObjectsMethodsForWeb",
      "com.google.common.base.Objects",
      "com.google.common.base.CommonPattern",
      "com.google.common.base.JdkPattern",
      "com.google.common.collect.Ordering",
      "com.google.common.collect.NaturalOrdering",
      "com.google.common.base.CharMatcher",
      "com.google.common.base.CharMatcher$FastMatcher",
      "com.google.common.base.CharMatcher$NamedFastMatcher",
      "com.google.common.base.CharMatcher$Any",
      "com.google.common.base.MoreObjects",
      "com.google.common.base.MoreObjects$ToStringHelper",
      "com.google.common.base.MoreObjects$ToStringHelper$ValueHolder",
      "com.google.common.base.MoreObjects$ToStringHelper$UnconditionalValueHolder",
      "com.google.common.base.CharMatcher$Ascii",
      "com.google.common.base.CharMatcher$Whitespace",
      "com.google.common.base.CharMatcher$And",
      "com.google.common.base.CharMatcher$Negated",
      "com.google.common.base.CharMatcher$NegatedFastMatcher",
      "com.google.common.base.CharMatcher$AnyOf",
      "com.google.common.base.CharMatcher$JavaIsoControl",
      "com.google.common.base.Converter",
      "com.google.common.base.Converter$IdentityConverter",
      "com.google.common.base.Converter$FunctionBasedConverter",
      "com.google.common.base.Converter$ConverterComposition",
      "com.google.common.base.Converter$1",
      "com.google.common.base.Platform$JdkPatternCompiler",
      "com.google.common.base.Platform",
      "com.google.common.base.CharMatcher$Is",
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
      "com.google.common.base.CharMatcher$IsNot",
      "com.google.common.base.CharMatcher$None",
      "com.google.common.base.CharMatcher$BreakingWhitespace",
      "com.google.common.base.CharMatcher$Or",
      "com.google.common.base.CharMatcher$ForPredicate",
      "com.google.common.base.SmallCharMatcher",
      "com.google.common.base.Converter$ReverseConverter",
      "com.google.common.base.CharMatcher$InRange",
      "com.google.common.collect.DiscreteDomain",
      "com.google.common.math.DoubleMath",
      "com.google.common.math.DoubleUtils",
      "com.google.common.math.DoubleMath$1",
      "com.google.common.math.MathPreconditions"
    );
  }
}
