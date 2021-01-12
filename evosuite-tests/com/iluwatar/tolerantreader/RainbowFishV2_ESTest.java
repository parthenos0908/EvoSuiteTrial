/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 13:44:08 GMT 2021
 */

package com.iluwatar.tolerantreader;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.tolerantreader.RainbowFishV2;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RainbowFishV2_ESTest extends RainbowFishV2_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RainbowFishV2 rainbowFishV2_0 = new RainbowFishV2("", 1, 1, 1, true, true, true);
      boolean boolean0 = rainbowFishV2_0.getSleeping();
      assertTrue(rainbowFishV2_0.getAngry());
      assertTrue(rainbowFishV2_0.getHungry());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RainbowFishV2 rainbowFishV2_0 = new RainbowFishV2("com.iluwatar.tolerantreader.RainbowFishV2", 1145, (-1), (-739), false, true, true);
      boolean boolean0 = rainbowFishV2_0.getHungry();
      assertFalse(rainbowFishV2_0.getSleeping());
      assertTrue(rainbowFishV2_0.getAngry());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RainbowFishV2 rainbowFishV2_0 = new RainbowFishV2("JA@,", 515, 0, 0);
      boolean boolean0 = rainbowFishV2_0.getAngry();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      RainbowFishV2 rainbowFishV2_0 = new RainbowFishV2((String) null, (-1367), 1086, 1086, false, false, true);
      boolean boolean0 = rainbowFishV2_0.getAngry();
      assertFalse(rainbowFishV2_0.getHungry());
      assertFalse(rainbowFishV2_0.getSleeping());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      RainbowFishV2 rainbowFishV2_0 = new RainbowFishV2((String) null, (-1367), 1086, 1086, false, false, true);
      boolean boolean0 = rainbowFishV2_0.getHungry();
      assertTrue(rainbowFishV2_0.getAngry());
      assertFalse(rainbowFishV2_0.getSleeping());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RainbowFishV2 rainbowFishV2_0 = new RainbowFishV2("com.iluwatar.tolerantreader.RainbowFish", 0, (-754), 0);
      boolean boolean0 = rainbowFishV2_0.getSleeping();
      assertFalse(boolean0);
  }
}
