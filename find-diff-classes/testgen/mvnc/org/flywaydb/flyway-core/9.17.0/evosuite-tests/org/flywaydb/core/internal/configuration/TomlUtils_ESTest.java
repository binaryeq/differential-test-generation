/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 23 21:49:21 GMT 2024
 */

package org.flywaydb.core.internal.configuration;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.flywaydb.core.internal.configuration.TomlUtils;
import org.flywaydb.core.internal.configuration.models.ConfigurationModel;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TomlUtils_ESTest extends TomlUtils_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      TomlUtils.loadConfigurationFromEnvironment();
      // Undeclared exception!
      TomlUtils.loadConfigurationFromEnvironment();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        TomlUtils.loadConfigurationFromCommandlineArgs((Map<String, String>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.flywaydb.core.internal.configuration.TomlUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put(".2@;!yp", (String) null);
      hashMap0.put("", "");
      // Undeclared exception!
      try { 
        TomlUtils.loadConfigurationFromCommandlineArgs(hashMap0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.String cannot be cast to java.util.Map
         //
         verifyException("org.flywaydb.core.internal.configuration.TomlUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      // Undeclared exception!
      try { 
        TomlUtils.loadConfigurationFiles((List<File>) null, "flyway_");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.flywaydb.core.internal.configuration.TomlUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      // Undeclared exception!
      try { 
        TomlUtils.loadConfigurationFile((File) null, ".");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.flywaydb.core.internal.configuration.TomlUtils", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockFile mockFile0 = new MockFile("_");
      // Undeclared exception!
      try { 
        TomlUtils.loadConfigurationFile(mockFile0, "_");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No mapper found for '' extension
         //
         verifyException("org.flywaydb.core.internal.util.ObjectMapperFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      // Undeclared exception!
      try { 
        TomlUtils.loadConfigurationFile(mockFile0, "");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No mapper found for '' extension
         //
         verifyException("org.flywaydb.core.internal.util.ObjectMapperFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockFile mockFile0 = new MockFile("r");
      ArrayList<File> arrayList0 = new ArrayList<File>();
      arrayList0.add((File) mockFile0);
      // Undeclared exception!
      try { 
        TomlUtils.loadConfigurationFiles(arrayList0, (String) null);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No mapper found for '' extension
         //
         verifyException("org.flywaydb.core.internal.util.ObjectMapperFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockFile mockFile0 = new MockFile(".", ".");
      // Undeclared exception!
      try { 
        TomlUtils.loadConfigurationFile(mockFile0, ".");
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // No mapper found for '.' extension
         //
         verifyException("org.flywaydb.core.internal.util.ObjectMapperFactory", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      hashMap0.put("org.apache.commons.dbcp.cpdsadapter.DriverAdapterCPDS", "%!Mq{]V~`bMM1k C)");
      // Undeclared exception!
      try { 
        TomlUtils.loadConfigurationFromCommandlineArgs(hashMap0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unrecognized field \"org\" (class org.flywaydb.core.internal.configuration.models.ConfigurationModel), not marked as ignorable (2 known properties: \"environments\", \"flyway\"])
         //  at [Source: UNKNOWN; byte offset: #UNKNOWN] (through reference chain: org.flywaydb.core.internal.configuration.models.ConfigurationModel[\"org\"])
         //
         verifyException("com.fasterxml.jackson.databind.ObjectMapper", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      ConfigurationModel configurationModel0 = TomlUtils.loadConfigurationFromCommandlineArgs(hashMap0);
      assertNotNull(configurationModel0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      ArrayList<File> arrayList0 = new ArrayList<File>();
      ConfigurationModel configurationModel0 = TomlUtils.loadConfigurationFiles(arrayList0, (String) null);
      assertNotNull(configurationModel0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      TomlUtils tomlUtils0 = new TomlUtils();
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      TomlUtils.loadConfigurationFromEnvironment();
      HashMap<String, String> hashMap0 = new HashMap<String, String>();
      // Undeclared exception!
      TomlUtils.loadConfigurationFromCommandlineArgs(hashMap0);
  }
}
