/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 04:39:02 GMT 2021
 */

package com.iluwatar.dirtyflag;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.dirtyflag.App;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class App_ESTest extends App_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[1];
      App.main(stringArray0);
      assertEquals(1, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      App app0 = new App();
      app0.run();
  }
}
