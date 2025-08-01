/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Oct 23 14:47:55 GMT 2024
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
public class CompoundOrdering_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.google.common.collect.CompoundOrdering"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(CompoundOrdering_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.common.collect.AllEqualOrdering",
      "com.google.common.collect.ImmutableSet$SetBuilderImpl",
      "com.google.common.math.IntMath$1",
      "com.google.common.collect.Hashing",
      "com.google.common.collect.ImmutableList$SubList",
      "com.google.common.collect.Lists$RandomAccessPartition",
      "com.google.common.collect.ImmutableSet$Indexed",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.math.IntMath",
      "com.google.common.collect.Lists$TransformingRandomAccessList",
      "com.google.common.collect.NullsLastOrdering",
      "com.google.common.collect.Platform",
      "com.google.common.collect.AbstractIterator$1",
      "com.google.common.base.Converter$IdentityConverter",
      "com.google.common.collect.Multisets",
      "com.google.common.collect.ByFunctionOrdering",
      "com.google.common.collect.SortedMapDifference",
      "com.google.common.collect.RegularImmutableSet",
      "com.google.common.collect.ImmutableMap$IteratorBasedImmutableMap",
      "com.google.common.collect.LexicographicalOrdering",
      "com.google.common.base.ParametricNullness",
      "com.google.common.collect.Iterables",
      "com.google.common.collect.NullsFirstOrdering",
      "com.google.common.collect.ImmutableAsList",
      "com.google.common.collect.ImmutableSet$Builder",
      "com.google.common.collect.ImmutableSet$CachingAsList",
      "com.google.common.collect.RegularImmutableAsList",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.common.collect.Lists$Partition",
      "com.google.common.collect.ImmutableSet$EmptySetBuilderImpl",
      "com.google.common.collect.Lists",
      "com.google.common.math.MathPreconditions",
      "com.google.common.collect.UsingToStringOrdering",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.Lists$TransformingSequentialList",
      "com.google.common.collect.ImmutableSortedSet",
      "com.google.common.primitives.IntsMethodsForWeb",
      "com.google.common.collect.ForwardingIterator",
      "com.google.common.collect.Maps$BiMapConverter",
      "com.google.common.collect.AbstractIterator",
      "com.google.common.collect.ImmutableSortedSet$Builder",
      "com.google.common.collect.ImmutableList$1",
      "com.google.common.base.ElementTypesAreNonnullByDefault",
      "com.google.common.collect.MapDifference",
      "com.google.common.collect.ConcurrentHashMultiset$2",
      "com.google.common.collect.SortedIterable",
      "com.google.common.collect.ConcurrentHashMultiset",
      "com.google.common.collect.AbstractMultiset$EntrySet",
      "com.google.common.collect.ConcurrentHashMultiset$3",
      "com.google.common.collect.Sets$ImprovedAbstractSet",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.ImmutableSortedSetFauxverideShim",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.base.Converter$ConverterComposition",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableEnumMap",
      "com.google.common.collect.ForwardingMultiset",
      "com.google.common.collect.Lists$RandomAccessListWrapper",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.common.base.Converter",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.ImmutableSet$JdkBackedSetBuilderImpl",
      "com.google.errorprone.annotations.DoNotMock",
      "com.google.common.collect.Maps$8",
      "com.google.common.collect.BiMap",
      "com.google.common.base.Function",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.Lists$AbstractListWrapper",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.ComparatorOrdering",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.ImmutableSortedAsList",
      "com.google.common.collect.CollectPreconditions",
      "com.google.common.primitives.Ints$IntConverter",
      "com.google.common.collect.AbstractIterator$State",
      "com.google.common.base.Converter$ReverseConverter",
      "com.google.common.collect.ExplicitOrdering",
      "com.google.common.collect.Lists$StringAsImmutableList",
      "com.google.common.collect.Lists$2",
      "com.google.common.collect.ImmutableList$Builder",
      "com.google.common.collect.Lists$1",
      "com.google.common.collect.ForwardingObject",
      "com.google.common.collect.Multiset",
      "com.google.common.collect.AbstractMultiset",
      "com.google.common.collect.CompoundOrdering",
      "com.google.common.collect.Multisets$UnmodifiableMultiset",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.ReverseOrdering",
      "com.google.common.collect.Multisets$EntrySet",
      "com.google.common.collect.ForwardingCollection",
      "com.google.common.collect.ConcurrentHashMultiset$EntrySet",
      "com.google.common.collect.ReverseNaturalOrdering",
      "com.google.common.primitives.Ints",
      "com.google.common.collect.Maps",
      "com.google.common.base.Converter$FunctionBasedConverter",
      "com.google.common.collect.ImmutableSet$SerializedForm",
      "com.google.common.collect.ImmutableSet$RegularSetBuilderImpl",
      "com.google.common.collect.Maps$EntryTransformer",
      "com.google.common.collect.Ordering",
      "com.google.common.collect.NaturalOrdering",
      "com.google.common.collect.ElementTypesAreNonnullByDefault",
      "com.google.common.collect.RegularImmutableSortedSet"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("com.google.common.base.Function", false, CompoundOrdering_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.lang.Comparable", false, CompoundOrdering_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.util.function.ToDoubleFunction", false, CompoundOrdering_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.util.function.ToIntFunction", false, CompoundOrdering_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.util.function.ToLongFunction", false, CompoundOrdering_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(CompoundOrdering_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.common.collect.Ordering",
      "com.google.common.collect.CompoundOrdering",
      "com.google.common.collect.Iterables",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.Platform",
      "com.google.common.collect.NullsFirstOrdering",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.ImmutableSet$SetBuilderImpl",
      "com.google.common.collect.ImmutableSet$RegularSetBuilderImpl",
      "com.google.common.collect.ImmutableSet$CachingAsList",
      "com.google.common.collect.ImmutableSortedSetFauxverideShim",
      "com.google.common.collect.ImmutableSortedSet",
      "com.google.common.collect.NaturalOrdering",
      "com.google.common.collect.RegularImmutableSortedSet",
      "com.google.common.math.IntMath",
      "com.google.common.math.MathPreconditions",
      "com.google.common.math.IntMath$1",
      "com.google.common.collect.Hashing",
      "com.google.common.collect.RegularImmutableSet",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.Iterators$ArrayItr",
      "com.google.common.collect.ImmutableMapValues",
      "com.google.common.collect.Maps",
      "com.google.common.collect.Maps$EntryFunction",
      "com.google.common.collect.ByFunctionOrdering",
      "com.google.common.collect.Lists",
      "com.google.common.collect.Lists$OnePlusArrayList",
      "com.google.common.collect.ExplicitOrdering",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.google.common.primitives.IntsMethodsForWeb",
      "com.google.common.primitives.Ints",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.CollectPreconditions",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.common.collect.ImmutableEntry",
      "com.google.common.collect.ImmutableMapEntry",
      "com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableMapEntry",
      "com.google.common.collect.ObjectArrays",
      "com.google.common.collect.UsingToStringOrdering",
      "com.google.common.collect.ImmutableMultisetGwtSerializationDependencies",
      "com.google.common.collect.ImmutableMultiset",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.ImmutableMultiset$Builder",
      "com.google.common.collect.AbstractMultiset",
      "com.google.common.collect.AbstractMapBasedMultiset",
      "com.google.common.collect.LinkedHashMultiset",
      "com.google.common.collect.Count",
      "com.google.common.collect.AllEqualOrdering",
      "com.google.common.collect.RangeGwtSerializationDependencies",
      "com.google.common.collect.Cut",
      "com.google.common.collect.Cut$BelowAll",
      "com.google.common.collect.Cut$AboveAll",
      "com.google.common.collect.Range",
      "com.google.common.collect.Cut$BelowValue",
      "com.google.common.base.Converter",
      "com.google.common.base.Converter$FunctionBasedConverter",
      "com.google.common.base.Converter$IdentityConverter",
      "com.google.common.base.Converter$ConverterComposition",
      "com.google.common.collect.ReverseOrdering",
      "com.google.common.collect.Multisets",
      "com.google.common.collect.Sets$ImprovedAbstractSet",
      "com.google.common.collect.Multisets$EntrySet",
      "com.google.common.collect.AbstractMultiset$EntrySet",
      "com.google.common.collect.RegularImmutableMultiset",
      "com.google.common.collect.AbstractMapBasedMultiset$2",
      "com.google.common.collect.Multisets$AbstractEntry",
      "com.google.common.collect.AbstractMapBasedMultiset$2$1",
      "com.google.common.collect.Multisets$ImmutableEntry",
      "com.google.common.collect.RegularImmutableMultiset$NonTerminalEntry",
      "com.google.common.collect.IndexedImmutableSet",
      "com.google.common.collect.ImmutableMultiset$EntrySet",
      "com.google.common.collect.ImmutableAsList",
      "com.google.common.collect.IndexedImmutableSet$1",
      "com.google.common.collect.ImmutableList$1",
      "com.google.common.collect.ImmutableSet$Indexed",
      "com.google.common.collect.ImmutableMultiset$ElementSet",
      "com.google.common.collect.AbstractMultimap",
      "com.google.common.collect.BaseImmutableMultimap",
      "com.google.common.collect.ImmutableMultimap",
      "com.google.common.collect.ImmutableSetMultimap",
      "com.google.common.collect.EmptyImmutableSetMultimap",
      "com.google.common.collect.ImmutableMultimap$2",
      "com.google.common.collect.RegularImmutableMap$Values",
      "com.google.common.collect.ImmutableSortedMultisetFauxverideShim",
      "com.google.common.collect.ImmutableSortedMultiset",
      "com.google.common.collect.RegularImmutableSortedMultiset",
      "com.google.common.base.Converter$ReverseConverter",
      "com.google.common.collect.HashMultiset",
      "com.google.common.collect.SortedIterables",
      "com.google.common.collect.Ordering$ArbitraryOrdering",
      "com.google.common.collect.MapMaker",
      "com.google.common.collect.MapMakerInternalMap$Strength",
      "com.google.common.collect.MapMakerInternalMap$1",
      "com.google.common.collect.MapMakerInternalMap",
      "com.google.common.base.MoreObjects",
      "com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueEntry$Helper",
      "com.google.common.base.Equivalence",
      "com.google.common.base.Equivalence$Identity",
      "com.google.common.collect.MapMakerInternalMap$Segment",
      "com.google.common.collect.MapMakerInternalMap$WeakKeyStrongValueSegment",
      "com.google.common.collect.Ordering$ArbitraryOrderingHolder",
      "com.google.common.collect.ConcurrentHashMultiset",
      "com.google.common.collect.ConcurrentHashMultiset$EntrySet",
      "com.google.common.collect.AbstractIterator",
      "com.google.common.collect.ConcurrentHashMultiset$2",
      "com.google.common.collect.AbstractIterator$State",
      "com.google.common.collect.ForwardingObject",
      "com.google.common.collect.ForwardingIterator",
      "com.google.common.collect.ConcurrentHashMultiset$3",
      "com.google.common.collect.AbstractIterator$1",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.common.collect.Range$1",
      "com.google.common.collect.Cut$AboveValue",
      "com.google.common.collect.NullnessCasts",
      "com.google.common.collect.ImmutableList$SubList",
      "com.google.common.collect.ImmutableMultiset$1",
      "com.google.common.collect.ComparatorOrdering",
      "com.google.common.collect.AbstractMapBasedMultiset$MapBasedMultisetIterator",
      "com.google.common.collect.Iterators$9"
    );
  }
}
