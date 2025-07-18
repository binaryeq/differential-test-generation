/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 23 15:01:39 GMT 2024
 */

package com.google.common.collect;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.collect.BoundType;
import com.google.common.collect.ForwardingNavigableMap;
import com.google.common.collect.ImmutableSortedSet;
import java.util.Locale;
import java.util.NavigableMap;
import java.util.function.BiFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ForwardingNavigableMap_ESTest extends ForwardingNavigableMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ForwardingNavigableMap<Integer, Locale.FilteringMode> forwardingNavigableMap0 = (ForwardingNavigableMap<Integer, Locale.FilteringMode>) mock(ForwardingNavigableMap.class, CALLS_REAL_METHODS);
      doReturn((NavigableMap) null, (NavigableMap) null).when(forwardingNavigableMap0).delegate();
      ForwardingNavigableMap.StandardDescendingMap forwardingNavigableMap_StandardDescendingMap0 = forwardingNavigableMap0.new StandardDescendingMap();
      Integer integer0 = new Integer((-1));
      Integer integer1 = new Integer((-1));
      // Undeclared exception!
      try { 
        forwardingNavigableMap_StandardDescendingMap0.subMap(integer0, true, integer1, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.collect.ForwardingNavigableMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ForwardingNavigableMap<Locale.FilteringMode, Locale.FilteringMode> forwardingNavigableMap0 = (ForwardingNavigableMap<Locale.FilteringMode, Locale.FilteringMode>) mock(ForwardingNavigableMap.class, CALLS_REAL_METHODS);
      ForwardingNavigableMap.StandardNavigableKeySet forwardingNavigableMap_StandardNavigableKeySet0 = forwardingNavigableMap0.new StandardNavigableKeySet();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ForwardingNavigableMap<Integer, Integer> forwardingNavigableMap0 = (ForwardingNavigableMap<Integer, Integer>) mock(ForwardingNavigableMap.class, CALLS_REAL_METHODS);
      doReturn((NavigableMap) null).when(forwardingNavigableMap0).delegate();
      ForwardingNavigableMap.StandardDescendingMap forwardingNavigableMap_StandardDescendingMap0 = forwardingNavigableMap0.new StandardDescendingMap();
      // Undeclared exception!
      try { 
        forwardingNavigableMap_StandardDescendingMap0.replaceAll((BiFunction<? super Integer, ? super ImmutableSortedSet<Integer>, ? extends ImmutableSortedSet<Integer>>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ForwardingNavigableMap<Integer, BoundType> forwardingNavigableMap0 = (ForwardingNavigableMap<Integer, BoundType>) mock(ForwardingNavigableMap.class, CALLS_REAL_METHODS);
      doReturn((NavigableMap) null, (NavigableMap) null).when(forwardingNavigableMap0).delegate();
      ForwardingNavigableMap.StandardDescendingMap forwardingNavigableMap_StandardDescendingMap0 = forwardingNavigableMap0.new StandardDescendingMap();
      // Undeclared exception!
      try { 
        forwardingNavigableMap_StandardDescendingMap0.standardHashCode();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.collect.ForwardingNavigableMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ForwardingNavigableMap<BoundType, Integer> forwardingNavigableMap0 = (ForwardingNavigableMap<BoundType, Integer>) mock(ForwardingNavigableMap.class, CALLS_REAL_METHODS);
      doReturn((NavigableMap) null, (NavigableMap) null).when(forwardingNavigableMap0).delegate();
      ForwardingNavigableMap.StandardDescendingMap forwardingNavigableMap_StandardDescendingMap0 = forwardingNavigableMap0.new StandardDescendingMap();
      BoundType boundType0 = BoundType.CLOSED;
      // Undeclared exception!
      try { 
        forwardingNavigableMap_StandardDescendingMap0.headMap(boundType0, true);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.collect.ForwardingNavigableMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ForwardingNavigableMap<Locale.FilteringMode, Integer> forwardingNavigableMap0 = (ForwardingNavigableMap<Locale.FilteringMode, Integer>) mock(ForwardingNavigableMap.class, CALLS_REAL_METHODS);
      doReturn((NavigableMap) null, (NavigableMap) null).when(forwardingNavigableMap0).delegate();
      ForwardingNavigableMap.StandardDescendingMap forwardingNavigableMap_StandardDescendingMap0 = forwardingNavigableMap0.new StandardDescendingMap();
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.IGNORE_EXTENDED_RANGES;
      // Undeclared exception!
      try { 
        forwardingNavigableMap_StandardDescendingMap0.subMap(locale_FilteringMode0, locale_FilteringMode0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.collect.ForwardingNavigableMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ForwardingNavigableMap<Integer, Integer> forwardingNavigableMap0 = (ForwardingNavigableMap<Integer, Integer>) mock(ForwardingNavigableMap.class, CALLS_REAL_METHODS);
      doReturn((NavigableMap) null, (NavigableMap) null).when(forwardingNavigableMap0).delegate();
      ForwardingNavigableMap.StandardDescendingMap forwardingNavigableMap_StandardDescendingMap0 = forwardingNavigableMap0.new StandardDescendingMap();
      // Undeclared exception!
      try { 
        forwardingNavigableMap_StandardDescendingMap0.descendingKeySet();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.collect.ForwardingNavigableMap", e);
      }
  }
}
