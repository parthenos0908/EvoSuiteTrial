/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 05:13:24 GMT 2021
 */

package com.iluwatar.execute.around;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.execute.around.App;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class App_ESTest extends App_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[3];
      App.main(stringArray0);
      assertEquals(3, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      App app0 = new App();
  }
}
