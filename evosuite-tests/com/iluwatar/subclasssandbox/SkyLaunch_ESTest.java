/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 13:24:08 GMT 2021
 */

package com.iluwatar.subclasssandbox;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.subclasssandbox.SkyLaunch;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SkyLaunch_ESTest extends SkyLaunch_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SkyLaunch skyLaunch0 = new SkyLaunch();
      skyLaunch0.logger = null;
      // Undeclared exception!
      try { 
        skyLaunch0.activate();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"org.slf4j.Logger.info(String)\" because \"this.logger\" is null
         //
         verifyException("com.iluwatar.subclasssandbox.Superpower", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SkyLaunch skyLaunch0 = new SkyLaunch();
      skyLaunch0.activate();
  }
}
