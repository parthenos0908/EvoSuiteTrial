/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 05:59:05 GMT 2021
 */

package com.iluwatar.front.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.front.controller.CatapultView;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CatapultView_ESTest extends CatapultView_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CatapultView catapultView0 = new CatapultView();
      catapultView0.display();
  }
}
