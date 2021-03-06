/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 07:58:40 GMT 2021
 */

package com.iluwatar.halfsynchalfasync;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.halfsynchalfasync.App;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class App_ESTest extends App_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      App.ArithmeticSumTask app_ArithmeticSumTask0 = new App.ArithmeticSumTask(2000L);
      Long long0 = new Long(0L);
      app_ArithmeticSumTask0.onPostCall(long0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      App.ArithmeticSumTask app_ArithmeticSumTask0 = new App.ArithmeticSumTask(2000L);
      MockThrowable mockThrowable0 = new MockThrowable();
      // Undeclared exception!
      try { 
        app_ArithmeticSumTask0.onError(mockThrowable0);
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // Should not occur
         //
         verifyException("com.iluwatar.halfsynchalfasync.App$ArithmeticSumTask", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String[] stringArray0 = new String[2];
      App.main(stringArray0);
      assertEquals(2, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      App app0 = new App();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      App.ArithmeticSumTask app_ArithmeticSumTask0 = new App.ArithmeticSumTask((-2162L));
      // Undeclared exception!
      try { 
        app_ArithmeticSumTask0.onPreCall();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // n is less than 0
         //
         verifyException("com.iluwatar.halfsynchalfasync.App$ArithmeticSumTask", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      App.ArithmeticSumTask app_ArithmeticSumTask0 = new App.ArithmeticSumTask(2000L);
      app_ArithmeticSumTask0.call();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      App.ArithmeticSumTask app_ArithmeticSumTask0 = new App.ArithmeticSumTask(0L);
      app_ArithmeticSumTask0.onPreCall();
  }
}
