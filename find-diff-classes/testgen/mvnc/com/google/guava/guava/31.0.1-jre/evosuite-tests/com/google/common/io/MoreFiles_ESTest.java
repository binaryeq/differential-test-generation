/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 23 16:33:51 GMT 2024
 */

package com.google.common.io;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.base.Predicate;
import com.google.common.collect.ImmutableList;
import com.google.common.graph.Traverser;
import com.google.common.io.ByteSink;
import com.google.common.io.ByteSource;
import com.google.common.io.CharSink;
import com.google.common.io.CharSource;
import com.google.common.io.MoreFiles;
import com.google.common.io.RecursiveDeleteOption;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.charset.Charset;
import java.nio.file.FileSystemException;
import java.nio.file.LinkOption;
import java.nio.file.NoSuchFileException;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.io.MockFile;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MoreFiles_ESTest extends MoreFiles_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          MockFile mockFile0 = new MockFile("com.google.common.io.CharSource$StringCharSource");
          Path path0 = mockFile0.toPath();
          // Undeclared exception!
          try { 
            MoreFiles.touch(path0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"com.google.common.io.CharSource$StringCharSource\" \"write\")
             // java.lang.Thread.getStackTrace(Thread.java:1564)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:424)
             // java.lang.SecurityManager.checkWrite(SecurityManager.java:979)
             // sun.nio.fs.UnixPath.checkWrite(UnixPath.java:801)
             // sun.nio.fs.UnixFileAttributeViews$Basic.setTimes(UnixFileAttributeViews.java:72)
             // java.nio.file.Files.setLastModifiedTime(Files.java:2306)
             // com.google.common.io.MoreFiles.touch(MoreFiles.java:402)
             // sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
             // sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:498)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:256)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:165)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:219)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:286)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:192)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:49)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:750)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MockFile mockFile0 = new MockFile("MoreFiles.asByteSource(", "MoreFiles.asByteSource(");
      Path path0 = mockFile0.toPath();
      String string0 = MoreFiles.getFileExtension(path0);
      assertEquals("asByteSource(", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      LinkOption[] linkOptionArray0 = new LinkOption[7];
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      Charset charset0 = Charset.defaultCharset();
      CharSink charSink0 = MoreFiles.asCharSink(path0, charset0, linkOptionArray0);
      assertNotNull(charSink0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MockFile mockFile0 = new MockFile((String) null, "A");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[2];
      ByteSink byteSink0 = MoreFiles.asByteSink(path0, openOptionArray0);
      assertNotNull(byteSink0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MockFile mockFile0 = new MockFile("plq");
      Path path0 = mockFile0.toPath();
      try { 
        MoreFiles.listFiles(path0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        MoreFiles.listFiles((Path) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        MoreFiles.getNameWithoutExtension((Path) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.io.MoreFiles", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      // Undeclared exception!
      try { 
        MoreFiles.getFileExtension((Path) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.io.MoreFiles", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      MockFile mockFile0 = new MockFile("./vT");
      MockFile mockFile1 = new MockFile(mockFile0, "SLDTx37L^BwHzL");
      Path path0 = mockFile1.toPath();
      Path path1 = mockFile0.toPath();
      try { 
        MoreFiles.equal(path1, path0);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      try { 
        MoreFiles.equal((Path) null, (Path) null);
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
      // Undeclared exception!
      try { 
        MoreFiles.deleteRecursively((Path) null, (RecursiveDeleteOption[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.io.MoreFiles", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        MoreFiles.deleteDirectoryContents((Path) null, (RecursiveDeleteOption[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      FileAttribute<Object>[] fileAttributeArray0 = (FileAttribute<Object>[]) Array.newInstance(FileAttribute.class, 0);
      // Undeclared exception!
      try { 
        MoreFiles.createParentDirectories((Path) null, fileAttributeArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.io.MoreFiles", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      MockFile mockFile0 = new MockFile("plU");
      Charset charset0 = Charset.defaultCharset();
      Path path0 = mockFile0.toPath();
      // Undeclared exception!
      try { 
        MoreFiles.asCharSource(path0, charset0, (OpenOption[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.io.MoreFiles$PathByteSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      Charset charset0 = Charset.defaultCharset();
      // Undeclared exception!
      try { 
        MoreFiles.asCharSink(path0, charset0, (OpenOption[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.io.MoreFiles$PathByteSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      MockFile mockFile0 = new MockFile("N]JdJ$^Fc[g2f2,<b}", "N]JdJ$^Fc[g2f2,<b}");
      Path path0 = mockFile0.toPath();
      // Undeclared exception!
      try { 
        MoreFiles.asByteSource(path0, (OpenOption[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.io.MoreFiles$PathByteSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      // Undeclared exception!
      try { 
        MoreFiles.asByteSource((Path) null, (OpenOption[]) null);
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
      MockFile mockFile0 = new MockFile("R|P&f", "R|P&f");
      Path path0 = mockFile0.toPath();
      // Undeclared exception!
      try { 
        MoreFiles.asByteSink(path0, (OpenOption[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.io.MoreFiles$PathByteSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      MockFile mockFile0 = new MockFile("plq");
      Path path0 = mockFile0.toPath();
      try { 
        MoreFiles.deleteDirectoryContents(path0, (RecursiveDeleteOption[]) null);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      MockFile mockFile0 = new MockFile("plq", "plq");
      Path path0 = mockFile0.toPath();
      try { 
        MoreFiles.deleteRecursively(path0, (RecursiveDeleteOption[]) null);
        fail("Expecting exception: NoSuchFileException");
      
      } catch(NoSuchFileException e) {
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      MockFile mockFile0 = new MockFile("mx,");
      Path path0 = mockFile0.toPath();
      try { 
        MoreFiles.deleteRecursively(path0, (RecursiveDeleteOption[]) null);
        fail("Expecting exception: FileSystemException");
      
      } catch(FileSystemException e) {
         //
         // mx,: failed to delete one or more files; see suppressed exceptions for details
         //
         verifyException("com.google.common.io.MoreFiles", e);
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      RecursiveDeleteOption[] recursiveDeleteOptionArray0 = new RecursiveDeleteOption[0];
      try { 
        MoreFiles.deleteRecursively(path0, recursiveDeleteOptionArray0);
        fail("Expecting exception: FileSystemException");
      
      } catch(FileSystemException e) {
         //
         // /: can't delete recursively
         //
         verifyException("com.google.common.io.MoreFiles", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          MockFile mockFile0 = new MockFile(".");
          Path path0 = mockFile0.toPath();
          // Undeclared exception!
          try { 
            MoreFiles.deleteRecursively(path0, (RecursiveDeleteOption[]) null);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"././evosuite.com.google.common.collect.ForwardingNavigableSet.log\" \"delete\")
             // java.lang.Thread.getStackTrace(Thread.java:1564)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:424)
             // java.lang.SecurityManager.checkDelete(SecurityManager.java:1007)
             // sun.nio.fs.UnixPath.checkDelete(UnixPath.java:807)
             // sun.nio.fs.UnixSecureDirectoryStream.implDelete(UnixSecureDirectoryStream.java:177)
             // sun.nio.fs.UnixSecureDirectoryStream.deleteFile(UnixSecureDirectoryStream.java:216)
             // sun.nio.fs.UnixSecureDirectoryStream.deleteFile(UnixSecureDirectoryStream.java:42)
             // com.google.common.io.MoreFiles.deleteRecursivelySecure(MoreFiles.java:640)
             // com.google.common.io.MoreFiles.deleteDirectoryContentsSecure(MoreFiles.java:659)
             // com.google.common.io.MoreFiles.deleteRecursivelySecure(MoreFiles.java:631)
             // com.google.common.io.MoreFiles.deleteRecursively(MoreFiles.java:538)
             // sun.reflect.GeneratedMethodAccessor118.invoke(Unknown Source)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:498)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:256)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:165)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:219)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:286)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:192)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:49)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:750)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      MockFile mockFile0 = new MockFile("MoreFiles.asByteSource(", "MoreFiles.asByteSource(");
      Path path0 = mockFile0.toPath();
      String string0 = MoreFiles.getNameWithoutExtension(path0);
      assertEquals("MoreFiles", string0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      String string0 = MoreFiles.getNameWithoutExtension(path0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      MockFile mockFile0 = new MockFile("plq", "plq");
      Path path0 = mockFile0.toPath();
      String string0 = MoreFiles.getNameWithoutExtension(path0);
      assertEquals("plq", string0);
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "K:u/vI}4q^s.");
      Path path0 = mockFile0.toPath();
      String string0 = MoreFiles.getFileExtension(path0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      String string0 = MoreFiles.getFileExtension(path0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      MockFile mockFile0 = new MockFile("./BitArrays must be of equal length (%s != %s)");
      Path path0 = mockFile0.toPath();
      String string0 = MoreFiles.getFileExtension(path0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          MockFile mockFile0 = new MockFile("INSTANCE", "INSTANCE");
          Path path0 = mockFile0.toPath();
          // Undeclared exception!
          try { 
            MoreFiles.createParentDirectories(path0, (FileAttribute<?>[]) null);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"/home/wtwhite/code/regression-test-generation/find-diff-classes/testgen/mvnc/com/google/guava/guava/31.0.1-jre/INSTANCE\" \"write\")
             // java.lang.Thread.getStackTrace(Thread.java:1564)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:424)
             // java.lang.SecurityManager.checkWrite(SecurityManager.java:979)
             // sun.nio.fs.UnixPath.checkWrite(UnixPath.java:801)
             // sun.nio.fs.UnixFileSystemProvider.createDirectory(UnixFileSystemProvider.java:376)
             // java.nio.file.Files.createDirectory(Files.java:674)
             // java.nio.file.Files.createAndCheckIsDirectory(Files.java:781)
             // java.nio.file.Files.createDirectories(Files.java:727)
             // com.google.common.io.MoreFiles.createParentDirectories(MoreFiles.java:446)
             // sun.reflect.GeneratedMethodAccessor115.invoke(Unknown Source)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:498)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:256)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:165)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:219)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:286)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:192)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:49)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:750)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      Path path0 = mockFile0.toPath();
      MoreFiles.createParentDirectories(path0, (FileAttribute<?>[]) null);
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      MoreFiles.createParentDirectories(path0, (FileAttribute<?>[]) null);
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      MockFile mockFile0 = new MockFile("f");
      Path path0 = mockFile0.toPath();
      boolean boolean0 = MoreFiles.equal(path0, path0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      ImmutableList<Path> immutableList0 = MoreFiles.listFiles(path0);
      assertEquals(118, immutableList0.size());
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      MockFile mockFile0 = new MockFile("", "");
      Charset charset0 = Charset.defaultCharset();
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[1];
      LinkOption linkOption0 = LinkOption.NOFOLLOW_LINKS;
      openOptionArray0[0] = (OpenOption) linkOption0;
      CharSource charSource0 = MoreFiles.asCharSource(path0, charset0, openOptionArray0);
      assertNotNull(charSource0);
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      MockFile mockFile0 = new MockFile(")");
      Path path0 = mockFile0.toPath();
      OpenOption[] openOptionArray0 = new OpenOption[1];
      ByteSource byteSource0 = MoreFiles.asByteSource(path0, openOptionArray0);
      assertNotNull(byteSource0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      LinkOption[] linkOptionArray0 = new LinkOption[0];
      Predicate<Path> predicate0 = MoreFiles.isRegularFile(linkOptionArray0);
      assertNotNull(predicate0);
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      MockFile mockFile0 = new MockFile("5Q&=x]/.^I*M");
      Path path0 = mockFile0.toPath();
      Charset charset0 = Charset.defaultCharset();
      OpenOption[] openOptionArray0 = new OpenOption[0];
      CharSource charSource0 = MoreFiles.asCharSource(path0, charset0, openOptionArray0);
      assertNotNull(charSource0);
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      LinkOption[] linkOptionArray0 = new LinkOption[0];
      Predicate<Path> predicate0 = MoreFiles.isDirectory(linkOptionArray0);
      assertNotNull(predicate0);
  }

  @Test(timeout = 4000)
  public void test39()  throws Throwable  {
      MockFile mockFile0 = new MockFile("");
      Path path0 = mockFile0.toPath();
      MockFile mockFile1 = new MockFile("", "");
      Path path1 = mockFile1.toPath();
      try { 
        MoreFiles.equal(path0, path1);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test40()  throws Throwable  {
      Traverser<Path> traverser0 = MoreFiles.fileTraverser();
      assertNotNull(traverser0);
  }

  @Test(timeout = 4000)
  public void test41()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      OpenOption[] openOptionArray0 = new OpenOption[0];
      // Undeclared exception!
      try { 
        MoreFiles.asCharSink((Path) null, charset0, openOptionArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test42()  throws Throwable  {
      // Undeclared exception!
      try { 
        MoreFiles.isDirectory((LinkOption[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.io.MoreFiles", e);
      }
  }

  @Test(timeout = 4000)
  public void test43()  throws Throwable  {
      Charset charset0 = Charset.defaultCharset();
      OpenOption[] openOptionArray0 = new OpenOption[0];
      // Undeclared exception!
      try { 
        MoreFiles.asCharSource((Path) null, charset0, openOptionArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test44()  throws Throwable  {
      // Undeclared exception!
      try { 
        MoreFiles.asByteSink((Path) null, (OpenOption[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test45()  throws Throwable  {
      // Undeclared exception!
      try { 
        MoreFiles.touch((Path) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test46()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          MockFile mockFile0 = new MockFile("", "");
          Path path0 = mockFile0.toPath();
          // Undeclared exception!
          try { 
            MoreFiles.deleteDirectoryContents(path0, (RecursiveDeleteOption[]) null);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.io.FilePermission\" \"/proc/fb\" \"delete\")
             // java.lang.Thread.getStackTrace(Thread.java:1564)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:424)
             // java.lang.SecurityManager.checkDelete(SecurityManager.java:1007)
             // sun.nio.fs.UnixPath.checkDelete(UnixPath.java:807)
             // sun.nio.fs.UnixSecureDirectoryStream.implDelete(UnixSecureDirectoryStream.java:177)
             // sun.nio.fs.UnixSecureDirectoryStream.deleteFile(UnixSecureDirectoryStream.java:216)
             // sun.nio.fs.UnixSecureDirectoryStream.deleteFile(UnixSecureDirectoryStream.java:42)
             // com.google.common.io.MoreFiles.deleteRecursivelySecure(MoreFiles.java:640)
             // com.google.common.io.MoreFiles.deleteDirectoryContentsSecure(MoreFiles.java:659)
             // com.google.common.io.MoreFiles.deleteRecursivelySecure(MoreFiles.java:631)
             // com.google.common.io.MoreFiles.deleteDirectoryContentsSecure(MoreFiles.java:659)
             // com.google.common.io.MoreFiles.deleteDirectoryContents(MoreFiles.java:602)
             // sun.reflect.GeneratedMethodAccessor119.invoke(Unknown Source)
             // sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
             // java.lang.reflect.Method.invoke(Method.java:498)
             // org.evosuite.testcase.statements.MethodStatement$1.execute(MethodStatement.java:256)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:165)
             // org.evosuite.testcase.statements.MethodStatement.execute(MethodStatement.java:219)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:286)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:192)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:49)
             // java.util.concurrent.FutureTask.run(FutureTask.java:266)
             // java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1149)
             // java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:624)
             // java.lang.Thread.run(Thread.java:750)
             //
             verifyException("org.evosuite.runtime.sandbox.MSecurityManager", e);
          }
        } catch(Throwable t) {
            // Need to catch declared exceptions
        }
      } 
    });
    future.get(4000, TimeUnit.MILLISECONDS);
  }

  @Test(timeout = 4000)
  public void test47()  throws Throwable  {
      // Undeclared exception!
      try { 
        MoreFiles.isRegularFile((LinkOption[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.io.MoreFiles", e);
      }
  }
}
