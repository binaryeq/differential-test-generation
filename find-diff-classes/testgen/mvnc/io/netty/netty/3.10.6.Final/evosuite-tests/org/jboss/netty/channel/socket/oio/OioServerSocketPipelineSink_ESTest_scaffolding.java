/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Fri Nov 08 03:25:24 GMT 2024
 */

package org.jboss.netty.channel.socket.oio;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class OioServerSocketPipelineSink_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.jboss.netty.channel.socket.oio.OioServerSocketPipelineSink"; 
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
    java.lang.System.setProperty("user.dir", "/home/wtwhite/code/regression-test-generation-NON-SOURCE-EQUIV/find-diff-classes/testgen/mvnc/io/netty/netty/3.10.6.Final"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(OioServerSocketPipelineSink_ESTest_scaffolding.class.getClassLoader() ,
      "org.jboss.netty.util.ThreadNameDeterminer",
      "org.jboss.netty.channel.socket.DefaultServerSocketChannelConfig",
      "org.jboss.netty.buffer.ChannelBufferFactory",
      "org.jboss.netty.logging.JdkLoggerFactory",
      "org.jboss.netty.channel.DefaultServerChannelConfig",
      "org.jboss.netty.channel.CompleteChannelFuture",
      "org.jboss.netty.channel.socket.ServerSocketChannel",
      "org.jboss.netty.channel.ChannelPipeline",
      "org.jboss.netty.channel.ChannelState",
      "org.jboss.netty.channel.ChannelFutureListener",
      "org.jboss.netty.channel.socket.oio.OioServerSocketPipelineSink$1",
      "org.jboss.netty.logging.InternalLoggerFactory",
      "org.jboss.netty.channel.Channels",
      "org.jboss.netty.channel.ChannelHandlerLifeCycleException",
      "org.jboss.netty.channel.socket.oio.AbstractOioChannelSink",
      "org.jboss.netty.channel.ChannelException",
      "org.jboss.netty.channel.SucceededChannelFuture",
      "org.jboss.netty.channel.DefaultChannelPipeline",
      "org.jboss.netty.channel.ChannelConfig",
      "org.jboss.netty.channel.AbstractChannel$ChannelCloseFuture",
      "org.jboss.netty.channel.ChannelPipelineFactory",
      "org.jboss.netty.logging.AbstractInternalLogger",
      "org.jboss.netty.buffer.AbstractChannelBufferFactory",
      "org.jboss.netty.channel.ChannelEvent",
      "org.jboss.netty.channel.socket.SocketChannel",
      "org.jboss.netty.logging.InternalLogger",
      "org.jboss.netty.util.ExternalResourceReleasable",
      "org.jboss.netty.channel.UpstreamChannelStateEvent$1",
      "org.jboss.netty.channel.socket.oio.OioSocketChannel",
      "org.jboss.netty.channel.socket.ServerSocketChannelFactory",
      "org.jboss.netty.buffer.HeapChannelBufferFactory",
      "org.jboss.netty.util.internal.ExecutorUtil",
      "org.jboss.netty.channel.socket.oio.AbstractOioChannel",
      "org.jboss.netty.channel.socket.oio.OioServerSocketPipelineSink",
      "org.jboss.netty.channel.ChannelHandlerContext",
      "org.jboss.netty.channel.DefaultChannelPipeline$DiscardingChannelSink",
      "org.jboss.netty.channel.ChannelFuture",
      "org.jboss.netty.channel.ServerChannel",
      "org.jboss.netty.channel.AbstractServerChannel",
      "org.jboss.netty.channel.ChannelHandler",
      "org.jboss.netty.channel.socket.oio.OioServerSocketChannel",
      "org.jboss.netty.channel.socket.oio.OioServerSocketChannelFactory",
      "org.jboss.netty.channel.socket.ServerSocketChannelConfig",
      "org.jboss.netty.channel.ChannelSink",
      "org.jboss.netty.channel.ServerChannelFactory",
      "org.jboss.netty.channel.Channel",
      "org.jboss.netty.channel.AbstractChannel",
      "org.jboss.netty.channel.ChannelPipelineException",
      "org.jboss.netty.channel.UpstreamChannelStateEvent",
      "org.jboss.netty.logging.JdkLogger",
      "org.jboss.netty.channel.DownstreamChannelStateEvent",
      "org.jboss.netty.channel.AbstractChannelSink",
      "org.jboss.netty.channel.ChannelStateEvent",
      "org.jboss.netty.channel.socket.oio.OioAcceptedSocketChannel",
      "org.jboss.netty.channel.DefaultChannelFuture",
      "org.jboss.netty.channel.ChannelFactory"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.util.concurrent.Callable", false, OioServerSocketPipelineSink_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("java.util.concurrent.ThreadFactory", false, OioServerSocketPipelineSink_ESTest_scaffolding.class.getClassLoader()));
    mock(Class.forName("org.jboss.netty.util.ThreadNameDeterminer", false, OioServerSocketPipelineSink_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(OioServerSocketPipelineSink_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.jboss.netty.channel.AbstractChannelSink",
      "org.jboss.netty.channel.socket.oio.AbstractOioChannelSink",
      "org.jboss.netty.logging.JdkLoggerFactory",
      "org.jboss.netty.logging.InternalLoggerFactory",
      "org.jboss.netty.logging.AbstractInternalLogger",
      "org.jboss.netty.logging.JdkLogger",
      "org.jboss.netty.channel.socket.oio.OioServerSocketPipelineSink",
      "org.jboss.netty.channel.socket.oio.OioServerSocketPipelineSink$Boss",
      "org.jboss.netty.channel.ChannelState",
      "org.jboss.netty.channel.socket.oio.OioServerSocketPipelineSink$1",
      "org.jboss.netty.channel.socket.oio.AbstractOioWorker",
      "org.jboss.netty.channel.socket.oio.OioWorker",
      "org.jboss.netty.channel.DefaultChannelPipeline$DiscardingChannelSink",
      "org.jboss.netty.channel.DefaultChannelPipeline",
      "org.jboss.netty.channel.local.DefaultLocalClientChannelFactory",
      "org.jboss.netty.channel.local.LocalClientChannelSink",
      "org.jboss.netty.channel.AbstractChannel",
      "org.jboss.netty.channel.local.DefaultLocalChannel",
      "org.jboss.netty.channel.CompleteChannelFuture",
      "org.jboss.netty.channel.SucceededChannelFuture",
      "org.jboss.netty.channel.DefaultChannelFuture",
      "org.jboss.netty.channel.AbstractChannel$ChannelCloseFuture",
      "org.jboss.netty.channel.local.DefaultLocalServerChannelFactory",
      "org.jboss.netty.channel.group.DefaultChannelGroup",
      "org.jboss.netty.channel.group.DefaultChannelGroup$1",
      "org.jboss.netty.channel.local.LocalServerChannelSink",
      "org.jboss.netty.channel.AbstractServerChannel",
      "org.jboss.netty.channel.local.DefaultLocalServerChannel",
      "org.jboss.netty.channel.DefaultServerChannelConfig",
      "org.jboss.netty.buffer.AbstractChannelBufferFactory",
      "org.jboss.netty.buffer.HeapChannelBufferFactory",
      "org.jboss.netty.channel.Channels",
      "org.jboss.netty.channel.UpstreamChannelStateEvent",
      "org.jboss.netty.channel.UpstreamChannelStateEvent$1",
      "org.jboss.netty.channel.socket.oio.OioServerSocketChannel",
      "org.jboss.netty.channel.socket.oio.OioServerSocketChannelFactory",
      "org.jboss.netty.channel.socket.oio.OioDatagramPipelineSink",
      "org.jboss.netty.channel.socket.DefaultServerSocketChannelConfig",
      "org.jboss.netty.channel.socket.oio.AbstractOioChannel",
      "org.jboss.netty.channel.socket.oio.OioSocketChannel",
      "org.jboss.netty.channel.socket.oio.OioAcceptedSocketChannel",
      "org.jboss.netty.channel.socket.oio.OioDatagramChannel",
      "org.jboss.netty.channel.DefaultChannelConfig",
      "org.jboss.netty.channel.FixedReceiveBufferSizePredictorFactory",
      "org.jboss.netty.channel.FixedReceiveBufferSizePredictor",
      "org.jboss.netty.channel.socket.DefaultDatagramChannelConfig",
      "org.jboss.netty.channel.socket.oio.OioClientSocketChannel",
      "org.jboss.netty.channel.socket.DefaultSocketChannelConfig",
      "org.jboss.netty.util.internal.DeadLockProofWorker",
      "org.jboss.netty.channel.socket.oio.OioClientSocketPipelineSink",
      "org.jboss.netty.channel.DefaultWriteCompletionEvent",
      "org.jboss.netty.util.internal.ExecutorUtil",
      "org.jboss.netty.channel.DownstreamChannelStateEvent",
      "org.jboss.netty.channel.FailedChannelFuture",
      "org.jboss.netty.util.internal.ThreadLocalBoolean",
      "org.jboss.netty.channel.local.DefaultLocalChannel$1",
      "org.jboss.netty.channel.DownstreamMessageEvent",
      "org.jboss.netty.channel.SimpleChannelUpstreamHandler",
      "org.jboss.netty.channel.UpstreamMessageEvent",
      "org.jboss.netty.channel.DefaultChildChannelStateEvent",
      "org.jboss.netty.channel.ChannelException",
      "org.jboss.netty.channel.ChannelPipelineException",
      "org.jboss.netty.channel.socket.nio.AbstractNioSelector",
      "org.jboss.netty.channel.socket.nio.AbstractNioWorker",
      "org.jboss.netty.channel.socket.nio.NioWorker",
      "org.jboss.netty.util.internal.SystemPropertyUtil",
      "org.jboss.netty.channel.socket.nio.SelectorUtil",
      "org.jboss.netty.util.ThreadNameDeterminer$1",
      "org.jboss.netty.util.ThreadNameDeterminer$2",
      "org.jboss.netty.util.ThreadNameDeterminer",
      "org.jboss.netty.util.ThreadRenamingRunnable",
      "org.jboss.netty.util.internal.DeadLockProofWorker$1",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$EmptySendBuffer",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool",
      "org.jboss.netty.channel.socket.nio.SocketSendBufferPool$Preallocation",
      "org.jboss.netty.channel.socket.nio.SocketReceiveBufferAllocator",
      "org.jboss.netty.channel.DefaultExceptionEvent",
      "org.jboss.netty.channel.socket.nio.AbstractNioChannel",
      "org.jboss.netty.channel.socket.nio.NioSocketChannel"
    );
  }
}
