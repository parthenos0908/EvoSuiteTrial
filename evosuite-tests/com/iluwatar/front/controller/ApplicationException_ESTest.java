/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 05:58:45 GMT 2021
 */

package com.iluwatar.front.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.front.controller.ApplicationException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockThrowable;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ApplicationException_ESTest extends ApplicationException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MockThrowable mockThrowable0 = new MockThrowable();
      ApplicationException applicationException0 = new ApplicationException(mockThrowable0);
  }
}