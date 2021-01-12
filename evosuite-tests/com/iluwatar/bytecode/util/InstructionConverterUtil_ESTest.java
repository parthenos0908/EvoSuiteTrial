/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 02:57:34 GMT 2021
 */

package com.iluwatar.bytecode.util;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.bytecode.util.InstructionConverterUtil;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class InstructionConverterUtil_ESTest extends InstructionConverterUtil_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      try { 
        InstructionConverterUtil.convertToByteCode("3 yNzbP");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid instruction or number: yNzbP
         //
         verifyException("com.iluwatar.bytecode.util.InstructionConverterUtil", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int[] intArray0 = InstructionConverterUtil.convertToByteCode("PLAY_SOUND");
      assertArrayEquals(new int[] {5}, intArray0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int[] intArray0 = InstructionConverterUtil.convertToByteCode("");
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      int[] intArray0 = InstructionConverterUtil.convertToByteCode((String) null);
      assertEquals(0, intArray0.length);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      InstructionConverterUtil instructionConverterUtil0 = new InstructionConverterUtil();
  }
}