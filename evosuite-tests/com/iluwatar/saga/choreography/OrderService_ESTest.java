/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 12:05:54 GMT 2021
 */

package com.iluwatar.saga.choreography;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.saga.choreography.OrderService;
import com.iluwatar.saga.choreography.ServiceDiscoveryService;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class OrderService_ESTest extends OrderService_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OrderService orderService0 = new OrderService((ServiceDiscoveryService) null);
      String string0 = orderService0.getName();
      assertEquals("init an order", string0);
  }
}