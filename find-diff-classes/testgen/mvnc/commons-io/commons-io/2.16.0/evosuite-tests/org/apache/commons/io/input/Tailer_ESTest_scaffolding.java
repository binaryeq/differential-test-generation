/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Wed Oct 23 20:31:51 GMT 2024
 */

package org.apache.commons.io.input;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class Tailer_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "org.apache.commons.io.input.Tailer"; 
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
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.dir", "/home/wtwhite/code/regression-test-generation/find-diff-classes/testgen/mvnc/commons-io/commons-io/2.16.0"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(Tailer_ESTest_scaffolding.class.getClassLoader() ,
      "org.apache.commons.io.input.Tailer",
      "org.apache.commons.io.output.NullWriter",
      "org.apache.commons.io.build.AbstractSupplier",
      "org.apache.commons.io.input.Tailer$TailablePath",
      "org.apache.commons.io.build.AbstractOrigin$ByteArrayOrigin",
      "org.apache.commons.io.build.AbstractOrigin$PathOrigin",
      "org.apache.commons.io.ThreadUtils",
      "org.apache.commons.io.input.Tailer$Builder",
      "org.apache.commons.io.CloseableURLConnection",
      "org.apache.commons.io.output.UnsynchronizedByteArrayOutputStream",
      "org.apache.commons.io.build.AbstractOrigin$InputStreamOrigin",
      "org.apache.commons.io.StandardLineSeparator",
      "org.apache.commons.io.output.AppendableWriter",
      "org.apache.commons.io.build.AbstractOrigin$OutputStreamOrigin",
      "org.apache.commons.io.output.StringBuilderWriter",
      "org.apache.commons.io.input.Tailer$RandomAccessResourceBridge",
      "org.apache.commons.io.input.TailerListenerAdapter",
      "org.apache.commons.io.build.AbstractOrigin$WriterOrigin",
      "org.apache.commons.io.file.DeleteOption",
      "org.apache.commons.io.Charsets",
      "org.apache.commons.io.build.AbstractStreamBuilder",
      "org.apache.commons.io.output.AbstractByteArrayOutputStream",
      "org.apache.commons.io.build.AbstractOrigin$FileOrigin",
      "org.apache.commons.io.output.ByteArrayOutputStream",
      "org.apache.commons.io.output.QueueOutputStream",
      "org.apache.commons.io.input.Tailer$RandomAccessFileBridge",
      "org.apache.commons.io.build.AbstractOrigin$CharSequenceOrigin",
      "org.apache.commons.io.function.IOSupplier",
      "org.apache.commons.io.IOUtils",
      "org.apache.commons.io.build.AbstractOriginSupplier",
      "org.apache.commons.io.build.AbstractOrigin$ReaderOrigin",
      "org.apache.commons.io.file.attribute.FileTimes",
      "org.apache.commons.io.output.NullOutputStream",
      "org.apache.commons.io.input.Tailer$1",
      "org.apache.commons.io.input.TailerListener",
      "org.apache.commons.io.input.Tailer$Tailable",
      "org.apache.commons.io.file.PathUtils",
      "org.apache.commons.io.output.ThresholdingOutputStream",
      "org.apache.commons.io.build.AbstractOrigin",
      "org.apache.commons.io.build.AbstractOrigin$URIOrigin"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(Tailer_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.apache.commons.io.input.Tailer",
      "org.apache.commons.io.build.AbstractSupplier",
      "org.apache.commons.io.build.AbstractOriginSupplier",
      "org.apache.commons.io.file.PathUtils",
      "org.apache.commons.io.build.AbstractStreamBuilder",
      "org.apache.commons.io.input.Tailer$Builder",
      "org.apache.commons.io.input.Tailer$TailablePath",
      "org.apache.commons.io.input.Tailer$RandomAccessFileBridge",
      "org.apache.commons.io.StandardLineSeparator",
      "org.apache.commons.io.file.attribute.FileTimes",
      "net.bytebuddy.build.HashCodeAndEqualsPlugin$Enhance$InvokeSuper",
      "org.apache.commons.io.build.AbstractOrigin",
      "org.apache.commons.io.build.AbstractOrigin$FileOrigin",
      "org.apache.commons.io.input.TailerListenerAdapter",
      "org.apache.commons.io.IOUtils",
      "org.apache.commons.io.ThreadUtils",
      "org.apache.commons.io.Charsets",
      "org.apache.commons.io.build.AbstractOrigin$URIOrigin",
      "org.apache.commons.io.build.AbstractOrigin$InputStreamOrigin",
      "org.apache.commons.io.build.AbstractOrigin$PathOrigin"
    );
  }
}
