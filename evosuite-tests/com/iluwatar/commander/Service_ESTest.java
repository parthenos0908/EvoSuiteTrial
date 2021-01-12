/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 03:51:10 GMT 2021
 */

package com.iluwatar.commander;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.commander.shippingservice.ShippingDatabase;
import com.iluwatar.commander.shippingservice.ShippingService;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Service_ESTest extends Service_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Exception[] exceptionArray0 = new Exception[6];
      MockException mockException0 = new MockException();
      exceptionArray0[0] = (Exception) mockException0;
      exceptionArray0[1] = (Exception) mockException0;
      exceptionArray0[2] = (Exception) mockException0;
      exceptionArray0[3] = (Exception) mockException0;
      exceptionArray0[4] = (Exception) mockException0;
      exceptionArray0[5] = (Exception) mockException0;
      Object[] objectArray0 = new Object[7];
      ShippingDatabase shippingDatabase0 = new ShippingDatabase();
      ShippingService shippingService0 = new ShippingService(shippingDatabase0, exceptionArray0);
      String string0 = shippingService0.receiveRequest(objectArray0);
      assertEquals("ADHKOSVZ37AD", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Exception[] exceptionArray0 = new Exception[0];
      ShippingDatabase shippingDatabase0 = new ShippingDatabase();
      ShippingService shippingService0 = new ShippingService(shippingDatabase0, exceptionArray0);
      Object[] objectArray0 = new Object[1];
      objectArray0[0] = (Object) shippingDatabase0;
      // Undeclared exception!
      try { 
        shippingService0.receiveRequest(objectArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class com.iluwatar.commander.shippingservice.ShippingDatabase cannot be cast to class java.lang.String (com.iluwatar.commander.shippingservice.ShippingDatabase is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @51c10e93; java.lang.String is in module java.base of loader 'bootstrap')
         //
         verifyException("com.iluwatar.commander.shippingservice.ShippingService", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Exception[] exceptionArray0 = new Exception[0];
      ShippingDatabase shippingDatabase0 = new ShippingDatabase();
      ShippingService shippingService0 = new ShippingService(shippingDatabase0, exceptionArray0);
      // Undeclared exception!
      try { 
        shippingService0.receiveRequest(exceptionArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("com.iluwatar.commander.shippingservice.ShippingService", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Exception[] exceptionArray0 = new Exception[0];
      ShippingDatabase shippingDatabase0 = new ShippingDatabase();
      ShippingService shippingService0 = new ShippingService(shippingDatabase0, exceptionArray0);
      // Undeclared exception!
      try { 
        shippingService0.receiveRequest((Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot load from object array because \"parameters\" is null
         //
         verifyException("com.iluwatar.commander.shippingservice.ShippingService", e);
      }
  }
}