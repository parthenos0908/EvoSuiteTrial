/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 04:34:11 GMT 2021
 */

package com.iluwatar.dependency.injection;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.dependency.injection.SimpleWizard;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SimpleWizard_ESTest extends SimpleWizard_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimpleWizard simpleWizard0 = new SimpleWizard();
      simpleWizard0.smoke();
  }
}
