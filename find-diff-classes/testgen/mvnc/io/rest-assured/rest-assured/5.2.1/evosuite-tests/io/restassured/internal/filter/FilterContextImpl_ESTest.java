/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 10 22:00:25 GMT 2024
 */

package io.restassured.internal.filter;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;
import com.fasterxml.jackson.databind.node.POJONode;
import groovy.lang.MissingMethodException;
import groovy.lang.NonEmptySequence;
import groovy.util.ConfigObject;
import io.restassured.authentication.CertAuthScheme;
import io.restassured.config.RestAssuredConfig;
import io.restassured.filter.Filter;
import io.restassured.internal.RequestSpecificationImpl;
import io.restassured.internal.filter.FilterContextImpl;
import io.restassured.internal.log.LogRepository;
import io.restassured.path.xml.config.XmlPathConfig;
import io.restassured.response.Response;
import io.restassured.specification.FilterableRequestSpecification;
import io.restassured.specification.FilterableResponseSpecification;
import io.restassured.specification.ProxySpecification;
import io.restassured.specification.RequestSender;
import io.restassured.specification.RequestSpecification;
import java.io.PipedReader;
import java.io.Reader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.xml.stream.util.EventReaderDelegate;
import org.codehaus.groovy.runtime.callsite.CallSiteArray;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.net.MockURL;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FilterContextImpl_ESTest extends FilterContextImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      objectArray0[3] = (Object) "(tG6ua`1bj+2";
      EventReaderDelegate eventReaderDelegate0 = new EventReaderDelegate();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("(tG6ua`1bj+2", objectArray0[3]);
      FilterContextImpl filterContextImpl0 = new FilterContextImpl("(tG6ua`1bj+2", "(tG6ua`1bj+2", "(tG6ua`1bj+2", "(tG6ua`1bj+2", "(tG6ua`1bj+2", objectArray0, "(tG6ua`1bj+2", objectArray0[2], eventReaderDelegate0, hashMap0);
      boolean boolean0 = filterContextImpl0.hasValue("(tG6ua`1bj+2");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      objectArray0[3] = (Object) "(tG6ua`1bj+2";
      EventReaderDelegate eventReaderDelegate0 = new EventReaderDelegate();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("(tG6ua`1bj+2", objectArray0[3]);
      FilterContextImpl filterContextImpl0 = new FilterContextImpl("(tG6ua`1bj+2", "(tG6ua`1bj+2", "(tG6ua`1bj+2", "(tG6ua`1bj+2", "(tG6ua`1bj+2", objectArray0, "(tG6ua`1bj+2", objectArray0[8], eventReaderDelegate0, hashMap0);
      Object object0 = filterContextImpl0.getValue("(tG6ua`1bj+2");
      assertEquals("(tG6ua`1bj+2", object0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      FilterContextImpl filterContextImpl0 = new FilterContextImpl("", "", "put", "", "toString", objectArray0, "e", "+gk|U|w", (Iterator<Filter>) null, (Map<String, Object>) null);
      Map<String, Object> map0 = filterContextImpl0.getProperties();
      assertNull(map0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Object[] objectArray0 = new Object[3];
      POJONode pOJONode0 = new POJONode((Object) null);
      EventReaderDelegate eventReaderDelegate0 = new EventReaderDelegate();
      XmlPathConfig xmlPathConfig0 = new XmlPathConfig();
      Map<String, Object> map0 = xmlPathConfig0.properties();
      FilterContextImpl filterContextImpl0 = new FilterContextImpl(",NRg.C=Y", ",NRg.C=Y", "fPIR&gk", "|tVRu", "", objectArray0, "", pOJONode0, eventReaderDelegate0, map0);
      filterContextImpl0.setValue("fPIR&gk", pOJONode0);
      Map<String, Object> map1 = filterContextImpl0.getProperties();
      assertSame(map0, map1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      FilterContextImpl filterContextImpl0 = new FilterContextImpl("(igmw", (String) null, (String) null, (String) null, (String) null, objectArray0, "(igmw", objectArray0[1], (Iterator<Filter>) null, (Map<String, Object>) null);
      String string0 = filterContextImpl0.getInternalRequestURI();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Object[] objectArray0 = new Object[0];
      Class<CallSiteArray> class0 = CallSiteArray.class;
      String[] stringArray0 = new String[1];
      CallSiteArray callSiteArray0 = new CallSiteArray(class0, stringArray0);
      ConfigObject configObject0 = new ConfigObject();
      FilterContextImpl filterContextImpl0 = new FilterContextImpl("", "", "", "", "", objectArray0, "", callSiteArray0, (Iterator<Filter>) null, configObject0);
      String string0 = filterContextImpl0.getInternalRequestURI();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) " ik;d}fN";
      ConfigObject configObject0 = new ConfigObject();
      FilterContextImpl filterContextImpl0 = new FilterContextImpl("Q%DsCV[J93o369*Q", "Q%DsCV[J93o369*Q", " ik;d}fN", " ik;d}fN", "", objectArray0, "($ p-t=-W", objectArray0[0], (Iterator<Filter>) null, configObject0);
      Object object0 = filterContextImpl0.getAssertionClosure();
      assertEquals(" ik;d}fN", object0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      Object object0 = new Object();
      FilterContextImpl filterContextImpl0 = new FilterContextImpl("", "", "(fR$vAz;RKgv,QR_A", "--xsXM", "", objectArray0, "{HzMmM}M$dE'4Zs6/|`", "{HzMmM}M$dE'4Zs6/|`", (Iterator<Filter>) null, (Map<String, Object>) null);
      // Undeclared exception!
      try { 
        filterContextImpl0.setValue("", object0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke method put() on null object
         //
         verifyException("org.codehaus.groovy.runtime.NullObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EventReaderDelegate eventReaderDelegate0 = new EventReaderDelegate();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Object[] objectArray0 = new Object[0];
      FilterContextImpl filterContextImpl0 = new FilterContextImpl("D}j/_oV&M*", "D}j/_oV&M*", "D}j/_oV&M*", "D}j/_oV&M*", "D}j/_oV&M*", objectArray0, "D}j/_oV&M*", hashMap0, eventReaderDelegate0, hashMap0);
      // Undeclared exception!
      try { 
        filterContextImpl0.send((RequestSender) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke method d}j/_ov&m*() on null object
         //
         verifyException("org.codehaus.groovy.runtime.NullObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EventReaderDelegate eventReaderDelegate0 = new EventReaderDelegate();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Object[] objectArray0 = new Object[7];
      eventReaderDelegate0.setParent(eventReaderDelegate0);
      FilterContextImpl filterContextImpl0 = new FilterContextImpl("", "s~;A", ";q(cOEHM&qW", ";q(cOEHM&qW", "9&+MGr?", objectArray0, "", objectArray0[0], eventReaderDelegate0, hashMap0);
      // Undeclared exception!
      try { 
        filterContextImpl0.next((FilterableRequestSpecification) null, (FilterableResponseSpecification) null);
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Object[] objectArray0 = new Object[4];
      ObjectMapper objectMapper0 = new ObjectMapper();
      Class<CallSiteArray> class0 = CallSiteArray.class;
      ObjectReader objectReader0 = objectMapper0.readerForMapOf(class0);
      PipedReader pipedReader0 = new PipedReader();
      JsonParser jsonParser0 = objectMapper0.createParser((Reader) pipedReader0);
      Class<Filter> class1 = Filter.class;
      Iterator<Filter> iterator0 = objectReader0.readValues(jsonParser0, class1);
      URL uRL0 = MockURL.getFileExample();
      ConfigObject configObject0 = new ConfigObject(uRL0);
      FilterContextImpl filterContextImpl0 = new FilterContextImpl("hasNext", "", "=@hi_]RjQaOfX[*l:e", "hasNext", "B97Y`U#k", objectArray0, "=@hi_]RjQaOfX[*l:e", (Object) null, iterator0, configObject0);
      // Undeclared exception!
      try { 
        filterContextImpl0.next((FilterableRequestSpecification) null, (FilterableResponseSpecification) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Pipe not connected
         //
         verifyException("com.fasterxml.jackson.databind.MappingIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EventReaderDelegate eventReaderDelegate0 = new EventReaderDelegate();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Object[] objectArray0 = new Object[1];
      FilterContextImpl filterContextImpl0 = new FilterContextImpl("D}j/_o|&t*", "D}j/_o|&t*", "D}j/_o|&t*", "D}j/_o|&t*", "D}j/_o|&t*", objectArray0, "D}j/_o|&t*", hashMap0, eventReaderDelegate0, hashMap0);
      // Undeclared exception!
      try { 
        filterContextImpl0.next((FilterableRequestSpecification) null, (FilterableResponseSpecification) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EventReaderDelegate eventReaderDelegate0 = new EventReaderDelegate();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Object[] objectArray0 = new Object[12];
      FilterContextImpl filterContextImpl0 = new FilterContextImpl("Non-standadjtoken '", "Non-standadjtoken '", "Non-standadjtoken '", "Non-standadjtoken '", "Non-standadjtoken '", objectArray0, "Non-standadjtoken '", hashMap0, eventReaderDelegate0, hashMap0);
      filterContextImpl0.setProperties((Map<String, Object>) null);
      // Undeclared exception!
      try { 
        filterContextImpl0.hasValue("Non-standadjtoken '", (Object) hashMap0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke method get() on null object
         //
         verifyException("org.codehaus.groovy.runtime.NullObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Object[] objectArray0 = new Object[2];
      FilterContextImpl filterContextImpl0 = new FilterContextImpl("%s type %s not supported by default: add Module \"%s\" to enable handling", "", "firstParameterName", "", "firstParameterName", objectArray0, "Cannot pass null Deserializers", objectArray0[1], (Iterator<Filter>) null, (Map<String, Object>) null);
      // Undeclared exception!
      try { 
        filterContextImpl0.hasValue("");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke method get() on null object
         //
         verifyException("org.codehaus.groovy.runtime.NullObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Object[] objectArray0 = new Object[8];
      EventReaderDelegate eventReaderDelegate0 = new EventReaderDelegate();
      FilterContextImpl filterContextImpl0 = new FilterContextImpl("1pPSo#Npu+~-0\"LGXkQ", "1pPSo#Npu+~-0\"LGXkQ", "1pPSo#Npu+~-0\"LGXkQ", "1pPSo#Npu+~-0\"LGXkQ", "1pPSo#Npu+~-0\"LGXkQ", objectArray0, "", objectArray0[0], eventReaderDelegate0, (Map<String, Object>) null);
      // Undeclared exception!
      try { 
        filterContextImpl0.getValue("1pPSo#Npu+~-0\"LGXkQ");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke method get() on null object
         //
         verifyException("org.codehaus.groovy.runtime.NullObject", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      EventReaderDelegate eventReaderDelegate0 = new EventReaderDelegate();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      FilterContextImpl filterContextImpl0 = new FilterContextImpl("(tG6ua`1bj+2", "(tG6ua`1bj+2", "(tG6ua`1bj+2", "(tG6ua`1bj+2", "(tG6ua`1bj+2", objectArray0, "(tG6ua`1bj+2", objectArray0[3], eventReaderDelegate0, hashMap0);
      boolean boolean0 = filterContextImpl0.hasValue("(tG6ua`1bj+2");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      EventReaderDelegate eventReaderDelegate0 = new EventReaderDelegate();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      FilterContextImpl filterContextImpl0 = new FilterContextImpl("(tG6ua`1bj+2", "(tG6ua`1bj+2", "(tG6ua`1bj+2", "(tG6ua`1bj+2", "(tG6ua`1bj+2", objectArray0, "(tG6ua`1bj+2", objectArray0[4], eventReaderDelegate0, hashMap0);
      Object object0 = filterContextImpl0.getValue("(tG6ua`1bj+2");
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EventReaderDelegate eventReaderDelegate0 = new EventReaderDelegate();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("new long[] {", "new long[] {");
      Object[] objectArray0 = new Object[0];
      FilterContextImpl filterContextImpl0 = new FilterContextImpl("new long[] {", "new long[] {", "new long[] {", "new long[] {", "new long[] {", objectArray0, "new long[] {", hashMap0, eventReaderDelegate0, hashMap0);
      boolean boolean0 = filterContextImpl0.hasValue("new long[] {", (Object) "new long[] {");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EventReaderDelegate eventReaderDelegate0 = new EventReaderDelegate();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      hashMap0.put("PEvIH", "PEvIH");
      Object[] objectArray0 = new Object[11];
      FilterContextImpl filterContextImpl0 = new FilterContextImpl("PEvIH", "PEvIH", "PEvIH", "PEvIH", "PEvIH", objectArray0, "PEvIH", hashMap0, eventReaderDelegate0, hashMap0);
      boolean boolean0 = filterContextImpl0.hasValue("PEvIH", (Object) hashMap0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      ObjectMapper objectMapper0 = new ObjectMapper();
      JsonGenerator.Feature[] jsonGenerator_FeatureArray0 = new JsonGenerator.Feature[5];
      JsonGenerator.Feature jsonGenerator_Feature0 = JsonGenerator.Feature.IGNORE_UNKNOWN;
      ObjectReader objectReader0 = objectMapper0.readerForUpdating(jsonGenerator_Feature0);
      byte[] byteArray0 = new byte[0];
      MappingIterator<Filter> mappingIterator0 = objectReader0.readValues(byteArray0, (int) 9, (-2924));
      FilterContextImpl filterContextImpl0 = new FilterContextImpl("JSON", "invoke", "<XO@i:2Lfh", "invoke", "JSON", jsonGenerator_FeatureArray0, "<XO@i:2Lfh", mappingIterator0, mappingIterator0, hashMap0);
      Response response0 = filterContextImpl0.next((FilterableRequestSpecification) null, (FilterableResponseSpecification) null);
      assertNull(response0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      String[] stringArray0 = new String[0];
      ConfigObject configObject0 = new ConfigObject();
      FilterContextImpl filterContextImpl0 = new FilterContextImpl("", (String) null, "put", (String) null, "DEFAULT", stringArray0, "", (Object) null, (Iterator<Filter>) null, configObject0);
      Object object0 = filterContextImpl0.getAssertionClosure();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Object[] objectArray0 = new Object[9];
      EventReaderDelegate eventReaderDelegate0 = new EventReaderDelegate();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      FilterContextImpl filterContextImpl0 = new FilterContextImpl("(tG6ua`1bj+2", "(tG6ua`1bj+2", "(tG6ua`1bj+2", "(tG6ua`1bj+2", "(tG6ua`1bj+2", objectArray0, "(tG6ua`1bj+2", objectArray0[4], eventReaderDelegate0, hashMap0);
      filterContextImpl0.setAssertionClosure(objectArray0[8]);
      assertEquals(9, objectArray0.length);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      EventReaderDelegate eventReaderDelegate0 = new EventReaderDelegate();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Object[] objectArray0 = new Object[1];
      FilterContextImpl filterContextImpl0 = new FilterContextImpl("Non-standard token '", "Non-standard token '", "Non-standard token '", "Non-standard token '", "Non-standard token '", objectArray0, "Non-standard token '", hashMap0, eventReaderDelegate0, hashMap0);
      CertAuthScheme certAuthScheme0 = new CertAuthScheme();
      Class<CallSiteArray> class0 = CallSiteArray.class;
      ArrayList<CallSiteArray> arrayList0 = new ArrayList<CallSiteArray>();
      NonEmptySequence nonEmptySequence0 = new NonEmptySequence(class0, arrayList0);
      RestAssuredConfig restAssuredConfig0 = RestAssuredConfig.config();
      ProxySpecification proxySpecification0 = ProxySpecification.auth("Non-standard token '", "Non-standard token '");
      RequestSpecificationImpl requestSpecificationImpl0 = new RequestSpecificationImpl("Non-standard token '", 732, "Non-standard token '", certAuthScheme0, nonEmptySequence0, (RequestSpecification) null, false, restAssuredConfig0, (LogRepository) null, proxySpecification0, false, false);
      // Undeclared exception!
      try { 
        filterContextImpl0.send(requestSpecificationImpl0);
        fail("Expecting exception: MissingMethodException");
      
      } catch(MissingMethodException e) {
         //
         // No signature of method: io.restassured.internal.RequestSpecificationImpl.non-standard token '() is applicable for argument types: (String) values: [Non-standard token ']
         //
         verifyException("org.codehaus.groovy.runtime.ScriptBytecodeAdapter", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      EventReaderDelegate eventReaderDelegate0 = new EventReaderDelegate();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Object[] objectArray0 = new Object[0];
      FilterContextImpl filterContextImpl0 = new FilterContextImpl("D}j/_oVM*", "D}j/_oVM*", "D}j/_oVM*", "D}j/_oVM*", "D}j/_oVM*", objectArray0, "D}j/_oVM*", hashMap0, eventReaderDelegate0, hashMap0);
      boolean boolean0 = filterContextImpl0.hasValue("D}j/_oVM*", (Object) hashMap0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      EventReaderDelegate eventReaderDelegate0 = new EventReaderDelegate();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      Object[] objectArray0 = new Object[0];
      FilterContextImpl filterContextImpl0 = new FilterContextImpl("new long[] {", "new long[] {", "new long[] {", "new long[] {", "new long[] {", objectArray0, "new long[] {", hashMap0, eventReaderDelegate0, hashMap0);
      Map<String, Object> map0 = filterContextImpl0.getProperties();
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      EventReaderDelegate eventReaderDelegate0 = new EventReaderDelegate();
      HashMap<String, Object> hashMap0 = new HashMap<String, Object>();
      FilterContextImpl filterContextImpl0 = new FilterContextImpl("No1-standard toen '", "No1-standard toen '", "No1-standard toen '", "No1-standard toen '", "No1-standard toen '", (Object[]) null, "No1-standard toen '", eventReaderDelegate0, eventReaderDelegate0, hashMap0);
      String string0 = filterContextImpl0.getInternalRequestURI();
      assertEquals("No1-standard toen '", string0);
  }
}
