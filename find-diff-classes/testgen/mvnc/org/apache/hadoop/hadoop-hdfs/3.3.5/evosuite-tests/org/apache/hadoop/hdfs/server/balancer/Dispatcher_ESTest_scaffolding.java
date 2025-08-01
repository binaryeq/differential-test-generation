/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Nov 10 23:12:53 GMT 2024
 */

package org.apache.hadoop.hdfs.server.balancer;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Dispatcher_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.hadoop.hdfs.server.balancer.Dispatcher"; 
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
    java.lang.System.setProperty("user.dir", "/home/wtwhite/code/regression-test-generation-NON-SOURCE-EQUIV/find-diff-classes/testgen/mvnc/org/apache/hadoop/hadoop-hdfs/3.3.5"); 
    java.lang.System.setProperty("sun.boot.library.path", "/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/amd64"); 
    java.lang.System.setProperty("file.encoding.pkg", "sun.io"); 
    java.lang.System.setProperty("user.country", "NZ"); 
    java.lang.System.setProperty("sun.java.launcher", "SUN_STANDARD"); 
    java.lang.System.setProperty("sun.os.patch.level", "unknown"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("inline", "true"); 
    java.lang.System.setProperty("master_log_port", "46765"); 
    java.lang.System.setProperty("log4j.configuration", "SUT.log4j.properties"); 
    java.lang.System.setProperty("sun.jnu.encoding", "UTF-8"); 
    java.lang.System.setProperty("selection_function", "RANK_CROWD_DISTANCE_TOURNAMENT"); 
    java.lang.System.setProperty("sun.management.compiler", "HotSpot 64-Bit Tiered Compilers"); 
    java.lang.System.setProperty("user.home", "/home/wtwhite"); 
    java.lang.System.setProperty("user.timezone", "Pacific/Auckland"); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("strategy", "MOSuite"); 
    java.lang.System.setProperty("CP_file_path", "/tmp/EvoSuite_classpathFile5256874620719360429.txt"); 
    java.lang.System.setProperty("user.name", "wtwhite"); 
    java.lang.System.setProperty("num_parallel_clients", "1"); 
    java.lang.System.setProperty("PROJECT_PREFIX", ""); 
    java.lang.System.setProperty("sun.arch.data.model", "64"); 
    java.lang.System.setProperty("algorithm", "DYNAMOSA"); 
    java.lang.System.setProperty("sun.java.command", "org.evosuite.ClientProcess Client-0"); 
    java.lang.System.setProperty("user.language", "en"); 
    java.lang.System.setProperty("process_communication_port", "16083"); 
    java.lang.System.setProperty("sun.boot.class.path", "/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/resources.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/rt.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/sunrsasign.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jsse.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jce.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/charsets.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/lib/jfr.jar:/usr/lib/jvm/java-8-openjdk-amd64/jre/classes"); 
    java.lang.System.setProperty("java.awt.headless", "true"); 
    java.lang.System.setProperty("logback.configurationFile", "logback-evosuite.xml"); 
    java.lang.System.setProperty("java.specification.maintenance.version", "5"); 
    java.lang.System.setProperty("java.vendor.url.bug", "http://bugreport.sun.com/bugreport/"); 
    java.lang.System.setProperty("sun.cpu.endian", "little"); 
    java.lang.System.setProperty("sun.io.unicode.encoding", "UnicodeLittle"); 
    java.lang.System.setProperty("java.rmi.server.hostname", "127.0.0.1"); 
    java.lang.System.setProperty("TARGET_CLASS", "org.apache.hadoop.hdfs.server.balancer.Dispatcher"); 
    java.lang.System.setProperty("evosuite.log.appender", "CLIENT"); 
    java.lang.System.setProperty("sun.cpu.isalist", ""); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Dispatcher_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.hadoop.net.InnerNode",
      "org.apache.hadoop.crypto.CryptoOutputStream",
      "com.ctc.wstx.sr.CompactNsContext",
      "org.apache.hadoop.fs.FileSystem",
      "com.ctc.wstx.io.WstxInputData",
      "org.apache.hadoop.io.Writable",
      "org.apache.hadoop.hdfs.util.StripedBlockUtil",
      "com.ctc.wstx.io.AsciiReader",
      "org.apache.hadoop.classification.InterfaceAudience$Private",
      "org.apache.hadoop.fs.CanUnbuffer",
      "org.apache.hadoop.thirdparty.com.google.common.base.FunctionalEquivalence",
      "org.apache.hadoop.hdfs.protocol.Block$1",
      "org.apache.hadoop.fs.ByteBufferPositionedReadable",
      "org.apache.hadoop.conf.Configuration",
      "com.ctc.wstx.exc.WstxParsingException",
      "org.apache.hadoop.io.WritableFactories",
      "org.apache.commons.collections.MapIterator",
      "org.apache.hadoop.thirdparty.com.google.common.collect.MapMakerInternalMap$InternalEntry",
      "org.apache.hadoop.fs.StorageType",
      "com.ctc.wstx.util.SymbolTable$Bucket",
      "org.apache.hadoop.classification.InterfaceStability$Stable",
      "org.apache.hadoop.thirdparty.com.google.common.collect.Interner",
      "com.ctc.wstx.sr.TypedStreamReader",
      "org.apache.hadoop.hdfs.server.balancer.MovedBlocks$Locations",
      "com.ctc.wstx.io.BaseReader",
      "com.ctc.wstx.io.InputSourceFactory",
      "org.codehaus.stax2.ri.typed.ValueDecoderFactory$BaseArrayDecoder",
      "org.codehaus.stax2.AttributeInfo",
      "org.apache.commons.collections.IterableMap",
      "org.apache.hadoop.fs.PathCapabilities",
      "com.ctc.wstx.util.SymbolTable",
      "org.apache.hadoop.fs.CanSetReadahead",
      "com.ctc.wstx.sr.InputProblemReporter",
      "org.codehaus.stax2.ri.typed.ValueDecoderFactory$FloatArrayDecoder",
      "org.apache.hadoop.thirdparty.com.google.common.collect.MapMakerInternalMap",
      "org.apache.hadoop.net.InnerNodeImpl$Factory",
      "org.apache.hadoop.util.Time$1",
      "com.ctc.wstx.io.CharArraySource",
      "org.apache.hadoop.fs.statistics.IOStatisticsSource",
      "org.apache.hadoop.fs.Syncable",
      "org.codehaus.stax2.typed.TypedXMLStreamException",
      "org.apache.hadoop.hdfs.server.balancer.Dispatcher$DDatanode$StorageGroup",
      "org.apache.hadoop.hdfs.protocol.datatransfer.sasl.DataTransferSaslUtil",
      "org.apache.hadoop.thirdparty.com.google.common.base.Equivalence$Identity",
      "org.apache.hadoop.fs.CanSetDropBehind",
      "org.apache.hadoop.thirdparty.com.google.common.base.Java8Usage",
      "org.apache.hadoop.io.DataInputBuffer",
      "com.ctc.wstx.util.DefaultXmlSymbolTable",
      "org.eclipse.jetty.util.component.Dumpable",
      "org.apache.hadoop.net.NetworkTopology$InvalidTopologyException",
      "org.codehaus.stax2.validation.XMLValidator",
      "com.ctc.wstx.util.StringVector",
      "org.apache.hadoop.util.ReflectionUtils",
      "org.codehaus.stax2.XMLEventReader2",
      "org.apache.hadoop.hdfs.protocol.datatransfer.TrustedChannelResolver",
      "org.apache.hadoop.thirdparty.com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueEntry$Helper",
      "org.apache.hadoop.thirdparty.com.google.common.collect.MapMakerInternalMap$Strength",
      "org.apache.hadoop.fs.Seekable",
      "org.codehaus.stax2.validation.ValidatorPair",
      "org.eclipse.jetty.util.component.Container",
      "org.apache.hadoop.fs.BatchListingOperations",
      "org.apache.hadoop.hdfs.server.balancer.Dispatcher$Allocator",
      "com.ctc.wstx.exc.WstxIOException",
      "org.apache.hadoop.hdfs.server.balancer.Dispatcher$Source",
      "org.apache.hadoop.hdfs.server.balancer.MovedBlocks",
      "org.apache.hadoop.conf.Configuration$NegativeCacheSentinel",
      "org.apache.hadoop.conf.StorageUnit",
      "org.apache.hadoop.net.InnerNodeImpl",
      "org.apache.hadoop.thirdparty.com.google.common.base.Preconditions",
      "org.apache.hadoop.thirdparty.com.google.common.base.PairwiseEquivalence",
      "org.apache.hadoop.conf.Configuration$DeprecationContext",
      "org.apache.hadoop.net.NetworkTopology",
      "org.codehaus.stax2.ri.evt.BaseEventImpl",
      "org.codehaus.stax2.ri.typed.ValueDecoderFactory$LongArrayDecoder",
      "org.apache.hadoop.hdfs.net.Peer",
      "org.apache.hadoop.hdfs.server.balancer.Dispatcher$GlobalBlockMap",
      "org.apache.hadoop.io.DataOutputBuffer",
      "org.apache.hadoop.fs.StreamCapabilities",
      "com.ctc.wstx.api.WstxInputProperties",
      "org.eclipse.jetty.util.AttributesMap",
      "org.apache.hadoop.net.NodeBase",
      "com.ctc.wstx.sr.InputElementStack",
      "com.ctc.wstx.io.InputBootstrapper",
      "org.codehaus.stax2.ri.typed.ValueDecoderFactory$BooleanDecoder",
      "org.apache.hadoop.hdfs.server.balancer.Dispatcher$Util",
      "org.codehaus.stax2.XMLInputFactory2",
      "org.codehaus.stax2.typed.TypedXMLStreamReader",
      "com.ctc.wstx.util.TextBuffer$BufferReader",
      "com.ctc.wstx.exc.WstxException",
      "com.ctc.wstx.evt.WEntityDeclaration",
      "com.ctc.wstx.util.InternCache",
      "org.codehaus.stax2.ri.typed.ValueDecoderFactory$DoubleDecoder",
      "org.apache.hadoop.crypto.key.KeyProviderTokenIssuer",
      "com.ctc.wstx.util.EmptyNamespaceContext",
      "org.apache.hadoop.hdfs.DistributedFileSystem",
      "com.ctc.wstx.api.CommonConfig",
      "org.apache.hadoop.hdfs.server.balancer.Dispatcher$DBlock",
      "org.apache.hadoop.hdfs.server.balancer.NameNodeConnector",
      "org.apache.hadoop.crypto.CryptoInputStream",
      "com.ctc.wstx.util.TextBuffer",
      "com.ctc.wstx.sr.ValidatingStreamReader",
      "com.ctc.wstx.api.ReaderConfig",
      "com.ctc.wstx.cfg.ParsingErrorMsgs",
      "com.ctc.wstx.sr.NsDefaultProvider",
      "org.apache.hadoop.thirdparty.com.google.common.collect.MapMakerInternalMap$Strength$2",
      "org.apache.hadoop.thirdparty.com.google.common.collect.MapMakerInternalMap$Strength$1",
      "org.codehaus.stax2.ri.typed.ValueDecoderFactory$DecoderBase",
      "org.codehaus.stax2.DTDInfo",
      "org.codehaus.stax2.ri.typed.ValueDecoderFactory$IntegerDecoder",
      "org.apache.hadoop.thirdparty.com.google.common.base.Equivalence$Equals",
      "org.apache.hadoop.hdfs.server.balancer.Dispatcher$StorageGroupMap",
      "com.ctc.wstx.io.StreamBootstrapper",
      "com.ctc.wstx.util.BaseNsContext",
      "org.codehaus.stax2.validation.ValidationContext",
      "org.apache.hadoop.hdfs.protocol.datatransfer.sasl.SaslDataTransferClient",
      "org.apache.hadoop.thirdparty.com.google.common.collect.Interners",
      "org.codehaus.stax2.ri.typed.ValueDecoderFactory$IntDecoder",
      "com.ctc.wstx.io.UTF32Reader",
      "org.codehaus.stax2.validation.XMLValidationSchema",
      "com.ctc.wstx.io.ReaderBootstrapper",
      "org.apache.hadoop.hdfs.security.token.block.InvalidBlockTokenException",
      "org.apache.hadoop.fs.ByteBufferReadable",
      "org.apache.hadoop.hdfs.protocol.Block",
      "org.apache.hadoop.fs.ChecksumFileSystem",
      "org.apache.hadoop.util.ReflectionUtils$1",
      "com.ctc.wstx.io.WstxInputSource",
      "org.apache.hadoop.thirdparty.com.google.common.base.Predicate",
      "org.codehaus.stax2.ri.typed.ValueDecoderFactory$DoubleArrayDecoder",
      "org.apache.hadoop.conf.Configuration$DeprecationDelta",
      "com.ctc.wstx.sr.BasicStreamReader",
      "org.apache.hadoop.classification.InterfaceStability$Evolving",
      "org.codehaus.stax2.ri.typed.ValueDecoderFactory$IntArrayDecoder",
      "org.apache.hadoop.thirdparty.com.google.common.collect.MapMakerInternalMap$1",
      "org.apache.hadoop.conf.Configuration$DeprecatedKeyInfo",
      "org.codehaus.stax2.typed.TypedArrayDecoder",
      "org.apache.hadoop.fs.FilterFileSystem",
      "org.apache.hadoop.hdfs.server.balancer.Dispatcher$Task",
      "org.codehaus.stax2.validation.DTDValidationSchema",
      "org.apache.hadoop.hdfs.server.balancer.Dispatcher$PendingMove",
      "org.apache.hadoop.util.StringInterner",
      "org.codehaus.stax2.XMLStreamProperties",
      "org.apache.hadoop.conf.Configuration$IntegerRanges",
      "com.ctc.wstx.io.BranchingReaderSource",
      "org.apache.hadoop.fs.HasEnhancedByteBufferAccess",
      "org.apache.hadoop.net.InnerNode$Factory",
      "org.apache.hadoop.hdfs.server.balancer.Dispatcher$DBlockStriped",
      "org.apache.hadoop.hdfs.server.balancer.Dispatcher$DDatanode",
      "com.ctc.wstx.exc.WstxUnexpectedCharException",
      "org.codehaus.stax2.LocationInfo",
      "org.codehaus.stax2.ri.typed.ValueDecoderFactory$QNameDecoder",
      "com.ctc.wstx.sr.Element",
      "org.apache.hadoop.hdfs.protocol.datatransfer.InvalidEncryptionKeyException",
      "org.apache.hadoop.hdfs.protocol.DatanodeID",
      "org.codehaus.stax2.ri.typed.ValueDecoderFactory$LongDecoder",
      "org.eclipse.jetty.util.Attributes",
      "com.ctc.wstx.ent.IntEntity",
      "org.codehaus.stax2.XMLStreamReader2",
      "org.apache.commons.collections.map.UnmodifiableMap",
      "com.ctc.wstx.io.MergedStream",
      "org.apache.commons.collections.map.AbstractMapDecorator",
      "com.ctc.wstx.ent.EntityDecl",
      "org.codehaus.stax2.ri.typed.ValueDecoderFactory$FloatDecoder",
      "org.apache.hadoop.thirdparty.com.google.common.collect.MapMaker",
      "com.ctc.wstx.api.WstxInputProperties$ParsingMode",
      "org.apache.hadoop.conf.Configured",
      "org.apache.hadoop.conf.Configuration$Parser",
      "org.apache.hadoop.fs.Path",
      "org.apache.hadoop.conf.Configurable",
      "org.apache.hadoop.classification.InterfaceAudience$Public",
      "com.ctc.wstx.sr.StreamReaderImpl",
      "org.apache.hadoop.thirdparty.com.google.common.base.MoreObjects",
      "com.ctc.wstx.util.TextBuilder",
      "org.apache.hadoop.thirdparty.com.google.common.base.Function",
      "org.apache.hadoop.security.token.DelegationTokenIssuer",
      "com.ctc.wstx.io.SystemId",
      "com.ctc.wstx.io.ReaderSource",
      "com.ctc.wstx.sr.AttributeCollector",
      "org.apache.hadoop.conf.Configuration$ParsedItem",
      "com.ctc.wstx.io.ISOLatinReader",
      "org.apache.hadoop.thirdparty.com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueSegment",
      "org.apache.hadoop.thirdparty.com.google.common.base.Equivalence",
      "org.codehaus.stax2.typed.TypedValueDecoder",
      "com.ctc.wstx.cfg.InputConfigFlags",
      "org.apache.hadoop.util.Preconditions",
      "org.codehaus.stax2.evt.XMLEvent2",
      "com.ctc.wstx.io.BaseInputSource",
      "org.apache.hadoop.fs.HasFileDescriptor",
      "org.apache.hadoop.thirdparty.com.google.common.collect.MapMakerInternalMap$WeakValueReference",
      "org.apache.hadoop.conf.Configuration$Resource",
      "com.ctc.wstx.io.UTF8Reader",
      "org.apache.hadoop.fs.PositionedReadable",
      "com.ctc.wstx.exc.WstxValidationException",
      "com.ctc.wstx.sr.ReaderCreator",
      "org.codehaus.stax2.XMLStreamLocation2",
      "com.ctc.wstx.sr.StreamScanner",
      "org.apache.hadoop.hdfs.protocol.DatanodeInfo",
      "org.codehaus.stax2.ri.typed.ValueDecoderFactory$DecimalDecoder",
      "org.apache.hadoop.thirdparty.com.google.common.collect.Interners$InternerImpl",
      "org.codehaus.stax2.validation.XMLValidationException",
      "org.apache.hadoop.net.Node",
      "org.apache.hadoop.io.WritableFactory",
      "com.ctc.wstx.stax.WstxInputFactory",
      "org.apache.hadoop.thirdparty.com.google.common.collect.Interners$InternerBuilder",
      "org.apache.hadoop.hdfs.server.balancer.Dispatcher",
      "org.apache.hadoop.util.Time",
      "com.ctc.wstx.exc.WstxEOFException",
      "org.apache.commons.collections.Unmodifiable",
      "org.apache.hadoop.fs.LocalFileSystem",
      "org.codehaus.stax2.validation.Validatable",
      "org.apache.hadoop.thirdparty.com.google.common.collect.MapMakerInternalMap$Segment",
      "org.apache.hadoop.thirdparty.com.google.common.collect.MapMakerInternalMap$InternalEntryHelper"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Dispatcher_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.hadoop.hdfs.server.balancer.Dispatcher",
      "org.apache.hadoop.hdfs.server.balancer.Dispatcher$GlobalBlockMap",
      "org.apache.hadoop.hdfs.server.balancer.Dispatcher$StorageGroupMap",
      "org.apache.hadoop.hdfs.server.balancer.Dispatcher$Allocator",
      "org.apache.hadoop.hdfs.server.balancer.Dispatcher$DDatanode$StorageGroup",
      "org.apache.hadoop.hdfs.server.balancer.Dispatcher$Source",
      "org.apache.hadoop.hdfs.server.balancer.Dispatcher$Util",
      "org.apache.hadoop.hdfs.server.balancer.Dispatcher$DDatanode",
      "org.apache.hadoop.hdfs.server.balancer.Dispatcher$PendingMove",
      "org.apache.hadoop.hdfs.server.balancer.Dispatcher$1",
      "org.apache.hadoop.hdfs.server.balancer.Dispatcher$2",
      "org.apache.hadoop.hdfs.server.balancer.MovedBlocks$Locations",
      "org.apache.hadoop.hdfs.server.balancer.Dispatcher$DBlock",
      "org.apache.hadoop.net.NodeBase",
      "org.apache.hadoop.net.InnerNodeImpl$Factory",
      "org.apache.hadoop.net.InnerNodeImpl",
      "org.apache.hadoop.util.ReflectionUtils$1",
      "org.apache.hadoop.util.ReflectionUtils",
      "org.apache.hadoop.hdfs.protocol.datatransfer.sasl.DataTransferSaslUtil",
      "org.apache.hadoop.util.Shell$OSType",
      "org.apache.hadoop.util.Shell$ShellCommandExecutor",
      "org.apache.hadoop.util.Time$1",
      "org.apache.hadoop.util.Time",
      "org.apache.hadoop.util.Shell",
      "org.apache.hadoop.util.StringUtils",
      "org.apache.hadoop.util.StringUtils$TraditionalBinaryPrefix",
      "org.apache.hadoop.hdfs.protocol.BlockType",
      "net.bytebuddy.build.HashCodeAndEqualsPlugin$Enhance$InvokeSuper",
      "org.assertj.core.internal.bytebuddy.build.HashCodeAndEqualsPlugin$Enhance$InvokeSuper",
      "org.codehaus.stax2.XMLInputFactory2",
      "com.ctc.wstx.util.SymbolTable",
      "com.ctc.wstx.util.SymbolTable$Bucket",
      "com.ctc.wstx.util.DefaultXmlSymbolTable",
      "com.ctc.wstx.stax.WstxInputFactory",
      "com.ctc.wstx.api.CommonConfig",
      "com.ctc.wstx.api.ReaderConfig",
      "com.ctc.wstx.api.WstxInputProperties$ParsingMode",
      "com.ctc.wstx.api.WstxInputProperties",
      "org.apache.hadoop.conf.Configuration$DeprecationDelta",
      "org.apache.hadoop.util.Preconditions",
      "org.apache.hadoop.conf.Configuration$DeprecationContext",
      "org.apache.hadoop.conf.Configuration$DeprecatedKeyInfo",
      "org.apache.commons.collections.map.AbstractMapDecorator",
      "org.apache.commons.collections.map.UnmodifiableMap",
      "org.apache.hadoop.conf.Configuration",
      "org.apache.hadoop.conf.Configuration$Resource",
      "com.ctc.wstx.io.SystemId",
      "com.ctc.wstx.io.InputBootstrapper",
      "com.ctc.wstx.io.StreamBootstrapper",
      "com.ctc.wstx.io.BaseReader",
      "com.ctc.wstx.io.UTF8Reader",
      "com.ctc.wstx.io.InputSourceFactory",
      "com.ctc.wstx.io.WstxInputSource",
      "com.ctc.wstx.io.BaseInputSource",
      "com.ctc.wstx.io.ReaderSource",
      "com.ctc.wstx.io.BranchingReaderSource",
      "com.ctc.wstx.io.WstxInputData",
      "com.ctc.wstx.sr.StreamScanner",
      "com.ctc.wstx.sr.BasicStreamReader",
      "com.ctc.wstx.sr.TypedStreamReader",
      "com.ctc.wstx.sr.ValidatingStreamReader",
      "com.ctc.wstx.sr.InputElementStack",
      "com.ctc.wstx.util.StringVector",
      "com.ctc.wstx.util.InternCache",
      "com.ctc.wstx.sr.AttributeCollector",
      "com.ctc.wstx.util.TextBuilder",
      "com.ctc.wstx.util.TextBuffer",
      "org.apache.hadoop.conf.Configuration$Parser",
      "com.ctc.wstx.sr.Element",
      "org.apache.hadoop.thirdparty.com.google.common.collect.Interners",
      "org.apache.hadoop.thirdparty.com.google.common.collect.Interners$InternerBuilder",
      "org.apache.hadoop.thirdparty.com.google.common.collect.MapMaker",
      "org.apache.hadoop.thirdparty.com.google.common.collect.Interners$InternerImpl",
      "org.apache.hadoop.thirdparty.com.google.common.base.Equivalence",
      "org.apache.hadoop.thirdparty.com.google.common.base.Equivalence$Equals",
      "org.apache.hadoop.thirdparty.com.google.common.base.Java8Usage",
      "org.apache.hadoop.thirdparty.com.google.common.base.Preconditions",
      "org.apache.hadoop.thirdparty.com.google.common.collect.MapMakerInternalMap$1",
      "org.apache.hadoop.thirdparty.com.google.common.collect.MapMakerInternalMap",
      "org.apache.hadoop.thirdparty.com.google.common.collect.MapMakerInternalMap$Strength",
      "org.apache.hadoop.thirdparty.com.google.common.base.MoreObjects",
      "org.apache.hadoop.thirdparty.com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueEntry$Helper",
      "org.apache.hadoop.thirdparty.com.google.common.collect.MapMakerInternalMap$Segment",
      "org.apache.hadoop.thirdparty.com.google.common.collect.MapMakerInternalMap$StrongKeyDummyValueSegment",
      "org.apache.hadoop.util.StringInterner",
      "org.apache.hadoop.conf.Configuration$ParsedItem",
      "org.apache.hadoop.fs.Path",
      "org.apache.hadoop.hdfs.server.balancer.NameNodeConnector",
      "org.eclipse.jetty.util.AttributesMap",
      "org.apache.hadoop.hdfs.server.balancer.MovedBlocks",
      "org.apache.hadoop.net.NetworkTopology",
      "org.apache.hadoop.hdfs.protocol.datatransfer.sasl.SaslDataTransferClient",
      "org.apache.hadoop.hdfs.protocol.datatransfer.TrustedChannelResolver",
      "org.apache.hadoop.hdfs.protocol.Block$1",
      "org.apache.hadoop.io.WritableFactories",
      "org.apache.hadoop.hdfs.protocol.Block",
      "org.apache.hadoop.hdfs.server.balancer.Dispatcher$DBlockStriped",
      "org.apache.hadoop.thirdparty.com.google.common.util.concurrent.RateLimiter",
      "org.apache.hadoop.thirdparty.com.google.common.util.concurrent.RateLimiter$SleepingStopwatch",
      "org.apache.hadoop.thirdparty.com.google.common.util.concurrent.RateLimiter$SleepingStopwatch$1",
      "org.apache.hadoop.thirdparty.com.google.common.base.Stopwatch",
      "org.apache.hadoop.thirdparty.com.google.common.base.Ticker$1",
      "org.apache.hadoop.thirdparty.com.google.common.base.Ticker",
      "org.apache.hadoop.thirdparty.com.google.common.base.Platform$JdkPatternCompiler",
      "org.apache.hadoop.thirdparty.com.google.common.base.Platform",
      "org.apache.hadoop.thirdparty.com.google.common.util.concurrent.SmoothRateLimiter",
      "org.apache.hadoop.thirdparty.com.google.common.util.concurrent.SmoothRateLimiter$SmoothBursty",
      "org.apache.hadoop.hdfs.NameNodeProxies",
      "org.apache.hadoop.hdfs.server.namenode.ha.NameNodeHAProxyFactory",
      "org.apache.hadoop.hdfs.NameNodeProxiesClient",
      "org.apache.hadoop.hdfs.DFSUtilClient",
      "org.eclipse.jetty.util.RegexSet",
      "org.apache.hadoop.hdfs.server.balancer.Dispatcher$Task",
      "org.eclipse.jetty.io.AbstractByteBufferPool",
      "org.eclipse.jetty.util.log.Log$1",
      "org.eclipse.jetty.util.Loader",
      "org.eclipse.jetty.util.log.Log",
      "org.eclipse.jetty.util.log.AbstractLogger",
      "org.eclipse.jetty.util.log.Slf4jLog",
      "org.eclipse.jetty.util.log.JettyAwareLogger",
      "org.eclipse.jetty.util.Uptime$DefaultImpl",
      "org.eclipse.jetty.util.Uptime",
      "org.eclipse.jetty.io.MappedByteBufferPool",
      "org.eclipse.jetty.util.component.AbstractLifeCycle",
      "org.eclipse.jetty.util.component.ContainerLifeCycle",
      "org.eclipse.jetty.io.LeakTrackingByteBufferPool",
      "org.eclipse.jetty.util.LeakDetector",
      "org.eclipse.jetty.io.LeakTrackingByteBufferPool$1",
      "org.eclipse.jetty.util.component.ContainerLifeCycle$Managed",
      "org.eclipse.jetty.util.component.ContainerLifeCycle$Bean",
      "org.eclipse.jetty.util.component.ContainerLifeCycle$1",
      "org.eclipse.jetty.util.AbstractTrie",
      "org.eclipse.jetty.util.ArrayTrie",
      "org.eclipse.jetty.util.MathUtils",
      "org.eclipse.jetty.util.StringUtil",
      "org.apache.hadoop.conf.Configured",
      "org.apache.log4j.Level",
      "org.apache.log4j.Priority",
      "org.apache.commons.logging.impl.Log4JLogger",
      "org.apache.log4j.Category",
      "org.apache.log4j.Logger",
      "org.apache.log4j.Hierarchy",
      "org.apache.log4j.spi.RootLogger",
      "org.apache.log4j.or.DefaultRenderer",
      "org.apache.log4j.or.RendererMap",
      "org.apache.log4j.DefaultCategoryFactory",
      "org.apache.log4j.spi.DefaultRepositorySelector",
      "org.apache.log4j.helpers.OptionConverter",
      "org.apache.log4j.helpers.Loader",
      "org.apache.log4j.helpers.LogLog",
      "org.apache.log4j.PropertyConfigurator",
      "org.apache.log4j.LogManager",
      "org.apache.log4j.CategoryKey",
      "org.apache.log4j.ProvisionNode",
      "org.apache.hadoop.fs.FileSystem$Cache",
      "org.apache.hadoop.fs.FileSystem$Cache$ClientFinalizer",
      "com.ctc.wstx.io.BufferRecycler",
      "org.apache.hadoop.fs.FileSystem$3",
      "org.apache.hadoop.fs.FileSystem",
      "org.apache.hadoop.fs.FilterFileSystem",
      "org.apache.hadoop.fs.ChecksumFileSystem$9",
      "org.apache.hadoop.fs.ChecksumFileSystem",
      "org.apache.hadoop.fs.LocalFileSystem",
      "org.apache.hadoop.fs.FileSystem$Cache$Key",
      "org.apache.hadoop.security.UserGroupInformation$UgiMetrics",
      "org.apache.hadoop.metrics2.MetricsSystem",
      "org.apache.hadoop.metrics2.impl.MetricsSystemImpl",
      "org.apache.hadoop.metrics2.lib.MetricsRegistry",
      "org.apache.hadoop.thirdparty.com.google.common.collect.Maps",
      "org.apache.hadoop.metrics2.lib.Interns",
      "org.apache.hadoop.metrics2.lib.Interns$CacheWith2Keys",
      "org.apache.hadoop.metrics2.lib.Interns$Info$1",
      "org.apache.hadoop.metrics2.lib.Interns$CacheWith2Keys$1",
      "org.apache.hadoop.metrics2.lib.Interns$Info",
      "org.apache.hadoop.metrics2.lib.Interns$CacheWith2Keys$2",
      "org.apache.hadoop.metrics2.lib.MetricsInfoImpl",
      "org.apache.hadoop.thirdparty.com.google.common.collect.Lists",
      "org.apache.hadoop.metrics2.impl.MetricsCollectorImpl",
      "org.apache.hadoop.thirdparty.com.google.common.base.Joiner",
      "org.apache.hadoop.metrics2.lib.UniqueNames",
      "org.apache.hadoop.metrics2.lib.DefaultMetricsSystem",
      "org.apache.hadoop.metrics2.lib.MetricsAnnotations",
      "org.apache.hadoop.metrics2.lib.MetricsSourceBuilder",
      "org.apache.hadoop.metrics2.lib.DefaultMetricsFactory",
      "org.apache.hadoop.metrics2.lib.MutableMetricsFactory",
      "org.apache.hadoop.util.ReflectionUtils$2",
      "org.apache.hadoop.metrics2.impl.MsInfo",
      "org.apache.hadoop.metrics2.lib.Interns$Tags$1",
      "org.apache.hadoop.metrics2.lib.Interns$Tags",
      "org.apache.hadoop.metrics2.MetricsTag",
      "org.apache.hadoop.metrics2.annotation.Metric$Type",
      "org.apache.commons.lang3.StringUtils",
      "org.apache.hadoop.metrics2.lib.MutableMetric",
      "org.apache.hadoop.metrics2.lib.MutableStat",
      "org.apache.hadoop.metrics2.lib.MutableRate",
      "org.apache.hadoop.metrics2.util.SampleStat",
      "org.apache.hadoop.metrics2.util.SampleStat$MinMax",
      "org.apache.hadoop.metrics2.lib.MutableGauge",
      "org.apache.hadoop.metrics2.lib.MutableGaugeInt",
      "org.apache.hadoop.metrics2.lib.MutableGaugeLong",
      "org.apache.hadoop.metrics2.lib.MetricsSourceBuilder$1",
      "org.apache.hadoop.metrics2.lib.UniqueNames$Count",
      "org.apache.hadoop.metrics2.MetricsSystem$AbstractCallback",
      "org.apache.hadoop.metrics2.impl.MetricsSystemImpl$1",
      "org.apache.hadoop.metrics2.impl.MetricsSystemImpl$3",
      "org.apache.hadoop.util.PlatformName",
      "org.apache.hadoop.security.UserGroupInformation",
      "org.apache.hadoop.security.SecurityUtil$StandardHostResolver",
      "org.apache.hadoop.net.DomainNameResolverFactory",
      "org.apache.hadoop.net.DNSDomainNameResolver",
      "org.apache.hadoop.security.SecurityUtil",
      "org.apache.hadoop.security.SaslRpcServer$AuthMethod",
      "org.apache.hadoop.security.UserGroupInformation$AuthenticationMethod",
      "org.apache.hadoop.security.authentication.util.KerberosName",
      "org.apache.hadoop.security.HadoopKerberosName",
      "org.apache.hadoop.security.HadoopKerberosName$1",
      "org.apache.hadoop.security.authentication.util.KerberosName$Rule",
      "org.apache.hadoop.security.Groups",
      "org.apache.hadoop.util.Timer",
      "org.apache.hadoop.security.JniBasedUnixGroupsMappingWithFallback",
      "org.apache.hadoop.util.NativeCodeLoader",
      "org.apache.hadoop.util.PerformanceAdvisory",
      "org.apache.hadoop.security.ShellBasedUnixGroupsMapping",
      "org.apache.hadoop.thirdparty.com.google.common.cache.CacheBuilder$1",
      "org.apache.hadoop.thirdparty.com.google.common.base.Suppliers",
      "org.apache.hadoop.thirdparty.com.google.common.base.Suppliers$SupplierOfInstance",
      "org.apache.hadoop.thirdparty.com.google.common.cache.CacheStats",
      "org.apache.hadoop.thirdparty.com.google.common.cache.CacheBuilder$2",
      "org.apache.hadoop.thirdparty.com.google.common.cache.CacheBuilder$3",
      "org.apache.hadoop.thirdparty.com.google.common.cache.CacheBuilder",
      "org.apache.hadoop.security.Groups$TimerToTickerAdapter",
      "org.apache.hadoop.thirdparty.com.google.common.cache.CacheLoader",
      "org.apache.hadoop.security.Groups$GroupCacheLoader",
      "org.apache.hadoop.thirdparty.com.google.common.cache.LocalCache$LocalManualCache",
      "org.apache.hadoop.thirdparty.com.google.common.cache.LocalCache$LocalLoadingCache",
      "org.apache.hadoop.thirdparty.com.google.common.cache.LocalCache$1",
      "org.apache.hadoop.thirdparty.com.google.common.cache.LocalCache$2",
      "org.apache.hadoop.thirdparty.com.google.common.cache.LocalCache",
      "org.apache.hadoop.thirdparty.com.google.common.cache.LocalCache$Strength",
      "org.apache.hadoop.thirdparty.com.google.common.cache.CacheBuilder$OneWeigher",
      "org.apache.hadoop.thirdparty.com.google.common.cache.CacheBuilder$NullListener",
      "org.apache.hadoop.thirdparty.com.google.common.cache.LocalCache$EntryFactory",
      "org.apache.hadoop.thirdparty.com.google.common.cache.LocalCache$Segment",
      "org.apache.hadoop.thirdparty.com.google.common.cache.LocalCache$WriteQueue",
      "org.apache.hadoop.thirdparty.com.google.common.cache.LocalCache$AbstractReferenceEntry",
      "org.apache.hadoop.thirdparty.com.google.common.cache.LocalCache$WriteQueue$1",
      "org.apache.hadoop.thirdparty.com.google.common.cache.LocalCache$AbstractCacheSet",
      "org.apache.hadoop.thirdparty.com.google.common.cache.LocalCache$KeySet",
      "org.eclipse.jetty.util.component.AttributeContainerMap",
      "org.apache.hadoop.test.LambdaTestUtils$FixedRetryInterval",
      "org.eclipse.jetty.io.NullByteBufferPool",
      "org.apache.hadoop.fs.FsUrlStreamHandlerFactory",
      "org.apache.hadoop.security.alias.JavaKeyStoreProvider$Factory",
      "org.apache.hadoop.security.alias.LocalJavaKeyStoreProvider$Factory",
      "org.apache.hadoop.security.alias.UserProvider$Factory",
      "org.apache.hadoop.security.alias.BouncyCastleFipsKeyStoreProvider$Factory",
      "org.apache.hadoop.security.alias.LocalBouncyCastleFipsKeyStoreProvider$Factory",
      "org.apache.hadoop.security.alias.CredentialProviderFactory",
      "org.eclipse.jetty.util.InetAddressSet",
      "org.apache.hadoop.test.LambdaTestUtils$ProportionalRetryInterval",
      "org.eclipse.jetty.io.MappedByteBufferPool$Tagged",
      "com.codahale.metrics.MetricRegistry",
      "org.apache.hadoop.thirdparty.com.google.common.cache.LocalCache$AccessQueue",
      "org.apache.hadoop.thirdparty.com.google.common.cache.LocalCache$AccessQueue$1",
      "org.apache.hadoop.net.NetUtils",
      "org.eclipse.jetty.util.BufferUtil",
      "org.apache.hadoop.conf.Configuration$ParsedTimeDuration",
      "org.eclipse.jetty.io.ArrayByteBufferPool",
      "org.eclipse.jetty.io.LogarithmicArrayByteBufferPool",
      "org.eclipse.jetty.io.ByteBufferPool$Bucket",
      "org.apache.commons.collections.collection.AbstractCollectionDecorator",
      "org.apache.commons.collections.set.AbstractSetDecorator",
      "org.apache.commons.collections.map.UnmodifiableEntrySet",
      "org.apache.commons.collections.iterators.AbstractIteratorDecorator",
      "org.apache.commons.collections.map.UnmodifiableEntrySet$UnmodifiableEntrySetIterator",
      "org.apache.commons.collections.keyvalue.AbstractMapEntryDecorator",
      "org.apache.commons.collections.map.UnmodifiableEntrySet$UnmodifiableEntry",
      "org.apache.hadoop.hdfs.util.StripedBlockUtil",
      "org.eclipse.jetty.util.thread.ScheduledExecutorScheduler",
      "org.eclipse.jetty.util.InetAddressSet$InetPattern",
      "org.eclipse.jetty.util.InetAddressSet$SingletonInetRange",
      "com.google.common.hash.BloomFilter",
      "com.google.common.hash.BloomFilterStrategies",
      "com.google.common.base.Preconditions",
      "com.google.common.hash.BloomFilterStrategies$LockFreeBitArray",
      "com.google.common.math.LongMath",
      "com.google.common.math.LongMath$1",
      "com.google.common.primitives.Ints",
      "com.google.common.hash.Striped64$1",
      "com.google.common.hash.Striped64",
      "com.google.common.hash.LongAdder",
      "com.google.common.hash.LongAddables$1",
      "com.google.common.hash.LongAddables",
      "org.eclipse.jetty.util.IncludeExcludeSet",
      "org.apache.hadoop.fs.DelegationTokenRenewer$RenewAction"
    );
  }
}
