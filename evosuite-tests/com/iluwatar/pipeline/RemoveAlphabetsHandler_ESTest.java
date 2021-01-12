/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 10:31:16 GMT 2021
 */

package com.iluwatar.pipeline;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.pipeline.RemoveAlphabetsHandler;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RemoveAlphabetsHandler_ESTest extends RemoveAlphabetsHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RemoveAlphabetsHandler removeAlphabetsHandler0 = new RemoveAlphabetsHandler();
      String string0 = removeAlphabetsHandler0.process("he~Xw&(!i '-99xy:");
      assertEquals("~&(! '-99:", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RemoveAlphabetsHandler removeAlphabetsHandler0 = new RemoveAlphabetsHandler();
      String string0 = removeAlphabetsHandler0.process("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RemoveAlphabetsHandler removeAlphabetsHandler0 = new RemoveAlphabetsHandler();
      // Undeclared exception!
      try { 
        removeAlphabetsHandler0.process((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"String.chars()\" because \"input\" is null
         //
         verifyException("com.iluwatar.pipeline.RemoveAlphabetsHandler", e);
      }
  }
}
