/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 05:59:00 GMT 2021
 */

package com.iluwatar.front.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.front.controller.CatapultCommand;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CatapultCommand_ESTest extends CatapultCommand_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CatapultCommand catapultCommand0 = new CatapultCommand();
      catapultCommand0.process();
  }
}