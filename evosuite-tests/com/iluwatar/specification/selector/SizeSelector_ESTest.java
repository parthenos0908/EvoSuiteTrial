/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 13:17:48 GMT 2021
 */

package com.iluwatar.specification.selector;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.specification.creature.Creature;
import com.iluwatar.specification.creature.KillerBee;
import com.iluwatar.specification.creature.Shark;
import com.iluwatar.specification.property.Mass;
import com.iluwatar.specification.property.Size;
import com.iluwatar.specification.selector.SizeSelector;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SizeSelector_ESTest extends SizeSelector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Size size0 = Size.SMALL;
      SizeSelector sizeSelector0 = new SizeSelector(size0);
      Mass mass0 = new Mass(1.0);
      KillerBee killerBee0 = new KillerBee(mass0);
      boolean boolean0 = sizeSelector0.test((Creature) killerBee0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Size size0 = Size.NORMAL;
      SizeSelector sizeSelector0 = new SizeSelector(size0);
      // Undeclared exception!
      try { 
        sizeSelector0.test((Creature) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.specification.creature.Creature.getSize()\" because \"t\" is null
         //
         verifyException("com.iluwatar.specification.selector.SizeSelector", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Size size0 = Size.LARGE;
      SizeSelector sizeSelector0 = new SizeSelector(size0);
      Shark shark0 = new Shark();
      boolean boolean0 = sizeSelector0.test((Creature) shark0);
      assertFalse(boolean0);
  }
}