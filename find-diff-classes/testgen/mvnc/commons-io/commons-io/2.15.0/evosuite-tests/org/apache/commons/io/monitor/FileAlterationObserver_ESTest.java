/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 23 20:24:20 GMT 2024
 */

package org.apache.commons.io.monitor;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.File;
import java.io.FileFilter;
import java.net.URI;
import java.nio.file.InvalidPathException;
import java.time.Instant;
import java.util.List;
import java.util.Stack;
import java.util.Vector;
import org.apache.commons.io.IOCase;
import org.apache.commons.io.filefilter.AgeFileFilter;
import org.apache.commons.io.filefilter.AndFileFilter;
import org.apache.commons.io.filefilter.CanReadFileFilter;
import org.apache.commons.io.filefilter.CanWriteFileFilter;
import org.apache.commons.io.filefilter.EmptyFileFilter;
import org.apache.commons.io.filefilter.FalseFileFilter;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.filefilter.NameFileFilter;
import org.apache.commons.io.filefilter.NotFileFilter;
import org.apache.commons.io.filefilter.OrFileFilter;
import org.apache.commons.io.filefilter.SuffixFileFilter;
import org.apache.commons.io.monitor.FileAlterationListener;
import org.apache.commons.io.monitor.FileAlterationListenerAdaptor;
import org.apache.commons.io.monitor.FileAlterationObserver;
import org.apache.commons.io.monitor.FileEntry;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.evosuite.runtime.mock.java.net.MockURI;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FileAlterationObserver_ESTest extends FileAlterationObserver_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      URI uRI0 = MockURI.aFileURI;
      MockFile mockFile0 = new MockFile(uRI0);
      FileEntry fileEntry0 = new FileEntry(mockFile0);
      Vector<String> vector0 = new Vector<String>();
      IOCase iOCase0 = IOCase.SENSITIVE;
      SuffixFileFilter suffixFileFilter0 = new SuffixFileFilter(vector0, iOCase0);
      FileAlterationObserver fileAlterationObserver0 = new FileAlterationObserver(fileEntry0, suffixFileFilter0, iOCase0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      FileAlterationObserver fileAlterationObserver0 = new FileAlterationObserver("[file='");
      FileFilter fileFilter0 = fileAlterationObserver0.getFileFilter();
      assertNull(fileFilter0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      CanWriteFileFilter canWriteFileFilter0 = (CanWriteFileFilter)CanWriteFileFilter.CAN_WRITE;
      IOCase iOCase0 = IOCase.INSENSITIVE;
      FileAlterationObserver fileAlterationObserver0 = new FileAlterationObserver("M^S{XY0']Z", canWriteFileFilter0, iOCase0);
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("M^S{XY0']Z");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "'C~Wz_Ync9y\"M");
      File file0 = fileAlterationObserver0.getDirectory();
      assertEquals(0L, file0.getFreeSpace());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileAlterationObserver fileAlterationObserver0 = new FileAlterationObserver(mockFile0);
      File file0 = fileAlterationObserver0.getDirectory();
      assertEquals(0L, file0.length());
  }

//  @Test(timeout = 4000)
  @Test
  public void test04()  throws Throwable  {
      OrFileFilter orFileFilter0 = new OrFileFilter();
      FileAlterationObserver fileAlterationObserver0 = new FileAlterationObserver("(Y", orFileFilter0);
      IOFileFilter[] iOFileFilterArray0 = new IOFileFilter[4];
      iOFileFilterArray0[0] = (IOFileFilter) orFileFilter0;
      iOFileFilterArray0[1] = (IOFileFilter) orFileFilter0;
      iOFileFilterArray0[2] = (IOFileFilter) orFileFilter0;
      iOFileFilterArray0[3] = (IOFileFilter) orFileFilter0;
      OrFileFilter orFileFilter1 = new OrFileFilter(iOFileFilterArray0);
      List<IOFileFilter> list0 = orFileFilter1.getFileFilters();
      orFileFilter0.setFileFilters(list0);
      // Undeclared exception!
      try { 
        fileAlterationObserver0.toString();
        fail("Expecting exception: StackOverflowError");
      
      } catch(StackOverflowError e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      MockFile mockFile1 = new MockFile("");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/wtwhite/code/regression-test-generation/find-diff-classes/testgen/mvnc/commons-io/commons-io/2.15.0");
      FileSystemHandling.createFolder(evoSuiteFile0);
      MockFile.createTempFile("!2YhS9V-jaCxN}", "!2YhS9V-jaCxN}", (File) mockFile1);
      FileAlterationObserver fileAlterationObserver0 = new FileAlterationObserver(mockFile0);
      fileAlterationObserver0.initialize();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NotFileFilter notFileFilter0 = (NotFileFilter)EmptyFileFilter.NOT_EMPTY;
      FileAlterationObserver fileAlterationObserver0 = new FileAlterationObserver("\u0000\u05BE\u05D0\u05F3\u0600\u0750\u0E00\u1E00\u2100\uFB50\uFE70\uFF61", notFileFilter0);
      try { 
        fileAlterationObserver0.initialize();
        fail("Expecting exception: InvalidPathException");
      
      } catch(InvalidPathException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      Stack<IOFileFilter> stack0 = new Stack<IOFileFilter>();
      stack0.add((IOFileFilter) null);
      AndFileFilter andFileFilter0 = new AndFileFilter(stack0);
      FileAlterationObserver fileAlterationObserver0 = new FileAlterationObserver(mockFile0, andFileFilter0);
      try { 
        fileAlterationObserver0.initialize();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.commons.io.filefilter.AndFileFilter", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      AgeFileFilter ageFileFilter0 = new AgeFileFilter((Instant) null);
      FileAlterationObserver fileAlterationObserver0 = new FileAlterationObserver(mockFile0, ageFileFilter0);
      // Undeclared exception!
      try { 
        fileAlterationObserver0.checkAndNotify();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // instant
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      FalseFileFilter falseFileFilter0 = (FalseFileFilter)FalseFileFilter.FALSE;
      IOCase iOCase0 = IOCase.SYSTEM;
      FileAlterationObserver fileAlterationObserver0 = null;
      try {
        fileAlterationObserver0 = new FileAlterationObserver((FileEntry) null, falseFileFilter0, iOCase0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // rootEntry
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      IOCase iOCase0 = IOCase.INSENSITIVE;
      FileAlterationObserver fileAlterationObserver0 = null;
      try {
        fileAlterationObserver0 = new FileAlterationObserver((String) null, (FileFilter) null, iOCase0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NotFileFilter notFileFilter0 = (NotFileFilter)CanReadFileFilter.CANNOT_READ;
      FileAlterationObserver fileAlterationObserver0 = null;
      try {
        fileAlterationObserver0 = new FileAlterationObserver((String) null, notFileFilter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileAlterationObserver fileAlterationObserver0 = null;
      try {
        fileAlterationObserver0 = new FileAlterationObserver((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.io.File", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      IOCase iOCase0 = IOCase.SENSITIVE;
      FileAlterationObserver fileAlterationObserver0 = null;
      try {
        fileAlterationObserver0 = new FileAlterationObserver((File) null, (FileFilter) null, iOCase0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // file
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      NameFileFilter nameFileFilter0 = new NameFileFilter("");
      FileAlterationObserver fileAlterationObserver0 = null;
      try {
        fileAlterationObserver0 = new FileAlterationObserver((File) null, nameFileFilter0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // file
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      FileAlterationObserver fileAlterationObserver0 = null;
      try {
        fileAlterationObserver0 = new FileAlterationObserver((File) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // file
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/wtwhite/code/regression-test-generation/find-diff-classes/testgen/mvnc/commons-io/commons-io/2.15.0");
      FileSystemHandling.createFolder(evoSuiteFile0);
      FileAlterationObserver fileAlterationObserver0 = new FileAlterationObserver(mockFile0);
      fileAlterationObserver0.initialize();
      fileAlterationObserver0.checkAndNotify();
      // Undeclared exception!
      fileAlterationObserver0.checkAndNotify();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NameFileFilter nameFileFilter0 = new NameFileFilter("com.google.common.jimfs.DosAttributeProvider");
      FileAlterationObserver fileAlterationObserver0 = new FileAlterationObserver("com.google.common.jimfs.DosAttributeProvider", nameFileFilter0);
      String string0 = fileAlterationObserver0.toString();
      assertEquals("FileAlterationObserver[file='com.google.common.jimfs.DosAttributeProvider', NameFileFilter(com.google.common.jimfs.DosAttributeProvider), listeners=0]", string0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      FileAlterationObserver fileAlterationObserver0 = new FileAlterationObserver("Z^B?");
      String string0 = fileAlterationObserver0.toString();
      assertEquals("FileAlterationObserver[file='Z^B?', listeners=0]", string0);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      FileAlterationObserver fileAlterationObserver0 = new FileAlterationObserver("[file='");
      FileAlterationListenerAdaptor fileAlterationListenerAdaptor0 = new FileAlterationListenerAdaptor();
      fileAlterationObserver0.removeListener(fileAlterationListenerAdaptor0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      FileAlterationObserver fileAlterationObserver0 = new FileAlterationObserver("");
      fileAlterationObserver0.removeListener((FileAlterationListener) null);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NotFileFilter notFileFilter0 = (NotFileFilter)CanReadFileFilter.CANNOT_READ;
      FileAlterationObserver fileAlterationObserver0 = new FileAlterationObserver("", notFileFilter0);
      fileAlterationObserver0.initialize();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      FileAlterationObserver fileAlterationObserver0 = new FileAlterationObserver("/");
      FileAlterationListenerAdaptor fileAlterationListenerAdaptor0 = new FileAlterationListenerAdaptor();
      fileAlterationObserver0.addListener(fileAlterationListenerAdaptor0);
      fileAlterationObserver0.checkAndNotify();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      MockFile.createTempFile("VM`P^k>", "", (File) mockFile0);
      FileAlterationObserver fileAlterationObserver0 = new FileAlterationObserver(mockFile0);
      FileAlterationListenerAdaptor fileAlterationListenerAdaptor0 = new FileAlterationListenerAdaptor();
      fileAlterationObserver0.addListener(fileAlterationListenerAdaptor0);
      fileAlterationObserver0.checkAndNotify();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      FileAlterationObserver fileAlterationObserver0 = new FileAlterationObserver(mockFile0);
      fileAlterationObserver0.initialize();
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("/home/wtwhite/code/regression-test-generation/find-diff-classes");
      FileSystemHandling.createFolder(evoSuiteFile0);
      fileAlterationObserver0.checkAndNotify();
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      FileAlterationObserver fileAlterationObserver0 = new FileAlterationObserver("t");
      fileAlterationObserver0.initialize();
      fileAlterationObserver0.checkAndNotify();
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      FileAlterationObserver fileAlterationObserver0 = new FileAlterationObserver("[file='");
      fileAlterationObserver0.checkAndNotify();
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      FileAlterationObserver fileAlterationObserver0 = new FileAlterationObserver("");
      fileAlterationObserver0.addListener((FileAlterationListener) null);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      FileAlterationObserver fileAlterationObserver0 = new FileAlterationObserver("/qf1");
      Iterable<FileAlterationListener> iterable0 = fileAlterationObserver0.getListeners();
      assertNotNull(iterable0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      NotFileFilter notFileFilter0 = (NotFileFilter)CanReadFileFilter.CANNOT_READ;
      FileAlterationObserver fileAlterationObserver0 = new FileAlterationObserver("/qf1", notFileFilter0);
      FileFilter fileFilter0 = fileAlterationObserver0.getFileFilter();
      assertSame(fileFilter0, notFileFilter0);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      FileAlterationObserver fileAlterationObserver0 = new FileAlterationObserver("[file='");
      fileAlterationObserver0.destroy();
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      FileAlterationObserver fileAlterationObserver0 = new FileAlterationObserver(".zIktts7r ~pI^hV");
      File file0 = fileAlterationObserver0.getDirectory();
      assertEquals(".zIktts7r ~pI^hV", file0.toString());
  }
}
