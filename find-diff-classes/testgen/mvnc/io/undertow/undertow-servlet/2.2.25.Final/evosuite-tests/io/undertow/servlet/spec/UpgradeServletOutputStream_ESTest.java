/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 10 22:46:36 GMT 2024
 */

package io.undertow.servlet.spec;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import io.undertow.servlet.spec.UpgradeServletOutputStream;
import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import java.util.concurrent.Executor;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import javax.servlet.WriteListener;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.jboss.threads.JBossThreadFactory;
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
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(nullStreamSinkChannel0, (Executor) null);
      upgradeServletOutputStream0.closeBlocking();
      upgradeServletOutputStream0.closeBlocking();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(nullStreamSinkChannel0, (Executor) null);
      upgradeServletOutputStream0.close();
      upgradeServletOutputStream0.close();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      SplitStreamSinkChannel splitStreamSinkChannel0 = new SplitStreamSinkChannel(nullStreamSinkChannel0, false);
      ThreadGroup threadGroup0 = mock(ThreadGroup.class, new ViolatedAssumptionAnswer());
      Boolean boolean0 = Boolean.TRUE;
      Integer integer0 = new Integer(4);
      Long long0 = new Long(4);
      JBossThreadFactory jBossThreadFactory0 = new JBossThreadFactory(threadGroup0, boolean0, integer0, "H2_d", threadGroup0, long0);
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(4, jBossThreadFactory0);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(splitStreamSinkChannel0, scheduledThreadPoolExecutor0);
      WriteListener writeListener0 = mock(WriteListener.class, new ViolatedAssumptionAnswer());
      upgradeServletOutputStream0.setWriteListener(writeListener0);
      upgradeServletOutputStream0.close();
      boolean boolean1 = upgradeServletOutputStream0.isReady();
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(nullStreamSinkChannel0, (Executor) null);
      Long long0 = new Long(2593L);
      ThreadGroup threadGroup0 = mock(ThreadGroup.class, new ViolatedAssumptionAnswer());
      Boolean boolean0 = Boolean.valueOf(">\"bcsIj");
      JBossThreadFactory jBossThreadFactory0 = new JBossThreadFactory(threadGroup0, boolean0, (Integer) null, ">\"bcsIj", threadGroup0, long0);
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(132, jBossThreadFactory0);
      UpgradeServletOutputStream upgradeServletOutputStream1 = new UpgradeServletOutputStream(nullStreamSinkChannel0, scheduledThreadPoolExecutor0);
      WriteListener writeListener0 = mock(WriteListener.class, new ViolatedAssumptionAnswer());
      upgradeServletOutputStream1.setWriteListener(writeListener0);
      upgradeServletOutputStream0.close();
      byte[] byteArray0 = new byte[7];
      try { 
        upgradeServletOutputStream1.write(byteArray0, (-4477), (int) (byte)1);
        fail("Expecting exception: ClosedChannelException");
      
      } catch(ClosedChannelException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.xnio.channels.NullStreamSinkChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(nullStreamSinkChannel0, (Executor) null);
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
  public void test05()  throws Throwable  {
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(nullStreamSinkChannel0, (Executor) null);
      byte[] byteArray0 = new byte[0];
      // Undeclared exception!
      try { 
        upgradeServletOutputStream0.write(byteArray0, (-1396), (-1396));
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(nullStreamSinkChannel0, (Executor) null);
      byte[] byteArray0 = new byte[8];
      nullStreamSinkChannel0.shutdownWrites();
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
  public void test07()  throws Throwable  {
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream((StreamSinkChannel) null, (Executor) null);
      // Undeclared exception!
      try { 
        upgradeServletOutputStream0.write((byte[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("io.undertow.servlet.spec.UpgradeServletOutputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(nullStreamSinkChannel0, (Executor) null);
      upgradeServletOutputStream0.close();
      UpgradeServletOutputStream upgradeServletOutputStream1 = new UpgradeServletOutputStream(nullStreamSinkChannel0, (Executor) null);
      try { 
        upgradeServletOutputStream1.write(1517);
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
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream((StreamSinkChannel) null, (Executor) null);
      // Undeclared exception!
      try { 
        upgradeServletOutputStream0.write(574);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.xnio.channels.Channels", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      SplitStreamSinkChannel splitStreamSinkChannel0 = new SplitStreamSinkChannel(nullStreamSinkChannel0, true);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(splitStreamSinkChannel0, (Executor) null);
      upgradeServletOutputStream0.close();
      try { 
        upgradeServletOutputStream0.write(313);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
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
  public void test12()  throws Throwable  {
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      Long long0 = new Long(2593L);
      ThreadGroup threadGroup0 = mock(ThreadGroup.class, new ViolatedAssumptionAnswer());
      Boolean boolean0 = Boolean.valueOf("");
      Integer integer0 = new Integer(0);
      JBossThreadFactory jBossThreadFactory0 = new JBossThreadFactory(threadGroup0, boolean0, integer0, ">\"bcsIj", threadGroup0, long0);
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(0, jBossThreadFactory0);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(nullStreamSinkChannel0, scheduledThreadPoolExecutor0);
      WriteListener writeListener0 = mock(WriteListener.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        upgradeServletOutputStream0.setWriteListener(writeListener0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.lang.Thread", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
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
  public void test14()  throws Throwable  {
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
  public void test15()  throws Throwable  {
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
  public void test16()  throws Throwable  {
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(nullStreamSinkChannel0, (Executor) null);
      upgradeServletOutputStream0.println();
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(nullStreamSinkChannel0, (Executor) null);
      upgradeServletOutputStream0.closeBlocking();
      try { 
        upgradeServletOutputStream0.write((byte[]) null, 2, 2);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
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
  public void test19()  throws Throwable  {
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
  public void test20()  throws Throwable  {
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      Long long0 = new Long(2593L);
      ThreadGroup threadGroup0 = mock(ThreadGroup.class, new ViolatedAssumptionAnswer());
      Boolean boolean0 = Boolean.valueOf(">\"bcsIj");
      JBossThreadFactory jBossThreadFactory0 = new JBossThreadFactory(threadGroup0, boolean0, (Integer) null, ">\"bcsIj", threadGroup0, long0);
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(132, jBossThreadFactory0);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(nullStreamSinkChannel0, scheduledThreadPoolExecutor0);
      WriteListener writeListener0 = mock(WriteListener.class, new ViolatedAssumptionAnswer());
      upgradeServletOutputStream0.setWriteListener(writeListener0);
      boolean boolean1 = upgradeServletOutputStream0.isReady();
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      Long long0 = new Long(2593L);
      ThreadGroup threadGroup0 = mock(ThreadGroup.class, new ViolatedAssumptionAnswer());
      Boolean boolean0 = Boolean.valueOf(">\"bcsIj");
      JBossThreadFactory jBossThreadFactory0 = new JBossThreadFactory(threadGroup0, boolean0, (Integer) null, ">\"bcsIj", threadGroup0, long0);
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(132, jBossThreadFactory0);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(nullStreamSinkChannel0, scheduledThreadPoolExecutor0);
      WriteListener writeListener0 = mock(WriteListener.class, new ViolatedAssumptionAnswer());
      upgradeServletOutputStream0.setWriteListener(writeListener0);
      upgradeServletOutputStream0.close();
      upgradeServletOutputStream0.close();
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      SplitStreamSinkChannel splitStreamSinkChannel0 = new SplitStreamSinkChannel(nullStreamSinkChannel0, false);
      ThreadGroup threadGroup0 = mock(ThreadGroup.class, new ViolatedAssumptionAnswer());
      Boolean boolean0 = Boolean.TRUE;
      Integer integer0 = new Integer(4);
      Long long0 = new Long(4);
      JBossThreadFactory jBossThreadFactory0 = new JBossThreadFactory(threadGroup0, boolean0, integer0, "H2_d", threadGroup0, long0);
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(4, jBossThreadFactory0);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(splitStreamSinkChannel0, scheduledThreadPoolExecutor0);
      WriteListener writeListener0 = mock(WriteListener.class, new ViolatedAssumptionAnswer());
      upgradeServletOutputStream0.setWriteListener(writeListener0);
      upgradeServletOutputStream0.flush();
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(nullStreamSinkChannel0, (Executor) null);
      upgradeServletOutputStream0.close();
      try { 
        upgradeServletOutputStream0.flush();
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      Long long0 = new Long(2593L);
      ThreadGroup threadGroup0 = mock(ThreadGroup.class, new ViolatedAssumptionAnswer());
      Boolean boolean0 = Boolean.valueOf(">\"bcsIj");
      JBossThreadFactory jBossThreadFactory0 = new JBossThreadFactory(threadGroup0, boolean0, (Integer) null, ">\"bcsIj", threadGroup0, long0);
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(132, jBossThreadFactory0);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(nullStreamSinkChannel0, scheduledThreadPoolExecutor0);
      WriteListener writeListener0 = mock(WriteListener.class, new ViolatedAssumptionAnswer());
      upgradeServletOutputStream0.setWriteListener(writeListener0);
      byte[] byteArray0 = new byte[7];
      upgradeServletOutputStream0.write(byteArray0, (-4477), (int) (byte)1);
      assertEquals(7, byteArray0.length);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(nullStreamSinkChannel0, (Executor) null);
      upgradeServletOutputStream0.closeBlocking();
      byte[] byteArray0 = new byte[3];
      try { 
        upgradeServletOutputStream0.write(byteArray0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
      }
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      ForkJoinPool forkJoinPool0 = ForkJoinPool.commonPool();
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(nullStreamSinkChannel0, forkJoinPool0);
      WriteListener writeListener0 = mock(WriteListener.class, new ViolatedAssumptionAnswer());
      upgradeServletOutputStream0.setWriteListener(writeListener0);
      WriteListener writeListener1 = mock(WriteListener.class, new ViolatedAssumptionAnswer());
      // Undeclared exception!
      try { 
        upgradeServletOutputStream0.setWriteListener(writeListener1);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(nullStreamSinkChannel0, (Executor) null);
      upgradeServletOutputStream0.write(1517);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      NullStreamSinkChannel nullStreamSinkChannel0 = new NullStreamSinkChannel((XnioIoThread) null);
      UpgradeServletOutputStream upgradeServletOutputStream0 = new UpgradeServletOutputStream(nullStreamSinkChannel0, (Executor) null);
      byte[] byteArray0 = new byte[3];
      upgradeServletOutputStream0.write(byteArray0);
      assertEquals(3, byteArray0.length);
  }
}
