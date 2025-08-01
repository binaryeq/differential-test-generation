/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 23 13:58:32 GMT 2024
 */

package com.google.common.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Converter;
import com.google.common.base.Function;
import com.google.common.collect.BoundType;
import java.util.Stack;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Converter_ESTest extends Converter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Converter<Integer, Integer> converter0 = Converter.identity();
      Integer integer0 = converter0.convert((Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Converter<BoundType, BoundType> converter0 = Converter.identity();
      BoundType boundType0 = BoundType.CLOSED;
      BoundType boundType1 = converter0.convert(boundType0);
      assertSame(boundType1, boundType0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Converter<Integer, Integer> converter0 = Converter.identity();
      Integer integer0 = converter0.apply((Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Converter<BoundType, BoundType> converter0 = Converter.identity();
      BoundType boundType0 = BoundType.OPEN;
      BoundType boundType1 = converter0.apply(boundType0);
      assertSame(boundType0, boundType1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        Converter.from((Function<? super Integer, ? extends Integer>) null, (Function<? super Integer, ? extends Integer>) null);
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
      Converter<BoundType, BoundType> converter0 = Converter.identity();
      // Undeclared exception!
      try { 
        converter0.doAndThen((Converter<BoundType, Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // otherConverter
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Converter<Integer, Integer> converter0 = Converter.identity();
      Function<Converter<Integer, Integer>, Integer> function0 = (Function<Converter<Integer, Integer>, Integer>) mock(Function.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(function0).apply(any(com.google.common.base.Converter.class));
      doReturn((String) null).when(function0).toString();
      Function<Integer, Converter<Integer, Integer>> function1 = (Function<Integer, Converter<Integer, Integer>>) mock(Function.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(function1).toString();
      Converter<Converter<Integer, Integer>, Integer> converter1 = Converter.from((Function<? super Converter<Integer, Integer>, ? extends Integer>) function0, (Function<? super Integer, ? extends Converter<Integer, Integer>>) function1);
      // Undeclared exception!
      try { 
        converter1.correctedDoForward(converter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Function<Integer, BoundType> function0 = (Function<Integer, BoundType>) mock(Function.class, new ViolatedAssumptionAnswer());
      doReturn((String) null).when(function0).toString();
      Function<BoundType, Integer> function1 = (Function<BoundType, Integer>) mock(Function.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(function1).apply(any(com.google.common.collect.BoundType.class));
      doReturn((String) null).when(function1).toString();
      Converter<Integer, BoundType> converter0 = Converter.from((Function<? super Integer, ? extends BoundType>) function0, (Function<? super BoundType, ? extends Integer>) function1);
      BoundType boundType0 = BoundType.CLOSED;
      // Undeclared exception!
      try { 
        converter0.correctedDoBackward(boundType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Converter<BoundType, BoundType> converter0 = Converter.identity();
      // Undeclared exception!
      try { 
        converter0.convertAll((Iterable<? extends BoundType>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // fromIterable
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Function<BoundType, Integer> function0 = (Function<BoundType, Integer>) mock(Function.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(function0).apply(any(com.google.common.collect.BoundType.class));
      doReturn((String) null).when(function0).toString();
      Function<Integer, BoundType> function1 = (Function<Integer, BoundType>) mock(Function.class, new ViolatedAssumptionAnswer());
      doReturn("otherConverter").when(function1).toString();
      Converter<BoundType, Integer> converter0 = Converter.from((Function<? super BoundType, ? extends Integer>) function0, (Function<? super Integer, ? extends BoundType>) function1);
      BoundType boundType0 = BoundType.CLOSED;
      // Undeclared exception!
      try { 
        converter0.apply(boundType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Converter<BoundType, BoundType> converter0 = Converter.identity();
      // Undeclared exception!
      try { 
        converter0.andThen((Converter<BoundType, Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // otherConverter
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Function<BoundType, Integer> function0 = (Function<BoundType, Integer>) mock(Function.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(function0).apply(any(com.google.common.collect.BoundType.class));
      doReturn((String) null).when(function0).toString();
      Function<Integer, BoundType> function1 = (Function<Integer, BoundType>) mock(Function.class, new ViolatedAssumptionAnswer());
      doReturn("d").when(function1).toString();
      Converter<BoundType, Integer> converter0 = Converter.from((Function<? super BoundType, ? extends Integer>) function0, (Function<? super Integer, ? extends BoundType>) function1);
      BoundType boundType0 = BoundType.CLOSED;
      // Undeclared exception!
      try { 
        converter0.convert(boundType0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Converter<BoundType, BoundType> converter0 = Converter.identity();
      Converter<BoundType, BoundType> converter1 = Converter.from((Function<? super BoundType, ? extends BoundType>) converter0, (Function<? super BoundType, ? extends BoundType>) converter0);
      Converter<BoundType, BoundType> converter2 = Converter.from((Function<? super BoundType, ? extends BoundType>) converter0, (Function<? super BoundType, ? extends BoundType>) converter1);
      boolean boolean0 = converter1.equals(converter2);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Converter<BoundType, BoundType> converter0 = Converter.identity();
      Converter<BoundType, BoundType> converter1 = Converter.from((Function<? super BoundType, ? extends BoundType>) converter0, (Function<? super BoundType, ? extends BoundType>) converter0);
      Converter<BoundType, BoundType> converter2 = Converter.from((Function<? super BoundType, ? extends BoundType>) converter1, (Function<? super BoundType, ? extends BoundType>) converter1);
      Converter<BoundType, BoundType> converter3 = converter2.reverse();
      Converter<BoundType, BoundType> converter4 = converter3.reverse();
      boolean boolean0 = converter4.equals(converter1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Converter<BoundType, BoundType> converter0 = Converter.identity();
      Converter<BoundType, BoundType> converter1 = Converter.from((Function<? super BoundType, ? extends BoundType>) converter0, (Function<? super BoundType, ? extends BoundType>) converter0);
      Converter<BoundType, BoundType> converter2 = converter1.andThen(converter1);
      Converter<BoundType, BoundType> converter3 = converter1.andThen(converter0);
      boolean boolean0 = converter3.equals(converter2);
      assertFalse(boolean0);
      assertFalse(converter2.equals((Object)converter3));
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Converter<Integer, Integer> converter0 = Converter.identity();
      Function<BoundType, Integer> function0 = (Function<BoundType, Integer>) mock(Function.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null).when(function0).toString();
      Function<Integer, BoundType> function1 = (Function<Integer, BoundType>) mock(Function.class, new ViolatedAssumptionAnswer());
      doReturn((String) null, (String) null, (String) null, (String) null).when(function1).toString();
      Converter<BoundType, Integer> converter1 = Converter.from((Function<? super BoundType, ? extends Integer>) function0, (Function<? super Integer, ? extends BoundType>) function1);
      Converter<BoundType, Integer> converter2 = converter1.doAndThen(converter0);
      Converter<BoundType, Integer> converter3 = converter2.andThen(converter0);
      boolean boolean0 = converter2.equals(converter3);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Converter<BoundType, BoundType> converter0 = Converter.identity();
      Converter<BoundType, BoundType> converter1 = Converter.from((Function<? super BoundType, ? extends BoundType>) converter0, (Function<? super BoundType, ? extends BoundType>) converter0);
      Converter<BoundType, BoundType> converter2 = converter1.andThen(converter0);
      boolean boolean0 = converter2.equals(converter0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Converter<BoundType, BoundType> converter0 = Converter.identity();
      Converter<BoundType, BoundType> converter1 = Converter.from((Function<? super BoundType, ? extends BoundType>) converter0, (Function<? super BoundType, ? extends BoundType>) converter0);
      Converter<BoundType, BoundType> converter2 = converter1.reverse();
      boolean boolean0 = converter2.equals(converter1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Converter<BoundType, BoundType> converter0 = Converter.identity();
      Converter<BoundType, BoundType> converter1 = Converter.from((Function<? super BoundType, ? extends BoundType>) converter0, (Function<? super BoundType, ? extends BoundType>) converter0);
      Converter<BoundType, BoundType> converter2 = converter1.reverse();
      Converter<BoundType, BoundType> converter3 = converter1.reverse();
      boolean boolean0 = converter3.equals(converter2);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Converter<Integer, Integer> converter0 = Converter.identity();
      Integer integer0 = converter0.correctedDoBackward((Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Converter<Integer, Integer> converter0 = Converter.identity();
      Integer integer0 = converter0.correctedDoForward((Integer) null);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      Converter<Integer, Integer> converter0 = Converter.identity();
      Converter<Integer, Integer> converter1 = converter0.reverse();
      assertSame(converter1, converter0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Converter<Integer, Integer> converter0 = Converter.identity();
      BoundType boundType0 = BoundType.OPEN;
      boolean boolean0 = converter0.equals(boundType0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Converter<Integer, Integer> converter0 = Converter.identity();
      Stack<Integer> stack0 = new Stack<Integer>();
      Iterable<Integer> iterable0 = converter0.convertAll(stack0);
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      Converter<BoundType, BoundType> converter0 = Converter.identity();
      Converter<BoundType, BoundType> converter1 = Converter.from((Function<? super BoundType, ? extends BoundType>) converter0, (Function<? super BoundType, ? extends BoundType>) converter0);
      Converter<BoundType, BoundType> converter2 = converter1.reverse();
      BoundType boundType0 = BoundType.CLOSED;
      BoundType boundType1 = converter2.correctedDoForward(boundType0);
      assertSame(boundType0, boundType1);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Converter<BoundType, BoundType> converter0 = Converter.identity();
      Converter<BoundType, BoundType> converter1 = Converter.from((Function<? super BoundType, ? extends BoundType>) converter0, (Function<? super BoundType, ? extends BoundType>) converter0);
      Converter<BoundType, BoundType> converter2 = converter1.reverse();
      BoundType boundType0 = BoundType.OPEN;
      BoundType boundType1 = converter2.correctedDoBackward(boundType0);
      assertSame(boundType0, boundType1);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Converter<BoundType, BoundType> converter0 = Converter.identity();
      Converter<BoundType, BoundType> converter1 = Converter.from((Function<? super BoundType, ? extends BoundType>) converter0, (Function<? super BoundType, ? extends BoundType>) converter0);
      Converter<BoundType, BoundType> converter2 = converter1.andThen(converter0);
      BoundType boundType0 = BoundType.OPEN;
      BoundType boundType1 = converter2.correctedDoBackward(boundType0);
      assertSame(boundType1, boundType0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      Converter<BoundType, BoundType> converter0 = Converter.identity();
      Converter<BoundType, BoundType> converter1 = Converter.from((Function<? super BoundType, ? extends BoundType>) converter0, (Function<? super BoundType, ? extends BoundType>) converter0);
      BoundType boundType0 = BoundType.CLOSED;
      Converter<BoundType, BoundType> converter2 = converter1.doAndThen(converter0);
      BoundType boundType1 = converter2.correctedDoForward(boundType0);
      assertSame(boundType1, boundType0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      Converter<Integer, Integer> converter0 = Converter.identity();
      Function<BoundType, Integer> function0 = (Function<BoundType, Integer>) mock(Function.class, new ViolatedAssumptionAnswer());
      doReturn(", ", "q.`k.").when(function0).toString();
      Function<Integer, BoundType> function1 = (Function<Integer, BoundType>) mock(Function.class, new ViolatedAssumptionAnswer());
      doReturn("", "com.google.common.base.Converter").when(function1).toString();
      Converter<BoundType, Integer> converter1 = Converter.from((Function<? super BoundType, ? extends Integer>) function0, (Function<? super Integer, ? extends BoundType>) function1);
      Converter<BoundType, Integer> converter2 = converter1.doAndThen(converter0);
      boolean boolean0 = converter2.equals(converter2);
      assertTrue(boolean0);
  }
}
