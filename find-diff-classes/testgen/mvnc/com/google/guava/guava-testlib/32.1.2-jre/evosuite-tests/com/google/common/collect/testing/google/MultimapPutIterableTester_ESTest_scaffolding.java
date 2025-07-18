/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Oct 23 13:46:41 GMT 2024
 */

package com.google.common.collect.testing.google;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class MultimapPutIterableTester_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.google.common.collect.testing.google.MultimapPutIterableTester"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(MultimapPutIterableTester_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.common.collect.testing.AbstractContainerTester",
      "com.google.common.collect.BaseImmutableMultimap",
      "com.google.common.collect.testing.google.MultimapPutIterableTester$4",
      "com.google.common.collect.testing.OneSizeTestContainerGenerator",
      "com.google.common.collect.testing.SampleElements",
      "com.google.common.collect.AbstractMultimap",
      "com.google.common.collect.testing.google.MultimapPutIterableTester$3",
      "com.google.common.collect.Multimap",
      "com.google.common.collect.testing.AbstractTester",
      "com.google.common.collect.testing.TestSubjectGenerator",
      "com.google.common.collect.testing.TestContainerGenerator",
      "com.google.common.collect.testing.google.AbstractMultimapTester",
      "com.google.common.collect.testing.MinimalCollection",
      "com.google.common.collect.testing.google.MultimapPutIterableTester",
      "com.google.common.collect.ImmutableMultimap",
      "com.google.common.collect.testing.AbstractContainerTester$ArrayWithDuplicate"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(MultimapPutIterableTester_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.common.collect.testing.AbstractTester",
      "com.google.common.collect.testing.AbstractContainerTester",
      "com.google.common.collect.testing.google.AbstractMultimapTester",
      "com.google.common.collect.testing.google.MultimapPutIterableTester",
      "com.google.common.collect.testing.google.MultimapPutIterableTester$1",
      "com.google.common.collect.testing.google.MultimapPutIterableTester$2",
      "com.google.common.collect.testing.google.MultimapPutIterableTester$3",
      "com.google.common.collect.testing.google.MultimapPutIterableTester$4",
      "com.google.common.collect.testing.Helpers$5",
      "com.google.common.collect.testing.Helpers",
      "com.google.common.collect.testing.features.MapFeature",
      "com.google.common.collect.testing.features.CollectionSize",
      "com.google.common.collect.AbstractMultimap",
      "com.google.common.collect.BaseImmutableMultimap",
      "com.google.common.collect.ImmutableMultimap",
      "com.google.common.collect.ImmutableListMultimap",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.common.collect.EmptyImmutableListMultimap",
      "com.google.common.collect.ImmutableSetMultimap",
      "com.google.common.collect.ImmutableMultimap$Builder",
      "com.google.common.collect.ImmutableSetMultimap$Builder",
      "com.google.common.collect.Platform",
      "com.google.common.collect.Maps",
      "com.google.common.collect.CollectPreconditions",
      "com.google.common.collect.Sets",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.common.collect.ImmutableEntry",
      "com.google.common.collect.ImmutableMapEntry",
      "com.google.common.collect.Hashing",
      "com.google.common.collect.ImmutableSet$CachingAsList",
      "com.google.common.collect.RegularImmutableSet",
      "com.google.common.collect.ImmutableListMultimap$Builder",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.ObjectArrays",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableMapEntry",
      "com.google.common.collect.ImmutableBiMapFauxverideShim",
      "com.google.common.collect.ImmutableBiMap",
      "com.google.common.collect.SingletonImmutableBiMap",
      "com.google.common.collect.RegularImmutableMap$Values",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.ImmutableList$1",
      "com.google.common.collect.LinkedListMultimap",
      "com.google.common.collect.AbstractMapBasedMultimap",
      "com.google.common.collect.AbstractSetMultimap",
      "com.google.common.collect.AbstractSortedSetMultimap",
      "com.google.common.collect.AbstractSortedKeySortedSetMultimap",
      "com.google.common.collect.TreeMultimap",
      "com.google.common.collect.Ordering",
      "com.google.common.collect.NaturalOrdering",
      "com.google.common.collect.LinkedListMultimap$1EntriesImpl",
      "com.google.common.collect.LinkedListMultimap$NodeIterator",
      "com.google.common.collect.testing.Platform",
      "com.google.common.collect.ImmutableMultimap$EntryCollection",
      "com.google.common.collect.ImmutableMultimap$1",
      "com.google.common.collect.ImmutableMapEntrySet",
      "com.google.common.collect.ImmutableMapEntrySet$RegularEntrySet",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.Iterators$ArrayItr",
      "com.google.common.collect.Iterators$9",
      "com.google.common.collect.LinkedListMultimap$1ValuesImpl",
      "com.google.common.collect.LinkedHashMultimapGwtSerializationDependencies",
      "com.google.common.collect.LinkedHashMultimap",
      "com.google.common.collect.LinkedHashMultimap$ValueEntry",
      "com.google.common.collect.AbstractMultimap$Values",
      "com.google.common.collect.HashMultimapGwtSerializationDependencies",
      "com.google.common.collect.HashMultimap",
      "com.google.common.collect.EmptyImmutableSetMultimap",
      "com.google.common.collect.ImmutableSet$SetBuilderImpl",
      "com.google.common.collect.ImmutableSet$RegularSetBuilderImpl",
      "com.google.common.math.IntMath",
      "com.google.common.math.MathPreconditions",
      "com.google.common.math.IntMath$1",
      "com.google.common.collect.AbstractListMultimap",
      "com.google.common.collect.ArrayListMultimapGwtSerializationDependencies",
      "com.google.common.collect.ArrayListMultimap",
      "com.google.common.collect.ImmutableSetMultimap$EntrySet",
      "com.google.common.collect.ImmutableMultisetGwtSerializationDependencies",
      "com.google.common.collect.ImmutableMultiset",
      "com.google.common.collect.ImmutableMultimap$Keys",
      "com.google.common.collect.Sets$ImprovedAbstractSet",
      "com.google.common.collect.Maps$KeySet",
      "com.google.common.collect.AbstractMapBasedMultimap$KeySet",
      "com.google.common.collect.Multimaps$Entries",
      "com.google.common.collect.AbstractMultimap$Entries",
      "com.google.common.collect.AbstractMapBasedMultimap$Itr",
      "com.google.common.collect.AbstractMapBasedMultimap$2",
      "com.google.common.collect.Iterators$EmptyModifiableIterator",
      "com.google.common.collect.LinkedListMultimap$ValueForKeyIterator",
      "com.google.common.collect.Lists",
      "com.google.common.collect.LinkedListMultimap$Node",
      "com.google.common.collect.LinkedListMultimap$KeyList",
      "com.google.common.collect.AbstractMultimap$EntrySet",
      "com.google.common.collect.LinkedListMultimap$1KeySetImpl"
    );
  }
}
