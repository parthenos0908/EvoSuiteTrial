/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 05:27:44 GMT 2021
 */

package com.iluwatar.factorykit;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.factorykit.Axe;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Axe_ESTest extends Axe_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Axe axe0 = new Axe();
      String string0 = axe0.toString();
      assertEquals("Axe", string0);
  }
}