/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 03:21:59 GMT 2021
 */

package com.iluwatar.circuitbreaker;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.circuitbreaker.QuickRemoteService;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class QuickRemoteService_ESTest extends QuickRemoteService_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      QuickRemoteService quickRemoteService0 = new QuickRemoteService();
      String string0 = quickRemoteService0.call();
      assertEquals("Quick Service is working", string0);
  }
}