/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 13:23:39 GMT 2021
 */

package com.iluwatar.strategy;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.strategy.MeleeStrategy;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MeleeStrategy_ESTest extends MeleeStrategy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MeleeStrategy meleeStrategy0 = new MeleeStrategy();
      meleeStrategy0.execute();
  }
}
