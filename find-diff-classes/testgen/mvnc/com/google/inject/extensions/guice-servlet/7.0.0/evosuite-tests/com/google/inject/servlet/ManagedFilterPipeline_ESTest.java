/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 23 18:18:07 GMT 2024
 */

package com.google.inject.servlet;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.inject.Binding;
import com.google.inject.Injector;
import com.google.inject.Provider;
import com.google.inject.servlet.FilterChainInvocation;
import com.google.inject.servlet.FilterDefinition;
import com.google.inject.servlet.ManagedFilterPipeline;
import com.google.inject.servlet.ManagedServletPipeline;
import jakarta.servlet.FilterChain;
import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ManagedFilterPipeline_ESTest extends ManagedFilterPipeline_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Stack<Binding<FilterDefinition>> stack0 = new Stack<Binding<FilterDefinition>>();
      Vector<Binding<Object>> vector0 = new Vector<Binding<Object>>();
      Injector injector0 = mock(Injector.class, new ViolatedAssumptionAnswer());
      Provider<ServletContext> provider0 = (Provider<ServletContext>) mock(Provider.class, new ViolatedAssumptionAnswer());
      FilterChain filterChain0 = mock(FilterChain.class, new ViolatedAssumptionAnswer());
      Injector injector1 = mock(Injector.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(injector1).findBindingsByType(any(com.google.inject.TypeLiteral.class));
      ManagedServletPipeline managedServletPipeline0 = null;
      try {
        managedServletPipeline0 = new ManagedServletPipeline(injector1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.inject.servlet.ManagedServletPipeline", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Injector injector0 = mock(Injector.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(injector0).findBindingsByType(any(com.google.inject.TypeLiteral.class));
      ManagedFilterPipeline managedFilterPipeline0 = null;
      try {
        managedFilterPipeline0 = new ManagedFilterPipeline(injector0, (ManagedServletPipeline) null, (Provider<ServletContext>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.inject.servlet.ManagedFilterPipeline", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Provider<ServletContext> provider0 = (Provider<ServletContext>) mock(Provider.class, new ViolatedAssumptionAnswer());
      Injector injector0 = mock(Injector.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(injector0).findBindingsByType(any(com.google.inject.TypeLiteral.class));
      ManagedFilterPipeline managedFilterPipeline0 = null;
      try {
        managedFilterPipeline0 = new ManagedFilterPipeline(injector0, (ManagedServletPipeline) null, provider0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.inject.servlet.ManagedFilterPipeline", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<Binding<Object>> linkedList0 = new LinkedList<Binding<Object>>();
      Injector injector0 = mock(Injector.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0).when(injector0).findBindingsByType(any(com.google.inject.TypeLiteral.class));
      Provider<ServletContext> provider0 = (Provider<ServletContext>) mock(Provider.class, new ViolatedAssumptionAnswer());
      Provider<Object> provider1 = (Provider<Object>) mock(Provider.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0).when(provider1).get();
      Binding<Object> binding0 = (Binding<Object>) mock(Binding.class, new ViolatedAssumptionAnswer());
      doReturn(provider1).when(binding0).getProvider();
      linkedList0.add(binding0);
      ManagedFilterPipeline managedFilterPipeline0 = null;
      try {
        managedFilterPipeline0 = new ManagedFilterPipeline(injector0, (ManagedServletPipeline) null, provider0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.LinkedList cannot be cast to com.google.inject.servlet.FilterDefinition
         //
         verifyException("com.google.inject.servlet.ManagedFilterPipeline", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Stack<Binding<FilterDefinition>> stack0 = new Stack<Binding<FilterDefinition>>();
      Vector<Binding<Object>> vector0 = new Vector<Binding<Object>>();
      Injector injector0 = mock(Injector.class, new ViolatedAssumptionAnswer());
      doReturn(stack0, vector0).when(injector0).findBindingsByType(any(com.google.inject.TypeLiteral.class));
      ManagedServletPipeline managedServletPipeline0 = new ManagedServletPipeline(injector0);
      Provider<ServletContext> provider0 = (Provider<ServletContext>) mock(Provider.class, new ViolatedAssumptionAnswer());
      ManagedFilterPipeline managedFilterPipeline0 = new ManagedFilterPipeline(injector0, managedServletPipeline0, provider0);
      managedFilterPipeline0.destroyPipeline();
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
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
  public void test6()  throws Throwable  {
      Injector injector0 = mock(Injector.class, new ViolatedAssumptionAnswer());
      Injector injector1 = mock(Injector.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(injector1).findBindingsByType(any(com.google.inject.TypeLiteral.class));
      ManagedServletPipeline managedServletPipeline0 = null;
      try {
        managedServletPipeline0 = new ManagedServletPipeline(injector1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.inject.servlet.ManagedServletPipeline", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LinkedList<Binding<Object>> linkedList0 = new LinkedList<Binding<Object>>();
      Injector injector0 = mock(Injector.class, new ViolatedAssumptionAnswer());
      doReturn(linkedList0).when(injector0).findBindingsByType(any(com.google.inject.TypeLiteral.class));
      Provider<ServletContext> provider0 = (Provider<ServletContext>) mock(Provider.class, new ViolatedAssumptionAnswer());
      Provider<Object> provider1 = (Provider<Object>) mock(Provider.class, new ViolatedAssumptionAnswer());
      Binding<Object> binding0 = (Binding<Object>) mock(Binding.class, new ViolatedAssumptionAnswer());
      doReturn((Provider) null).when(binding0).getProvider();
      linkedList0.add(binding0);
      ManagedFilterPipeline managedFilterPipeline0 = null;
      try {
        managedFilterPipeline0 = new ManagedFilterPipeline(injector0, (ManagedServletPipeline) null, provider0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.inject.servlet.ManagedFilterPipeline", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      Stack<Binding<FilterDefinition>> stack0 = new Stack<Binding<FilterDefinition>>();
      Vector<Binding<Object>> vector0 = new Vector<Binding<Object>>();
      Injector injector0 = mock(Injector.class, new ViolatedAssumptionAnswer());
      doReturn(stack0, vector0).when(injector0).findBindingsByType(any(com.google.inject.TypeLiteral.class));
      ManagedServletPipeline managedServletPipeline0 = new ManagedServletPipeline(injector0);
      Provider<ServletContext> provider0 = (Provider<ServletContext>) mock(Provider.class, new ViolatedAssumptionAnswer());
      ManagedFilterPipeline managedFilterPipeline0 = new ManagedFilterPipeline(injector0, managedServletPipeline0, provider0);
      managedFilterPipeline0.initPipeline((ServletContext) null);
      FilterChain filterChain0 = mock(FilterChain.class, new ViolatedAssumptionAnswer());
      FilterChainInvocation filterChainInvocation0 = new FilterChainInvocation((FilterDefinition[]) null, managedServletPipeline0, filterChain0);
      // Undeclared exception!
      try { 
        managedFilterPipeline0.dispatch((ServletRequest) null, (ServletResponse) null, filterChainInvocation0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }
}
