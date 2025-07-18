/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 23 15:14:41 GMT 2024
 */

package com.google.common.collect;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Converter;
import com.google.common.collect.BoundType;
import com.google.common.collect.Cut;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableMultiset;
import com.google.common.collect.ImmutableRangeMap;
import com.google.common.collect.ImmutableSet;
import com.google.common.collect.ImmutableSortedMultiset;
import com.google.common.collect.Multisets;
import com.google.common.collect.Range;
import com.google.common.collect.RangeMap;
import com.google.common.collect.SingletonImmutableList;
import com.google.common.collect.TreeRangeMap;
import com.google.common.collect.UnmodifiableSortedMultiset;
import java.nio.CharBuffer;
import java.util.Collection;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.function.BiFunction;
import java.util.function.Function;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ImmutableRangeMap_ESTest extends ImmutableRangeMap_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(14);
      Range<CharBuffer> range0 = Range.atLeast(charBuffer0);
      Range<CharBuffer> range1 = Range.greaterThan(charBuffer0);
      ImmutableList<Range<CharBuffer>> immutableList0 = ImmutableList.of(range0, range0, range0, range0, range1, range0, range0, range1, range0, range1);
      ImmutableList<CharBuffer> immutableList1 = ImmutableList.of(charBuffer0, charBuffer0, charBuffer0, charBuffer0, charBuffer0, charBuffer0, charBuffer0, charBuffer0, charBuffer0);
      ImmutableRangeMap<CharBuffer, CharBuffer> immutableRangeMap0 = new ImmutableRangeMap<CharBuffer, CharBuffer>(immutableList0, immutableList1);
      ImmutableRangeMap<CharBuffer, CharBuffer> immutableRangeMap1 = immutableRangeMap0.subRangeMap(range0);
      assertSame(immutableRangeMap1, immutableRangeMap0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Integer integer0 = new Integer(2);
      Range<Integer> range0 = Range.lessThan(integer0);
      ImmutableRangeMap<Integer, Integer> immutableRangeMap0 = ImmutableRangeMap.of(range0, integer0);
      Range<Integer> range1 = immutableRangeMap0.span();
      assertTrue(range1.equals((Object)range0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Object[] objectArray0 = new Object[1];
      ImmutableList<Comparable<BoundType>> immutableList0 = ImmutableList.asImmutableList(objectArray0, 0);
      ImmutableRangeMap<BoundType, Comparable<BoundType>> immutableRangeMap0 = new ImmutableRangeMap<BoundType, Comparable<BoundType>>((ImmutableList<Range<BoundType>>) null, immutableList0);
      // Undeclared exception!
      try { 
        immutableRangeMap0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.collect.ImmutableRangeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(2791);
      Range<CharBuffer> range0 = Range.greaterThan(charBuffer0);
      ImmutableRangeMap<CharBuffer, CharBuffer> immutableRangeMap0 = new ImmutableRangeMap<CharBuffer, CharBuffer>((ImmutableList<Range<CharBuffer>>) null, (ImmutableList<CharBuffer>) null);
      // Undeclared exception!
      try { 
        immutableRangeMap0.subRangeMap(range0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.collect.ImmutableRangeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      BoundType boundType0 = BoundType.OPEN;
      Range<Integer> range0 = Range.downTo(integer0, boundType0);
      // Undeclared exception!
      try { 
        ImmutableRangeMap.of(range0, (Multisets.UnmodifiableMultiset<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      ImmutableRangeMap<Integer, Integer> immutableRangeMap0 = ImmutableRangeMap.of();
      // Undeclared exception!
      try { 
        immutableRangeMap0.getEntry((Integer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Integer integer0 = new Integer(461845907);
      Range<Integer> range0 = Range.singleton(integer0);
      ImmutableMultiset<Range<Integer>> immutableMultiset0 = ImmutableMultiset.of(range0, range0);
      ImmutableList<Range<Integer>> immutableList0 = ImmutableList.copyOf((Collection<? extends Range<Integer>>) immutableMultiset0);
      ImmutableRangeMap<Integer, Comparable<Integer>> immutableRangeMap0 = new ImmutableRangeMap<Integer, Comparable<Integer>>(immutableList0, (ImmutableList<Comparable<Integer>>) null);
      // Undeclared exception!
      try { 
        immutableRangeMap0.get(integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.collect.ImmutableRangeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      char[] charArray0 = new char[1];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      Range<CharBuffer> range0 = Range.atMost(charBuffer0);
      ImmutableList<Range<CharBuffer>> immutableList0 = ImmutableList.of(range0, range0, range0, range0, range0, range0, range0, range0, range0, range0, range0);
      SingletonImmutableList<CharBuffer> singletonImmutableList0 = new SingletonImmutableList<CharBuffer>(charBuffer0);
      ImmutableRangeMap<CharBuffer, CharBuffer> immutableRangeMap0 = new ImmutableRangeMap<CharBuffer, CharBuffer>(immutableList0, singletonImmutableList0);
      // Undeclared exception!
      try { 
        immutableRangeMap0.get(charBuffer0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // java.lang.String@0000000008 (java.lang.Integer@0000000009) must be less than size (java.lang.Integer@0000000010)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        ImmutableRangeMap.copyOf((RangeMap<Integer, ? extends Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.collect.ImmutableRangeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Integer integer0 = new Integer(1183);
      Range<Comparable<Integer>> range0 = Range.singleton((Comparable<Integer>) integer0);
      ImmutableRangeMap<Comparable<Integer>, Integer> immutableRangeMap0 = ImmutableRangeMap.of(range0, integer0);
      ImmutableMap<Range<Comparable<Integer>>, Integer> immutableMap0 = immutableRangeMap0.asMapOfRanges();
      assertEquals(1, immutableMap0.size());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      ImmutableRangeMap<Integer, ImmutableRangeMap<Integer, CharBuffer>> immutableRangeMap0 = ImmutableRangeMap.of();
      ImmutableMap<Range<Integer>, ImmutableRangeMap<Integer, CharBuffer>> immutableMap0 = immutableRangeMap0.asMapOfRanges();
      assertEquals(0, immutableMap0.size());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Integer integer0 = new Integer(2);
      Range<Integer> range0 = Range.singleton(integer0);
      ImmutableRangeMap<Integer, Integer> immutableRangeMap0 = ImmutableRangeMap.of(range0, integer0);
      Range<Integer> range1 = immutableRangeMap0.span();
      assertTrue(range1.hasLowerBound());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      ImmutableRangeMap.Builder<CharBuffer, Range<CharBuffer>> immutableRangeMap_Builder0 = new ImmutableRangeMap.Builder<CharBuffer, Range<CharBuffer>>();
      ImmutableRangeMap<CharBuffer, Range<CharBuffer>> immutableRangeMap0 = immutableRangeMap_Builder0.build();
      boolean boolean0 = immutableRangeMap0.equals(immutableRangeMap0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      ImmutableRangeMap.Builder<CharBuffer, Range<CharBuffer>> immutableRangeMap_Builder0 = new ImmutableRangeMap.Builder<CharBuffer, Range<CharBuffer>>();
      ImmutableRangeMap<CharBuffer, Range<CharBuffer>> immutableRangeMap0 = immutableRangeMap_Builder0.build();
      boolean boolean0 = immutableRangeMap0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(2791);
      Range<CharBuffer> range0 = Range.greaterThan(charBuffer0);
      ImmutableList<Range<CharBuffer>> immutableList0 = ImmutableList.of(range0, range0, range0);
      ImmutableRangeMap<CharBuffer, Range<CharBuffer>> immutableRangeMap0 = new ImmutableRangeMap<CharBuffer, Range<CharBuffer>>(immutableList0, immutableList0);
      Range<CharBuffer> range1 = Range.lessThan(charBuffer0);
      ImmutableRangeMap<CharBuffer, Range<CharBuffer>> immutableRangeMap1 = immutableRangeMap0.subRangeMap(range1);
      assertNotSame(immutableRangeMap1, immutableRangeMap0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Integer integer0 = new Integer(2190);
      Range<Integer> range0 = Range.singleton(integer0);
      ImmutableRangeMap<Integer, Comparable<Integer>> immutableRangeMap0 = ImmutableRangeMap.of();
      ImmutableRangeMap<Integer, Comparable<Integer>> immutableRangeMap1 = immutableRangeMap0.subRangeMap(range0);
      assertSame(immutableRangeMap0, immutableRangeMap1);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      ImmutableRangeMap<Integer, Integer> immutableRangeMap0 = ImmutableRangeMap.of();
      Integer integer0 = new Integer((-205));
      Range<Integer> range0 = Range.greaterThan(integer0);
      Cut<Integer> cut0 = range0.lowerBound;
      Range<Integer> range1 = Range.create(cut0, cut0);
      ImmutableRangeMap<Integer, Integer> immutableRangeMap1 = immutableRangeMap0.subRangeMap(range1);
      assertSame(immutableRangeMap1, immutableRangeMap0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      ImmutableRangeMap<BoundType, Comparable<BoundType>> immutableRangeMap0 = ImmutableRangeMap.of();
      ImmutableMap<Range<BoundType>, Comparable<BoundType>> immutableMap0 = immutableRangeMap0.asDescendingMapOfRanges();
      assertEquals(0, immutableMap0.size());
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      BoundType boundType0 = BoundType.OPEN;
      Range<BoundType> range0 = Range.openClosed(boundType0, boundType0);
      ImmutableRangeMap<BoundType, Comparable<BoundType>> immutableRangeMap0 = ImmutableRangeMap.of(range0, (Comparable<BoundType>) boundType0);
      ImmutableMap<Range<BoundType>, Comparable<BoundType>> immutableMap0 = immutableRangeMap0.asDescendingMapOfRanges();
      assertEquals(1, immutableMap0.size());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      ImmutableRangeMap<Integer, Map.Entry<Integer, Integer>> immutableRangeMap0 = ImmutableRangeMap.of();
      // Undeclared exception!
      try { 
        immutableRangeMap0.span();
        fail("Expecting exception: NoSuchElementException");
      
      } catch(NoSuchElementException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.collect.ImmutableRangeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Integer integer0 = new Integer(44);
      BoundType boundType0 = BoundType.OPEN;
      Range<Integer> range0 = Range.upTo(integer0, boundType0);
      ImmutableSortedMultiset<Integer> immutableSortedMultiset0 = ImmutableSortedMultiset.of(integer0);
      UnmodifiableSortedMultiset<Integer> unmodifiableSortedMultiset0 = new UnmodifiableSortedMultiset<Integer>(immutableSortedMultiset0);
      ImmutableRangeMap<Integer, Multisets.UnmodifiableMultiset<Integer>> immutableRangeMap0 = ImmutableRangeMap.of(range0, (Multisets.UnmodifiableMultiset<Integer>) unmodifiableSortedMultiset0);
      Map.Entry<Range<Integer>, Multisets.UnmodifiableMultiset<Integer>> map_Entry0 = immutableRangeMap0.getEntry(integer0);
      assertNull(map_Entry0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Integer integer0 = new Integer((-4101));
      ImmutableRangeMap<Integer, Integer> immutableRangeMap0 = ImmutableRangeMap.of();
      Map.Entry<Range<Integer>, Integer> map_Entry0 = immutableRangeMap0.getEntry(integer0);
      assertNull(map_Entry0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Integer integer0 = new Integer(1);
      Range<Integer> range0 = Range.atMost(integer0);
      ImmutableRangeMap<Integer, Integer> immutableRangeMap0 = ImmutableRangeMap.of(range0, integer0);
      Map.Entry<Range<Integer>, Integer> map_Entry0 = immutableRangeMap0.getEntry(integer0);
      assertNotNull(map_Entry0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      ImmutableRangeMap<Integer, Integer> immutableRangeMap0 = ImmutableRangeMap.of();
      Integer integer0 = new Integer((-205));
      Integer integer1 = immutableRangeMap0.get(integer0);
      assertNull(integer1);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      char[] charArray0 = new char[1];
      CharBuffer charBuffer0 = CharBuffer.wrap(charArray0);
      Range<CharBuffer> range0 = Range.atMost(charBuffer0);
      ImmutableRangeMap<CharBuffer, CharBuffer> immutableRangeMap0 = ImmutableRangeMap.of(range0, charBuffer0);
      CharBuffer charBuffer1 = immutableRangeMap0.get(charBuffer0);
      assertEquals(1, charBuffer1.length());
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(63);
      Range<CharBuffer> range0 = Range.atLeast(charBuffer0);
      ImmutableRangeMap.Builder<CharBuffer, Range<CharBuffer>> immutableRangeMap_Builder0 = new ImmutableRangeMap.Builder<CharBuffer, Range<CharBuffer>>();
      ImmutableRangeMap<CharBuffer, Range<CharBuffer>> immutableRangeMap0 = ImmutableRangeMap.of(range0, range0);
      ImmutableRangeMap.Builder<CharBuffer, Range<CharBuffer>> immutableRangeMap_Builder1 = immutableRangeMap_Builder0.put(range0, range0);
      immutableRangeMap_Builder1.putAll(immutableRangeMap0);
      // Undeclared exception!
      try { 
        immutableRangeMap_Builder0.build();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Overlapping ranges: range [\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000..+\u221E) overlaps with entry [\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000\u0000..+\u221E)
         //
         verifyException("com.google.common.collect.ImmutableRangeMap$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      ImmutableRangeMap.Builder<Integer, Comparable<Integer>> immutableRangeMap_Builder0 = new ImmutableRangeMap.Builder<Integer, Comparable<Integer>>();
      Integer integer0 = new Integer(47);
      Range<Integer> range0 = Range.openClosed(integer0, integer0);
      // Undeclared exception!
      try { 
        immutableRangeMap_Builder0.put(range0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Range must not be empty, but was com.google.common.collect.Range@0000000004
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      TreeRangeMap<Integer, Integer> treeRangeMap0 = TreeRangeMap.create();
      Integer integer0 = new Integer((-5574));
      Integer[] integerArray0 = new Integer[3];
      integerArray0[0] = integer0;
      integerArray0[1] = integerArray0[0];
      integerArray0[2] = integer0;
      ImmutableSet<Integer> immutableSet0 = ImmutableSet.of(integer0, integer0, integer0, integer0, integer0, integer0, integerArray0);
      Range<Integer> range0 = Range.encloseAll((Iterable<Integer>) immutableSet0);
      treeRangeMap0.put(range0, integer0);
      ImmutableRangeMap<Integer, Integer> immutableRangeMap0 = ImmutableRangeMap.copyOf((RangeMap<Integer, ? extends Integer>) treeRangeMap0);
      assertNotNull(immutableRangeMap0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      TreeRangeMap<Integer, Integer> treeRangeMap0 = TreeRangeMap.create();
      ImmutableRangeMap<Integer, Integer> immutableRangeMap0 = ImmutableRangeMap.copyOf((RangeMap<Integer, ? extends Integer>) treeRangeMap0);
      // Undeclared exception!
      try { 
        immutableRangeMap0.subRangeMap((Range<Integer>) null);
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
      CharBuffer charBuffer0 = CharBuffer.allocate(14);
      Range<CharBuffer> range0 = Range.atLeast(charBuffer0);
      BoundType boundType0 = BoundType.OPEN;
      Range<CharBuffer> range1 = Range.upTo(charBuffer0, boundType0);
      ImmutableList<Range<CharBuffer>> immutableList0 = ImmutableList.of(range0, range0, range0, range0, range0, range0, range0, range0, range1, range0);
      ImmutableRangeMap<CharBuffer, CharBuffer> immutableRangeMap0 = ImmutableRangeMap.of(range1, charBuffer0);
      ImmutableList<ImmutableRangeMap<CharBuffer, CharBuffer>> immutableList1 = ImmutableList.of(immutableRangeMap0, immutableRangeMap0, immutableRangeMap0, immutableRangeMap0, immutableRangeMap0, immutableRangeMap0, immutableRangeMap0);
      ImmutableRangeMap<CharBuffer, ImmutableRangeMap<CharBuffer, CharBuffer>> immutableRangeMap1 = new ImmutableRangeMap<CharBuffer, ImmutableRangeMap<CharBuffer, CharBuffer>>(immutableList0, immutableList1);
      assertTrue(immutableList1.contains(immutableRangeMap0));
      
      ImmutableRangeMap<CharBuffer, ImmutableRangeMap<CharBuffer, CharBuffer>> immutableRangeMap2 = immutableRangeMap1.subRangeMap(range1);
      ImmutableRangeMap<CharBuffer, ImmutableRangeMap<CharBuffer, CharBuffer>> immutableRangeMap3 = immutableRangeMap2.subRangeMap(range1);
      assertTrue(immutableRangeMap3.equals((Object)immutableRangeMap2));
      assertNotSame(immutableRangeMap3, immutableRangeMap2);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(14);
      Range<CharBuffer> range0 = Range.atLeast(charBuffer0);
      BoundType boundType0 = BoundType.OPEN;
      Range<CharBuffer> range1 = Range.upTo(charBuffer0, boundType0);
      ImmutableList<Range<CharBuffer>> immutableList0 = ImmutableList.of(range1, range0, range1, range0, range0, range1, range0, range0, range0, range1);
      ImmutableRangeMap<CharBuffer, CharBuffer> immutableRangeMap0 = ImmutableRangeMap.of(range0, charBuffer0);
      ImmutableList<ImmutableRangeMap<CharBuffer, CharBuffer>> immutableList1 = ImmutableList.of(immutableRangeMap0, immutableRangeMap0, immutableRangeMap0, immutableRangeMap0, immutableRangeMap0, immutableRangeMap0, immutableRangeMap0);
      ImmutableRangeMap<CharBuffer, ImmutableRangeMap<CharBuffer, CharBuffer>> immutableRangeMap1 = new ImmutableRangeMap<CharBuffer, ImmutableRangeMap<CharBuffer, CharBuffer>>(immutableList0, immutableList1);
      // Undeclared exception!
      try { 
        immutableRangeMap1.subRangeMap(range0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // java.lang.String@0000000020 (java.lang.Integer@0000000021) must not be greater than size (java.lang.Integer@0000000022)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(14);
      Range<CharBuffer> range0 = Range.atLeast(charBuffer0);
      ImmutableRangeMap<CharBuffer, CharBuffer> immutableRangeMap0 = ImmutableRangeMap.of(range0, charBuffer0);
      Object object0 = immutableRangeMap0.writeReplace();
      assertNotNull(object0);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      CharBuffer charBuffer0 = CharBuffer.allocate(14);
      Range<CharBuffer> range0 = Range.atLeast(charBuffer0);
      ImmutableList<Range<CharBuffer>> immutableList0 = ImmutableList.of(range0, range0, range0, range0, range0, range0, range0, range0, range0, range0);
      ImmutableRangeMap<CharBuffer, CharBuffer> immutableRangeMap0 = ImmutableRangeMap.of(range0, charBuffer0);
      ImmutableList<ImmutableRangeMap<CharBuffer, CharBuffer>> immutableList1 = ImmutableList.of(immutableRangeMap0, immutableRangeMap0, immutableRangeMap0, immutableRangeMap0, immutableRangeMap0, immutableRangeMap0, immutableRangeMap0);
      ImmutableRangeMap<CharBuffer, ImmutableRangeMap<CharBuffer, CharBuffer>> immutableRangeMap1 = new ImmutableRangeMap<CharBuffer, ImmutableRangeMap<CharBuffer, CharBuffer>>(immutableList0, immutableList1);
      // Undeclared exception!
      try { 
        immutableRangeMap1.clear();
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.collect.ImmutableRangeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      ImmutableRangeMap<Integer, Integer> immutableRangeMap0 = ImmutableRangeMap.of();
      String string0 = immutableRangeMap0.toString();
      assertEquals("{}", string0);
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      ImmutableRangeMap<Integer, Integer> immutableRangeMap0 = ImmutableRangeMap.of();
      Integer integer0 = new Integer((-1));
      Range<Integer> range0 = Range.atMost(integer0);
      // Undeclared exception!
      try { 
        immutableRangeMap0.putCoalescing(range0, integer0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.collect.ImmutableRangeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      ImmutableRangeMap<Integer, Range<Integer>> immutableRangeMap0 = ImmutableRangeMap.of();
      Integer integer0 = new Integer((-1));
      Range<Integer> range0 = Range.openClosed(integer0, integer0);
      // Undeclared exception!
      try { 
        immutableRangeMap0.remove(range0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.collect.ImmutableRangeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      ImmutableRangeMap<BoundType, Comparable<BoundType>> immutableRangeMap0 = ImmutableRangeMap.of();
      // Undeclared exception!
      try { 
        immutableRangeMap0.putAll(immutableRangeMap0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.collect.ImmutableRangeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      Converter<Range<Integer>, Range<Integer>> converter0 = Converter.identity();
      // Undeclared exception!
      try { 
        ImmutableRangeMap.toImmutableRangeMap((Function<? super Range<Integer>, Range<Integer>>) converter0, (Function<? super Range<Integer>, ? extends Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      Range<Integer> range0 = Range.all();
      Integer integer0 = new Integer((-1));
      ImmutableRangeMap<Integer, Integer> immutableRangeMap0 = ImmutableRangeMap.of(range0, integer0);
      immutableRangeMap0.hashCode();
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      Range<Integer> range0 = Range.all();
      Integer integer0 = new Integer((-1));
      ImmutableRangeMap<Integer, Integer> immutableRangeMap0 = ImmutableRangeMap.of(range0, integer0);
      // Undeclared exception!
      try { 
        immutableRangeMap0.put(range0, integer0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.collect.ImmutableRangeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      ImmutableRangeMap.Builder<Integer, Comparable<Integer>> immutableRangeMap_Builder0 = ImmutableRangeMap.builder();
      TreeRangeMap<Integer, Integer> treeRangeMap0 = TreeRangeMap.create();
      ImmutableRangeMap.Builder<Integer, Comparable<Integer>> immutableRangeMap_Builder1 = immutableRangeMap_Builder0.putAll(treeRangeMap0);
      assertSame(immutableRangeMap_Builder0, immutableRangeMap_Builder1);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      ImmutableRangeMap<Integer, Integer> immutableRangeMap0 = ImmutableRangeMap.of();
      Integer integer0 = new Integer((-511));
      Range<Integer> range0 = Range.lessThan(integer0);
      ImmutableRangeMap<Integer, ImmutableRangeMap<Integer, Integer>> immutableRangeMap1 = ImmutableRangeMap.of(range0, immutableRangeMap0);
      // Undeclared exception!
      try { 
        immutableRangeMap1.merge(range0, immutableRangeMap0, (BiFunction<? super ImmutableRangeMap<Integer, Integer>, ? super ImmutableRangeMap<Integer, Integer>, ? extends ImmutableRangeMap<Integer, Integer>>) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.collect.ImmutableRangeMap", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      ImmutableRangeMap.Builder<CharBuffer, Range<CharBuffer>> immutableRangeMap_Builder0 = new ImmutableRangeMap.Builder<CharBuffer, Range<CharBuffer>>();
      ImmutableRangeMap.Builder<CharBuffer, Range<CharBuffer>> immutableRangeMap_Builder1 = new ImmutableRangeMap.Builder<CharBuffer, Range<CharBuffer>>();
      ImmutableRangeMap.Builder<CharBuffer, Range<CharBuffer>> immutableRangeMap_Builder2 = immutableRangeMap_Builder0.combine(immutableRangeMap_Builder1);
      assertNotNull(immutableRangeMap_Builder2);
  }
}
