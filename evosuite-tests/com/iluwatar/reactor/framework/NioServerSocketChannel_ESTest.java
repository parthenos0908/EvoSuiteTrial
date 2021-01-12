/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 11:40:42 GMT 2021
 */

package com.iluwatar.reactor.framework;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.reactor.app.LoggingHandler;
import com.iluwatar.reactor.framework.NioServerSocketChannel;
import java.nio.channels.SelectionKey;
import java.nio.channels.ServerSocketChannel;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NioServerSocketChannel_ESTest extends NioServerSocketChannel_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LoggingHandler loggingHandler0 = new LoggingHandler();
      NioServerSocketChannel nioServerSocketChannel0 = new NioServerSocketChannel((-1935), loggingHandler0);
      // Undeclared exception!
      try { 
        nioServerSocketChannel0.read((SelectionKey) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"java.nio.channels.SelectionKey.channel()\" because \"key\" is null
         //
         verifyException("com.iluwatar.reactor.framework.NioServerSocketChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LoggingHandler loggingHandler0 = new LoggingHandler();
      NioServerSocketChannel nioServerSocketChannel0 = new NioServerSocketChannel(0, loggingHandler0);
      // Undeclared exception!
      try { 
        nioServerSocketChannel0.doWrite(loggingHandler0, (SelectionKey) null);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class com.iluwatar.reactor.app.LoggingHandler cannot be cast to class java.nio.ByteBuffer (com.iluwatar.reactor.app.LoggingHandler is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @46569971; java.nio.ByteBuffer is in module java.base of loader 'bootstrap')
         //
         verifyException("com.iluwatar.reactor.framework.NioServerSocketChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LoggingHandler loggingHandler0 = new LoggingHandler();
      NioServerSocketChannel nioServerSocketChannel0 = new NioServerSocketChannel((-1), loggingHandler0);
      ServerSocketChannel serverSocketChannel0 = nioServerSocketChannel0.getJavaChannel();
      assertEquals(16, serverSocketChannel0.validOps());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LoggingHandler loggingHandler0 = new LoggingHandler();
      NioServerSocketChannel nioServerSocketChannel0 = new NioServerSocketChannel(0, loggingHandler0);
      // Undeclared exception!
      try { 
        nioServerSocketChannel0.doWrite((Object) null, (SelectionKey) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"java.nio.channels.SelectionKey.channel()\" because \"key\" is null
         //
         verifyException("com.iluwatar.reactor.framework.NioServerSocketChannel", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LoggingHandler loggingHandler0 = new LoggingHandler();
      NioServerSocketChannel nioServerSocketChannel0 = new NioServerSocketChannel((-1710), loggingHandler0);
      // Undeclared exception!
      try { 
        nioServerSocketChannel0.bind();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // port out of range:-1710
         //
         verifyException("java.net.InetSocketAddress", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LoggingHandler loggingHandler0 = new LoggingHandler();
      NioServerSocketChannel nioServerSocketChannel0 = new NioServerSocketChannel((-1), loggingHandler0);
      int int0 = nioServerSocketChannel0.getInterestedOps();
      assertEquals(16, int0);
  }
}
