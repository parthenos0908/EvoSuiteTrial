/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 05:57:01 GMT 2021
 */

package com.iluwatar.flyweight;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.flyweight.HealingPotion;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class HealingPotion_ESTest extends HealingPotion_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HealingPotion healingPotion0 = new HealingPotion();
      healingPotion0.drink();
  }
}
