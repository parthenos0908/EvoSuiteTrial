/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 02:32:24 GMT 2021
 */

package com.iluwatar.ambassador;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.ambassador.Client;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Client_ESTest extends Client_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Client client0 = new Client();
      long long0 = client0.useService(0);
      long long1 = client0.useService(946);
      //  // Unstable assertion: assertTrue(long1 == long0);
      //  // Unstable assertion: assertEquals((-1L), long1);
  }
}