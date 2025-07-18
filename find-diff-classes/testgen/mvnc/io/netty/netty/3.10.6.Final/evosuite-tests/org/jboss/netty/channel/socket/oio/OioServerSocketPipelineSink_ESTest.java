/*
 * This file was automatically generated by EvoSuite
 * Fri Nov 08 03:25:24 GMT 2024
 */

package org.jboss.netty.channel.socket.oio;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.concurrent.Callable;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.ForkJoinTask;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockThread;
import org.jboss.netty.channel.ChannelEvent;
import org.jboss.netty.channel.ChannelFactory;
import org.jboss.netty.channel.ChannelFuture;
import org.jboss.netty.channel.ChannelPipeline;
import org.jboss.netty.channel.ChannelState;
import org.jboss.netty.channel.DefaultChannelPipeline;
import org.jboss.netty.channel.DownstreamChannelStateEvent;
import org.jboss.netty.channel.UpstreamChannelStateEvent;
import org.jboss.netty.channel.socket.oio.OioServerSocketChannel;
import org.jboss.netty.channel.socket.oio.OioServerSocketChannelFactory;
import org.jboss.netty.channel.socket.oio.OioServerSocketPipelineSink;
import org.jboss.netty.util.ThreadNameDeterminer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class OioServerSocketPipelineSink_ESTest extends OioServerSocketPipelineSink_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ForkJoinPool forkJoinPool0 = ForkJoinPool.commonPool();
      ThreadNameDeterminer threadNameDeterminer0 = mock(ThreadNameDeterminer.class, new ViolatedAssumptionAnswer());
      OioServerSocketPipelineSink oioServerSocketPipelineSink0 = new OioServerSocketPipelineSink(forkJoinPool0, threadNameDeterminer0);
      DefaultChannelPipeline defaultChannelPipeline0 = new DefaultChannelPipeline();
      try { 
        oioServerSocketPipelineSink0.eventSunk(defaultChannelPipeline0, (ChannelEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.jboss.netty.channel.socket.oio.OioServerSocketPipelineSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ThreadPoolExecutor.CallerRunsPolicy threadPoolExecutor_CallerRunsPolicy0 = new ThreadPoolExecutor.CallerRunsPolicy();
      ScheduledThreadPoolExecutor scheduledThreadPoolExecutor0 = new ScheduledThreadPoolExecutor(38, threadPoolExecutor_CallerRunsPolicy0);
      Callable<ForkJoinTask<Object>> callable0 = (Callable<ForkJoinTask<Object>>) mock(Callable.class, new ViolatedAssumptionAnswer());
      doReturn((Object) null).when(callable0).call();
      scheduledThreadPoolExecutor0.submit(callable0);
      ThreadNameDeterminer threadNameDeterminer0 = mock(ThreadNameDeterminer.class, new ViolatedAssumptionAnswer());
      OioServerSocketPipelineSink oioServerSocketPipelineSink0 = new OioServerSocketPipelineSink(scheduledThreadPoolExecutor0, threadNameDeterminer0);
      DefaultChannelPipeline defaultChannelPipeline0 = new DefaultChannelPipeline();
      OioServerSocketChannelFactory oioServerSocketChannelFactory0 = new OioServerSocketChannelFactory(scheduledThreadPoolExecutor0, scheduledThreadPoolExecutor0);
      OioServerSocketChannel oioServerSocketChannel0 = new OioServerSocketChannel(oioServerSocketChannelFactory0, defaultChannelPipeline0, oioServerSocketPipelineSink0);
      MockThread mockThread0 = new MockThread();
      ChannelFuture channelFuture0 = oioServerSocketPipelineSink0.execute(defaultChannelPipeline0, mockThread0);
      oioServerSocketChannelFactory0.releaseExternalResources();
      ChannelState channelState0 = ChannelState.BOUND;
      DownstreamChannelStateEvent downstreamChannelStateEvent0 = new DownstreamChannelStateEvent(oioServerSocketChannel0, channelFuture0, channelState0, threadPoolExecutor_CallerRunsPolicy0);
      try { 
        oioServerSocketPipelineSink0.eventSunk(defaultChannelPipeline0, downstreamChannelStateEvent0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.util.concurrent.ThreadPoolExecutor$CallerRunsPolicy cannot be cast to java.net.SocketAddress
         //
         verifyException("org.jboss.netty.channel.socket.oio.OioServerSocketPipelineSink", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TimeUnit timeUnit0 = TimeUnit.DAYS;
      LinkedTransferQueue<Runnable> linkedTransferQueue0 = new LinkedTransferQueue<Runnable>();
      ThreadFactory threadFactory0 = mock(ThreadFactory.class, new ViolatedAssumptionAnswer());
      ThreadPoolExecutor threadPoolExecutor0 = new ThreadPoolExecutor(40, 1996, 1996, timeUnit0, linkedTransferQueue0, threadFactory0);
      DefaultChannelPipeline defaultChannelPipeline0 = new DefaultChannelPipeline();
      ThreadNameDeterminer threadNameDeterminer0 = mock(ThreadNameDeterminer.class, new ViolatedAssumptionAnswer());
      OioServerSocketPipelineSink oioServerSocketPipelineSink0 = new OioServerSocketPipelineSink(threadPoolExecutor0, threadNameDeterminer0);
      OioServerSocketChannel oioServerSocketChannel0 = new OioServerSocketChannel((ChannelFactory) null, defaultChannelPipeline0, oioServerSocketPipelineSink0);
      oioServerSocketChannel0.getParent();
      ChannelState channelState0 = ChannelState.OPEN;
      Object object0 = new Object();
      UpstreamChannelStateEvent upstreamChannelStateEvent0 = new UpstreamChannelStateEvent(oioServerSocketChannel0, channelState0, object0);
      UpstreamChannelStateEvent upstreamChannelStateEvent1 = new UpstreamChannelStateEvent(oioServerSocketChannel0, channelState0, object0);
      oioServerSocketPipelineSink0.eventSunk((ChannelPipeline) null, upstreamChannelStateEvent1);
      assertEquals(0, (int)oioServerSocketChannel0.getId());
      assertTrue(oioServerSocketChannel0.isOpen());
  }
}
