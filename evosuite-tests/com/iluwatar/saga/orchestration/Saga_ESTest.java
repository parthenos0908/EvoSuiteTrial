/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 12:16:03 GMT 2021
 */

package com.iluwatar.saga.orchestration;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.saga.orchestration.Saga;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Saga_ESTest extends Saga_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Saga saga0 = Saga.create();
      boolean boolean0 = saga0.isPresent(0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Saga saga0 = Saga.create();
      saga0.chapter("YrBXCb%O[i|1ryHOZ");
      Saga saga1 = saga0.chapter("");
      boolean boolean0 = saga1.isPresent(1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Saga saga0 = Saga.create();
      boolean boolean0 = saga0.isPresent(1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Saga saga0 = Saga.create();
      boolean boolean0 = saga0.isPresent((-2381));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Saga.Chapter saga_Chapter0 = new Saga.Chapter((String) null);
      String string0 = saga_Chapter0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Saga saga0 = Saga.create();
      // Undeclared exception!
      try { 
        saga0.get(0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Saga saga0 = Saga.create();
      Saga saga1 = saga0.chapter("");
      Saga.Chapter saga_Chapter0 = saga1.get(0);
      assertEquals("", saga_Chapter0.getName());
  }
}
