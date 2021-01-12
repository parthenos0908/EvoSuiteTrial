/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 12:10:31 GMT 2021
 */

package com.iluwatar.saga.choreography;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.saga.choreography.Saga;
import com.iluwatar.saga.choreography.ServiceDiscoveryService;
import com.iluwatar.saga.choreography.WithdrawMoneyService;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class WithdrawMoneyService_ESTest extends WithdrawMoneyService_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ServiceDiscoveryService serviceDiscoveryService0 = new ServiceDiscoveryService();
      WithdrawMoneyService withdrawMoneyService0 = new WithdrawMoneyService(serviceDiscoveryService0);
      // Undeclared exception!
      try { 
        withdrawMoneyService0.process((Saga) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.saga.choreography.Saga.getCurrentValue()\" because \"saga\" is null
         //
         verifyException("com.iluwatar.saga.choreography.WithdrawMoneyService", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ServiceDiscoveryService serviceDiscoveryService0 = new ServiceDiscoveryService();
      WithdrawMoneyService withdrawMoneyService0 = new WithdrawMoneyService(serviceDiscoveryService0);
      Saga saga0 = Saga.create();
      // Undeclared exception!
      try { 
        withdrawMoneyService0.process(saga0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ServiceDiscoveryService serviceDiscoveryService0 = new ServiceDiscoveryService();
      WithdrawMoneyService withdrawMoneyService0 = new WithdrawMoneyService(serviceDiscoveryService0);
      String string0 = withdrawMoneyService0.getName();
      assertEquals("withdrawing Money", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ServiceDiscoveryService serviceDiscoveryService0 = new ServiceDiscoveryService();
      Saga saga0 = Saga.create();
      Saga saga1 = saga0.chapter((String) null);
      WithdrawMoneyService withdrawMoneyService0 = new WithdrawMoneyService(serviceDiscoveryService0);
      saga0.setCurrentValue(saga1);
      withdrawMoneyService0.process(saga0);
      assertEquals("withdrawing Money", withdrawMoneyService0.getName());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ServiceDiscoveryService serviceDiscoveryService0 = new ServiceDiscoveryService();
      WithdrawMoneyService withdrawMoneyService0 = new WithdrawMoneyService(serviceDiscoveryService0);
      Saga saga0 = Saga.create();
      Saga saga1 = saga0.chapter("withdrawing Money");
      saga1.setCurrentValue("bad_order");
      withdrawMoneyService0.process(saga1);
      assertEquals("withdrawing Money", withdrawMoneyService0.getName());
  }
}
