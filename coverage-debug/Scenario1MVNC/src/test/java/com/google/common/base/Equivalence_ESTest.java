/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 23 14:00:46 GMT 2024
 */

package com.google.common.base;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Converter;
import com.google.common.base.Equivalence;
import com.google.common.base.Function;
import com.google.common.base.FunctionalEquivalence;
import com.google.common.base.Predicate;
import java.sql.SQLNonTransientConnectionException;
import java.sql.SQLTransactionRollbackException;
import java.util.ArrayDeque;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Equivalence_ESTest extends Equivalence_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Equivalence.Identity equivalence_Identity0 = new Equivalence.Identity();
      int int0 = equivalence_Identity0.doHash((Object) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Equivalence.Identity equivalence_Identity0 = new Equivalence.Identity();
      SQLNonTransientConnectionException sQLNonTransientConnectionException0 = new SQLNonTransientConnectionException("_@XD");
      boolean boolean0 = equivalence_Identity0.doEquivalent(sQLNonTransientConnectionException0, sQLNonTransientConnectionException0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Equivalence.Equals equivalence_Equals0 = new Equivalence.Equals();
      Object object0 = new Object();
      SQLNonTransientConnectionException sQLNonTransientConnectionException0 = new SQLNonTransientConnectionException();
      boolean boolean0 = equivalence_Equals0.doEquivalent(object0, sQLNonTransientConnectionException0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Equivalence<Object> equivalence0 = Equivalence.identity();
      Object object0 = new Object();
      boolean boolean0 = equivalence0.test((Object) null, object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Function<Object, SQLNonTransientConnectionException> function0 = (Function<Object, SQLNonTransientConnectionException>) mock(Function.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(function0).apply(any());
      Converter<Object, SQLNonTransientConnectionException> converter0 = Converter.from((Function<? super Object, ? extends SQLNonTransientConnectionException>) function0, (Function<? super SQLNonTransientConnectionException, ?>) function0);
      Converter<SQLNonTransientConnectionException, SQLNonTransientConnectionException> converter1 = Converter.identity();
      Converter<Object, SQLNonTransientConnectionException> converter2 = converter0.andThen(converter1);
      Equivalence.Equals equivalence_Equals0 = new Equivalence.Equals();
      FunctionalEquivalence<Object, Object> functionalEquivalence0 = new FunctionalEquivalence<Object, Object>(converter0, equivalence_Equals0);
      // Undeclared exception!
      try { 
        functionalEquivalence0.test(converter2, converter0);
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
      Equivalence<Object> equivalence0 = Equivalence.equals();
      Object object0 = new Object();
      boolean boolean0 = equivalence0.equivalent(object0, object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Equivalence.Equals equivalence_Equals0 = new Equivalence.Equals();
      Converter<Object, Object> converter0 = Converter.identity();
      Equivalence<Object> equivalence0 = equivalence_Equals0.onResultOf((Function<? super Object, ?>) converter0);
      Object object0 = new Object();
      Equivalence.Wrapper<Object> equivalence_Wrapper0 = equivalence_Equals0.wrap(object0);
      ArrayDeque<Object> arrayDeque0 = new ArrayDeque<Object>();
      Equivalence.Wrapper<ArrayDeque<Object>> equivalence_Wrapper1 = equivalence0.wrap(arrayDeque0);
      boolean boolean0 = equivalence_Wrapper1.equals(equivalence_Wrapper0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Equivalence<Object> equivalence0 = Equivalence.identity();
      Object object0 = new Object();
      Equivalence.Wrapper<Object> equivalence_Wrapper0 = equivalence0.wrap(object0);
      boolean boolean0 = equivalence_Wrapper0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Equivalence.Identity equivalence_Identity0 = new Equivalence.Identity();
      Object object0 = new Object();
      Equivalence.Wrapper<Object> equivalence_Wrapper0 = equivalence_Identity0.wrap(object0);
      boolean boolean0 = equivalence_Wrapper0.equals(equivalence_Wrapper0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Equivalence<Object> equivalence0 = Equivalence.identity();
      int int0 = equivalence0.hash((Object) null);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Equivalence<Object> equivalence0 = Equivalence.identity();
      Object object0 = new Object();
      boolean boolean0 = equivalence0.equivalent(object0, (Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Equivalence<Object> equivalence0 = Equivalence.identity();
      SQLTransactionRollbackException sQLTransactionRollbackException0 = new SQLTransactionRollbackException("", "");
      SQLNonTransientConnectionException sQLNonTransientConnectionException0 = new SQLNonTransientConnectionException("", sQLTransactionRollbackException0);
      boolean boolean0 = equivalence0.equivalent((Object) null, sQLNonTransientConnectionException0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Equivalence.Equals equivalence_Equals0 = new Equivalence.Equals();
      Object object0 = new Object();
      Equivalence.Wrapper<Object> equivalence_Wrapper0 = equivalence_Equals0.wrap(object0);
      ArrayDeque<Object> arrayDeque0 = new ArrayDeque<Object>();
      Equivalence.Wrapper<ArrayDeque<Object>> equivalence_Wrapper1 = equivalence_Equals0.wrap(arrayDeque0);
      boolean boolean0 = equivalence_Wrapper1.equals(equivalence_Wrapper0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Equivalence<Object> equivalence0 = Equivalence.identity();
      Equivalence.Equals equivalence_Equals0 = new Equivalence.Equals();
      int int0 = equivalence_Equals0.doHash(equivalence0);
      //  // Unstable assertion: assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Equivalence.Identity equivalence_Identity0 = new Equivalence.Identity();
      Object object0 = new Object();
      int int0 = equivalence_Identity0.hash(object0);
      assertEquals(2, int0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Equivalence<Object> equivalence0 = Equivalence.identity();
      Converter<SQLNonTransientConnectionException, SQLNonTransientConnectionException> converter0 = Converter.identity();
      Object object0 = new Object();
      boolean boolean0 = equivalence0.equivalent(object0, converter0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Equivalence.Equals equivalence_Equals0 = new Equivalence.Equals();
      Object object0 = new Object();
      Equivalence.Wrapper<Object> equivalence_Wrapper0 = equivalence_Equals0.wrap(object0);
      Object object1 = equivalence_Wrapper0.get();
      Predicate<Object> predicate0 = equivalence_Equals0.equivalentTo(object1);
      assertNotNull(predicate0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Equivalence<Object> equivalence0 = Equivalence.identity();
      boolean boolean0 = equivalence0.test((Object) null, (Object) null);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      Equivalence<Object> equivalence0 = Equivalence.equals();
      Equivalence<Iterable<SQLNonTransientConnectionException>> equivalence1 = equivalence0.pairwise();
      assertNotNull(equivalence1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      Equivalence<Object> equivalence0 = Equivalence.identity();
      // Undeclared exception!
      try { 
        equivalence0.onResultOf((Function<? super ArrayDeque<ArrayDeque>, ?>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }
}
