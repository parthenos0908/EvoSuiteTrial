/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 03:36:37 GMT 2021
 */

package com.iluwatar.commander;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.commander.AppShippingFailCases;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AppShippingFailCases_ESTest extends AppShippingFailCases_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AppShippingFailCases appShippingFailCases0 = new AppShippingFailCases();
      try { 
        appShippingFailCases0.shippingSuccessCase();
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"java.lang.Boolean.booleanValue()\" because the return value of \"java.util.Hashtable.get(Object)\" is null
         //
         verifyException("com.iluwatar.commander.Order", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AppShippingFailCases appShippingFailCases0 = new AppShippingFailCases();
      try { 
        appShippingFailCases0.shippingDatabaseUnavailableCase();
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"java.lang.Boolean.booleanValue()\" because the return value of \"java.util.Hashtable.get(Object)\" is null
         //
         verifyException("com.iluwatar.commander.Order", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AppShippingFailCases appShippingFailCases0 = new AppShippingFailCases();
      try { 
        appShippingFailCases0.shippingNotPossibleCase();
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"java.lang.Boolean.booleanValue()\" because the return value of \"java.util.Hashtable.get(Object)\" is null
         //
         verifyException("com.iluwatar.commander.Order", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AppShippingFailCases appShippingFailCases0 = new AppShippingFailCases();
      try { 
        appShippingFailCases0.itemUnavailableCase();
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"java.lang.Boolean.booleanValue()\" because the return value of \"java.util.Hashtable.get(Object)\" is null
         //
         verifyException("com.iluwatar.commander.Order", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String[] stringArray0 = new String[2];
      try { 
        AppShippingFailCases.main(stringArray0);
       //  fail("Expecting exception: NullPointerException");
       // Unstable assertion
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"java.lang.Boolean.booleanValue()\" because the return value of \"java.util.Hashtable.get(Object)\" is null
         //
         verifyException("com.iluwatar.commander.Order", e);
      }
  }
}
