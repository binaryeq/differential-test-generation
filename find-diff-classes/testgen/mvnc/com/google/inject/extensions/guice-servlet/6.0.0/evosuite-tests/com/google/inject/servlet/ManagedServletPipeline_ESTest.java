/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 23 18:15:46 GMT 2024
 */

package com.google.inject.servlet;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.inject.Binding;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.Provider;
import com.google.inject.servlet.ManagedServletPipeline;
import com.google.inject.servlet.ServletDefinition;
import com.google.inject.servlet.UriPatternMatcher;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.ServletResponseWrapper;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletRequestWrapper;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ManagedServletPipeline_ESTest extends ManagedServletPipeline_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn("z", "https", "https").when(httpServletRequest0).getScheme();
      doReturn("https", "82QjRMj&s3et=h", "https").when(httpServletRequest0).getServerName();
      doReturn(229, 229, 1940).when(httpServletRequest0).getServerPort();
      HttpServletRequest httpServletRequest1 = ManagedServletPipeline.wrapRequest(httpServletRequest0, "z");
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest1);
      StringBuffer stringBuffer0 = httpServletRequestWrapper0.getRequestURL();
      assertEquals("z://httpsz", stringBuffer0.toString());
      
      StringBuffer stringBuffer1 = httpServletRequestWrapper0.getRequestURL();
      assertEquals(28, stringBuffer1.length());
      
      StringBuffer stringBuffer2 = httpServletRequestWrapper0.getRequestURL();
      assertEquals("https://https:1940z", stringBuffer2.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn("Y/acCZun==^kaUXY$-", "http").when(httpServletRequest0).getScheme();
      doReturn("Y/acCZun==^kaUXY$-", "http").when(httpServletRequest0).getServerName();
      doReturn(59, 59).when(httpServletRequest0).getServerPort();
      HttpServletRequest httpServletRequest1 = ManagedServletPipeline.wrapRequest(httpServletRequest0, "Y/acCZun==^kaUXY$-");
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest1);
      StringBuffer stringBuffer0 = httpServletRequestWrapper0.getRequestURL();
      assertEquals(57, stringBuffer0.length());
      
      StringBuffer stringBuffer1 = httpServletRequestWrapper0.getRequestURL();
      assertEquals("http://http:59Y/acCZun==^kaUXY$-", stringBuffer1.toString());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn("#.?)%c>8T&M7*@v.").when(httpServletRequest0).getScheme();
      doReturn("javax.servlet.forward.servlet_path").when(httpServletRequest0).getServerName();
      doReturn((-1654)).when(httpServletRequest0).getServerPort();
      HttpServletRequest httpServletRequest1 = ManagedServletPipeline.wrapRequest(httpServletRequest0, "://");
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest1);
      StringBuffer stringBuffer0 = httpServletRequestWrapper0.getRequestURL();
      assertEquals("#.?)%c>8T&M7*@v.://javax.servlet.forward.servlet_path://", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        ManagedServletPipeline.wrapRequest((HttpServletRequest) null, "value");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Request cannot be null
         //
         verifyException("javax.servlet.ServletRequestWrapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      ArrayList<Binding<Object>> arrayList0 = new ArrayList<Binding<Object>>();
      Class<HttpServlet> class0 = HttpServlet.class;
      Key<HttpServlet> key0 = Key.get(class0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      HttpServlet httpServlet0 = mock(HttpServlet.class, new ViolatedAssumptionAnswer());
      ServletDefinition servletDefinition0 = new ServletDefinition(key0, (UriPatternMatcher) null, hashMap0, httpServlet0);
      Provider<Object> provider0 = (Provider<Object>) mock(Provider.class, new ViolatedAssumptionAnswer());
      Binding<Object> binding0 = (Binding<Object>) mock(Binding.class, new ViolatedAssumptionAnswer());
      doReturn((Provider) null).when(binding0).getProvider();
      arrayList0.add(binding0);
      Injector injector0 = mock(Injector.class, new ViolatedAssumptionAnswer());
      doReturn(arrayList0).when(injector0).findBindingsByType(any(com.google.inject.TypeLiteral.class));
      ManagedServletPipeline managedServletPipeline0 = null;
      try {
        managedServletPipeline0 = new ManagedServletPipeline(injector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.inject.servlet.ManagedServletPipeline", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ArrayList<Binding<Object>> arrayList0 = new ArrayList<Binding<Object>>();
      Provider<Object> provider0 = (Provider<Object>) mock(Provider.class, new ViolatedAssumptionAnswer());
      Binding<Object> binding0 = (Binding<Object>) mock(Binding.class, new ViolatedAssumptionAnswer());
      doReturn((Provider) null).when(binding0).getProvider();
      arrayList0.add(binding0);
      Injector injector0 = mock(Injector.class, new ViolatedAssumptionAnswer());
      doReturn(arrayList0).when(injector0).findBindingsByType(any(com.google.inject.TypeLiteral.class));
      ManagedServletPipeline managedServletPipeline0 = null;
      try {
        managedServletPipeline0 = new ManagedServletPipeline(injector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.inject.servlet.ManagedServletPipeline", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn("ax", "https").when(httpServletRequest0).getScheme();
      doReturn("https", "ax").when(httpServletRequest0).getServerName();
      doReturn(443, 443).when(httpServletRequest0).getServerPort();
      HttpServletRequest httpServletRequest1 = ManagedServletPipeline.wrapRequest(httpServletRequest0, "https");
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest1);
      httpServletRequestWrapper0.getRequestURL();
      StringBuffer stringBuffer0 = httpServletRequestWrapper0.getRequestURL();
      assertEquals("https://axhttps", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn("http").when(httpServletRequest0).getScheme();
      doReturn("http").when(httpServletRequest0).getServerName();
      doReturn(379).when(httpServletRequest0).getServerPort();
      HttpServletRequest httpServletRequest1 = ManagedServletPipeline.wrapRequest(httpServletRequest0, "http");
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest1);
      StringBuffer stringBuffer0 = httpServletRequestWrapper0.getRequestURL();
      assertEquals("http://http:379http", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HttpServletRequest httpServletRequest0 = mock(HttpServletRequest.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(httpServletRequest0).getScheme();
      doReturn((String) null).when(httpServletRequest0).getServerName();
      doReturn(0).when(httpServletRequest0).getServerPort();
      HttpServletRequest httpServletRequest1 = ManagedServletPipeline.wrapRequest(httpServletRequest0, "suppress");
      HttpServletRequestWrapper httpServletRequestWrapper0 = new HttpServletRequestWrapper(httpServletRequest1);
      StringBuffer stringBuffer0 = httpServletRequestWrapper0.getRequestURL();
      assertEquals("null://nullsuppress", stringBuffer0.toString());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      ArrayList<Binding<Object>> arrayList0 = new ArrayList<Binding<Object>>();
      Class<HttpServlet> class0 = HttpServlet.class;
      Key<HttpServlet> key0 = Key.get(class0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      HttpServlet httpServlet0 = mock(HttpServlet.class, new ViolatedAssumptionAnswer());
      ServletDefinition servletDefinition0 = new ServletDefinition(key0, (UriPatternMatcher) null, hashMap0, httpServlet0);
      Provider<Object> provider0 = (Provider<Object>) mock(Provider.class, new ViolatedAssumptionAnswer());
      doReturn(servletDefinition0).when(provider0).get();
      Binding<Object> binding0 = (Binding<Object>) mock(Binding.class, new ViolatedAssumptionAnswer());
      doReturn(provider0).when(binding0).getProvider();
      arrayList0.add(binding0);
      Injector injector0 = mock(Injector.class, new ViolatedAssumptionAnswer());
      doReturn(arrayList0).when(injector0).findBindingsByType(any(com.google.inject.TypeLiteral.class));
      ManagedServletPipeline managedServletPipeline0 = new ManagedServletPipeline(injector0);
      RequestDispatcher requestDispatcher0 = managedServletPipeline0.getRequestDispatcher((String) null);
      assertNull(requestDispatcher0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArrayList<Binding<Object>> arrayList0 = new ArrayList<Binding<Object>>();
      Provider<Object> provider0 = (Provider<Object>) mock(Provider.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(provider0).get();
      Binding<Object> binding0 = (Binding<Object>) mock(Binding.class, new ViolatedAssumptionAnswer());
      doReturn(provider0).when(binding0).getProvider();
      arrayList0.add(binding0);
      Injector injector0 = mock(Injector.class, new ViolatedAssumptionAnswer());
      doReturn(arrayList0).when(injector0).findBindingsByType(any(com.google.inject.TypeLiteral.class));
      ManagedServletPipeline managedServletPipeline0 = new ManagedServletPipeline(injector0);
      // Undeclared exception!
      try { 
        managedServletPipeline0.getRequestDispatcher("javax.servlet.forward.servlet_path");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.inject.servlet.ManagedServletPipeline", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Injector injector0 = mock(Injector.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(injector0).findBindingsByType(any(com.google.inject.TypeLiteral.class));
      ManagedServletPipeline managedServletPipeline0 = null;
      try {
        managedServletPipeline0 = new ManagedServletPipeline(injector0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.inject.servlet.ManagedServletPipeline", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ArrayList<Binding<Object>> arrayList0 = new ArrayList<Binding<Object>>();
      Provider<Object> provider0 = (Provider<Object>) mock(Provider.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(provider0).get();
      Binding<Object> binding0 = (Binding<Object>) mock(Binding.class, new ViolatedAssumptionAnswer());
      doReturn(provider0).when(binding0).getProvider();
      arrayList0.add(binding0);
      Injector injector0 = mock(Injector.class, new ViolatedAssumptionAnswer());
      doReturn(arrayList0).when(injector0).findBindingsByType(any(com.google.inject.TypeLiteral.class));
      ManagedServletPipeline managedServletPipeline0 = new ManagedServletPipeline(injector0);
      // Undeclared exception!
      try { 
        managedServletPipeline0.destroy();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.inject.servlet.ManagedServletPipeline", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ArrayList<Binding<Object>> arrayList0 = new ArrayList<Binding<Object>>();
      Class<HttpServlet> class0 = HttpServlet.class;
      Key<HttpServlet> key0 = Key.get(class0);
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      HttpServlet httpServlet0 = mock(HttpServlet.class, new ViolatedAssumptionAnswer());
      ServletDefinition servletDefinition0 = new ServletDefinition(key0, (UriPatternMatcher) null, hashMap0, httpServlet0);
      Provider<Object> provider0 = (Provider<Object>) mock(Provider.class, new ViolatedAssumptionAnswer());
      doReturn(servletDefinition0).when(provider0).get();
      Binding<Object> binding0 = (Binding<Object>) mock(Binding.class, new ViolatedAssumptionAnswer());
      doReturn(provider0).when(binding0).getProvider();
      arrayList0.add(binding0);
      Injector injector0 = mock(Injector.class, new ViolatedAssumptionAnswer());
      doReturn(arrayList0).when(injector0).findBindingsByType(any(com.google.inject.TypeLiteral.class));
      ManagedServletPipeline managedServletPipeline0 = new ManagedServletPipeline(injector0);
      ServletResponse servletResponse0 = mock(ServletResponse.class, new ViolatedAssumptionAnswer());
      ServletResponseWrapper servletResponseWrapper0 = new ServletResponseWrapper(servletResponse0);
      boolean boolean0 = managedServletPipeline0.service((ServletRequest) null, servletResponseWrapper0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      ArrayList<Binding<Object>> arrayList0 = new ArrayList<Binding<Object>>();
      Provider<Object> provider0 = (Provider<Object>) mock(Provider.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(provider0).get();
      Binding<Object> binding0 = (Binding<Object>) mock(Binding.class, new ViolatedAssumptionAnswer());
      doReturn(provider0).when(binding0).getProvider();
      arrayList0.add(binding0);
      Injector injector0 = mock(Injector.class, new ViolatedAssumptionAnswer());
      doReturn(arrayList0).when(injector0).findBindingsByType(any(com.google.inject.TypeLiteral.class));
      ManagedServletPipeline managedServletPipeline0 = new ManagedServletPipeline(injector0);
      // Undeclared exception!
      try { 
        managedServletPipeline0.init((ServletContext) null, (Injector) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.inject.servlet.ManagedServletPipeline", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      ArrayList<Binding<Object>> arrayList0 = new ArrayList<Binding<Object>>();
      Provider<Object> provider0 = (Provider<Object>) mock(Provider.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(provider0).get();
      Binding<Object> binding0 = (Binding<Object>) mock(Binding.class, new ViolatedAssumptionAnswer());
      doReturn(provider0).when(binding0).getProvider();
      arrayList0.add(binding0);
      Injector injector0 = mock(Injector.class, new ViolatedAssumptionAnswer());
      doReturn(arrayList0).when(injector0).findBindingsByType(any(com.google.inject.TypeLiteral.class));
      ManagedServletPipeline managedServletPipeline0 = new ManagedServletPipeline(injector0);
      boolean boolean0 = managedServletPipeline0.hasServletsMapped();
      assertTrue(boolean0);
  }
}
