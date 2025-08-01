/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Oct 23 18:45:32 GMT 2024
 */

package com.google.common.jimfs;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class SystemJimfsFileSystemProvider_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.google.common.jimfs.SystemJimfsFileSystemProvider"; 
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
    java.lang.System.setProperty("user.dir", "/home/wtwhite/code/regression-test-generation/find-diff-classes/testgen/mvnc/com/google/jimfs/jimfs/1.2"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(SystemJimfsFileSystemProvider_ESTest_scaffolding.class.getClassLoader() ,
      "com.google.common.base.Equivalence$Identity",
      "com.google.common.base.FunctionalEquivalence",
      "com.google.common.collect.ImmutableSet$Builder",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.common.base.JdkPattern",
      "com.google.common.jimfs.SystemJimfsFileSystemProvider$1",
      "com.google.common.base.Strings",
      "com.google.common.base.Platform",
      "com.google.common.base.PatternCompiler",
      "com.google.common.collect.MapMakerInternalMap$InternalEntryHelper",
      "com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueSegment",
      "com.google.common.collect.ImmutableList",
      "com.google.common.base.PairwiseEquivalence",
      "com.google.common.base.Platform$JdkPatternCompiler",
      "com.google.common.collect.MapMakerInternalMap$WeakValueReference",
      "com.google.common.jimfs.BasicAttributeProvider$Attributes",
      "com.google.common.collect.MapMakerInternalMap$1",
      "com.google.common.collect.ImmutableCollection$ArrayBasedBuilder",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.errorprone.annotations.DoNotMock",
      "com.google.common.collect.ImmutableSortedSet",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.MapMakerInternalMap$Strength",
      "com.google.common.base.Equivalence",
      "com.google.common.collect.MapMakerInternalMap$Segment",
      "com.google.common.collect.MapMakerInternalMap$Strength$2",
      "com.google.common.collect.MapMakerInternalMap$Strength$1",
      "com.google.common.base.MoreObjects",
      "com.google.common.base.Equivalence$Equals",
      "com.google.common.collect.RegularImmutableSet",
      "com.google.common.base.CommonPattern",
      "com.google.common.jimfs.BasicAttributeProvider",
      "com.google.common.collect.SortedIterable",
      "com.google.common.base.Predicate",
      "com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry$Helper",
      "com.google.common.jimfs.AttributeProvider",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.MapMakerInternalMap",
      "com.google.common.collect.ImmutableSortedSetFauxverideShim",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.jimfs.SystemJimfsFileSystemProvider",
      "com.google.common.collect.MapMaker",
      "com.google.common.collect.MapMakerInternalMap$InternalEntry"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(SystemJimfsFileSystemProvider_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.google.common.collect.MapMaker",
      "com.google.common.collect.MapMakerInternalMap$Strength",
      "com.google.common.base.Preconditions",
      "com.google.common.collect.MapMakerInternalMap$1",
      "com.google.common.collect.MapMakerInternalMap",
      "com.google.common.base.MoreObjects",
      "com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueEntry$Helper",
      "com.google.common.base.Equivalence",
      "com.google.common.base.Equivalence$Equals",
      "com.google.common.collect.MapMakerInternalMap$Segment",
      "com.google.common.collect.MapMakerInternalMap$StrongKeyWeakValueSegment",
      "com.google.common.jimfs.SystemJimfsFileSystemProvider",
      "com.google.common.jimfs.SystemJimfsFileSystemProvider$1",
      "com.google.common.jimfs.PathType",
      "com.google.common.base.Joiner",
      "com.google.common.base.Splitter",
      "com.google.common.base.Platform$JdkPatternCompiler",
      "com.google.common.base.Platform",
      "com.google.common.base.CommonPattern",
      "com.google.common.base.JdkPattern",
      "com.google.common.base.CommonMatcher",
      "com.google.common.base.JdkPattern$JdkMatcher",
      "com.google.common.base.Splitter$3",
      "com.google.common.base.CharMatcher",
      "com.google.common.base.CharMatcher$FastMatcher",
      "com.google.common.base.CharMatcher$NamedFastMatcher",
      "com.google.common.base.CharMatcher$None",
      "com.google.common.jimfs.WindowsPathType",
      "com.google.common.collect.Ordering",
      "com.google.common.collect.NaturalOrdering",
      "com.google.common.jimfs.Name$1",
      "com.google.common.collect.ByFunctionOrdering",
      "com.google.common.jimfs.Name$2",
      "com.google.common.jimfs.Name",
      "com.google.common.collect.NullsLastOrdering",
      "com.google.common.collect.LexicographicalOrdering",
      "com.google.common.jimfs.PathService$1",
      "com.google.common.jimfs.PathService",
      "com.google.common.collect.ImmutableCollection",
      "com.google.common.collect.ImmutableSet",
      "com.google.common.collect.RegularImmutableSet",
      "com.google.common.collect.UnmodifiableIterator",
      "com.google.common.collect.UnmodifiableListIterator",
      "com.google.common.collect.AbstractIndexedListIterator",
      "com.google.common.collect.ImmutableList$Itr",
      "com.google.common.collect.RegularImmutableList",
      "com.google.common.collect.ImmutableList",
      "com.google.common.collect.ObjectArrays",
      "com.google.common.jimfs.JimfsPath",
      "com.google.common.jimfs.Configuration",
      "com.google.common.base.CharMatcher$Is",
      "com.google.common.base.Splitter$1",
      "com.google.common.jimfs.UnixPathType",
      "com.google.common.jimfs.Configuration$Builder",
      "com.google.common.jimfs.WatchServiceConfiguration$PollingConfig",
      "com.google.common.jimfs.WatchServiceConfiguration",
      "com.google.common.collect.Lists",
      "com.google.common.collect.Lists$OnePlusArrayList",
      "com.google.common.math.IntMath",
      "com.google.common.primitives.IntsMethodsForWeb",
      "com.google.common.primitives.Ints",
      "com.google.common.jimfs.PathType$ParseResult",
      "com.google.common.base.Splitter$5",
      "com.google.common.collect.Iterables",
      "com.google.common.base.AbstractIterator",
      "com.google.common.base.Splitter$SplittingIterator",
      "com.google.common.base.Splitter$1$1",
      "com.google.common.base.AbstractIterator$State",
      "com.google.common.base.AbstractIterator$1",
      "com.google.common.collect.SingletonImmutableSet",
      "com.google.common.jimfs.Feature",
      "com.google.common.collect.Sets",
      "com.google.common.collect.ImmutableEnumSet",
      "com.google.common.collect.ImmutableMap",
      "com.google.common.collect.RegularImmutableMap",
      "com.google.common.jimfs.Configuration$UnixHolder",
      "com.google.common.jimfs.Configuration$1",
      "com.google.common.collect.Iterators",
      "com.google.common.jimfs.Configuration$OsxHolder",
      "com.google.common.collect.FluentIterable",
      "com.google.common.collect.Iterables$4",
      "com.google.common.base.Optional",
      "com.google.common.base.Absent",
      "com.google.common.collect.AbstractIterator",
      "com.google.common.collect.Iterators$5",
      "com.google.common.collect.AbstractIterator$State",
      "com.google.common.collect.AbstractIterator$1",
      "com.google.common.collect.Iterators$9",
      "com.google.common.collect.Iterators$1",
      "com.google.common.base.Ascii",
      "com.google.common.collect.ImmutableCollection$Builder",
      "com.google.common.collect.ImmutableCollection$ArrayBasedBuilder",
      "com.google.common.collect.ImmutableList$Builder",
      "com.google.common.collect.CollectPreconditions",
      "com.google.common.collect.ImmutableSortedSetFauxverideShim",
      "com.google.common.collect.ImmutableSortedSet",
      "com.google.common.collect.RegularImmutableSortedSet",
      "com.google.common.collect.ImmutableList$SubList",
      "com.google.common.base.Strings",
      "com.google.common.collect.Hashing",
      "com.ibm.icu.lang.UCharacter",
      "com.ibm.icu.impl.ICUData",
      "com.ibm.icu.impl.ICUData$2",
      "com.ibm.icu.impl.ICUConfig",
      "com.ibm.icu.impl.ICUConfig$1",
      "com.ibm.icu.impl.ICUBinary",
      "com.ibm.icu.impl.ClassLoaderUtil",
      "com.ibm.icu.impl.ICUData$3",
      "com.ibm.icu.impl.UCaseProps$IsAcceptable",
      "com.ibm.icu.impl.Trie2$1",
      "com.ibm.icu.impl.Trie2",
      "com.ibm.icu.impl.Trie2_16",
      "com.ibm.icu.impl.Trie2$UTrie2Header",
      "com.ibm.icu.impl.Trie2$ValueWidth",
      "com.ibm.icu.impl.Trie2$2",
      "com.ibm.icu.impl.UCaseProps",
      "com.ibm.icu.impl.CaseMapImpl",
      "com.ibm.icu.text.Edits",
      "com.ibm.icu.impl.UCaseProps$LatinCase",
      "com.ibm.icu.text.Edits$Iterator",
      "com.google.common.jimfs.Handler",
      "com.google.common.jimfs.JimfsFileSystemProvider",
      "com.google.common.collect.SortedIterables",
      "com.google.common.base.Splitter$3$1",
      "com.google.common.jimfs.Configuration$WindowsHolder",
      "com.google.common.collect.RangeGwtSerializationDependencies",
      "com.google.common.collect.Cut",
      "com.google.common.collect.Cut$BelowAll",
      "com.google.common.collect.Cut$AboveAll",
      "com.google.common.collect.Range",
      "com.google.common.collect.Cut$AboveValue",
      "com.google.common.collect.ContiguousSet",
      "com.google.common.collect.Platform",
      "com.google.common.collect.Cut$BelowValue",
      "com.google.common.primitives.Booleans",
      "com.google.common.collect.DiscreteDomain",
      "com.google.common.collect.RegularContiguousSet",
      "com.google.common.collect.BoundType",
      "com.google.common.collect.Range$1",
      "com.google.common.jimfs.JimfsPath$1",
      "com.google.common.collect.ImmutableSet$Builder",
      "com.google.common.collect.ImmutableSortedSet$Builder",
      "com.google.common.jimfs.HeapDisk",
      "com.google.common.math.LongMath",
      "com.google.common.jimfs.File",
      "com.google.common.jimfs.RegularFile",
      "com.google.common.jimfs.FileFactory",
      "com.google.common.jimfs.FileFactory$DirectorySupplier",
      "com.google.common.jimfs.FileFactory$RegularFileSupplier",
      "com.google.common.jimfs.Directory",
      "com.google.common.jimfs.DirectoryEntry",
      "com.google.common.jimfs.Util",
      "com.google.common.collect.ImmutableList$ReverseImmutableList",
      "com.google.common.base.MoreObjects$ToStringHelper",
      "com.google.common.base.MoreObjects$ToStringHelper$ValueHolder",
      "com.google.common.base.Java8Usage",
      "com.google.common.collect.EmptyContiguousSet",
      "com.google.common.jimfs.BasicAttributeProvider$Attributes",
      "com.google.common.jimfs.PosixAttributeProvider$Attributes",
      "com.google.common.jimfs.AttributeService",
      "com.google.common.collect.ImmutableMap$Builder",
      "com.google.common.jimfs.AttributeProvider",
      "com.google.common.jimfs.BasicAttributeProvider",
      "com.google.common.jimfs.UserLookupService",
      "com.google.common.jimfs.UserLookupService$NamedPrincipal",
      "com.google.common.jimfs.UserLookupService$JimfsUserPrincipal",
      "com.google.common.jimfs.OwnerAttributeProvider",
      "com.google.common.jimfs.UserLookupService$JimfsGroupPrincipal",
      "com.google.common.jimfs.PosixAttributeProvider",
      "com.google.common.jimfs.DosAttributeProvider",
      "com.google.common.jimfs.AclAttributeProvider",
      "com.google.common.jimfs.UserDefinedAttributeProvider",
      "com.google.common.jimfs.StandardAttributeProviders",
      "com.google.common.collect.RegularImmutableMap$EntrySet",
      "com.google.common.collect.RegularImmutableMap$EntrySet$1",
      "com.google.common.jimfs.FileTree",
      "com.google.common.collect.ImmutableSortedMapFauxverideShim",
      "com.google.common.collect.ImmutableSortedMap",
      "com.google.common.jimfs.FileSystemState",
      "com.google.common.jimfs.DosAttributeProvider$Attributes",
      "com.google.common.base.Functions",
      "com.google.common.base.Functions$ToStringFunction",
      "com.google.common.collect.Iterables$5",
      "com.google.common.collect.ComparisonChain$1",
      "com.google.common.collect.ComparisonChain$InactiveComparisonChain",
      "com.google.common.collect.ComparisonChain",
      "com.google.common.jimfs.SymbolicLink",
      "com.google.common.collect.Iterators$ArrayItr",
      "com.google.common.collect.AbstractSequentialIterator",
      "com.google.common.collect.RegularContiguousSet$1",
      "com.google.common.jimfs.Directory$1",
      "com.google.common.jimfs.JimfsFileSystem",
      "com.google.common.jimfs.FileSystemView",
      "com.google.common.jimfs.JimfsFileStore",
      "com.google.common.collect.TransformedIterator",
      "com.google.common.collect.Iterators$6",
      "com.google.common.jimfs.PathMatchers",
      "com.google.common.collect.DescendingImmutableSortedSet",
      "com.google.common.collect.ReverseNaturalOrdering",
      "com.google.common.collect.RegularContiguousSet$2",
      "com.google.common.collect.DiscreteDomain$IntegerDomain",
      "com.google.common.collect.RegularImmutableMap$KeysOrValuesAsList",
      "com.google.common.collect.RegularImmutableMap$KeySet",
      "com.google.common.jimfs.FileFactory$SymbolicLinkSupplier"
    );
  }
}
