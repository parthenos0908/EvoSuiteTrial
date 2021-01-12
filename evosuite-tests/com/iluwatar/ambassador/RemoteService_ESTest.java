/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 02:33:55 GMT 2021
 */

package com.iluwatar.ambassador;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.ambassador.RemoteService;
import com.iluwatar.ambassador.util.RandomProvider;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RemoteService_ESTest extends RemoteService_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RemoteService remoteService0 = RemoteService.getRemoteService();
      remoteService0.doRemoteFunction((-504));
      remoteService0.doRemoteFunction(763);
      RemoteService.getRemoteService();
      RemoteService remoteService1 = RemoteService.getRemoteService();
      remoteService1.doRemoteFunction(200);
      RemoteService remoteService2 = RemoteService.getRemoteService();
      RemoteService.getRemoteService();
      remoteService2.doRemoteFunction(763);
      RemoteService.getRemoteService();
      RemoteService.getRemoteService();
      remoteService0.doRemoteFunction(763);
      RemoteService remoteService3 = RemoteService.getRemoteService();
      RemoteService remoteService4 = RemoteService.getRemoteService();
      assertSame(remoteService4, remoteService3);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RandomProvider randomProvider0 = mock(RandomProvider.class, new ViolatedAssumptionAnswer());
      doReturn(0.0).when(randomProvider0).random();
      RemoteService remoteService0 = new RemoteService(randomProvider0);
      long long0 = remoteService0.doRemoteFunction(0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RemoteService remoteService0 = new RemoteService((RandomProvider) null);
      // Undeclared exception!
      try { 
        remoteService0.doRemoteFunction(4340);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.ambassador.util.RandomProvider.random()\" because \"this.randomProvider\" is null
         //
         verifyException("com.iluwatar.ambassador.RemoteService", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RandomProvider randomProvider0 = mock(RandomProvider.class, new ViolatedAssumptionAnswer());
      doReturn((-5.427)).when(randomProvider0).random();
      RemoteService remoteService0 = new RemoteService(randomProvider0);
      // Undeclared exception!
      try { 
        remoteService0.doRemoteFunction((-1));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // timeout value is negative
         //
         verifyException("java.lang.Thread", e);
      }
  }
}
