/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 05:25:25 GMT 2021
 */

package com.iluwatar.factory;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.factory.Ferrari;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Ferrari_ESTest extends Ferrari_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Ferrari ferrari0 = new Ferrari();
      String string0 = ferrari0.getDescription();
      assertEquals("This is Ferrari.", string0);
  }
}