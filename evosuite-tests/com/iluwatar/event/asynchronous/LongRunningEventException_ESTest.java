/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 05:01:33 GMT 2021
 */

package com.iluwatar.event.asynchronous;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.event.asynchronous.LongRunningEventException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LongRunningEventException_ESTest extends LongRunningEventException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LongRunningEventException longRunningEventException0 = new LongRunningEventException("L");
  }
}