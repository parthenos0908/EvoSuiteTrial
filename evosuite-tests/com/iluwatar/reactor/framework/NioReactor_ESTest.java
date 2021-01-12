/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 11:39:34 GMT 2021
 */

package com.iluwatar.reactor.framework;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.reactor.framework.NioReactor;
import com.iluwatar.reactor.framework.SameThreadDispatcher;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NioReactor_ESTest extends NioReactor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
    Future<?> future = executor.submit(new Runnable(){ 
            @Override public void run() { 
        try {
          SameThreadDispatcher sameThreadDispatcher0 = new SameThreadDispatcher();
          NioReactor nioReactor0 = null;
          try {
            nioReactor0 = new NioReactor(sameThreadDispatcher0);
            fail("Expecting exception: SecurityException");
          
          } catch(SecurityException e) {
             //
             // Security manager blocks (\"java.net.SocketPermission\" \"localhost:0\" \"listen,resolve\")
             // java.base/java.lang.Thread.getStackTrace(Thread.java:1598)
             // org.evosuite.runtime.sandbox.MSecurityManager.checkPermission(MSecurityManager.java:433)
             // java.base/java.lang.SecurityManager.checkListen(SecurityManager.java:990)
             // java.base/sun.nio.ch.ServerSocketChannelImpl.bind(ServerSocketChannelImpl.java:247)
             // java.base/sun.nio.ch.ServerSocketAdaptor.bind(ServerSocketAdaptor.java:88)
             // java.base/sun.nio.ch.ServerSocketAdaptor.bind(ServerSocketAdaptor.java:80)
             // java.base/sun.nio.ch.PipeImpl$Initializer$LoopbackConnector.run(PipeImpl.java:121)
             // java.base/sun.nio.ch.PipeImpl$Initializer.run(PipeImpl.java:76)
             // java.base/sun.nio.ch.PipeImpl$Initializer.run(PipeImpl.java:61)
             // java.base/java.security.AccessController.doPrivileged(AccessController.java:554)
             // java.base/sun.nio.ch.PipeImpl.<init>(PipeImpl.java:171)
             // java.base/sun.nio.ch.SelectorProviderImpl.openPipe(SelectorProviderImpl.java:60)
             // java.base/java.nio.channels.Pipe.open(Pipe.java:155)
             // java.base/sun.nio.ch.WindowsSelectorImpl.<init>(WindowsSelectorImpl.java:142)
             // java.base/sun.nio.ch.WindowsSelectorProvider.openSelector(WindowsSelectorProvider.java:44)
             // java.base/java.nio.channels.Selector.open(Selector.java:295)
             // com.iluwatar.reactor.framework.NioReactor.<init>(NioReactor.java:77)
             // java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance0(Native Method)
             // java.base/jdk.internal.reflect.NativeConstructorAccessorImpl.newInstance(NativeConstructorAccessorImpl.java:64)
             // java.base/jdk.internal.reflect.DelegatingConstructorAccessorImpl.newInstance(DelegatingConstructorAccessorImpl.java:45)
             // java.base/java.lang.reflect.Constructor.newInstanceWithCaller(Constructor.java:500)
             // java.base/java.lang.reflect.Constructor.newInstance(Constructor.java:481)
             // org.evosuite.testcase.statements.ConstructorStatement$1.execute(ConstructorStatement.java:234)
             // org.evosuite.testcase.statements.AbstractStatement.exceptionHandler(AbstractStatement.java:172)
             // org.evosuite.testcase.statements.ConstructorStatement.execute(ConstructorStatement.java:189)
             // org.evosuite.testcase.execution.TestRunnable.executeStatements(TestRunnable.java:295)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:201)
             // org.evosuite.testcase.execution.TestRunnable.call(TestRunnable.java:54)
             // java.base/java.util.concurrent.FutureTask.run(FutureTask.java:264)
             // java.base/java.util.concurrent.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:1130)
             // java.base/java.util.concurrent.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:630)
             // java.base/java.lang.Thread.run(Thread.java:832)
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
}
