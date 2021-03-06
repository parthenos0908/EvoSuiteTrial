/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 13:21:49 GMT 2021
 */

package com.iluwatar.strangler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.strangler.HalfArithmetic;
import com.iluwatar.strangler.HalfSource;
import com.iluwatar.strangler.OldSource;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class HalfArithmetic_ESTest extends HalfArithmetic_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HalfSource halfSource0 = new HalfSource();
      OldSource oldSource0 = new OldSource();
      HalfArithmetic halfArithmetic0 = new HalfArithmetic(halfSource0, oldSource0);
      int[] intArray0 = new int[4];
      intArray0[1] = 150;
      int int0 = halfArithmetic0.sum(intArray0);
      assertEquals(150, int0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HalfSource halfSource0 = new HalfSource();
      OldSource oldSource0 = new OldSource();
      HalfArithmetic halfArithmetic0 = new HalfArithmetic(halfSource0, oldSource0);
      int[] intArray0 = new int[3];
      intArray0[2] = (-3616);
      int int0 = halfArithmetic0.sum(intArray0);
      assertEquals((-3616), int0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HalfSource halfSource0 = new HalfSource();
      OldSource oldSource0 = new OldSource();
      HalfArithmetic halfArithmetic0 = new HalfArithmetic(halfSource0, oldSource0);
      int[] intArray0 = new int[3];
      intArray0[0] = 1945;
      intArray0[1] = (-1);
      intArray0[2] = (-3616);
      int int0 = halfArithmetic0.mul(intArray0);
      assertEquals(7033120, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HalfSource halfSource0 = new HalfSource();
      OldSource oldSource0 = new OldSource();
      HalfArithmetic halfArithmetic0 = new HalfArithmetic(halfSource0, oldSource0);
      int[] intArray0 = new int[2];
      intArray0[0] = (-1530);
      intArray0[1] = 1;
      int int0 = halfArithmetic0.mul(intArray0);
      assertEquals((-1530), int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      OldSource oldSource0 = new OldSource();
      HalfArithmetic halfArithmetic0 = new HalfArithmetic((HalfSource) null, oldSource0);
      // Undeclared exception!
      try { 
        halfArithmetic0.sum((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.strangler.HalfSource.accumulateSum(int[])\" because \"this.newSource\" is null
         //
         verifyException("com.iluwatar.strangler.HalfArithmetic", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HalfSource halfSource0 = new HalfSource();
      HalfArithmetic halfArithmetic0 = new HalfArithmetic(halfSource0, (OldSource) null);
      // Undeclared exception!
      try { 
        halfArithmetic0.mul((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.strangler.OldSource.accumulateMul(int[])\" because \"this.oldSource\" is null
         //
         verifyException("com.iluwatar.strangler.HalfArithmetic", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      OldSource oldSource0 = new OldSource();
      HalfArithmetic halfArithmetic0 = new HalfArithmetic((HalfSource) null, oldSource0);
      // Undeclared exception!
      try { 
        halfArithmetic0.ifHasZero((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.strangler.HalfSource.ifNonZero(int[])\" because \"this.newSource\" is null
         //
         verifyException("com.iluwatar.strangler.HalfArithmetic", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HalfSource halfSource0 = new HalfSource();
      OldSource oldSource0 = new OldSource();
      int[] intArray0 = new int[7];
      HalfArithmetic halfArithmetic0 = new HalfArithmetic(halfSource0, oldSource0);
      boolean boolean0 = halfArithmetic0.ifHasZero(intArray0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HalfSource halfSource0 = new HalfSource();
      OldSource oldSource0 = new OldSource();
      int[] intArray0 = new int[7];
      HalfArithmetic halfArithmetic0 = new HalfArithmetic(halfSource0, oldSource0);
      int int0 = halfArithmetic0.mul(intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HalfSource halfSource0 = new HalfSource();
      OldSource oldSource0 = new OldSource();
      int[] intArray0 = new int[7];
      HalfArithmetic halfArithmetic0 = new HalfArithmetic(halfSource0, oldSource0);
      int int0 = halfArithmetic0.sum(intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HalfSource halfSource0 = new HalfSource();
      OldSource oldSource0 = new OldSource();
      HalfArithmetic halfArithmetic0 = new HalfArithmetic(halfSource0, oldSource0);
      int[] intArray0 = new int[3];
      intArray0[0] = 1945;
      intArray0[1] = (-1);
      intArray0[2] = (-3616);
      boolean boolean0 = halfArithmetic0.ifHasZero(intArray0);
      assertFalse(boolean0);
  }
}
