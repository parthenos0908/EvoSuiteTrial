/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 02:35:03 GMT 2021
 */

package com.iluwatar.ambassador;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.ambassador.RemoteServiceStatus;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RemoteServiceStatus_ESTest extends RemoteServiceStatus_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      RemoteServiceStatus[] remoteServiceStatusArray0 = RemoteServiceStatus.values();
      assertEquals(1, remoteServiceStatusArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RemoteServiceStatus remoteServiceStatus0 = RemoteServiceStatus.valueOf("FAILURE");
      assertEquals((-1L), remoteServiceStatus0.getRemoteServiceStatusValue());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RemoteServiceStatus remoteServiceStatus0 = RemoteServiceStatus.FAILURE;
      long long0 = remoteServiceStatus0.getRemoteServiceStatusValue();
      assertEquals((-1L), long0);
  }
}