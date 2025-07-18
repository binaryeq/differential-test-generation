/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Sun Nov 10 22:13:47 GMT 2024
 */

package io.restassured.internal.matcher.xml;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

import static org.evosuite.shaded.org.mockito.Mockito.*;
@EvoSuiteClassExclude
public class XmlDtdMatcher_ESTest_scaffolding {

  @org.junit.Rule
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "io.restassured.internal.matcher.xml.XmlDtdMatcher"; 
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
    java.lang.System.setProperty("user.dir", "/home/wtwhite/code/regression-test-generation-NON-SOURCE-EQUIV/find-diff-classes/testgen/mvnc/io/rest-assured/rest-assured/5.2.1"); 
    java.lang.System.setProperty("file.encoding", "UTF-8"); 
    java.lang.System.setProperty("java.io.tmpdir", "/tmp"); 
    java.lang.System.setProperty("user.home", "/home/wtwhite"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(XmlDtdMatcher_ESTest_scaffolding.class.getClassLoader() ,
      "org.hamcrest.BaseMatcher",
      "io.restassured.internal.matcher.xml.XmlDtdMatcher",
      "org.hamcrest.Description",
      "org.hamcrest.BaseDescription",
      "org.hamcrest.StringDescription",
      "org.hamcrest.Matcher",
      "io.restassured.internal.common.assertion.AssertParameter",
      "io.restassured.internal.matcher.xml.LoadFromClasspathSupport",
      "org.hamcrest.SelfDescribing"
    );
  } 
  private static void initMocksToAvoidTimeoutsInTheTests() throws ClassNotFoundException { 
    mock(Class.forName("java.util.Enumeration", false, XmlDtdMatcher_ESTest_scaffolding.class.getClassLoader()));
  }

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(XmlDtdMatcher_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "org.hamcrest.BaseMatcher",
      "io.restassured.internal.matcher.xml.XmlDtdMatcher",
      "org.assertj.core.internal.bytebuddy.build.HashCodeAndEqualsPlugin$Enhance$InvokeSuper",
      "io.restassured.internal.common.assertion.AssertParameter",
      "io.restassured.internal.matcher.xml.LoadFromClasspathSupport",
      "org.hamcrest.BaseDescription",
      "org.hamcrest.StringDescription",
      "org.glassfish.jaxb.core.unmarshaller.DOMScanner",
      "org.glassfish.jaxb.core.v2.runtime.unmarshaller.LocatorEx$Snapshot",
      "jakarta.xml.bind.helpers.ValidationEventLocatorImpl",
      "jakarta.xml.bind.helpers.Messages",
      "com.fasterxml.jackson.databind.JsonSerializable$Base",
      "com.fasterxml.jackson.databind.JsonNode",
      "com.fasterxml.jackson.databind.node.BaseJsonNode",
      "com.fasterxml.jackson.databind.node.ValueNode",
      "com.fasterxml.jackson.databind.node.NumericNode",
      "com.fasterxml.jackson.databind.node.FloatNode",
      "org.hamcrest.internal.ReflectiveTypeFinder",
      "org.hamcrest.TypeSafeMatcher",
      "org.hamcrest.core.IsNull",
      "org.hamcrest.core.ShortcutCombination",
      "org.hamcrest.core.AnyOf",
      "org.hamcrest.text.IsBlankString",
      "org.hamcrest.core.SubstringMatcher",
      "org.hamcrest.core.StringContains",
      "org.hamcrest.core.IsAnything",
      "org.hamcrest.text.IsEmptyString",
      "org.glassfish.jaxb.runtime.v2.runtime.output.Pcdata",
      "org.glassfish.jaxb.runtime.v2.runtime.unmarshaller.Base64Data",
      "org.hamcrest.TypeSafeDiagnosingMatcher",
      "org.hamcrest.core.StringRegularExpression",
      "org.hamcrest.text.IsEqualCompressingWhiteSpace",
      "org.hamcrest.core.IsSame",
      "jakarta.activation.URLDataSource",
      "org.hamcrest.object.HasEqualValues",
      "org.hamcrest.DiagnosingMatcher",
      "org.hamcrest.object.HasEqualValues$FieldMatcher",
      "org.hamcrest.core.IsEqual",
      "org.hamcrest.text.IsEqualIgnoringCase",
      "org.hamcrest.core.StringEndsWith",
      "org.glassfish.jaxb.runtime.v2.runtime.Coordinator",
      "org.glassfish.jaxb.runtime.v2.runtime.unmarshaller.LocatorExWrapper",
      "org.glassfish.jaxb.runtime.v2.runtime.unmarshaller.Loader",
      "org.glassfish.jaxb.runtime.v2.runtime.unmarshaller.UnmarshallingContext$DefaultRootLoader",
      "org.glassfish.jaxb.runtime.v2.runtime.unmarshaller.UnmarshallingContext$ExpectedTypeRootLoader",
      "org.glassfish.jaxb.runtime.v2.runtime.unmarshaller.UnmarshallingContext",
      "org.hamcrest.core.StringStartsWith",
      "jakarta.xml.bind.annotation.W3CDomHandler",
      "org.glassfish.jaxb.runtime.v2.runtime.XMLSerializer",
      "jakarta.activation.DataHandler",
      "org.hamcrest.beans.HasProperty",
      "org.hamcrest.text.MatchesPattern",
      "com.fasterxml.jackson.databind.node.JsonNodeFactory",
      "com.fasterxml.jackson.databind.node.ContainerNode",
      "com.fasterxml.jackson.databind.node.ObjectNode",
      "jakarta.activation.FileDataSource",
      "jakarta.activation.MimeType",
      "jakarta.activation.MimeTypeParseException",
      "jakarta.activation.CommandMap",
      "jakarta.activation.SecuritySupport",
      "jakarta.activation.SecuritySupport$1",
      "jakarta.activation.MailcapCommandMap$1",
      "jakarta.activation.MailcapCommandMap",
      "jakarta.activation.SecuritySupport$3",
      "jakarta.activation.SecuritySupport$2",
      "jakarta.activation.ObjectDataContentHandler",
      "jakarta.activation.UnsupportedDataTypeException",
      "org.hamcrest.core.Is",
      "org.glassfish.jaxb.runtime.v2.runtime.unmarshaller.Base64Data$1",
      "org.glassfish.jaxb.runtime.v2.runtime.AssociationMap",
      "jakarta.xml.bind.helpers.AbstractUnmarshallerImpl",
      "org.glassfish.jaxb.runtime.v2.runtime.unmarshaller.UnmarshallerImpl",
      "jakarta.xml.bind.helpers.DefaultValidationEventHandler",
      "org.glassfish.jaxb.runtime.IDResolver",
      "org.glassfish.jaxb.runtime.v2.runtime.unmarshaller.DefaultIDResolver",
      "org.glassfish.jaxb.runtime.v2.runtime.unmarshaller.Scope",
      "org.glassfish.jaxb.runtime.v2.runtime.unmarshaller.UnmarshallingContext$State",
      "jakarta.activation.FileTypeMap",
      "jakarta.activation.MimetypesFileTypeMap$1",
      "jakarta.activation.MimetypesFileTypeMap"
    );
  }
}
