/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 11:51:37 GMT 2021
 */

package com.iluwatar.resource.acquisition.is.initialization;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.resource.acquisition.is.initialization.TreasureChest;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TreasureChest_ESTest extends TreasureChest_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      TreasureChest treasureChest0 = new TreasureChest();
      treasureChest0.close();
  }
}
