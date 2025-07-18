/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Oct 23 16:02:45 GMT 2024
 */

package com.google.common.graph;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class AbstractBaseGraph_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.google.common.graph.AbstractBaseGraph"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AbstractBaseGraph_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.common.collect.ImmutableSet$SetBuilderImpl",
      "com.google.common.collect.ImmutableList$SubList",
      "com.google.common.graph.ImmutableGraph",
      "com.google.common.graph.AbstractBaseGraph",
      "com.google.common.graph.EndpointPairIterator",
      "com.google.common.collect.PeekingIterator",
      "com.google.common.graph.MapIteratorCache",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.math.IntMath",
      "com.google.common.graph.ImmutableValueGraph$Builder",
      "com.google.common.graph.EndpointPairIterator$Directed",
      "com.google.common.base.Optional",
      "com.google.common.graph.Network",
      "com.google.common.collect.RegularImmutableMap$KeySet",
      "com.google.common.collect.Iterators$ArrayItr",
      "com.google.common.collect.AbstractIterator$1",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.common.graph.AbstractGraph",
      "com.google.common.collect.SortedMapDifference",
      "com.google.common.collect.RegularImmutableSet",
      "com.google.common.collect.Iterators$10",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.common.collect.ImmutableMap$IteratorBasedImmutableMap",
      "com.google.common.graph.ValueGraph",
      "com.google.common.graph.MapIteratorCache$1$1",
      "com.google.common.base.Predicate",
      "com.google.common.base.Present",
      "com.google.common.graph.ForwardingGraph",
      "com.google.common.graph.StandardMutableGraph",
      "com.google.common.collect.ImmutableAsList",
      "com.google.common.collect.ImmutableMapEntrySet$RegularEntrySet",
      "com.google.common.base.MoreObjects$ToStringHelper$ValueHolder",
      "com.google.common.collect.ImmutableSet$CachingAsList",
      "com.google.common.base.MoreObjects$ToStringHelper",
      "com.google.common.graph.UndirectedGraphConnections",
      "com.google.common.collect.RegularImmutableAsList",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.common.collect.ImmutableMapEntrySet",
      "com.google.common.graph.MapIteratorCache$1",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.graph.StandardValueGraph",
      "com.google.common.base.MoreObjects$ToStringHelper$UnconditionalValueHolder",
      "com.google.common.primitives.IntsMethodsForWeb",
      "com.google.common.graph.PredecessorsFunction",
      "com.google.common.base.Absent",
      "com.google.common.collect.Maps$BiMapConverter",
      "com.google.common.collect.AbstractIterator",
      "com.google.common.base.MoreObjects",
      "com.google.common.graph.EndpointPair$Unordered",
      "com.google.common.graph.MapRetrievalCache",
      "com.google.common.collect.ImmutableList$1",
      "com.google.common.collect.MapDifference",
      "com.google.common.graph.MutableValueGraph",
      "com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets",
      "com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableMapEntry",
      "com.google.common.graph.AbstractGraphBuilder",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.graph.UndirectedGraphConnections$2",
      "com.google.common.graph.Graph",
      "com.google.common.graph.ElementOrder",
      "com.google.common.collect.ImmutableEntry",
      "com.google.common.graph.AbstractBaseGraph$1",
      "com.google.common.collect.ImmutableEnumMap",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.graph.EndpointPair",
      "com.google.common.graph.ValueGraphBuilder",
      "com.google.errorprone.annotations.Immutable",
      "com.google.common.graph.StandardNetwork",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.google.common.graph.ElementTypesAreNonnullByDefault",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.common.graph.EndpointPair$Ordered",
      "com.google.common.base.Converter",
      "com.google.errorprone.annotations.DoNotMock",
      "com.google.common.collect.Maps$8",
      "com.google.common.collect.BiMap",
      "com.google.common.collect.IndexedImmutableSet",
      "com.google.common.base.Function",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.Iterators$9",
      "com.google.common.graph.NetworkBuilder",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.ImmutableMapEntry",
      "com.google.common.graph.MutableGraph",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.Iterators$1",
      "com.google.common.graph.GraphBuilder",
      "com.google.common.primitives.Ints$IntConverter",
      "com.google.common.collect.Iterators$4",
      "com.google.common.collect.Iterators$5",
      "com.google.common.collect.AbstractIterator$State",
      "com.google.common.graph.EndpointPairIterator$Undirected",
      "com.google.common.graph.GraphConnections",
      "com.google.common.collect.ImmutableMap$1",
      "com.google.common.graph.ElementOrder$Type",
      "com.google.common.collect.Iterators",
      "com.google.common.graph.Graphs",
      "com.google.common.collect.ImmutableBiMap",
      "com.google.common.graph.StandardMutableValueGraph",
      "com.google.common.collect.ImmutableList",
      "com.google.common.graph.ElementOrder$1",
      "com.google.common.collect.ImmutableBiMapFauxverideShim",
      "com.google.common.graph.ImmutableValueGraph",
      "com.google.common.graph.ImmutableGraph$Builder",
      "com.google.common.graph.ImmutableNetwork$Builder",
      "com.google.common.hash.BloomFilter",
      "com.google.common.collect.Maps",
      "com.google.common.primitives.Ints",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.google.common.graph.BaseGraph",
      "com.google.common.collect.Maps$EntryTransformer",
      "com.google.common.collect.ImmutableSet$RegularSetBuilderImpl",
      "com.google.common.graph.MutableNetwork",
      "com.google.common.collect.Iterators$MergingIterator",
      "com.google.common.graph.SuccessorsFunction",
      "com.google.common.collect.RegularImmutableMap$Values",
      "com.google.common.graph.AbstractNetwork",
      "com.google.common.graph.AbstractValueGraph"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.util.Enumeration", false, AbstractBaseGraph_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AbstractBaseGraph_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.common.graph.AbstractBaseGraph",
      "com.google.common.graph.AbstractBaseGraph$1",
      "com.google.common.graph.IncidentEdgeSet",
      "com.google.common.graph.AbstractBaseGraph$2",
      "com.google.common.graph.ElementOrder$Type",
      "com.google.common.graph.AbstractGraphBuilder",
      "com.google.common.graph.NetworkBuilder",
      "com.google.common.graph.ElementOrder",
      "com.google.common.base.Preconditions",
      "com.google.common.base.Optional",
      "com.google.common.base.Absent",
      "com.google.common.graph.ValueGraphBuilder",
      "com.google.common.graph.AbstractValueGraph",
      "com.google.common.graph.StandardValueGraph",
      "com.google.common.graph.MapIteratorCache",
      "com.google.common.graph.Graphs",
      "com.google.common.graph.ImmutableValueGraph$Builder",
      "com.google.common.graph.StandardMutableValueGraph",
      "com.google.common.graph.ElementOrder$1",
      "com.google.common.collect.Maps",
      "com.google.common.graph.ImmutableValueGraph",
      "com.google.common.base.MoreObjects",
      "com.google.common.base.MoreObjects$ToStringHelper",
      "com.google.common.base.MoreObjects$ToStringHelper$ValueHolder",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.google.common.graph.MapIteratorCache$1",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.graph.MapIteratorCache$1$1",
      "com.google.common.graph.ImmutableValueGraph$1",
      "com.google.common.base.Strings",
      "com.google.common.collect.CollectPreconditions",
      "com.google.common.graph.AbstractNetwork",
      "com.google.common.graph.StandardNetwork",
      "com.google.common.graph.GraphBuilder",
      "com.google.common.graph.AbstractGraph",
      "com.google.common.graph.ForwardingGraph",
      "com.google.common.graph.StandardMutableGraph",
      "com.google.common.graph.EndpointPair",
      "com.google.common.graph.EndpointPair$Unordered",
      "com.google.common.base.Present",
      "com.google.common.graph.AbstractNetwork$3",
      "com.google.common.collect.Maps$ViewCachingAbstractMap",
      "com.google.common.collect.Maps$AsMapView",
      "com.google.common.collect.Sets$ImprovedAbstractSet",
      "com.google.common.collect.Maps$EntrySet",
      "com.google.common.collect.Maps$AsMapView$1EntrySetImpl",
      "com.google.common.collect.TransformedIterator",
      "com.google.common.collect.Maps$3",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.common.collect.AbstractIterator",
      "com.google.common.graph.EndpointPairIterator",
      "com.google.common.graph.EndpointPairIterator$Directed",
      "com.google.common.collect.AbstractIterator$State",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.ImmutableSet$CachingAsList",
      "com.google.common.collect.RegularImmutableSet",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.Iterators$ArrayItr",
      "com.google.common.collect.AbstractIterator$1",
      "com.google.common.primitives.IntsMethodsForWeb",
      "com.google.common.primitives.Ints",
      "com.google.common.graph.StandardMutableNetwork",
      "com.google.common.graph.EndpointPairIterator$Undirected",
      "com.google.common.collect.Sets",
      "com.google.common.graph.ImmutableGraph",
      "com.google.common.graph.AbstractValueGraph$1",
      "com.google.common.collect.Ordering",
      "com.google.common.collect.NaturalOrdering",
      "com.google.common.graph.MapRetrievalCache",
      "com.google.common.graph.EndpointPair$Ordered",
      "com.google.common.graph.AbstractValueGraph$2",
      "com.google.common.graph.ImmutableGraph$Builder",
      "com.google.common.graph.ImmutableNetwork$Builder",
      "com.google.common.graph.ImmutableNetwork",
      "com.google.common.graph.AbstractNetwork$1",
      "com.google.common.graph.GraphConstants$Presence",
      "com.google.common.collect.ImmutableMapEntrySet",
      "com.google.common.collect.ImmutableMapEntrySet$RegularEntrySet",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.base.ExtraObjectsMethodsForWeb",
      "com.google.common.base.Objects",
      "com.google.common.graph.UndirectedGraphConnections",
      "com.google.common.graph.UndirectedGraphConnections$2",
      "com.google.common.graph.DirectedGraphConnections",
      "com.google.common.graph.DirectedGraphConnections$8",
      "com.google.common.graph.DirectedGraphConnections$PredAndSucc",
      "com.google.common.hash.BloomFilter",
      "com.google.common.hash.BloomFilterStrategies",
      "com.google.common.collect.DiscreteDomain",
      "com.google.common.collect.DiscreteDomain$IntegerDomain",
      "com.google.common.graph.DirectedGraphConnections$3",
      "com.google.common.graph.DirectedGraphConnections$3$1",
      "com.google.common.collect.NullnessCasts",
      "com.google.common.graph.AbstractNetwork$1$1",
      "com.google.common.collect.Iterables",
      "com.google.common.collect.ImmutableBiMapFauxverideShim",
      "com.google.common.collect.ImmutableBiMap",
      "com.google.common.collect.SingletonImmutableBiMap",
      "com.google.common.base.Converter",
      "com.google.common.base.Converter$IdentityConverter",
      "com.google.common.base.Converter$FunctionBasedConverter",
      "com.google.common.math.IntMath",
      "com.google.common.graph.DirectedGraphConnections$2",
      "com.google.common.base.Converter$ConverterComposition",
      "com.google.common.graph.StandardValueGraph$1",
      "com.google.common.graph.MapRetrievalCache$CacheEntry"
    );
  }
}
