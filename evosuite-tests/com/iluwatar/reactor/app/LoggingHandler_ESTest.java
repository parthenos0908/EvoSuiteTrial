/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 11:35:57 GMT 2021
 */

package com.iluwatar.reactor.app;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.reactor.app.LoggingHandler;
import com.iluwatar.reactor.framework.AbstractNioChannel;
import com.iluwatar.reactor.framework.NioDatagramChannel;
import com.iluwatar.reactor.framework.NioServerSocketChannel;
import java.nio.ByteBuffer;
import java.nio.ReadOnlyBufferException;
import java.nio.channels.SelectableChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.ServerSocketChannel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LoggingHandler_ESTest extends LoggingHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1440);
      ByteBuffer byteBuffer1 = byteBuffer0.asReadOnlyBuffer();
      LoggingHandler loggingHandler0 = new LoggingHandler();
      // Undeclared exception!
      try { 
        loggingHandler0.handleChannelRead((AbstractNioChannel) null, byteBuffer1, (SelectionKey) null);
        fail("Expecting exception: ReadOnlyBufferException");
      
      } catch(ReadOnlyBufferException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocateDirect(1515);
      LoggingHandler loggingHandler0 = new LoggingHandler();
      NioServerSocketChannel nioServerSocketChannel0 = new NioServerSocketChannel(1515, loggingHandler0);
      // Undeclared exception!
      try { 
        loggingHandler0.handleChannelRead(nioServerSocketChannel0, byteBuffer0, (SelectionKey) null);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.nio.ByteBuffer", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LoggingHandler loggingHandler0 = new LoggingHandler();
      NioServerSocketChannel nioServerSocketChannel0 = new NioServerSocketChannel((-1104), loggingHandler0);
      byte[] byteArray0 = new byte[9];
      ByteBuffer byteBuffer0 = ByteBuffer.wrap(byteArray0);
      NioDatagramChannel.DatagramPacket nioDatagramChannel_DatagramPacket0 = new NioDatagramChannel.DatagramPacket(byteBuffer0);
      ServerSocketChannel serverSocketChannel0 = nioServerSocketChannel0.getJavaChannel();
      SelectionKey selectionKey0 = mock(SelectionKey.class, new ViolatedAssumptionAnswer());
      doReturn(serverSocketChannel0, (SelectableChannel) null).when(selectionKey0).channel();
      // Undeclared exception!
      try { 
        loggingHandler0.handleChannelRead(nioServerSocketChannel0, nioDatagramChannel_DatagramPacket0, selectionKey0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LoggingHandler loggingHandler0 = new LoggingHandler();
      // Undeclared exception!
      try { 
        loggingHandler0.handleChannelRead((AbstractNioChannel) null, (Object) null, (SelectionKey) null);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Unknown data received
         //
         verifyException("com.iluwatar.reactor.app.LoggingHandler", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ByteBuffer byteBuffer0 = ByteBuffer.allocate(1516);
      LoggingHandler loggingHandler0 = new LoggingHandler();
      NioServerSocketChannel nioServerSocketChannel0 = new NioServerSocketChannel(1516, loggingHandler0);
      // Undeclared exception!
      try { 
        loggingHandler0.handleChannelRead(nioServerSocketChannel0, byteBuffer0, (SelectionKey) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"java.nio.channels.SelectionKey.channel()\" because \"key\" is null
         //
         verifyException("com.iluwatar.reactor.framework.AbstractNioChannel", e);
      }
  }
}
