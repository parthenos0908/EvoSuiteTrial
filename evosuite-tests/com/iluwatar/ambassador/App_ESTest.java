/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 02:30:54 GMT 2021
 */

package com.iluwatar.ambassador;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.ambassador.App;
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
      String[] stringArray0 = new String[2];
      App.main(stringArray0);
      assertEquals(2, stringArray0.length);
  }
}
