/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 03:28:03 GMT 2021
 */

package com.iluwatar.combinator;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.combinator.CombinatorApp;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CombinatorApp_ESTest extends CombinatorApp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CombinatorApp.main((String[]) null);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CombinatorApp combinatorApp0 = new CombinatorApp();
  }
}