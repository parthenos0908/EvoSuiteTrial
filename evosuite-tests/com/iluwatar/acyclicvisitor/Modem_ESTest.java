/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 02:26:50 GMT 2021
 */

package com.iluwatar.acyclicvisitor;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.acyclicvisitor.Zoom;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Modem_ESTest extends Modem_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Zoom zoom0 = new Zoom();
      assertEquals("Zoom modem", zoom0.toString());
  }
}