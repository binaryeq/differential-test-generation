/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 23 16:19:39 GMT 2024
 */

package com.google.common.hash;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.hash.Crc32cHashFunction;
import com.google.common.hash.HashCode;
import com.google.common.hash.Hasher;
import com.google.common.hash.Murmur3_32HashFunction;
import com.google.common.hash.SipHashFunction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SipHashFunction_ESTest extends SipHashFunction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      SipHashFunction sipHashFunction0 = (SipHashFunction)SipHashFunction.SIP_HASH_24;
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte) (-63);
      HashCode hashCode0 = sipHashFunction0.hashBytes(byteArray0);
      assertNotNull(hashCode0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      SipHashFunction sipHashFunction0 = new SipHashFunction(64, 64, (-2649L), 64);
      sipHashFunction0.hashCode();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      SipHashFunction sipHashFunction0 = new SipHashFunction(4, 4, 4, (-2277L));
      sipHashFunction0.hashCode();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      SipHashFunction sipHashFunction0 = (SipHashFunction)SipHashFunction.SIP_HASH_24;
      sipHashFunction0.hashLong(3015L);
      sipHashFunction0.hashCode();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      SipHashFunction sipHashFunction0 = new SipHashFunction(135, 135, 135, 0L);
      SipHashFunction sipHashFunction1 = new SipHashFunction(135, 135, 135, (-782L));
      boolean boolean0 = sipHashFunction0.equals(sipHashFunction1);
      assertFalse(sipHashFunction1.equals((Object)sipHashFunction0));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      SipHashFunction sipHashFunction0 = new SipHashFunction(135, 135, 113L, 8L);
      SipHashFunction sipHashFunction1 = new SipHashFunction(135, 135, 135, (-782L));
      boolean boolean0 = sipHashFunction0.equals(sipHashFunction1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      SipHashFunction sipHashFunction0 = (SipHashFunction)SipHashFunction.SIP_HASH_24;
      SipHashFunction sipHashFunction1 = new SipHashFunction(2, 2, 2, 128L);
      boolean boolean0 = sipHashFunction1.equals(sipHashFunction0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      SipHashFunction sipHashFunction0 = (SipHashFunction)SipHashFunction.SIP_HASH_24;
      SipHashFunction sipHashFunction1 = new SipHashFunction(64, 64, 64, 64);
      boolean boolean0 = sipHashFunction1.equals(sipHashFunction0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      SipHashFunction sipHashFunction0 = new SipHashFunction(21, 4, 4, 21);
      assertEquals(64, sipHashFunction0.bits());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      SipHashFunction sipHashFunction0 = null;
      try {
        sipHashFunction0 = new SipHashFunction(2246, 0, 0, 2L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The number of SipRound iterations (d=java.lang.Integer@0000000002) during Finalization must be positive.
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      SipHashFunction sipHashFunction0 = null;
      try {
        sipHashFunction0 = new SipHashFunction(0, 0, 0, 0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The number of SipRound iterations (c=java.lang.Integer@0000000002) during Compression must be positive.
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      SipHashFunction sipHashFunction0 = (SipHashFunction)SipHashFunction.SIP_HASH_24;
      Hasher hasher0 = sipHashFunction0.newHasher();
      assertNotNull(hasher0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Murmur3_32HashFunction murmur3_32HashFunction0 = (Murmur3_32HashFunction)Murmur3_32HashFunction.MURMUR3_32;
      // Undeclared exception!
      try { 
        murmur3_32HashFunction0.toString();
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Murmur3_32HashFunction murmur3_32HashFunction0 = (Murmur3_32HashFunction)Murmur3_32HashFunction.MURMUR3_32_FIXED;
      // Undeclared exception!
      try { 
        murmur3_32HashFunction0.newHasher();
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Crc32cHashFunction crc32cHashFunction0 = new Crc32cHashFunction();
      // Undeclared exception!
      try { 
        crc32cHashFunction0.bits();
       //  fail("Expecting exception: IllegalArgumentException");
       // Unstable assertion
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SipHashFunction sipHashFunction0 = new SipHashFunction(497, 497, 506097522914230528L, 2480279821605975764L);
      SipHashFunction sipHashFunction1 = new SipHashFunction(497, 497, 355L, 1069L);
      boolean boolean0 = sipHashFunction0.equals(sipHashFunction1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      SipHashFunction sipHashFunction0 = (SipHashFunction)SipHashFunction.SIP_HASH_24;
      SipHashFunction sipHashFunction1 = new SipHashFunction(2, 2, 2, (-412L));
      boolean boolean0 = sipHashFunction0.equals(sipHashFunction1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      SipHashFunction sipHashFunction0 = (SipHashFunction)SipHashFunction.SIP_HASH_24;
      SipHashFunction sipHashFunction1 = new SipHashFunction(16, 16, 16, 16);
      boolean boolean0 = sipHashFunction0.equals(sipHashFunction1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      SipHashFunction sipHashFunction0 = (SipHashFunction)SipHashFunction.SIP_HASH_24;
      boolean boolean0 = sipHashFunction0.equals(sipHashFunction0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      SipHashFunction sipHashFunction0 = (SipHashFunction)SipHashFunction.SIP_HASH_24;
      Object object0 = new Object();
      boolean boolean0 = sipHashFunction0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      SipHashFunction sipHashFunction0 = null;
      try {
        sipHashFunction0 = new SipHashFunction(1586, (-553), 1586, 1586);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The number of SipRound iterations (d=java.lang.Integer@0000000002) during Finalization must be positive.
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      SipHashFunction sipHashFunction0 = new SipHashFunction(116, 116, 116, 116);
      SipHashFunction sipHashFunction1 = new SipHashFunction(116, 116, 116, 1949L);
      boolean boolean0 = sipHashFunction0.equals(sipHashFunction1);
      assertFalse(boolean0);
      assertFalse(sipHashFunction1.equals((Object)sipHashFunction0));
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      SipHashFunction sipHashFunction0 = null;
      try {
        sipHashFunction0 = new SipHashFunction((-1593), 1788, 2042L, 2042L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // The number of SipRound iterations (c=java.lang.Integer@0000000002) during Compression must be positive.
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      SipHashFunction sipHashFunction0 = (SipHashFunction)SipHashFunction.SIP_HASH_24;
      int int0 = sipHashFunction0.bits();
      assertEquals(64, int0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      SipHashFunction sipHashFunction0 = (SipHashFunction)SipHashFunction.SIP_HASH_24;
      String string0 = sipHashFunction0.toString();
      assertEquals("Hashing.sipHash24(506097522914230528, 1084818905618843912)", string0);
  }
}
