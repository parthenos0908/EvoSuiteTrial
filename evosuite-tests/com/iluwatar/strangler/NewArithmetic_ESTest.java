/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 13:22:02 GMT 2021
 */

package com.iluwatar.strangler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.strangler.NewArithmetic;
import com.iluwatar.strangler.NewSource;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class NewArithmetic_ESTest extends NewArithmetic_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      NewSource newSource0 = new NewSource();
      NewArithmetic newArithmetic0 = new NewArithmetic(newSource0);
      int[] intArray0 = new int[3];
      intArray0[0] = 1206;
      int int0 = newArithmetic0.sum(intArray0);
      assertEquals(1206, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      NewSource newSource0 = new NewSource();
      NewArithmetic newArithmetic0 = new NewArithmetic(newSource0);
      int[] intArray0 = new int[4];
      intArray0[0] = (-4482);
      int int0 = newArithmetic0.sum(intArray0);
      assertEquals((-4482), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NewSource newSource0 = new NewSource();
      NewArithmetic newArithmetic0 = new NewArithmetic(newSource0);
      int[] intArray0 = new int[3];
      int int0 = newArithmetic0.mul(intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NewSource newSource0 = new NewSource();
      NewArithmetic newArithmetic0 = new NewArithmetic(newSource0);
      int[] intArray0 = new int[1];
      intArray0[0] = 1450;
      int int0 = newArithmetic0.mul(intArray0);
      assertEquals(1450, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NewSource newSource0 = new NewSource();
      NewArithmetic newArithmetic0 = new NewArithmetic(newSource0);
      int[] intArray0 = new int[2];
      intArray0[0] = (-1);
      intArray0[1] = 1077;
      int int0 = newArithmetic0.mul(intArray0);
      assertEquals((-1077), int0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      NewSource newSource0 = new NewSource();
      NewArithmetic newArithmetic0 = new NewArithmetic(newSource0);
      // Undeclared exception!
      try { 
        newArithmetic0.sum((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot read the array length because \"array\" is null
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      NewSource newSource0 = new NewSource();
      NewArithmetic newArithmetic0 = new NewArithmetic(newSource0);
      // Undeclared exception!
      try { 
        newArithmetic0.ifHasZero((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot read the array length because \"array\" is null
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      NewSource newSource0 = new NewSource();
      NewArithmetic newArithmetic0 = new NewArithmetic(newSource0);
      int[] intArray0 = new int[2];
      boolean boolean0 = newArithmetic0.ifHasZero(intArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      NewSource newSource0 = new NewSource();
      NewArithmetic newArithmetic0 = new NewArithmetic(newSource0);
      int[] intArray0 = new int[1];
      intArray0[0] = 1450;
      boolean boolean0 = newArithmetic0.ifHasZero(intArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      NewSource newSource0 = new NewSource();
      NewArithmetic newArithmetic0 = new NewArithmetic(newSource0);
      // Undeclared exception!
      try { 
        newArithmetic0.mul((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot read the array length because \"array\" is null
         //
         verifyException("java.util.Arrays", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      NewSource newSource0 = new NewSource();
      NewArithmetic newArithmetic0 = new NewArithmetic(newSource0);
      int[] intArray0 = new int[1];
      int int0 = newArithmetic0.sum(intArray0);
      assertEquals(0, int0);
  }
}
