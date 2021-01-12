/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 08:27:43 GMT 2021
 */

package com.iluwatar.intercepting.filter;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.intercepting.filter.AddressFilter;
import com.iluwatar.intercepting.filter.ContactFilter;
import com.iluwatar.intercepting.filter.DepositFilter;
import com.iluwatar.intercepting.filter.Filter;
import com.iluwatar.intercepting.filter.Order;
import com.iluwatar.intercepting.filter.OrderFilter;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ContactFilter_ESTest extends ContactFilter_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ContactFilter contactFilter0 = new ContactFilter();
      DepositFilter depositFilter0 = new DepositFilter();
      depositFilter0.setNext(contactFilter0);
      depositFilter0.setNext(contactFilter0);
      contactFilter0.setNext(depositFilter0);
      depositFilter0.setNext(contactFilter0);
      contactFilter0.setNext(depositFilter0);
      Order order0 = new Order("G3sLatI;<X W", "5|}H/w", "G3sLatI;<X W", "`3@D.5~", "com.iluwatar.intercepting.filter.AddressFilter");
      ContactFilter contactFilter1 = new ContactFilter();
      Filter filter0 = contactFilter1.getLast();
      contactFilter0.setNext(filter0);
      order0.setContactNumber("`3@D.5~");
      order0.setAddress("`3@D.5~");
      order0.setAddress("J7.14Y%\f<");
      contactFilter0.execute(order0);
      contactFilter0.execute(order0);
      contactFilter0.execute(order0);
      Order order1 = new Order();
      order1.setOrderItem("Invalid contact number! Invalid contact number! ");
      contactFilter0.execute(order1);
      contactFilter1.execute(order0);
      contactFilter1.execute(order0);
      contactFilter1.execute(order0);
      order1.setOrderItem("5|}H/w");
      Order order2 = new Order("Invalid contact number! Invalid contact number! ", "JHXUAcw_&81)O", "", "J7.14Y%\f<", "");
      contactFilter1.execute(order2);
      contactFilter0.execute(order1);
      contactFilter0.execute(order1);
      contactFilter1.execute(order0);
      String string0 = contactFilter1.execute(order0);
      String string1 = contactFilter1.execute(order2);
      assertTrue(string1.equals((Object)string0));
      
      String string2 = contactFilter1.execute(order1);
      assertEquals("Invalid contact number! ", string2);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ContactFilter contactFilter0 = new ContactFilter();
      Order order0 = new Order((String) null, "", (String) null, (String) null, "");
      OrderFilter orderFilter0 = new OrderFilter();
      contactFilter0.setNext(orderFilter0);
      contactFilter0.execute(order0);
      String string0 = contactFilter0.execute(order0);
      assertEquals("Invalid order! Invalid contact number! ", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ContactFilter contactFilter0 = new ContactFilter();
      AddressFilter addressFilter0 = new AddressFilter();
      contactFilter0.setNext(addressFilter0);
      Filter filter0 = contactFilter0.getNext();
      contactFilter0.setNext(filter0);
      Order order0 = new Order("", "", "c~[eAZ%", "WA>R", "c~[eAZ%");
      contactFilter0.execute(order0);
      order0.setContactNumber("");
      contactFilter0.execute(order0);
      contactFilter0.execute(order0);
      contactFilter0.execute(order0);
      order0.setDepositNumber("");
      order0.setName("Invalid contact number! ");
      contactFilter0.execute(order0);
      contactFilter0.execute(order0);
      contactFilter0.execute(order0);
      contactFilter0.execute(order0);
      contactFilter0.execute(order0);
      String string0 = contactFilter0.execute(order0);
      assertEquals("Invalid contact number! ", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ContactFilter contactFilter0 = new ContactFilter();
      // Undeclared exception!
      try { 
        contactFilter0.execute((Order) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ContactFilter contactFilter0 = new ContactFilter();
      Order order0 = new Order(".*[^w|s]+.*", ".*[^w|s]+.*", ".*[^w|s]+.*", "", "");
      String string0 = contactFilter0.execute(order0);
      assertEquals("Invalid contact number! ", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ContactFilter contactFilter0 = new ContactFilter();
      Order order0 = new Order("com.iluwatar.intercepting.filter.NameFilter", "com.iluwatar.intercepting.filter.NameFilter", "com.iluwatar.intercepting.filter.NameFilter", "com.iluwatar.intercepting.filter.NameFilter", "com.iluwatar.intercepting.filter.NameFilter");
      String string0 = contactFilter0.execute(order0);
      assertEquals("Invalid contact number! ", string0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ContactFilter contactFilter0 = new ContactFilter();
      Order order0 = new Order();
      String string0 = contactFilter0.execute(order0);
      assertEquals("Invalid contact number! ", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ContactFilter contactFilter0 = new ContactFilter();
      contactFilter0.getNext();
      contactFilter0.setNext((Filter) null);
      Order order0 = new Order();
      contactFilter0.execute(order0);
      Order order1 = new Order(".*[^d]+.*", ".*[^d]+.*", "U", (String) null, "");
      String string0 = contactFilter0.execute(order1);
      assertEquals("Invalid contact number! ", string0);
  }
}
