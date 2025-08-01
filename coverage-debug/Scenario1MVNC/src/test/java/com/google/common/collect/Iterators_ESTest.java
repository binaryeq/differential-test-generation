/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 23 15:20:12 GMT 2024
 */

package com.google.common.collect;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Predicate;
import com.google.common.collect.BoundType;
import com.google.common.collect.ConsumingQueueIterator;
import com.google.common.collect.EmptyImmutableSetMultimap;
import com.google.common.collect.ImmutableMapEntrySet;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableSortedMultiset;
import com.google.common.collect.ImmutableSortedSet;
import com.google.common.collect.Iterators;
import com.google.common.collect.Range;
import com.google.common.collect.RegularImmutableSortedSet;
import com.google.common.collect.TreeMultiset;
import com.google.common.collect.UnmodifiableIterator;
import com.google.common.collect.UnmodifiableListIterator;
import java.lang.reflect.Array;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.concurrent.ConcurrentHashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Iterators_ESTest extends Iterators_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      UnmodifiableIterator<Object> unmodifiableIterator0 = Iterators.emptyIterator();
      Class<Object> class0 = Object.class;
      UnmodifiableIterator<Object> unmodifiableIterator1 = Iterators.filter((Iterator<?>) unmodifiableIterator0, class0);
      PriorityQueue<BoundType> priorityQueue0 = new PriorityQueue<BoundType>();
      Iterator<BoundType> iterator0 = priorityQueue0.iterator();
      Iterator<Object> iterator1 = Iterators.concat((Iterator<?>) iterator0, (Iterator<?>) unmodifiableIterator0, (Iterator<?>) unmodifiableIterator0, (Iterator<?>) unmodifiableIterator1);
      assertNotNull(iterator1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Iterators.checkNonnegative(0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        Iterators.unmodifiableIterator((Iterator<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StringTokenizer stringTokenizer0 = new StringTokenizer("d!&rBnP&");
      UnmodifiableIterator<Object> unmodifiableIterator0 = Iterators.forEnumeration((Enumeration<Object>) stringTokenizer0);
      // Undeclared exception!
      try { 
        Iterators.retainAll(unmodifiableIterator0, (Collection<?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UnmodifiableListIterator<Object> unmodifiableListIterator0 = Iterators.emptyListIterator();
      // Undeclared exception!
      try { 
        Iterators.getOnlyElement((Iterator<Object>) unmodifiableListIterator0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.collect.AbstractIndexedListIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UnmodifiableIterator<ImmutableMapEntrySet.RegularEntrySet<Locale.Category, Object>> unmodifiableIterator0 = Iterators.emptyIterator();
      // Undeclared exception!
      try { 
        Iterators.getLast((Iterator<ImmutableMapEntrySet.RegularEntrySet<Locale.Category, Object>>) unmodifiableIterator0);
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.collect.AbstractIndexedListIterator", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Locale.Category locale_Category0 = Locale.Category.FORMAT;
      // Undeclared exception!
      try { 
        Iterators.frequency((Iterator<?>) null, locale_Category0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.collect.Iterators", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Iterator<Object>[] iteratorArray0 = (Iterator<Object>[]) Array.newInstance(Iterator.class, 5);
      // Undeclared exception!
      try { 
        Iterators.forArray(iteratorArray0, 93, 93, 43);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // java.lang.String@0000000001 (java.lang.Integer@0000000002) must not be greater than size (java.lang.Integer@0000000003)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Locale.Category[] locale_CategoryArray0 = new Locale.Category[3];
      Locale.Category locale_Category0 = Locale.Category.DISPLAY;
      locale_CategoryArray0[0] = locale_Category0;
      ImmutableMultiset<Object> immutableMultiset0 = ImmutableMultiset.of((Object) locale_CategoryArray0[0]);
      Iterator<Locale.Category>[] iteratorArray0 = (Iterator<Locale.Category>[]) Array.newInstance(Iterator.class, 0);
      Iterator<Locale.Category> iterator0 = Iterators.concatNoDefensiveCopy((Iterator<? extends Locale.Category>[]) iteratorArray0);
      boolean boolean0 = Iterators.retainAll(iterator0, immutableMultiset0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      RegularImmutableSortedSet<Object> regularImmutableSortedSet0 = ImmutableSortedSet.emptySet((Comparator<? super Object>) comparator0);
      UnmodifiableIterator<Object> unmodifiableIterator0 = regularImmutableSortedSet0.iterator();
      assertNotNull(unmodifiableIterator0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ArrayList<Object> arrayList0 = new ArrayList<Object>();
      Iterator<Object> iterator0 = arrayList0.iterator();
      arrayList0.add((Object) iterator0);
      // Undeclared exception!
      try { 
        Iterators.pollNext(iterator0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList$Itr", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ArrayDeque<Object> arrayDeque0 = new ArrayDeque<Object>();
      ConsumingQueueIterator<Object> consumingQueueIterator0 = new ConsumingQueueIterator<Object>(arrayDeque0);
      // Undeclared exception!
      try { 
        Iterators.limit((Iterator<Object>) consumingQueueIterator0, (-1521));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // limit is negative
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      UnmodifiableIterator<Object> unmodifiableIterator0 = Iterators.emptyIterator();
      int int0 = Iterators.advance(unmodifiableIterator0, 0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Locale.Category locale_Category0 = Locale.Category.DISPLAY;
      UnmodifiableIterator<Locale.Category> unmodifiableIterator0 = Iterators.singletonIterator(locale_Category0);
      Object object0 = Iterators.getNext((Iterator<?>) unmodifiableIterator0, (Object) locale_Category0);
      assertSame(locale_Category0, object0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EmptyImmutableSetMultimap emptyImmutableSetMultimap0 = EmptyImmutableSetMultimap.INSTANCE;
      UnmodifiableIterator<Object> unmodifiableIterator0 = emptyImmutableSetMultimap0.valueIterator();
      // Undeclared exception!
      try { 
        Iterators.paddedPartition((Iterator<Object>) unmodifiableIterator0, (-1812));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Locale.FilteringMode[] locale_FilteringModeArray0 = new Locale.FilteringMode[5];
      Locale.FilteringMode locale_FilteringMode0 = Locale.FilteringMode.REJECT_EXTENDED_RANGES;
      locale_FilteringModeArray0[0] = locale_FilteringMode0;
      locale_FilteringModeArray0[1] = locale_FilteringMode0;
      locale_FilteringModeArray0[2] = locale_FilteringMode0;
      locale_FilteringModeArray0[3] = locale_FilteringModeArray0[2];
      locale_FilteringModeArray0[4] = locale_FilteringMode0;
      ImmutableSortedMultiset<Locale.FilteringMode> immutableSortedMultiset0 = ImmutableSortedMultiset.copyOf(locale_FilteringModeArray0);
      assertTrue(immutableSortedMultiset0.contains(locale_FilteringMode0));
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      RegularImmutableSortedSet<Object> regularImmutableSortedSet0 = ImmutableSortedSet.emptySet((Comparator<? super Object>) comparator0);
      Comparator<Object> comparator1 = regularImmutableSortedSet0.unsafeComparator();
      TreeMultiset<BoundType> treeMultiset0 = TreeMultiset.create((Comparator<? super BoundType>) comparator1);
      Iterator<BoundType> iterator0 = treeMultiset0.iterator();
      BoundType boundType0 = BoundType.OPEN;
      BoundType boundType1 = Iterators.getOnlyElement((Iterator<? extends BoundType>) iterator0, boundType0);
      assertSame(boundType1, boundType0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      UnmodifiableListIterator<Locale.FilteringMode> unmodifiableListIterator0 = Iterators.emptyListIterator();
      Iterator<Object> iterator0 = Iterators.concat((Iterator<?>) unmodifiableListIterator0, (Iterator<?>) unmodifiableListIterator0, (Iterator<?>) unmodifiableListIterator0, (Iterator<?>) unmodifiableListIterator0);
      String string0 = Iterators.toString(iterator0);
      assertEquals("[]", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      UnmodifiableIterator<Object> unmodifiableIterator0 = Iterators.emptyIterator();
      PriorityQueue<BoundType> priorityQueue0 = new PriorityQueue<BoundType>();
      BoundType boundType0 = BoundType.OPEN;
      priorityQueue0.add(boundType0);
      Iterator<BoundType> iterator0 = priorityQueue0.iterator();
      UnmodifiableIterator<Object> unmodifiableIterator1 = Iterators.unmodifiableIterator((Iterator<?>) iterator0);
      boolean boolean0 = Iterators.elementsEqual(unmodifiableIterator1, unmodifiableIterator0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Locale.Category[] locale_CategoryArray0 = new Locale.Category[3];
      Locale.Category locale_Category0 = Locale.Category.DISPLAY;
      locale_CategoryArray0[0] = locale_Category0;
      locale_CategoryArray0[1] = locale_CategoryArray0[0];
      locale_CategoryArray0[2] = locale_Category0;
      UnmodifiableIterator<Locale.Category> unmodifiableIterator0 = Iterators.forArray(locale_CategoryArray0);
      ImmutableMultiset<Object> immutableMultiset0 = ImmutableMultiset.of((Object) locale_CategoryArray0[0]);
      boolean boolean0 = Iterators.retainAll(unmodifiableIterator0, immutableMultiset0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Locale.Category[] locale_CategoryArray0 = new Locale.Category[3];
      Locale.Category locale_Category0 = Locale.Category.DISPLAY;
      locale_CategoryArray0[0] = locale_Category0;
      locale_CategoryArray0[1] = locale_CategoryArray0[0];
      UnmodifiableIterator<Object> unmodifiableIterator0 = Iterators.emptyIterator();
      ImmutableMultiset<Object> immutableMultiset0 = ImmutableMultiset.of((Object) locale_CategoryArray0[1]);
      boolean boolean0 = Iterators.removeAll(unmodifiableIterator0, immutableMultiset0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      UnmodifiableIterator<Object> unmodifiableIterator0 = Iterators.emptyIterator();
      PriorityQueue<BoundType> priorityQueue0 = new PriorityQueue<BoundType>();
      BoundType boundType0 = BoundType.OPEN;
      priorityQueue0.add(boundType0);
      Iterator<BoundType> iterator0 = priorityQueue0.iterator();
      boolean boolean0 = Iterators.contains(iterator0, unmodifiableIterator0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      RegularImmutableSortedSet<Object> regularImmutableSortedSet0 = ImmutableSortedSet.emptySet((Comparator<? super Object>) comparator0);
      Comparator<Object> comparator1 = regularImmutableSortedSet0.unsafeComparator();
      PriorityQueue<BoundType> priorityQueue0 = new PriorityQueue<BoundType>(comparator1);
      BoundType boundType0 = BoundType.OPEN;
      priorityQueue0.add(boundType0);
      Iterator<BoundType> iterator0 = Iterators.cycle((Iterable<BoundType>) priorityQueue0);
      // Undeclared exception!
      Iterators.size(iterator0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      UnmodifiableListIterator<Iterator<Object>> unmodifiableListIterator0 = Iterators.emptyListIterator();
      Enumeration<Iterator<Object>> enumeration0 = Iterators.asEnumeration((Iterator<Iterator<Object>>) unmodifiableListIterator0);
      assertNotNull(enumeration0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      UnmodifiableIterator<Object> unmodifiableIterator0 = Iterators.emptyIterator();
      PriorityQueue<BoundType> priorityQueue0 = new PriorityQueue<BoundType>();
      Iterator<BoundType> iterator0 = priorityQueue0.iterator();
      UnmodifiableIterator<Object> unmodifiableIterator1 = Iterators.unmodifiableIterator((Iterator<?>) iterator0);
      boolean boolean0 = Iterators.elementsEqual(unmodifiableIterator1, unmodifiableIterator0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Comparator<Object> comparator0 = (Comparator<Object>) mock(Comparator.class, new ViolatedAssumptionAnswer());
      RegularImmutableSortedSet<Object> regularImmutableSortedSet0 = ImmutableSortedSet.emptySet((Comparator<? super Object>) comparator0);
      Comparator<Object> comparator1 = regularImmutableSortedSet0.unsafeComparator();
      PriorityQueue<BoundType> priorityQueue0 = new PriorityQueue<BoundType>(comparator1);
      Iterator<BoundType> iterator0 = Iterators.cycle((Iterable<BoundType>) priorityQueue0);
      int int0 = Iterators.size(iterator0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      PriorityQueue<BoundType> priorityQueue0 = new PriorityQueue<BoundType>();
      Iterator<BoundType> iterator0 = priorityQueue0.iterator();
      Iterator<BoundType> iterator1 = Iterators.concat((Iterator<? extends BoundType>) iterator0, (Iterator<? extends BoundType>) iterator0);
      assertFalse(iterator1.equals((Object)iterator0));
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      ConsumingQueueIterator<Object> consumingQueueIterator0 = new ConsumingQueueIterator<Object>(linkedList0);
      // Undeclared exception!
      try { 
        Iterators.cast((Iterator<Object>) consumingQueueIterator0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // com.google.common.collect.ConsumingQueueIterator cannot be cast to java.util.ListIterator
         //
         verifyException("com.google.common.collect.Iterators", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        Iterators.asEnumeration((Iterator<Locale.FilteringMode>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      UnmodifiableIterator<Object> unmodifiableIterator0 = Iterators.emptyIterator();
      Class<Object> class0 = Object.class;
      UnmodifiableIterator<Object> unmodifiableIterator1 = Iterators.filter((Iterator<?>) unmodifiableIterator0, class0);
      boolean boolean0 = Iterators.elementsEqual(unmodifiableIterator1, unmodifiableIterator1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      StringTokenizer stringTokenizer0 = new StringTokenizer("d!&rBnP&");
      UnmodifiableIterator<Object> unmodifiableIterator0 = Iterators.forEnumeration((Enumeration<Object>) stringTokenizer0);
      Iterator<Object> iterator0 = Iterators.concat((Iterator<?>) unmodifiableIterator0, (Iterator<?>) unmodifiableIterator0, (Iterator<?>) unmodifiableIterator0);
      assertNotNull(iterator0);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      ConcurrentHashMap<Locale.FilteringMode, Object> concurrentHashMap0 = new ConcurrentHashMap<Locale.FilteringMode, Object>();
      Enumeration<Object> enumeration0 = concurrentHashMap0.elements();
      UnmodifiableIterator<Object> unmodifiableIterator0 = Iterators.forEnumeration(enumeration0);
      UnmodifiableIterator<Object> unmodifiableIterator1 = Iterators.unmodifiableIterator(unmodifiableIterator0);
      assertSame(unmodifiableIterator0, unmodifiableIterator1);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      UnmodifiableIterator<Object> unmodifiableIterator0 = Iterators.emptyIterator();
      Iterator<Object> iterator0 = Iterators.consumingIterator((Iterator<Object>) unmodifiableIterator0);
      Iterators.clear(iterator0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      Locale.Category locale_Category0 = Locale.Category.DISPLAY;
      UnmodifiableIterator<Locale.Category> unmodifiableIterator0 = Iterators.singletonIterator(locale_Category0);
      Range<Locale.Category> range0 = Range.greaterThan(locale_Category0);
      boolean boolean0 = Iterators.any((Iterator<Locale.Category>) unmodifiableIterator0, (Predicate<? super Locale.Category>) range0);
      assertFalse(boolean0);
  }
}
