/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 13:23:22 GMT 2021
 */

package com.iluwatar.strangler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.strangler.OldSource;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class OldSource_ESTest extends OldSource_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OldSource oldSource0 = new OldSource();
      int[] intArray0 = new int[4];
      intArray0[0] = 1133;
      int int0 = oldSource0.accumulateSum(intArray0);
      assertEquals(1133, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      OldSource oldSource0 = new OldSource();
      int[] intArray0 = new int[7];
      intArray0[0] = (-1229);
      int int0 = oldSource0.accumulateSum(intArray0);
      assertEquals((-1229), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      OldSource oldSource0 = new OldSource();
      int[] intArray0 = new int[0];
      int int0 = oldSource0.accumulateMul(intArray0);
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      OldSource oldSource0 = new OldSource();
      int[] intArray0 = new int[4];
      intArray0[0] = 1133;
      intArray0[1] = 2358;
      intArray0[2] = 492;
      intArray0[3] = (-1);
      int int0 = oldSource0.accumulateMul(intArray0);
      assertEquals((-1314434088), int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      OldSource oldSource0 = new OldSource();
      // Undeclared exception!
      try { 
        oldSource0.accumulateSum((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot read the array length because \"<local3>\" is null
         //
         verifyException("com.iluwatar.strangler.OldSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      OldSource oldSource0 = new OldSource();
      // Undeclared exception!
      try { 
        oldSource0.accumulateMul((int[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot read the array length because \"<local3>\" is null
         //
         verifyException("com.iluwatar.strangler.OldSource", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      OldSource oldSource0 = new OldSource();
      int[] intArray0 = new int[4];
      int int0 = oldSource0.accumulateMul(intArray0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      OldSource oldSource0 = new OldSource();
      int[] intArray0 = new int[4];
      int int0 = oldSource0.accumulateSum(intArray0);
      assertEquals(0, int0);
  }
}