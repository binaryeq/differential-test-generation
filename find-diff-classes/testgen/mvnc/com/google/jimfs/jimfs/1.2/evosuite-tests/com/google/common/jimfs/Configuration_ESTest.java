/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 23 18:25:27 GMT 2024
 */

package com.google.common.jimfs;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.jimfs.AclAttributeProvider;
import com.google.common.jimfs.BasicAttributeProvider;
import com.google.common.jimfs.Configuration;
import com.google.common.jimfs.DosAttributeProvider;
import com.google.common.jimfs.Feature;
import com.google.common.jimfs.PathNormalization;
import com.google.common.jimfs.PathType;
import com.google.common.jimfs.UnixPathType;
import com.google.common.jimfs.WatchServiceConfiguration;
import com.google.common.jimfs.WindowsPathType;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Configuration_ESTest extends Configuration_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Configuration configuration0 = Configuration.forCurrentPlatform();
      Configuration.Builder configuration_Builder0 = configuration0.toBuilder();
      Configuration.Builder configuration_Builder1 = configuration_Builder0.setMaxCacheSize(0L);
      assertEquals(4294967296L, Configuration.Builder.DEFAULT_MAX_SIZE);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      PathType pathType0 = PathType.windows();
      Configuration.Builder configuration_Builder0 = Configuration.builder(pathType0);
      // Undeclared exception!
      try { 
        configuration_Builder0.setMaxSize(0L);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // maxSize (java.lang.Long@0000000002) must be positive
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      UnixPathType unixPathType0 = (UnixPathType)UnixPathType.INSTANCE;
      Configuration.Builder configuration_Builder0 = Configuration.builder(unixPathType0);
      // Undeclared exception!
      try { 
        configuration_Builder0.setBlockSize(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // blockSize (java.lang.Integer@0000000002) must be positive
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      WindowsPathType windowsPathType0 = WindowsPathType.INSTANCE;
      Configuration.Builder configuration_Builder0 = Configuration.builder(windowsPathType0);
      PathNormalization pathNormalization0 = PathNormalization.CASE_FOLD_ASCII;
      PathNormalization[] pathNormalizationArray0 = new PathNormalization[1];
      pathNormalizationArray0[0] = pathNormalization0;
      // Undeclared exception!
      try { 
        configuration_Builder0.setNameCanonicalNormalization(pathNormalization0, pathNormalizationArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // can't set normalization CASE_FOLD_ASCII: normalization CASE_FOLD_ASCII already set
         //
         verifyException("com.google.common.jimfs.Configuration$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      UnixPathType unixPathType0 = (UnixPathType)UnixPathType.INSTANCE;
      Configuration.Builder configuration_Builder0 = Configuration.builder(unixPathType0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "/";
      Configuration.Builder configuration_Builder1 = configuration_Builder0.setAttributeViews("/", stringArray0);
      assertEquals(4294967296L, Configuration.Builder.DEFAULT_MAX_SIZE);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        Configuration.builder((PathType) null);
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
      UnixPathType unixPathType0 = (UnixPathType)UnixPathType.INSTANCE;
      Configuration.Builder configuration_Builder0 = Configuration.builder(unixPathType0);
      String[] stringArray0 = new String[1];
      stringArray0[0] = "/";
      Configuration.Builder configuration_Builder1 = configuration_Builder0.setRoots("/", stringArray0);
      assertEquals(8192, Configuration.Builder.DEFAULT_BLOCK_SIZE);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      WindowsPathType windowsPathType0 = WindowsPathType.INSTANCE;
      Configuration.Builder configuration_Builder0 = Configuration.builder(windowsPathType0);
      BasicAttributeProvider basicAttributeProvider0 = new BasicAttributeProvider();
      Configuration.Builder configuration_Builder1 = configuration_Builder0.addAttributeProvider(basicAttributeProvider0);
      Configuration.Builder configuration_Builder2 = configuration_Builder1.addAttributeProvider(basicAttributeProvider0);
      assertEquals((-1L), Configuration.Builder.DEFAULT_MAX_CACHE_SIZE);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Configuration configuration0 = Configuration.osX();
      Configuration.Builder configuration_Builder0 = configuration0.toBuilder();
      // Undeclared exception!
      try { 
        configuration_Builder0.setMaxCacheSize((-1L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // maxCacheSize (java.lang.Long@0000000005) may not be negative
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Configuration configuration0 = Configuration.forCurrentPlatform();
      Configuration.Builder configuration_Builder0 = configuration0.toBuilder();
      Configuration.Builder configuration_Builder1 = configuration_Builder0.setMaxSize(1L);
      assertEquals(8192, Configuration.Builder.DEFAULT_BLOCK_SIZE);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      WindowsPathType windowsPathType0 = WindowsPathType.INSTANCE;
      Configuration.Builder configuration_Builder0 = Configuration.builder(windowsPathType0);
      // Undeclared exception!
      try { 
        configuration_Builder0.setMaxSize((-1L));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // maxSize (java.lang.Long@0000000002) must be positive
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      WindowsPathType windowsPathType0 = WindowsPathType.INSTANCE;
      Configuration.Builder configuration_Builder0 = Configuration.builder(windowsPathType0);
      Configuration.Builder configuration_Builder1 = configuration_Builder0.setBlockSize(1);
      assertEquals((-1L), Configuration.Builder.DEFAULT_MAX_CACHE_SIZE);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Configuration configuration0 = Configuration.forCurrentPlatform();
      Configuration.Builder configuration_Builder0 = configuration0.toBuilder();
      // Undeclared exception!
      try { 
        configuration_Builder0.setBlockSize((-1691));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // blockSize (java.lang.Integer@0000000008) must be positive
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      PathNormalization pathNormalization0 = PathNormalization.NFC;
      UnixPathType unixPathType0 = (UnixPathType)UnixPathType.INSTANCE;
      Configuration.Builder configuration_Builder0 = Configuration.builder(unixPathType0);
      PathNormalization[] pathNormalizationArray0 = new PathNormalization[3];
      pathNormalizationArray0[0] = pathNormalization0;
      // Undeclared exception!
      try { 
        configuration_Builder0.setNameCanonicalNormalization(pathNormalization0, pathNormalizationArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // can't set normalization NFC: normalization NFC already set
         //
         verifyException("com.google.common.jimfs.Configuration$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      WindowsPathType windowsPathType0 = WindowsPathType.INSTANCE;
      Configuration.Builder configuration_Builder0 = Configuration.builder(windowsPathType0);
      PathNormalization pathNormalization0 = PathNormalization.CASE_FOLD_ASCII;
      PathNormalization[] pathNormalizationArray0 = new PathNormalization[0];
      Configuration.Builder configuration_Builder1 = configuration_Builder0.setNameCanonicalNormalization(pathNormalization0, pathNormalizationArray0);
      assertEquals(4294967296L, Configuration.Builder.DEFAULT_MAX_SIZE);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      WindowsPathType windowsPathType0 = WindowsPathType.INSTANCE;
      Configuration.Builder configuration_Builder0 = Configuration.builder(windowsPathType0);
      PathNormalization pathNormalization0 = PathNormalization.CASE_FOLD_UNICODE;
      PathNormalization[] pathNormalizationArray0 = new PathNormalization[0];
      Configuration.Builder configuration_Builder1 = configuration_Builder0.setNameDisplayNormalization(pathNormalization0, pathNormalizationArray0);
      assertEquals(8192, Configuration.Builder.DEFAULT_BLOCK_SIZE);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      WindowsPathType windowsPathType0 = WindowsPathType.INSTANCE;
      Configuration.Builder configuration_Builder0 = Configuration.builder(windowsPathType0);
      PathNormalization[] pathNormalizationArray0 = new PathNormalization[5];
      PathNormalization pathNormalization0 = PathNormalization.NFD;
      // Undeclared exception!
      try { 
        configuration_Builder0.setNameCanonicalNormalization(pathNormalization0, pathNormalizationArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      PathType pathType0 = PathType.windows();
      Configuration.Builder configuration_Builder0 = Configuration.builder(pathType0);
      PathNormalization pathNormalization0 = PathNormalization.NONE;
      PathNormalization[] pathNormalizationArray0 = new PathNormalization[0];
      Configuration.Builder configuration_Builder1 = configuration_Builder0.setNameCanonicalNormalization(pathNormalization0, pathNormalizationArray0);
      assertSame(configuration_Builder1, configuration_Builder0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      WindowsPathType windowsPathType0 = WindowsPathType.INSTANCE;
      Configuration.Builder configuration_Builder0 = Configuration.builder(windowsPathType0);
      DosAttributeProvider dosAttributeProvider0 = new DosAttributeProvider();
      Configuration.Builder configuration_Builder1 = configuration_Builder0.addAttributeProvider(dosAttributeProvider0);
      Configuration configuration0 = configuration_Builder0.build();
      Configuration.Builder configuration_Builder2 = configuration0.toBuilder();
      assertFalse(configuration_Builder2.equals((Object)configuration_Builder1));
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      WindowsPathType windowsPathType0 = WindowsPathType.INSTANCE;
      Configuration.Builder configuration_Builder0 = Configuration.builder(windowsPathType0);
      configuration_Builder0.setMaxCacheSize(1596L);
      Configuration configuration0 = configuration_Builder0.build();
      String string0 = configuration0.toString();
      assertEquals("Configuration{pathType=WindowsPathType, roots=[], supportedFeatures=[], workingDirectory=null, pathEqualityUsesCanonicalForm=false, blockSize=8192, maxSize=4294967296, maxCacheSize=1596}", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      Configuration configuration0 = Configuration.forCurrentPlatform();
      String string0 = configuration0.toString();
      assertEquals("Configuration{Unix}", string0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      WindowsPathType windowsPathType0 = WindowsPathType.INSTANCE;
      Configuration.Builder configuration_Builder0 = Configuration.builder(windowsPathType0);
      AclAttributeProvider aclAttributeProvider0 = new AclAttributeProvider();
      configuration_Builder0.addAttributeProvider(aclAttributeProvider0);
      Configuration configuration0 = configuration_Builder0.build();
      String string0 = configuration0.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      Configuration configuration0 = Configuration.forCurrentPlatform();
      Configuration.Builder configuration_Builder0 = configuration0.toBuilder();
      Feature[] featureArray0 = new Feature[0];
      Configuration.Builder configuration_Builder1 = configuration_Builder0.setSupportedFeatures(featureArray0);
      assertSame(configuration_Builder0, configuration_Builder1);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      Configuration configuration0 = Configuration.forCurrentPlatform();
      Configuration.Builder configuration_Builder0 = configuration0.toBuilder();
      Configuration.Builder configuration_Builder1 = configuration_Builder0.setWorkingDirectory("/work");
      assertSame(configuration_Builder1, configuration_Builder0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      WindowsPathType windowsPathType0 = WindowsPathType.INSTANCE;
      Configuration.Builder configuration_Builder0 = Configuration.builder(windowsPathType0);
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      WatchServiceConfiguration watchServiceConfiguration0 = WatchServiceConfiguration.polling(4294967296L, timeUnit0);
      Configuration.Builder configuration_Builder1 = configuration_Builder0.setWatchServiceConfiguration(watchServiceConfiguration0);
      Configuration configuration0 = configuration_Builder1.build();
      String string0 = configuration0.toString();
      assertEquals("Configuration{pathType=WindowsPathType, roots=[], supportedFeatures=[], workingDirectory=null, pathEqualityUsesCanonicalForm=false, blockSize=8192, maxSize=4294967296, watchServiceConfig=WatchServiceConfiguration.polling(4294967296, HOURS)}", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      Configuration configuration0 = Configuration.osX();
      Configuration.Builder configuration_Builder0 = configuration0.toBuilder();
      Configuration configuration1 = configuration_Builder0.build();
      String string0 = configuration1.toString();
      assertNotNull(string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      Configuration configuration0 = Configuration.windows();
      Configuration.Builder configuration_Builder0 = configuration0.toBuilder();
      PathNormalization pathNormalization0 = PathNormalization.NONE;
      PathNormalization[] pathNormalizationArray0 = new PathNormalization[1];
      PathNormalization pathNormalization1 = PathNormalization.NFC;
      pathNormalizationArray0[0] = pathNormalization1;
      // Undeclared exception!
      try { 
        configuration_Builder0.setNameCanonicalNormalization(pathNormalization0, pathNormalizationArray0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // can't set normalization NFC: normalization NONE already set
         //
         verifyException("com.google.common.jimfs.Configuration$Builder", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      WindowsPathType windowsPathType0 = WindowsPathType.INSTANCE;
      Configuration.Builder configuration_Builder0 = Configuration.builder(windowsPathType0);
      Configuration.Builder configuration_Builder1 = configuration_Builder0.setPathEqualityUsesCanonicalForm(true);
      assertEquals((-1L), Configuration.Builder.DEFAULT_MAX_CACHE_SIZE);
  }
}
