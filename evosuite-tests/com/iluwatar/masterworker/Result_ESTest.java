/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 09:29:08 GMT 2021
 */

package com.iluwatar.masterworker;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.masterworker.ArrayResult;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Result_ESTest extends Result_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      int[][] intArray0 = new int[1][1];
      ArrayResult arrayResult0 = new ArrayResult(intArray0);
  }
}