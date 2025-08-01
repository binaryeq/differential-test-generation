/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Oct 23 16:05:13 GMT 2024
 */

package com.google.common.graph;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class AbstractNetwork_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) System.getProperties().clone();

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.google.common.graph.AbstractNetwork"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AbstractNetwork_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.common.collect.ImmutableSet$SetBuilderImpl",
      "com.google.common.collect.Hashing",
      "com.google.common.collect.ImmutableList$SubList",
      "com.google.common.graph.ImmutableGraph",
      "com.google.common.graph.AbstractBaseGraph",
      "com.google.common.graph.EndpointPairIterator",
      "com.google.common.collect.PeekingIterator",
      "com.google.common.graph.MapIteratorCache",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.math.IntMath",
      "com.google.common.graph.EndpointPairIterator$Directed",
      "com.google.common.base.Optional",
      "com.google.common.graph.Network",
      "com.google.common.collect.Iterators$ArrayItr",
      "com.google.common.collect.RegularImmutableMap$KeySet",
      "com.google.common.collect.Sets$2",
      "com.google.common.collect.Sets$3",
      "com.google.common.collect.Maps$KeySet",
      "com.google.common.collect.Sets$1",
      "com.google.common.collect.AbstractIterator$1",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.common.graph.AbstractGraph",
      "com.google.common.collect.HashBiMap$Inverse",
      "com.google.common.collect.SortedMapDifference",
      "com.google.common.collect.RegularImmutableSet",
      "com.google.common.collect.Iterators$10",
      "com.google.common.graph.AbstractValueGraph$2",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.common.collect.ImmutableMap$IteratorBasedImmutableMap",
      "com.google.common.graph.ValueGraph",
      "com.google.common.graph.MapIteratorCache$1$1",
      "com.google.common.base.Predicate",
      "com.google.common.collect.HashBiMap$KeySet",
      "com.google.common.base.Present",
      "com.google.common.graph.ForwardingGraph",
      "com.google.common.graph.UndirectedMultiNetworkConnections",
      "com.google.common.collect.Maps$AsMapView$1EntrySetImpl",
      "com.google.common.collect.ImmutableAsList",
      "com.google.common.collect.ImmutableMapEntrySet$RegularEntrySet",
      "com.google.common.base.MoreObjects$ToStringHelper$ValueHolder",
      "com.google.common.collect.Sets$SetView",
      "com.google.common.base.MoreObjects$ToStringHelper",
      "com.google.common.collect.ImmutableSet$CachingAsList",
      "com.google.common.collect.RegularImmutableAsList",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.common.collect.ImmutableMapEntrySet",
      "com.google.common.graph.MapIteratorCache$1",
      "com.google.common.graph.AbstractNetwork$3",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.graph.ImmutableNetwork",
      "com.google.common.graph.StandardValueGraph",
      "com.google.common.base.MoreObjects$ToStringHelper$UnconditionalValueHolder",
      "com.google.common.primitives.IntsMethodsForWeb",
      "com.google.common.collect.HashBiMap$Itr",
      "com.google.common.graph.PredecessorsFunction",
      "com.google.common.collect.Sets$4",
      "com.google.common.base.Absent",
      "com.google.common.graph.AbstractNetwork$1$1",
      "com.google.common.graph.DirectedNetworkConnections",
      "com.google.common.collect.Maps$BiMapConverter",
      "com.google.common.graph.StandardMutableNetwork",
      "com.google.common.collect.AbstractIterator",
      "com.google.common.base.MoreObjects",
      "com.google.common.graph.AbstractNetwork$1",
      "com.google.common.graph.MapRetrievalCache",
      "com.google.common.graph.EndpointPair$Unordered",
      "com.google.common.collect.ImmutableList$1",
      "com.google.common.collect.MapDifference",
      "com.google.common.graph.MutableValueGraph",
      "com.google.common.collect.ImmutableMap$MapViewOfValuesAsSingletonSets",
      "com.google.common.collect.Sets$ImprovedAbstractSet",
      "com.google.common.collect.ImmutableMapEntry$NonTerminalImmutableMapEntry",
      "com.google.common.graph.AbstractGraphBuilder",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.graph.Graph",
      "com.google.common.graph.ElementOrder",
      "com.google.common.collect.ImmutableEntry",
      "com.google.common.graph.AbstractBaseGraph$1",
      "com.google.common.collect.ImmutableEnumMap",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.graph.DirectedMultiNetworkConnections",
      "com.google.common.graph.EndpointPair",
      "com.google.common.collect.ImmutableEnumSet",
      "com.google.common.graph.ValueGraphBuilder",
      "com.google.errorprone.annotations.Immutable",
      "com.google.common.graph.StandardNetwork",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.google.common.graph.ElementTypesAreNonnullByDefault",
      "com.google.common.collect.SingletonImmutableList",
      "com.google.common.graph.EndpointPair$Ordered",
      "com.google.common.base.Converter",
      "com.google.errorprone.annotations.DoNotMock",
      "com.google.common.collect.Maps$AsMapView",
      "com.google.common.collect.Maps$8",
      "com.google.common.collect.Iterators$6",
      "com.google.common.collect.BiMap",
      "com.google.common.collect.IndexedImmutableSet",
      "com.google.common.base.Function",
      "com.google.common.graph.NetworkConnections",
      "com.google.common.collect.Iterators$9",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.graph.NetworkBuilder",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.ImmutableMapEntry",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.graph.MutableGraph",
      "com.google.common.collect.CollectPreconditions",
      "com.google.common.collect.Iterators$1",
      "com.google.common.graph.GraphBuilder",
      "com.google.common.collect.Iterators$4",
      "com.google.common.collect.Sets",
      "com.google.common.primitives.Ints$IntConverter",
      "com.google.common.collect.Iterators$5",
      "com.google.common.collect.Maps$3",
      "com.google.common.collect.AbstractIterator$State",
      "com.google.common.graph.EndpointPairIterator$Undirected",
      "com.google.common.collect.BoundType",
      "com.google.common.graph.AbstractUndirectedNetworkConnections",
      "com.google.common.collect.Maps$ViewCachingAbstractMap",
      "com.google.common.collect.Maps$IteratorBasedAbstractMap",
      "com.google.common.graph.GraphConnections",
      "com.google.common.collect.ImmutableMap$1",
      "com.google.common.collect.Maps$EntrySet",
      "com.google.common.graph.ElementOrder$Type",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.ImmutableBiMap",
      "com.google.common.graph.Graphs",
      "com.google.common.graph.StandardMutableValueGraph",
      "com.google.common.graph.UndirectedNetworkConnections",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.HashBiMap$Inverse$InverseKeySet$1",
      "com.google.common.graph.ElementOrder$1",
      "com.google.common.collect.HashBiMap$Inverse$InverseKeySet",
      "com.google.common.graph.AbstractNetwork$1$1$1",
      "com.google.common.collect.ImmutableBiMapFauxverideShim",
      "com.google.common.graph.ImmutableValueGraph",
      "com.google.common.graph.ImmutableNetwork$Builder",
      "com.google.common.graph.AbstractDirectedNetworkConnections",
      "com.google.common.collect.Maps",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.google.common.primitives.Ints",
      "com.google.common.collect.TransformedIterator",
      "com.google.common.graph.BaseGraph",
      "com.google.common.collect.HashBiMap",
      "com.google.common.collect.Maps$EntryTransformer",
      "com.google.common.collect.ImmutableSet$RegularSetBuilderImpl",
      "com.google.common.graph.MutableNetwork",
      "com.google.common.collect.HashBiMap$BiEntry",
      "com.google.common.collect.Iterators$MergingIterator",
      "com.google.common.graph.SuccessorsFunction",
      "com.google.common.collect.RegularImmutableMap$Values",
      "com.google.common.graph.AbstractNetwork",
      "com.google.common.graph.AbstractValueGraph"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AbstractNetwork_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.common.graph.AbstractNetwork",
      "com.google.common.graph.AbstractBaseGraph",
      "com.google.common.graph.AbstractGraph",
      "com.google.common.graph.AbstractNetwork$1",
      "com.google.common.graph.AbstractNetwork$2",
      "com.google.common.graph.AbstractNetwork$3",
      "com.google.common.graph.StandardNetwork",
      "com.google.common.graph.ImmutableNetwork",
      "com.google.common.graph.AbstractGraphBuilder",
      "com.google.common.graph.NetworkBuilder",
      "com.google.common.graph.ElementOrder",
      "com.google.common.graph.ElementOrder$Type",
      "com.google.common.base.Preconditions",
      "com.google.common.base.Optional",
      "com.google.common.base.Absent",
      "com.google.common.graph.ElementOrder$1",
      "com.google.common.collect.Maps",
      "com.google.common.collect.CollectPreconditions",
      "com.google.common.graph.StandardMutableNetwork",
      "com.google.common.graph.MapIteratorCache",
      "com.google.common.base.ExtraObjectsMethodsForWeb",
      "com.google.common.base.Objects",
      "com.google.common.base.MoreObjects",
      "com.google.common.base.MoreObjects$ToStringHelper",
      "com.google.common.base.MoreObjects$ToStringHelper$ValueHolder",
      "com.google.common.graph.AbstractValueGraph",
      "com.google.common.graph.StandardValueGraph",
      "com.google.common.graph.StandardMutableValueGraph",
      "com.google.common.graph.Graphs",
      "com.google.common.graph.ImmutableValueGraph",
      "com.google.common.graph.ValueGraphBuilder",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.google.common.graph.MapIteratorCache$1",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.graph.MapIteratorCache$1$1",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.common.graph.AbstractBaseGraph$1",
      "com.google.common.primitives.IntsMethodsForWeb",
      "com.google.common.primitives.Ints",
      "com.google.common.collect.Ordering",
      "com.google.common.collect.NaturalOrdering",
      "com.google.common.collect.DiscreteDomain",
      "com.google.common.collect.DiscreteDomain$IntegerDomain",
      "com.google.common.base.Strings",
      "com.google.common.base.Present",
      "com.google.common.graph.MapRetrievalCache",
      "com.google.common.graph.AbstractDirectedNetworkConnections",
      "com.google.common.graph.DirectedNetworkConnections",
      "com.google.common.collect.Maps$IteratorBasedAbstractMap",
      "com.google.common.collect.HashBiMap",
      "com.google.common.collect.Hashing",
      "com.google.common.collect.Maps$ViewCachingAbstractMap",
      "com.google.common.collect.Maps$AsMapView",
      "com.google.common.collect.Sets$ImprovedAbstractSet",
      "com.google.common.collect.Maps$EntrySet",
      "com.google.common.collect.Maps$AsMapView$1EntrySetImpl",
      "com.google.common.collect.TransformedIterator",
      "com.google.common.collect.Maps$3",
      "com.google.common.graph.EndpointPair",
      "com.google.common.graph.EndpointPair$Ordered",
      "com.google.common.graph.ForwardingGraph",
      "com.google.common.graph.ImmutableGraph",
      "com.google.common.graph.StandardMutableGraph",
      "com.google.common.graph.GraphBuilder",
      "com.google.common.graph.EndpointPair$Unordered",
      "com.google.common.graph.AbstractNetwork$1$1",
      "com.google.common.graph.AbstractNetwork$1$1$1",
      "com.google.common.collect.Iterators",
      "com.google.common.collect.Iterators$6",
      "com.google.common.collect.RangeGwtSerializationDependencies",
      "com.google.common.collect.Cut",
      "com.google.common.collect.Cut$BelowAll",
      "com.google.common.collect.Cut$AboveAll",
      "com.google.common.collect.Range",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.ImmutableSet$CachingAsList",
      "com.google.common.collect.ImmutableMapEntrySet",
      "com.google.common.collect.ImmutableMapEntrySet$RegularEntrySet",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.Iterators$ArrayItr",
      "com.google.common.collect.AbstractIterator",
      "com.google.common.graph.EndpointPairIterator",
      "com.google.common.graph.EndpointPairIterator$Undirected",
      "com.google.common.collect.AbstractIterator$State",
      "com.google.common.collect.RegularImmutableSet",
      "com.google.common.collect.Sets",
      "com.google.common.collect.AbstractIterator$1",
      "com.google.common.graph.AbstractValueGraph$2",
      "com.google.common.graph.EndpointPairIterator$Directed",
      "com.google.common.graph.AbstractUndirectedNetworkConnections",
      "com.google.common.graph.UndirectedNetworkConnections",
      "com.google.common.base.Converter",
      "com.google.common.base.Converter$IdentityConverter",
      "com.google.common.graph.ImmutableNetwork$Builder",
      "com.google.common.graph.UndirectedGraphConnections",
      "com.google.common.graph.UndirectedGraphConnections$2",
      "com.google.common.graph.ImmutableValueGraph$1",
      "com.google.common.collect.Iterables",
      "com.google.common.collect.ImmutableBiMapFauxverideShim",
      "com.google.common.collect.ImmutableBiMap",
      "com.google.common.collect.SingletonImmutableBiMap",
      "com.google.common.collect.Cut$BelowValue",
      "com.google.common.collect.Cut$AboveValue",
      "com.google.common.primitives.Booleans",
      "com.google.common.graph.AbstractValueGraph$1",
      "com.google.common.collect.HashBiMap$Inverse",
      "com.google.common.collect.Maps$KeySet",
      "com.google.common.collect.HashBiMap$Inverse$InverseKeySet",
      "com.google.common.collect.HashBiMap$Itr",
      "com.google.common.collect.HashBiMap$Inverse$InverseKeySet$1",
      "com.google.common.collect.AbstractMapEntry",
      "com.google.common.collect.ImmutableEntry",
      "com.google.common.collect.HashBiMap$BiEntry",
      "com.google.common.collect.HashBiMap$KeySet",
      "com.google.common.math.IntMath",
      "com.google.common.base.Converter$FunctionBasedConverter",
      "com.google.common.base.Converter$ConverterComposition",
      "com.google.common.base.Converter$ReverseConverter",
      "com.google.common.graph.ImmutableNetwork$3",
      "com.google.common.collect.HashBiMap$KeySet$1",
      "com.google.common.collect.RegularImmutableBiMap",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.common.collect.Iterators$9",
      "com.google.common.graph.UndirectedMultiNetworkConnections",
      "com.google.common.collect.Range$1",
      "com.google.common.graph.EdgesConnecting",
      "com.google.common.graph.AbstractDirectedNetworkConnections$1",
      "com.google.common.graph.MapRetrievalCache$CacheEntry"
    );
  }
}
