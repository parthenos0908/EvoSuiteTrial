/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 02:47:41 GMT 2021
 */

package com.iluwatar.bridge;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.bridge.Enchantment;
import com.iluwatar.bridge.FlyingEnchantment;
import com.iluwatar.bridge.SoulEatingEnchantment;
import com.iluwatar.bridge.Sword;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Sword_ESTest extends Sword_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Sword sword0 = new Sword((Enchantment) null);
      Enchantment enchantment0 = sword0.getEnchantment();
      assertNull(enchantment0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Sword sword0 = new Sword((Enchantment) null);
      // Undeclared exception!
      try { 
        sword0.wield();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.bridge.Enchantment.onActivate()\" because \"this.enchantment\" is null
         //
         verifyException("com.iluwatar.bridge.Sword", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Sword sword0 = new Sword((Enchantment) null);
      // Undeclared exception!
      try { 
        sword0.unwield();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.bridge.Enchantment.onDeactivate()\" because \"this.enchantment\" is null
         //
         verifyException("com.iluwatar.bridge.Sword", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Sword sword0 = new Sword((Enchantment) null);
      // Undeclared exception!
      try { 
        sword0.swing();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.bridge.Enchantment.apply()\" because \"this.enchantment\" is null
         //
         verifyException("com.iluwatar.bridge.Sword", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SoulEatingEnchantment soulEatingEnchantment0 = new SoulEatingEnchantment();
      Sword sword0 = new Sword(soulEatingEnchantment0);
      Enchantment enchantment0 = sword0.getEnchantment();
      assertSame(soulEatingEnchantment0, enchantment0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      FlyingEnchantment flyingEnchantment0 = new FlyingEnchantment();
      Sword sword0 = new Sword(flyingEnchantment0);
      sword0.unwield();
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      FlyingEnchantment flyingEnchantment0 = new FlyingEnchantment();
      Sword sword0 = new Sword(flyingEnchantment0);
      sword0.swing();
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      FlyingEnchantment flyingEnchantment0 = new FlyingEnchantment();
      Sword sword0 = new Sword(flyingEnchantment0);
      sword0.wield();
  }
}
