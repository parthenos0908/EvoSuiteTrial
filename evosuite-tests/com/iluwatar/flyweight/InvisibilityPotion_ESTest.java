/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 05:57:11 GMT 2021
 */

package com.iluwatar.flyweight;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.flyweight.InvisibilityPotion;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class InvisibilityPotion_ESTest extends InvisibilityPotion_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      InvisibilityPotion invisibilityPotion0 = new InvisibilityPotion();
      invisibilityPotion0.drink();
  }
}