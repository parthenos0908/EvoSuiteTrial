/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 13:42:54 GMT 2021
 */

package com.iluwatar.tolerantreader;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.tolerantreader.RainbowFish;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RainbowFish_ESTest extends RainbowFish_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      RainbowFish rainbowFish0 = new RainbowFish("", 0, 0, 0);
      int int0 = rainbowFish0.getWeightTons();
      assertEquals(0, int0);
      assertEquals(0, rainbowFish0.getAge());
      assertEquals(0, rainbowFish0.getLengthMeters());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      RainbowFish rainbowFish0 = new RainbowFish("", 2499, 2157, 2499);
      int int0 = rainbowFish0.getWeightTons();
      assertEquals(2499, rainbowFish0.getAge());
      assertEquals(2157, rainbowFish0.getLengthMeters());
      assertEquals(2499, int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      RainbowFish rainbowFish0 = new RainbowFish((String) null, (-1411), (-1411), (-1411));
      rainbowFish0.getName();
      assertEquals((-1411), rainbowFish0.getWeightTons());
      assertEquals((-1411), rainbowFish0.getLengthMeters());
      assertEquals((-1411), rainbowFish0.getAge());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      RainbowFish rainbowFish0 = new RainbowFish("", 0, 0, 0);
      rainbowFish0.getName();
      assertEquals(0, rainbowFish0.getWeightTons());
      assertEquals(0, rainbowFish0.getAge());
      assertEquals(0, rainbowFish0.getLengthMeters());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      RainbowFish rainbowFish0 = new RainbowFish("", 2499, 2157, 2499);
      int int0 = rainbowFish0.getLengthMeters();
      assertEquals(2157, int0);
      assertEquals(2499, rainbowFish0.getWeightTons());
      assertEquals(2499, rainbowFish0.getAge());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      RainbowFish rainbowFish0 = new RainbowFish((String) null, (-1411), (-1411), (-1411));
      int int0 = rainbowFish0.getLengthMeters();
      assertEquals((-1411), rainbowFish0.getAge());
      assertEquals((-1411), int0);
      assertEquals((-1411), rainbowFish0.getWeightTons());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      RainbowFish rainbowFish0 = new RainbowFish("ecZtr`>vC}", 0, 0, (-1728));
      int int0 = rainbowFish0.getAge();
      assertEquals(0, rainbowFish0.getLengthMeters());
      assertEquals((-1728), rainbowFish0.getWeightTons());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RainbowFish rainbowFish0 = new RainbowFish("", 2499, 2157, 2499);
      int int0 = rainbowFish0.getAge();
      assertEquals(2499, int0);
      assertEquals(2157, rainbowFish0.getLengthMeters());
      assertEquals(2499, rainbowFish0.getWeightTons());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      RainbowFish rainbowFish0 = new RainbowFish("ecZtr`>vC}", 0, 0, (-1728));
      int int0 = rainbowFish0.getLengthMeters();
      assertEquals(0, int0);
      assertEquals((-1728), rainbowFish0.getWeightTons());
      assertEquals(0, rainbowFish0.getAge());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      RainbowFish rainbowFish0 = new RainbowFish("ecZtr`>vC}", 0, 0, (-1728));
      int int0 = rainbowFish0.getWeightTons();
      assertEquals(0, rainbowFish0.getAge());
      assertEquals(0, rainbowFish0.getLengthMeters());
      assertEquals((-1728), int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      RainbowFish rainbowFish0 = new RainbowFish("ecZtr`>vC}", 0, 0, (-1728));
      rainbowFish0.getName();
      assertEquals((-1728), rainbowFish0.getWeightTons());
      assertEquals(0, rainbowFish0.getLengthMeters());
      assertEquals(0, rainbowFish0.getAge());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      RainbowFish rainbowFish0 = new RainbowFish("]87@e_nOUa*6B=\"`P*", (-1), (-1), (-1));
      int int0 = rainbowFish0.getAge();
      assertEquals((-1), int0);
      assertEquals((-1), rainbowFish0.getWeightTons());
      assertEquals((-1), rainbowFish0.getLengthMeters());
  }
}
