/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 03:17:30 GMT 2021
 */

package com.iluwatar.circuitbreaker;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.circuitbreaker.App;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class App_ESTest extends App_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      App app0 = new App();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      App.main((String[]) null);
  }
}
