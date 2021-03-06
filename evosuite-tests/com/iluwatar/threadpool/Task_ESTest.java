/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 13:32:12 GMT 2021
 */

package com.iluwatar.threadpool;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.threadpool.CoffeeMakingTask;
import com.iluwatar.threadpool.PotatoPeelingTask;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Task_ESTest extends Task_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PotatoPeelingTask potatoPeelingTask0 = new PotatoPeelingTask((-1417));
      potatoPeelingTask0.toString();
      //  // Unstable assertion: assertEquals(29, potatoPeelingTask0.getId());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CoffeeMakingTask coffeeMakingTask0 = new CoffeeMakingTask(0);
      int int0 = coffeeMakingTask0.getTimeMs();
      //  // Unstable assertion: assertEquals(22, coffeeMakingTask0.getId());
      //  // Unstable assertion: assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      PotatoPeelingTask potatoPeelingTask0 = new PotatoPeelingTask(174);
      int int0 = potatoPeelingTask0.getTimeMs();
      assertEquals(34800, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      PotatoPeelingTask potatoPeelingTask0 = new PotatoPeelingTask((-1417));
      int int0 = potatoPeelingTask0.getId();
      //  // Unstable assertion: assertEquals(8, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      PotatoPeelingTask potatoPeelingTask0 = new PotatoPeelingTask((-1656));
      int int0 = potatoPeelingTask0.getTimeMs();
      assertEquals((-331200), int0);
  }
}
