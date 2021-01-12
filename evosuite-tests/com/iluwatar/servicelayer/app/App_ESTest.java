/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 12:34:08 GMT 2021
 */

package com.iluwatar.servicelayer.app;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.servicelayer.app.App;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class App_ESTest extends App_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        App.initData();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/hibernate/criterion/Criterion
         //
         verifyException("com.iluwatar.servicelayer.app.App", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        App.queryData();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/hibernate/criterion/Criterion
         //
         verifyException("com.iluwatar.servicelayer.app.App", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      App app0 = new App();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[3];
      // Undeclared exception!
      try { 
        App.main(stringArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // org/hibernate/criterion/Criterion
         //
         verifyException("com.iluwatar.servicelayer.app.App", e);
      }
  }
}
