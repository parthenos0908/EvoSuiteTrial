/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 12:16:09 GMT 2021
 */

package com.iluwatar.saga.orchestration;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.saga.orchestration.SagaApplication;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SagaApplication_ESTest extends SagaApplication_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SagaApplication sagaApplication0 = new SagaApplication();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[1];
      SagaApplication.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }
}
