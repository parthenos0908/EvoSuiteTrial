/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 08:31:19 GMT 2021
 */

package com.iluwatar.intercepting.filter;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.intercepting.filter.DepositFilter;
import com.iluwatar.intercepting.filter.FilterManager;
import com.iluwatar.intercepting.filter.NameFilter;
import com.iluwatar.intercepting.filter.Order;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FilterManager_ESTest extends FilterManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FilterManager filterManager0 = new FilterManager();
      DepositFilter depositFilter0 = new DepositFilter();
      filterManager0.addFilter(depositFilter0);
      Order order0 = new Order("", "", "Invalid deposit number! ", "Invalid deposit number! ", "Invalid deposit number! ");
      String string0 = filterManager0.filterRequest(order0);
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FilterManager filterManager0 = new FilterManager();
      DepositFilter depositFilter0 = new DepositFilter();
      filterManager0.addFilter(depositFilter0);
      filterManager0.addFilter(depositFilter0);
      // Undeclared exception!
      filterManager0.addFilter(depositFilter0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      FilterManager filterManager0 = new FilterManager();
      NameFilter nameFilter0 = new NameFilter();
      filterManager0.addFilter(nameFilter0);
      // Undeclared exception!
      try { 
        filterManager0.filterRequest((Order) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.intercepting.filter.Order.getName()\" because \"order\" is null
         //
         verifyException("com.iluwatar.intercepting.filter.NameFilter", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      FilterManager filterManager0 = new FilterManager();
      Order order0 = new Order();
      String string0 = filterManager0.filterRequest(order0);
      assertEquals("RUNNING...", string0);
  }
}