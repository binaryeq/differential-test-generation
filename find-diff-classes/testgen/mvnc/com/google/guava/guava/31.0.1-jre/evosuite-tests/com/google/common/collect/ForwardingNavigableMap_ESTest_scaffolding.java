/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Oct 23 15:01:39 GMT 2024
 */

package com.google.common.collect;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class ForwardingNavigableMap_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.google.common.collect.ForwardingNavigableMap"; 
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
    try { initMocksToAvoidTimeoutsInTheTests(); } catch(ClassNotFoundException e) {} 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ForwardingNavigableMap_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.common.collect.ParametricNullness",
      "com.google.common.collect.ForwardingObject",
      "com.google.common.collect.ForwardingNavigableMap$StandardDescendingMap",
      "com.google.common.collect.Sets$SetView",
      "com.google.common.collect.ImmutableSet$CachingAsList",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableEnumSet",
      "com.google.common.collect.Maps$NavigableKeySet",
      "com.google.common.collect.Maps$DescendingMap$1EntrySetImpl",
      "com.google.common.collect.Sets$2",
      "com.google.common.collect.Maps$KeySet",
      "com.google.common.collect.Sets$3",
      "com.google.common.collect.Sets$1",
      "com.google.common.collect.ImmutableSortedSet",
      "com.google.common.collect.Sets$4",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.Maps$Values",
      "com.google.common.collect.Maps$SortedKeySet",
      "com.google.common.collect.ForwardingNavigableMap$StandardNavigableKeySet",
      "com.google.common.collect.ForwardingNavigableMap",
      "com.google.common.collect.Maps",
      "com.google.common.collect.Sets",
      "com.google.common.collect.ForwardingNavigableMap$StandardDescendingMap$1",
      "com.google.common.collect.ForwardingMap",
      "com.google.common.collect.DescendingImmutableSortedSet",
      "com.google.common.collect.SortedIterable",
      "com.google.common.collect.Ordering",
      "com.google.common.collect.BoundType",
      "com.google.common.collect.Sets$ImprovedAbstractSet",
      "com.google.common.collect.Maps$DescendingMap",
      "com.google.common.collect.ElementTypesAreNonnullByDefault",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.ImmutableSortedSetFauxverideShim",
      "com.google.common.collect.ForwardingSortedMap",
      "com.google.common.collect.Maps$EntrySet"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.google.common.collect.ForwardingNavigableMap", false, ForwardingNavigableMap_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ForwardingNavigableMap_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.common.collect.ForwardingObject",
      "com.google.common.collect.ForwardingMap",
      "com.google.common.collect.ForwardingSortedMap",
      "com.google.common.collect.ForwardingNavigableMap",
      "com.google.common.collect.Maps$DescendingMap",
      "com.google.common.collect.ForwardingNavigableMap$StandardDescendingMap",
      "com.google.common.collect.Sets$ImprovedAbstractSet",
      "com.google.common.collect.Maps$EntrySet",
      "com.google.common.collect.Maps$DescendingMap$1EntrySetImpl",
      "com.google.common.collect.Sets",
      "com.google.common.collect.ForwardingNavigableMap$StandardDescendingMap$1",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.ImmutableSet$CachingAsList",
      "com.google.common.collect.ImmutableSortedSetFauxverideShim",
      "com.google.common.collect.ImmutableSortedSet",
      "com.google.common.collect.Ordering",
      "com.google.common.collect.NaturalOrdering",
      "com.google.common.collect.RegularImmutableSortedSet",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.ImmutableSortedMapFauxverideShim",
      "com.google.common.collect.ImmutableSortedMap",
      "com.google.common.collect.CollectPreconditions",
      "com.google.common.collect.ImmutableSortedMap$1",
      "com.google.common.base.Preconditions",
      "com.google.common.base.Converter",
      "com.google.common.base.Converter$FunctionBasedConverter",
      "com.google.common.base.Converter$IdentityConverter",
      "com.google.common.base.Converter$ConverterComposition",
      "com.google.common.collect.Maps$KeySet",
      "com.google.common.collect.Maps$SortedKeySet",
      "com.google.common.collect.Maps$NavigableKeySet",
      "com.google.common.collect.ForwardingNavigableMap$StandardNavigableKeySet",
      "com.google.common.collect.ObjectArrays",
      "com.google.common.collect.ImmutableList$SubList",
      "com.google.common.base.Strings",
      "com.google.common.collect.RangeGwtSerializationDependencies",
      "com.google.common.collect.Cut",
      "com.google.common.collect.Cut$BelowAll",
      "com.google.common.collect.Cut$AboveAll",
      "com.google.common.collect.Range",
      "com.google.common.collect.Cut$AboveValue",
      "com.google.common.hash.BloomFilter",
      "com.google.common.hash.BloomFilterStrategies",
      "com.google.common.collect.ImmutableMultisetGwtSerializationDependencies",
      "com.google.common.collect.ImmutableMultiset",
      "com.google.common.collect.ImmutableSortedMultisetFauxverideShim",
      "com.google.common.collect.ImmutableSortedMultiset",
      "com.google.common.collect.RegularImmutableSortedMultiset",
      "com.google.common.collect.ForwardingCollection",
      "com.google.common.collect.ForwardingMultiset",
      "com.google.common.collect.Multisets$UnmodifiableMultiset",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.common.collect.Maps",
      "com.google.common.collect.SortedIterables"
    );
  }
}
