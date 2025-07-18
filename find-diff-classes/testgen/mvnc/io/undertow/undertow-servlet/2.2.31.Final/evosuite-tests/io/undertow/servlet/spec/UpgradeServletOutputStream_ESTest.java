/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 10 23:03:52 GMT 2024
 */

package io.undertow.servlet.spec;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.netty.buffer.EmptyByteBuf;
import io.netty.buffer.UnpooledByteBufAllocator;
import io.undertow.servlet.spec.UpgradeServletOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import javax.servlet.WriteListener;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;
import org.xnio.XnioIoThread;
import org.xnio.channels.NullStreamSinkChannel;
import org.xnio.channels.SplitStreamSinkChannel;
import org.xnio.channels.StreamSinkChannel;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class UpgradeServletOutputStream_ESTest extends UpgradeServletOutputStream_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(1);
      scheduledThreadPoolExecutor0.getRemoveOnCancelPolicy();
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(nullStreamSinkChannel0, scheduledThreadPoolExecutor0);
      WriteListener writeListener0 = mock(WriteListener.class, new ViolatedAssumptionAnswer());
      upgradeServletOutputStream0.setWriteListener(writeListener0);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte)42;
      byteArray0[1] = (byte)113;
      byteArray0[2] = (byte)4;
      upgradeServletOutputStream0.write(byteArray0, 4, 2545);
      upgradeServletOutputStream0.write(byteArray0, 1, 391);
      upgradeServletOutputStream0.closeBlocking();
      try { 
        upgradeServletOutputStream0.flush();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(1);
      scheduledThreadPoolExecutor0.getRemoveOnCancelPolicy();
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(nullStreamSinkChannel0, scheduledThreadPoolExecutor0);
      WriteListener writeListener0 = mock(WriteListener.class, new ViolatedAssumptionAnswer());
      upgradeServletOutputStream0.setWriteListener(writeListener0);
      upgradeServletOutputStream0.write(1);
      upgradeServletOutputStream0.flush();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      nullStreamSinkChannel0.close();
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(1);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(nullStreamSinkChannel0, scheduledThreadPoolExecutor0);
      WriteListener writeListener0 = mock(WriteListener.class, new ViolatedAssumptionAnswer());
      upgradeServletOutputStream0.setWriteListener(writeListener0);
      upgradeServletOutputStream0.close();
      upgradeServletOutputStream0.isReady();
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(1);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(nullStreamSinkChannel0, scheduledThreadPoolExecutor0);
      WriteListener writeListener0 = mock(WriteListener.class, new ViolatedAssumptionAnswer());
      upgradeServletOutputStream0.setWriteListener(writeListener0);
      upgradeServletOutputStream0.close();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(1);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(nullStreamSinkChannel0, scheduledThreadPoolExecutor0);
      WriteListener writeListener0 = mock(WriteListener.class, new ViolatedAssumptionAnswer());
      upgradeServletOutputStream0.setWriteListener(writeListener0);
      boolean boolean0 = upgradeServletOutputStream0.isReady();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream((StreamSinkChannel) null, (Executor) null);
      // Undeclared exception!
      try { 
        upgradeServletOutputStream0.closeBlocking();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.undertow.servlet.spec.UpgradeServletOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(nullStreamSinkChannel0, (Executor) null);
      upgradeServletOutputStream0.write((-368));
      upgradeServletOutputStream0.close();
      upgradeServletOutputStream0.close();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream((StreamSinkChannel) null, (Executor) null);
      // Undeclared exception!
      try { 
        upgradeServletOutputStream0.flush();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.xnio.channels.Channels", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      XnioIoThread.currentThread();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(nullStreamSinkChannel0, (Executor) null);
      upgradeServletOutputStream0.closeBlocking();
      upgradeServletOutputStream0.close();
      UpgradeServletOutputStream upgradeServletOutputStream1 = new UpgradeServletOutputStream(nullStreamSinkChannel0, (Executor) null);
      try { 
        upgradeServletOutputStream1.write(99);
        fail("Expecting exception: ClosedChannelException");
      
      } catch(ClosedChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.xnio.channels.NullStreamSinkChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      XnioIoThread.currentThread();
      FileSystemHandling fileSystemHandling0 = new FileSystemHandling();
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(nullStreamSinkChannel0, (Executor) null);
      upgradeServletOutputStream0.closeBlocking();
      upgradeServletOutputStream0.closeBlocking();
      // Undeclared exception!
      try { 
        upgradeServletOutputStream0.isReady();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(nullStreamSinkChannel0, (Executor) null);
      nullStreamSinkChannel0.close();
      try { 
        upgradeServletOutputStream0.write(51);
        fail("Expecting exception: ClosedChannelException");
      
      } catch(ClosedChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.xnio.channels.NullStreamSinkChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(nullStreamSinkChannel0, (Executor) null);
      UpgradeServletOutputStream upgradeServletOutputStream1 = new UpgradeServletOutputStream(nullStreamSinkChannel0, (Executor) null);
      upgradeServletOutputStream1.closeBlocking();
      upgradeServletOutputStream0.flush();
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)4;
      byteArray0[1] = (byte)4;
      byteArray0[2] = (byte)4;
      byteArray0[3] = (byte)4;
      byteArray0[5] = (byte)4;
      byteArray0[6] = (byte)4;
      byteArray0[8] = (byte)4;
      try { 
        upgradeServletOutputStream0.write(byteArray0);
        fail("Expecting exception: ClosedChannelException");
      
      } catch(ClosedChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.xnio.channels.NullStreamSinkChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(nullStreamSinkChannel0, (Executor) null);
      UpgradeServletOutputStream upgradeServletOutputStream1 = new UpgradeServletOutputStream(nullStreamSinkChannel0, (Executor) null);
      upgradeServletOutputStream1.closeBlocking();
      upgradeServletOutputStream0.flush();
      byte[] byteArray0 = new byte[5];
      try { 
        upgradeServletOutputStream0.write(byteArray0, 1, 1);
        fail("Expecting exception: ClosedChannelException");
      
      } catch(ClosedChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.xnio.channels.NullStreamSinkChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      XnioIoThread xnioIoThread0 = null;
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(nullStreamSinkChannel0, (Executor) null);
      UpgradeServletOutputStream upgradeServletOutputStream1 = new UpgradeServletOutputStream(nullStreamSinkChannel0, (Executor) null);
      upgradeServletOutputStream1.closeBlocking();
      upgradeServletOutputStream0.flush();
      byte[] byteArray0 = new byte[5];
      byte byte0 = (byte)52;
      try { 
        upgradeServletOutputStream1.write(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      XnioIoThread.currentThread();
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      SplitStreamSinkChannel splitStreamSinkChannel0 = new SplitStreamSinkChannel(nullStreamSinkChannel0, false);
      MockThread.dumpStack();
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(splitStreamSinkChannel0, (Executor) null);
      MockThread.getDefaultUncaughtExceptionHandler();
      byte[] byteArray0 = new byte[6];
      byteArray0[0] = (byte)58;
      byteArray0[1] = (byte)127;
      byteArray0[2] = (byte) (-62);
      byteArray0[3] = (byte)97;
      byteArray0[4] = (byte) (-18);
      byteArray0[5] = (byte)1;
      upgradeServletOutputStream0.write(byteArray0);
      MockThread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler) null);
      upgradeServletOutputStream0.write((int) (byte) (-18));
      upgradeServletOutputStream0.println(0L);
      // Undeclared exception!
      try { 
        upgradeServletOutputStream0.isReady();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      XnioIoThread.currentThread();
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      SplitStreamSinkChannel splitStreamSinkChannel0 = new SplitStreamSinkChannel(nullStreamSinkChannel0, true);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(splitStreamSinkChannel0, (Executor) null);
      upgradeServletOutputStream0.flush();
      byte[] byteArray0 = new byte[8];
      UnpooledByteBufAllocator unpooledByteBufAllocator0 = new UnpooledByteBufAllocator(true, false);
      EmptyByteBuf emptyByteBuf0 = new EmptyByteBuf(unpooledByteBufAllocator0);
      ByteBuffer byteBuffer0 = emptyByteBuf0.internalNioBuffer(0, 0);
      splitStreamSinkChannel0.write(byteBuffer0);
      byteArray0[0] = (byte) (-62);
      byteArray0[1] = (byte) (-24);
      byteArray0[2] = (byte)109;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)2;
      byteArray0[5] = (byte) (-112);
      WriteListener writeListener0 = mock(WriteListener.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        upgradeServletOutputStream0.setWriteListener(writeListener0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.undertow.servlet.spec.UpgradeServletOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream((StreamSinkChannel) null, (Executor) null);
      // Undeclared exception!
      try { 
        upgradeServletOutputStream0.close();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.undertow.servlet.spec.UpgradeServletOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(nullStreamSinkChannel0, (Executor) null);
      // Undeclared exception!
      try { 
        upgradeServletOutputStream0.setWriteListener((WriteListener) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      XnioIoThread.currentThread();
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      SplitStreamSinkChannel splitStreamSinkChannel0 = new SplitStreamSinkChannel(nullStreamSinkChannel0, true);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(splitStreamSinkChannel0, (Executor) null);
      upgradeServletOutputStream0.flush();
      byte[] byteArray0 = new byte[8];
      UnpooledByteBufAllocator unpooledByteBufAllocator0 = new UnpooledByteBufAllocator(true, false);
      EmptyByteBuf emptyByteBuf0 = new EmptyByteBuf(unpooledByteBufAllocator0);
      ByteBuffer byteBuffer0 = emptyByteBuf0.internalNioBuffer(0, 0);
      splitStreamSinkChannel0.write(byteBuffer0);
      byteArray0[0] = (byte) (-62);
      byteArray0[1] = (byte) (-24);
      byteArray0[2] = (byte)109;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)2;
      byteArray0[5] = (byte) (-112);
      byteArray0[6] = (byte)52;
      byteArray0[7] = (byte) (-111);
      upgradeServletOutputStream0.write(byteArray0);
      byte[] byteArray1 = new byte[2];
      byteArray1[0] = (byte)2;
      byteArray1[1] = (byte)0;
      upgradeServletOutputStream0.write(byteArray1, 0, 0);
      assertArrayEquals(new byte[] {(byte)2, (byte)0}, byteArray1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(nullStreamSinkChannel0, (Executor) null);
      upgradeServletOutputStream0.println(4);
      // Undeclared exception!
      try { 
        upgradeServletOutputStream0.write((byte[]) null, 1, 1);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.HeapByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(nullStreamSinkChannel0, (Executor) null);
      upgradeServletOutputStream0.close();
      byte[] byteArray0 = new byte[0];
      try { 
        upgradeServletOutputStream0.write(byteArray0, (-153), (-153));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(nullStreamSinkChannel0, (Executor) null);
      upgradeServletOutputStream0.println(0.0F);
      upgradeServletOutputStream0.closeBlocking();
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte)0;
      byteArray0[1] = (byte)0;
      byteArray0[2] = (byte)7;
      byteArray0[3] = (byte) (-39);
      byteArray0[4] = (byte)1;
      byteArray0[5] = (byte)0;
      byteArray0[6] = (byte) (-51);
      byteArray0[7] = (byte)0;
      byteArray0[8] = (byte)102;
      try { 
        upgradeServletOutputStream0.write(byteArray0, (-3983), (-3983));
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(nullStreamSinkChannel0, (Executor) null);
      UpgradeServletOutputStream upgradeServletOutputStream1 = new UpgradeServletOutputStream(nullStreamSinkChannel0, (Executor) null);
      // Undeclared exception!
      try { 
        upgradeServletOutputStream1.write((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.undertow.servlet.spec.UpgradeServletOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(nullStreamSinkChannel0, (Executor) null);
      upgradeServletOutputStream0.flush();
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      XnioIoThread.currentThread();
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      SplitStreamSinkChannel splitStreamSinkChannel0 = new SplitStreamSinkChannel(nullStreamSinkChannel0, true);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(splitStreamSinkChannel0, (Executor) null);
      upgradeServletOutputStream0.flush();
      byte[] byteArray0 = new byte[8];
      UnpooledByteBufAllocator unpooledByteBufAllocator0 = new UnpooledByteBufAllocator(true, false);
      EmptyByteBuf emptyByteBuf0 = new EmptyByteBuf(unpooledByteBufAllocator0);
      ByteBuffer byteBuffer0 = emptyByteBuf0.internalNioBuffer(0, 0);
      splitStreamSinkChannel0.write(byteBuffer0);
      byteArray0[0] = (byte) (-62);
      byteArray0[1] = (byte) (-24);
      byteArray0[2] = (byte)109;
      byteArray0[3] = (byte)0;
      byteArray0[4] = (byte)2;
      byteArray0[5] = (byte) (-112);
      byteArray0[6] = (byte)52;
      byteArray0[7] = (byte) (-111);
      upgradeServletOutputStream0.write(byteArray0);
      upgradeServletOutputStream0.close();
      try { 
        upgradeServletOutputStream0.write((int) (byte)2);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(nullStreamSinkChannel0, (Executor) null);
      upgradeServletOutputStream0.closeBlocking();
      try { 
        upgradeServletOutputStream0.write(255);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream((StreamSinkChannel) null, (Executor) null);
      // Undeclared exception!
      try { 
        upgradeServletOutputStream0.write(1362);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.xnio.channels.Channels", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      ForkJoinPool forkJoinPool0 = new ForkJoinPool(4);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream((StreamSinkChannel) null, forkJoinPool0);
      // Undeclared exception!
      try { 
        upgradeServletOutputStream0.write((-2));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.xnio.channels.Channels", e);
      }
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(nullStreamSinkChannel0, (Executor) null);
      upgradeServletOutputStream0.closeBlocking();
      try { 
        upgradeServletOutputStream0.flush();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      XnioIoThread.currentThread();
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(nullStreamSinkChannel0, (Executor) null);
      upgradeServletOutputStream0.closeBlocking();
      try { 
        upgradeServletOutputStream0.flush();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream((StreamSinkChannel) null, (Executor) null);
      long long0 = 0L;
      byte[] byteArray0 = null;
      WriteListener writeListener0 = null;
      // Undeclared exception!
      try { 
        upgradeServletOutputStream0.setWriteListener((WriteListener) null);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.HOURS;
      LinkedTransferQueue<Runnable> linkedTransferQueue0 = new LinkedTransferQueue<Runnable>();
      ThreadPoolExecutor.DiscardOldestPolicy threadPoolExecutor_DiscardOldestPolicy0 = new ThreadPoolExecutor.DiscardOldestPolicy();
      ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(2114, 2114, 2114, timeUnit0, linkedTransferQueue0, threadPoolExecutor_DiscardOldestPolicy0);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream((StreamSinkChannel) null, threadPoolExecutor0);
      WriteListener writeListener0 = mock(WriteListener.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        upgradeServletOutputStream0.setWriteListener(writeListener0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.undertow.servlet.spec.UpgradeServletOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(nullStreamSinkChannel0, (Executor) null);
      WriteListener writeListener0 = mock(WriteListener.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        upgradeServletOutputStream0.setWriteListener(writeListener0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.undertow.servlet.spec.UpgradeServletOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(nullStreamSinkChannel0, (Executor) null);
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        upgradeServletOutputStream0.write(byteArray0, (-1747), 1);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      XnioIoThread.currentThread();
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream((StreamSinkChannel) null, (Executor) null);
      byte[] byteArray0 = new byte[3];
      byteArray0[0] = (byte) (-2);
      byteArray0[1] = (byte)5;
      byteArray0[2] = (byte)0;
      // Undeclared exception!
      try { 
        upgradeServletOutputStream0.write(byteArray0, (int) (byte)0, 4824);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(nullStreamSinkChannel0, (Executor) null);
      // Undeclared exception!
      try { 
        upgradeServletOutputStream0.isReady();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
      }
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      XnioIoThread.currentThread();
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      SplitStreamSinkChannel splitStreamSinkChannel0 = new SplitStreamSinkChannel(nullStreamSinkChannel0, false);
      MockThread.dumpStack();
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(splitStreamSinkChannel0, (Executor) null);
      MockThread.getDefaultUncaughtExceptionHandler();
      MockThread.setDefaultUncaughtExceptionHandler((Thread.UncaughtExceptionHandler) null);
      upgradeServletOutputStream0.println(0L);
      // Undeclared exception!
      try { 
        upgradeServletOutputStream0.isReady();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
      }
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(nullStreamSinkChannel0, (Executor) null);
      upgradeServletOutputStream0.write((-1400));
  }
}
