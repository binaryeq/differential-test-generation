/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Oct 23 14:37:25 GMT 2024
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
public class ArrayTable_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.google.common.collect.ArrayTable"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(ArrayTable_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.common.collect.ImmutableSet$SetBuilderImpl",
      "com.google.common.collect.RegularContiguousSet",
      "com.google.common.collect.AllEqualOrdering",
      "com.google.common.collect.Hashing",
      "com.google.common.collect.ImmutableList$SubList",
      "com.google.common.collect.Lists$RandomAccessPartition",
      "com.google.common.collect.HashBasedTable",
      "com.google.common.collect.StandardTable$RowMap",
      "com.google.common.collect.StandardTable$CellIterator",
      "com.google.common.collect.PeekingIterator",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.collect.StandardTable$ColumnKeySet",
      "com.google.common.collect.Lists$TransformingRandomAccessList",
      "com.google.common.collect.SingletonImmutableTable",
      "com.google.common.collect.Iterators$ArrayItr",
      "com.google.common.collect.RegularImmutableMap$KeySet",
      "com.google.common.collect.Maps$KeySet",
      "com.google.common.collect.AbstractIterator$1",
      "com.google.common.collect.NullsLastOrdering",
      "com.google.common.collect.BaseImmutableMultimap",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.common.collect.RegularImmutableBiMap",
      "com.google.common.collect.RowSortedTable",
      "com.google.common.collect.Range",
      "com.google.common.collect.StandardTable$TableSet",
      "com.google.common.collect.ByFunctionOrdering",
      "com.google.common.collect.SortedMapDifference",
      "com.google.common.collect.RegularImmutableSet",
      "com.google.common.collect.Iterators$10",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.common.collect.ImmutableMap$IteratorBasedImmutableMap",
      "com.google.common.base.Predicate",
      "com.google.common.collect.LexicographicalOrdering",
      "com.google.common.collect.ArrayTable$Row",
      "com.google.common.collect.Tables$UnmodifiableRowSortedMap",
      "com.google.common.collect.HashBasedTable$Factory",
      "com.google.common.collect.NullsFirstOrdering",
      "com.google.common.collect.ContiguousSet",
      "com.google.common.collect.ImmutableAsList",
      "com.google.common.collect.DiscreteDomain$BigIntegerDomain",
      "com.google.common.collect.ImmutableMapEntrySet$RegularEntrySet",
      "com.google.common.collect.ImmutableSet$Builder",
      "com.google.common.collect.ImmutableSet$CachingAsList",
      "com.google.common.collect.RegularImmutableAsList",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.common.collect.ImmutableList$SerializedForm",
      "com.google.common.collect.ImmutableMapEntrySet",
      "com.google.common.base.Strings",
      "com.google.common.collect.ForwardingTable",
      "com.google.common.collect.Lists$Partition",
      "com.google.common.collect.Lists",
      "com.google.common.collect.StandardTable$RowMap$EntrySet",
      "com.google.common.collect.ArrayTable$1",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.DiscreteDomain",
      "com.google.common.collect.Tables$ImmutableCell",
      "com.google.common.collect.UsingToStringOrdering",
      "com.google.common.collect.ArrayTable$ArrayMap",
      "com.google.common.collect.EmptyContiguousSet",
      "com.google.common.collect.ImmutableMultimap",
      "com.google.common.collect.Lists$TransformingSequentialList",
      "com.google.common.collect.DenseImmutableTable",
      "com.google.common.collect.ImmutableSortedSet",
      "com.google.common.primitives.IntsMethodsForWeb",
      "com.google.common.collect.RangeGwtSerializationDependencies",
      "com.google.common.collect.ObjectArrays",
      "com.google.common.collect.Maps$BiMapConverter",
      "com.google.common.collect.AbstractIterator",
      "com.google.common.collect.ImmutableSortedSet$Builder",
      "com.google.common.collect.ImmutableList$1",
      "com.google.common.collect.MapDifference",
      "com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets",
      "com.google.common.collect.SortedIterable",
      "com.google.common.collect.StandardTable",
      "com.google.common.collect.Sets$ImprovedAbstractSet",
      "com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableMapEntry",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.ImmutableSortedSetFauxverideShim",
      "com.google.common.collect.StandardTable$ColumnKeyIterator",
      "com.google.common.collect.ImmutableEntry",
      "com.google.common.collect.AbstractTable$CellSet",
      "com.google.common.collect.Iterators$EmptyModifiableIterator",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableEnumMap",
      "com.google.common.collect.Maps$IteratorBasedAbstractMap$1",
      "com.google.common.collect.Lists$RandomAccessListWrapper",
      "com.google.common.collect.Tables",
      "com.google.common.collect.ArrayTable",
      "com.google.common.collect.ArrayTable$RowMap",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.ImmutableSetMultimap",
      "com.google.errorprone.annotations.DoNotMock",
      "com.google.common.base.Converter",
      "com.google.common.collect.Maps$8",
      "com.google.common.collect.BiMap",
      "com.google.common.collect.ArrayTable$Column",
      "com.google.common.collect.ImmutableTable$Builder",
      "com.google.common.collect.IndexedImmutableSet",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.Iterators$9",
      "com.google.common.base.Function",
      "com.google.common.collect.Lists$AbstractListWrapper",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.ImmutableMapEntry",
      "com.google.common.collect.ComparatorOrdering",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.DiscreteDomain$IntegerDomain",
      "com.google.common.collect.Maps$1",
      "com.google.common.collect.CollectPreconditions",
      "com.google.common.collect.Iterators$1",
      "com.google.common.collect.Iterators$4",
      "com.google.common.primitives.Ints$IntConverter",
      "com.google.common.collect.Iterators$5",
      "com.google.common.collect.Maps$3",
      "com.google.common.collect.AbstractIterator$State",
      "com.google.common.collect.DiscreteDomain$LongDomain",
      "com.google.common.collect.BoundType",
      "com.google.common.collect.ExplicitOrdering",
      "com.google.common.collect.Lists$StringAsImmutableList",
      "com.google.common.collect.Lists$2",
      "com.google.common.collect.StandardTable$RowMap$EntrySet$1",
      "com.google.common.collect.Maps$IteratorBasedAbstractMap",
      "com.google.common.collect.Maps$ViewCachingAbstractMap",
      "com.google.common.collect.ImmutableList$Builder",
      "com.google.common.collect.ImmutableMap$1",
      "com.google.common.collect.Lists$1",
      "com.google.common.collect.Maps$EntrySet",
      "com.google.common.collect.ArrayTable$ArrayMap$1",
      "com.google.common.collect.ForwardingObject",
      "com.google.common.collect.ArrayTable$ArrayMap$2",
      "com.google.common.collect.AbstractTable",
      "com.google.common.collect.Tables$1",
      "com.google.common.collect.AbstractMultimap",
      "com.google.common.base.Supplier",
      "com.google.common.collect.Multimap",
      "com.google.common.collect.AbstractTable$Values",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.CompoundOrdering",
      "com.google.common.collect.ImmutableBiMap",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.SingletonImmutableBiMap",
      "com.google.common.collect.ReverseOrdering",
      "com.google.common.collect.Table$Cell",
      "com.google.common.collect.ImmutableBiMapFauxverideShim",
      "com.google.common.collect.ArrayTable$ColumnMap",
      "com.google.common.collect.Tables$TransformedTable",
      "com.google.common.collect.Tables$AbstractCell",
      "com.google.common.collect.Tables$TransposeTable",
      "com.google.common.collect.ReverseNaturalOrdering",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.google.common.collect.Maps",
      "com.google.common.primitives.Ints",
      "com.google.common.collect.SetMultimap",
      "com.google.common.collect.TransformedIterator",
      "com.google.common.collect.DescendingImmutableSortedSet",
      "com.google.common.collect.ImmutableSet$RegularSetBuilderImpl",
      "com.google.common.collect.Maps$EntryTransformer",
      "com.google.common.collect.Ordering",
      "com.google.common.collect.ImmutableTable",
      "com.google.common.collect.ImmutableTable$SerializedForm",
      "com.google.common.collect.Tables$UnmodifiableTable",
      "com.google.common.collect.NaturalOrdering",
      "com.google.common.collect.RegularImmutableTable",
      "com.google.common.collect.ElementTypesAreNonnullByDefault",
      "com.google.common.collect.Iterators$MergingIterator",
      "com.google.common.collect.RegularImmutableMap$Values",
      "com.google.common.collect.RegularImmutableSortedSet",
      "com.google.common.collect.Table"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.lang.Comparable", false, ArrayTable_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(ArrayTable_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.common.collect.AbstractTable",
      "com.google.common.collect.ArrayTable",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.ArrayTable$1",
      "com.google.common.collect.Tables$AbstractCell",
      "com.google.common.collect.ArrayTable$2",
      "com.google.common.collect.Maps$IteratorBasedAbstractMap",
      "com.google.common.collect.ArrayTable$ArrayMap",
      "com.google.common.collect.ArrayTable$Column",
      "com.google.common.collect.ArrayTable$ColumnMap",
      "com.google.common.collect.ArrayTable$Row",
      "com.google.common.collect.ArrayTable$RowMap",
      "com.google.common.collect.ArrayTable$3",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.ObjectArrays",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.common.collect.Maps",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.Iterators$9",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.CollectPreconditions",
      "com.google.common.collect.ImmutableBiMapFauxverideShim",
      "com.google.common.collect.ImmutableBiMap",
      "com.google.common.collect.SingletonImmutableBiMap",
      "com.google.common.collect.StandardTable",
      "com.google.common.collect.HashBasedTable",
      "com.google.common.collect.HashBasedTable$Factory",
      "com.google.common.collect.AbstractTable$CellSet",
      "com.google.common.collect.StandardTable$CellIterator",
      "com.google.common.collect.Iterators$EmptyModifiableIterator",
      "com.google.common.collect.Maps$ViewCachingAbstractMap",
      "com.google.common.collect.StandardTable$RowMap",
      "com.google.common.collect.Sets$ImprovedAbstractSet",
      "com.google.common.collect.Maps$KeySet",
      "com.google.common.collect.StandardTable$TableSet",
      "com.google.common.collect.StandardTable$ColumnKeySet",
      "com.google.common.collect.StandardTable$RowMap$EntrySet",
      "com.google.common.collect.StandardTable$RowMap$EntrySet$1",
      "com.google.common.collect.TransformedIterator",
      "com.google.common.collect.Maps$3",
      "com.google.common.collect.Maps$1",
      "com.google.common.collect.AbstractIterator",
      "com.google.common.collect.StandardTable$ColumnKeyIterator",
      "com.google.common.collect.AbstractIterator$State",
      "com.google.common.collect.Iterators$ArrayItr",
      "com.google.common.collect.AbstractIterator$1",
      "com.google.common.primitives.IntsMethodsForWeb",
      "com.google.common.primitives.Ints",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.common.collect.ImmutableMultisetGwtSerializationDependencies",
      "com.google.common.collect.ImmutableMultiset",
      "com.google.common.collect.AbstractMultiset",
      "com.google.common.collect.AbstractMapBasedMultiset",
      "com.google.common.collect.LinkedHashMultiset",
      "com.google.common.collect.Count",
      "com.google.common.collect.Multisets$EntrySet",
      "com.google.common.collect.AbstractMultiset$EntrySet",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.ImmutableSet$CachingAsList",
      "com.google.common.collect.RegularImmutableSet",
      "com.google.common.collect.RegularImmutableMultiset",
      "com.google.common.collect.Hashing",
      "com.google.common.collect.AbstractMapBasedMultiset$2",
      "com.google.common.collect.Multisets$AbstractEntry",
      "com.google.common.collect.AbstractMapBasedMultiset$2$1",
      "com.google.common.collect.Multisets$ImmutableEntry",
      "com.google.common.collect.Platform",
      "com.google.common.collect.IndexedImmutableSet",
      "com.google.common.collect.ImmutableMultiset$EntrySet",
      "com.google.common.collect.ImmutableAsList",
      "com.google.common.collect.IndexedImmutableSet$1",
      "com.google.common.collect.ImmutableList$1",
      "com.google.common.collect.ImmutableSet$Indexed",
      "com.google.common.collect.ImmutableMultiset$ElementSet",
      "com.google.common.collect.ImmutableTable",
      "com.google.common.collect.RegularImmutableTable",
      "com.google.common.collect.SparseImmutableTable",
      "com.google.common.collect.SingletonImmutableTable",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.common.collect.Tables$1",
      "com.google.common.collect.Tables",
      "com.google.common.collect.Tables$ImmutableCell",
      "com.google.common.collect.Maps$EntrySet",
      "com.google.common.collect.Maps$IteratorBasedAbstractMap$1",
      "com.google.common.collect.ArrayTable$ArrayMap$2",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.common.collect.ArrayTable$ArrayMap$1",
      "com.google.common.collect.ImmutableEntry",
      "com.google.common.collect.ImmutableMapEntry",
      "com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableMapEntry",
      "com.google.common.base.Strings",
      "com.google.common.collect.DiscreteDomain",
      "com.google.common.collect.DiscreteDomain$IntegerDomain",
      "com.google.common.collect.ImmutableSortedSetFauxverideShim",
      "com.google.common.collect.ImmutableSortedSet",
      "com.google.common.collect.ContiguousSet",
      "com.google.common.collect.EmptyContiguousSet",
      "com.google.common.collect.Ordering",
      "com.google.common.collect.NaturalOrdering",
      "com.google.common.collect.AbstractTable$Values",
      "com.google.common.collect.Lists"
    );
  }
}
