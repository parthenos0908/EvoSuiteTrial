/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 03:22:04 GMT 2021
 */

package com.iluwatar.circuitbreaker;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.circuitbreaker.RemoteServiceException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RemoteServiceException_ESTest extends RemoteServiceException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RemoteServiceException remoteServiceException0 = new RemoteServiceException("0");
  }
}