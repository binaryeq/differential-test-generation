/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 08 03:12:10 GMT 2024
 */

package com.google.common.truth;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.truth.FailureMetadata;
import com.google.common.truth.FailureStrategy;
import com.google.common.truth.StandardSubjectBuilder;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StandardSubjectBuilder_ESTest extends StandardSubjectBuilder_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        StandardSubjectBuilder.forCustomFailureStrategy((FailureStrategy) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StandardSubjectBuilder standardSubjectBuilder0 = null;
      try {
        standardSubjectBuilder0 = new StandardSubjectBuilder((FailureMetadata) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }
}
