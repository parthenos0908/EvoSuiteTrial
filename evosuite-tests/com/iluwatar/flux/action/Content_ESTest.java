/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 05:49:59 GMT 2021
 */

package com.iluwatar.flux.action;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.flux.action.Content;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Content_ESTest extends Content_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Content[] contentArray0 = Content.values();
      assertEquals(2, contentArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Content content0 = Content.valueOf("PRODUCTS");
      assertEquals("Products - This page lists the company's products.", content0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Content content0 = Content.COMPANY;
      String string0 = content0.toString();
      assertEquals("Company - This page displays information about the company.", string0);
  }
}
