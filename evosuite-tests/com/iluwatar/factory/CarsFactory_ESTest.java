/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 05:23:13 GMT 2021
 */

package com.iluwatar.factory;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.factory.Car;
import com.iluwatar.factory.CarType;
import com.iluwatar.factory.CarsFactory;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CarsFactory_ESTest extends CarsFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CarType carType0 = CarType.FORD;
      Car car0 = CarsFactory.getCar(carType0);
      assertEquals("This is Ford.", car0.getDescription());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CarsFactory carsFactory0 = new CarsFactory();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        CarsFactory.getCar((CarType) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.factory.CarType.getConstructor()\" because \"type\" is null
         //
         verifyException("com.iluwatar.factory.CarsFactory", e);
      }
  }
}
