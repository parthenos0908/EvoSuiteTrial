/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 13:23:34 GMT 2021
 */

package com.iluwatar.strategy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.strategy.DragonSlayer;
import com.iluwatar.strategy.DragonSlayingStrategy;
import com.iluwatar.strategy.MeleeStrategy;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DragonSlayer_ESTest extends DragonSlayer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      MeleeStrategy meleeStrategy0 = new MeleeStrategy();
      DragonSlayer dragonSlayer0 = new DragonSlayer(meleeStrategy0);
      dragonSlayer0.goToBattle();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      MeleeStrategy meleeStrategy0 = new MeleeStrategy();
      DragonSlayer dragonSlayer0 = new DragonSlayer(meleeStrategy0);
      dragonSlayer0.changeStrategy(meleeStrategy0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DragonSlayer dragonSlayer0 = new DragonSlayer((DragonSlayingStrategy) null);
      // Undeclared exception!
      try { 
        dragonSlayer0.goToBattle();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.strategy.DragonSlayingStrategy.execute()\" because \"this.strategy\" is null
         //
         verifyException("com.iluwatar.strategy.DragonSlayer", e);
      }
  }
}