/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 13:22:08 GMT 2021
 */

package com.iluwatar.strangler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.strangler.NewSource;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NewSource_ESTest extends NewSource_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NewSource newSource0 = new NewSource();
      int[] intArray0 = new int[2];
      intArray0[0] = 4821;
      intArray0[1] = (-2976);
      boolean boolean0 = newSource0.ifNonZero(intArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NewSource newSource0 = new NewSource();
      int[] intArray0 = new int[2];
      intArray0[0] = 4821;
      int int0 = newSource0.accumulateSum(intArray0);
      assertEquals(4821, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      NewSource newSource0 = new NewSource();
      int[] intArray0 = new int[1];
      intArray0[0] = (-14347296);
      int int0 = newSource0.accumulateSum(intArray0);
      assertEquals((-14347296), int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NewSource newSource0 = new NewSource();
      int[] intArray0 = new int[4];
      intArray0[0] = 1251;
      intArray0[1] = 2480;
      intArray0[2] = 1572;
      intArray0[3] = (-3826);
      int int0 = newSource0.accumulateMul(intArray0);
      assertEquals(1853810560, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      NewSource newSource0 = new NewSource();
      int[] intArray0 = new int[2];
      intArray0[0] = 4821;
      intArray0[1] = (-2976);
      int int0 = newSource0.accumulateMul(intArray0);
      assertEquals((-14347296), int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      NewSource newSource0 = new NewSource();
      // Undeclared exception!
      try { 
        newSource0.ifNonZero((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot read the array length because \"array\" is null
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      NewSource newSource0 = new NewSource();
      // Undeclared exception!
      try { 
        newSource0.accumulateSum((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot read the array length because \"array\" is null
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      NewSource newSource0 = new NewSource();
      int[] intArray0 = new int[4];
      int int0 = newSource0.accumulateMul(intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      NewSource newSource0 = new NewSource();
      int[] intArray0 = new int[4];
      boolean boolean0 = newSource0.ifNonZero(intArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      NewSource newSource0 = new NewSource();
      int[] intArray0 = new int[2];
      int int0 = newSource0.accumulateSum(intArray0);
      assertEquals(0, int0);
  }
}
