/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 11:53:17 GMT 2021
 */

package com.iluwatar.retry;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.retry.BusinessException;
import com.iluwatar.retry.FindCustomer;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FindCustomer_ESTest extends FindCustomer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BusinessException[] businessExceptionArray0 = new BusinessException[0];
      FindCustomer findCustomer0 = new FindCustomer("com.iluwatar.retry.BusinessException", businessExceptionArray0);
      String string0 = findCustomer0.perform();
      assertEquals("com.iluwatar.retry.BusinessException", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BusinessException[] businessExceptionArray0 = new BusinessException[0];
      FindCustomer findCustomer0 = new FindCustomer("", businessExceptionArray0);
      String string0 = findCustomer0.perform();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BusinessException[] businessExceptionArray0 = new BusinessException[2];
      BusinessException businessException0 = new BusinessException("'~F's[{fr");
      businessExceptionArray0[0] = businessException0;
      businessExceptionArray0[1] = businessException0;
      FindCustomer findCustomer0 = new FindCustomer("'~F's[{fr", businessExceptionArray0);
      try { 
        findCustomer0.perform();
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BusinessException[] businessExceptionArray0 = new BusinessException[0];
      FindCustomer findCustomer0 = new FindCustomer((String) null, businessExceptionArray0);
      String string0 = findCustomer0.perform();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      FindCustomer findCustomer0 = null;
      try {
        findCustomer0 = new FindCustomer("", (BusinessException[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot read the array length because \"elements\" is null
         //
         verifyException("java.util.List", e);
      }
  }
}
