/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 03:31:29 GMT 2021
 */

package com.iluwatar.command;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.command.Size;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Size_ESTest extends Size_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Size[] sizeArray0 = Size.values();
      assertEquals(2, sizeArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Size size0 = Size.valueOf("NORMAL");
      assertEquals("normal", size0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Size size0 = Size.SMALL;
      String string0 = size0.toString();
      assertEquals("small", string0);
  }
}