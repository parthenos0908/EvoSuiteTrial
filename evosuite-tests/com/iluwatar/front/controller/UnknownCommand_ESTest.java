/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 06:00:21 GMT 2021
 */

package com.iluwatar.front.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.front.controller.UnknownCommand;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class UnknownCommand_ESTest extends UnknownCommand_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UnknownCommand unknownCommand0 = new UnknownCommand();
      unknownCommand0.process();
  }
}
