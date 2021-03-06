/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 04:13:37 GMT 2021
 */

package com.iluwatar.dao;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.dao.Customer;
import com.iluwatar.dao.InMemoryCustomerDao;
import java.util.Optional;
import java.util.stream.Stream;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class InMemoryCustomerDao_ESTest extends InMemoryCustomerDao_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InMemoryCustomerDao inMemoryCustomerDao0 = new InMemoryCustomerDao();
      // Undeclared exception!
      try { 
        inMemoryCustomerDao0.update((Customer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.dao.Customer.getId()\" because \"customer\" is null
         //
         verifyException("com.iluwatar.dao.InMemoryCustomerDao", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      InMemoryCustomerDao inMemoryCustomerDao0 = new InMemoryCustomerDao();
      // Undeclared exception!
      try { 
        inMemoryCustomerDao0.delete((Customer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.dao.Customer.getId()\" because \"customer\" is null
         //
         verifyException("com.iluwatar.dao.InMemoryCustomerDao", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      InMemoryCustomerDao inMemoryCustomerDao0 = new InMemoryCustomerDao();
      // Undeclared exception!
      try { 
        inMemoryCustomerDao0.add((Customer) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.dao.Customer.getId()\" because \"customer\" is null
         //
         verifyException("com.iluwatar.dao.InMemoryCustomerDao", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      InMemoryCustomerDao inMemoryCustomerDao0 = new InMemoryCustomerDao();
      Customer customer0 = new Customer(3515, "", "");
      boolean boolean0 = inMemoryCustomerDao0.add(customer0);
      assertTrue(boolean0);
      
      boolean boolean1 = inMemoryCustomerDao0.delete(customer0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      InMemoryCustomerDao inMemoryCustomerDao0 = new InMemoryCustomerDao();
      Customer customer0 = new Customer(81, "com.iluwatar.dao.InMemoryCustomerDao", "com.iluwatar.dao.InMemoryCustomerDao");
      boolean boolean0 = inMemoryCustomerDao0.delete(customer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      InMemoryCustomerDao inMemoryCustomerDao0 = new InMemoryCustomerDao();
      Customer customer0 = new Customer(81, "com.iluwatar.dao.InMemoryCustomerDao", "com.iluwatar.dao.InMemoryCustomerDao");
      boolean boolean0 = inMemoryCustomerDao0.add(customer0);
      assertTrue(boolean0);
      
      boolean boolean1 = inMemoryCustomerDao0.update(customer0);
      assertTrue(boolean1);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      InMemoryCustomerDao inMemoryCustomerDao0 = new InMemoryCustomerDao();
      Customer customer0 = new Customer(81, "com.iluwatar.dao.InMemoryCustomerDao", "com.iluwatar.dao.InMemoryCustomerDao");
      boolean boolean0 = inMemoryCustomerDao0.update(customer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      InMemoryCustomerDao inMemoryCustomerDao0 = new InMemoryCustomerDao();
      Customer customer0 = new Customer(81, "com.iluwatar.dao.InMemoryCustomerDao", "com.iluwatar.dao.InMemoryCustomerDao");
      boolean boolean0 = inMemoryCustomerDao0.add(customer0);
      boolean boolean1 = inMemoryCustomerDao0.add(customer0);
      assertFalse(boolean1 == boolean0);
      assertFalse(boolean1);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      InMemoryCustomerDao inMemoryCustomerDao0 = new InMemoryCustomerDao();
      Stream<Customer> stream0 = inMemoryCustomerDao0.getAll();
      assertNotNull(stream0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      InMemoryCustomerDao inMemoryCustomerDao0 = new InMemoryCustomerDao();
      Optional<Customer> optional0 = inMemoryCustomerDao0.getById((-1146));
      assertNotNull(optional0);
  }
}
