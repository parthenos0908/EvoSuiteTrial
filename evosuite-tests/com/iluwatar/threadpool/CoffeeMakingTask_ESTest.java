/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 13:29:59 GMT 2021
 */

package com.iluwatar.threadpool;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.threadpool.CoffeeMakingTask;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CoffeeMakingTask_ESTest extends CoffeeMakingTask_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CoffeeMakingTask coffeeMakingTask0 = new CoffeeMakingTask(100);
      coffeeMakingTask0.toString();
      assertEquals(1, coffeeMakingTask0.getId());
  }
}
