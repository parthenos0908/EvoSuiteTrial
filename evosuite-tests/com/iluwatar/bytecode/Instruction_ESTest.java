/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 02:56:26 GMT 2021
 */

package com.iluwatar.bytecode;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.bytecode.Instruction;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Instruction_ESTest extends Instruction_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Instruction instruction0 = Instruction.getInstruction(3);
      assertEquals(Instruction.SET_WISDOM, instruction0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Instruction[] instructionArray0 = Instruction.values();
      assertEquals(11, instructionArray0.length);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Instruction instruction0 = Instruction.valueOf("SET_WISDOM");
      int int0 = instruction0.getIntValue();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        Instruction.getInstruction(0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid instruction value
         //
         verifyException("com.iluwatar.bytecode.Instruction", e);
      }
  }
}