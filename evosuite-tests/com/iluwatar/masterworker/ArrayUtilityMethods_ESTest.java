/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 09:27:57 GMT 2021
 */

package com.iluwatar.masterworker;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.masterworker.ArrayUtilityMethods;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ArrayUtilityMethods_ESTest extends ArrayUtilityMethods_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      int[][] intArray0 = new int[3][3];
      int[][] intArray1 = new int[3][3];
      boolean boolean0 = ArrayUtilityMethods.matricesSame(intArray1, intArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      int[][] intArray0 = new int[6][8];
      int[][] intArray1 = new int[3][6];
      boolean boolean0 = ArrayUtilityMethods.matricesSame(intArray0, intArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      int[] intArray0 = new int[2];
      int[] intArray1 = new int[2];
      intArray1[0] = 33;
      boolean boolean0 = ArrayUtilityMethods.arraysSame(intArray0, intArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      int[] intArray0 = new int[1];
      int[] intArray1 = new int[4];
      boolean boolean0 = ArrayUtilityMethods.arraysSame(intArray0, intArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      int[][] intArray0 = ArrayUtilityMethods.createRandomIntMatrix(0, 652);
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      // Undeclared exception!
      try { 
        ArrayUtilityMethods.printMatrix((int[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot read the array length because \"<local1>\" is null
         //
         verifyException("com.iluwatar.masterworker.ArrayUtilityMethods", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      int[][] intArray0 = new int[2][0];
      int[] intArray1 = new int[1];
      intArray0[0] = intArray1;
      // Undeclared exception!
      try { 
        ArrayUtilityMethods.printMatrix(intArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("com.iluwatar.masterworker.ArrayUtilityMethods", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      int[][] intArray0 = ArrayUtilityMethods.createRandomIntMatrix(610, 10);
      ArrayUtilityMethods.matricesSame(intArray0, intArray0);
      // Undeclared exception!
      ArrayUtilityMethods.matricesSame(intArray0, intArray0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        ArrayUtilityMethods.matricesSame((int[][]) null, (int[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      // Undeclared exception!
      ArrayUtilityMethods.createRandomIntMatrix(435, 435);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        ArrayUtilityMethods.createRandomIntMatrix((-2623), (-2623));
        fail("Expecting exception: NegativeArraySizeException");
      
      } catch(NegativeArraySizeException e) {
         //
         // -2623
         //
         verifyException("com.iluwatar.masterworker.ArrayUtilityMethods", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      // Undeclared exception!
      try { 
        ArrayUtilityMethods.arraysSame((int[]) null, (int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      int[] intArray0 = new int[2];
      boolean boolean0 = ArrayUtilityMethods.arraysSame(intArray0, intArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      int[][] intArray0 = ArrayUtilityMethods.createRandomIntMatrix(72, 72);
      ArrayUtilityMethods.printMatrix(intArray0);
      // Undeclared exception!
      ArrayUtilityMethods.printMatrix(intArray0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      int[][] intArray0 = new int[4][0];
      boolean boolean0 = ArrayUtilityMethods.matricesSame(intArray0, intArray0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      int[][] intArray0 = new int[7][6];
      int[][] intArray1 = new int[8][5];
      boolean boolean0 = ArrayUtilityMethods.matricesSame(intArray0, intArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      int[] intArray0 = new int[2];
      intArray0[0] = 20;
      int[] intArray1 = new int[2];
      boolean boolean0 = ArrayUtilityMethods.arraysSame(intArray0, intArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      int[] intArray0 = new int[3];
      int[] intArray1 = new int[1];
      boolean boolean0 = ArrayUtilityMethods.arraysSame(intArray0, intArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      ArrayUtilityMethods arrayUtilityMethods0 = new ArrayUtilityMethods();
  }
}