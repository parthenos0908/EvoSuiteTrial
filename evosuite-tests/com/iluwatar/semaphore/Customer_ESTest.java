/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 12:21:51 GMT 2021
 */

package com.iluwatar.semaphore;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.semaphore.Customer;
import com.iluwatar.semaphore.FruitShop;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Customer_ESTest extends Customer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FruitShop fruitShop0 = new FruitShop();
      fruitShop0.takeBowl();
      fruitShop0.takeBowl();
      Customer customer0 = new Customer("", fruitShop0);
      // Undeclared exception!
      customer0.run();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Customer customer0 = new Customer("", (FruitShop) null);
      // Undeclared exception!
      try { 
        customer0.run();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FruitShop fruitShop0 = new FruitShop();
      fruitShop0.takeBowl();
      Customer customer0 = new Customer("", fruitShop0);
      // Undeclared exception!
      customer0.run();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FruitShop fruitShop0 = new FruitShop();
      Customer customer0 = new Customer("", fruitShop0);
      customer0.run();
      assertEquals(0, fruitShop0.countFruit());
  }
}
