/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 02:55:02 GMT 2021
 */

package com.iluwatar.business.delegate;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.business.delegate.EjbService;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EjbService_ESTest extends EjbService_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EjbService ejbService0 = new EjbService();
      ejbService0.doProcessing();
  }
}