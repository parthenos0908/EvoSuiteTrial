/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 12:24:05 GMT 2021
 */

package com.iluwatar.semaphore;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.semaphore.Fruit;
import com.iluwatar.semaphore.FruitBowl;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FruitBowl_ESTest extends FruitBowl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FruitBowl fruitBowl0 = new FruitBowl();
      Fruit.FruitType fruit_FruitType0 = Fruit.FruitType.LEMON;
      Fruit fruit0 = new Fruit(fruit_FruitType0);
      fruitBowl0.put(fruit0);
      int int0 = fruitBowl0.countFruit();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FruitBowl fruitBowl0 = new FruitBowl();
      fruitBowl0.put((Fruit) null);
      // Undeclared exception!
      try { 
        fruitBowl0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.semaphore.Fruit.getType()\" because \"f\" is null
         //
         verifyException("com.iluwatar.semaphore.FruitBowl", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FruitBowl fruitBowl0 = new FruitBowl();
      Fruit.FruitType fruit_FruitType0 = Fruit.FruitType.ORANGE;
      Fruit fruit0 = new Fruit(fruit_FruitType0);
      fruitBowl0.put(fruit0);
      String string0 = fruitBowl0.toString();
      assertEquals("0 Apples, 1 Oranges, and 0 Lemons", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FruitBowl fruitBowl0 = new FruitBowl();
      Fruit.FruitType fruit_FruitType0 = Fruit.FruitType.APPLE;
      Fruit fruit0 = new Fruit(fruit_FruitType0);
      fruitBowl0.put(fruit0);
      String string0 = fruitBowl0.toString();
      assertEquals("1 Apples, 0 Oranges, and 0 Lemons", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FruitBowl fruitBowl0 = new FruitBowl();
      Fruit.FruitType fruit_FruitType0 = Fruit.FruitType.LEMON;
      Fruit fruit0 = new Fruit(fruit_FruitType0);
      fruitBowl0.put(fruit0);
      String string0 = fruitBowl0.toString();
      assertEquals("0 Apples, 0 Oranges, and 1 Lemons", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FruitBowl fruitBowl0 = new FruitBowl();
      Fruit fruit0 = fruitBowl0.take();
      assertNull(fruit0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FruitBowl fruitBowl0 = new FruitBowl();
      int int0 = fruitBowl0.countFruit();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      FruitBowl fruitBowl0 = new FruitBowl();
      Fruit.FruitType fruit_FruitType0 = Fruit.FruitType.LEMON;
      Fruit fruit0 = new Fruit(fruit_FruitType0);
      fruitBowl0.put(fruit0);
      fruitBowl0.take();
      assertEquals(0, fruitBowl0.countFruit());
  }
}