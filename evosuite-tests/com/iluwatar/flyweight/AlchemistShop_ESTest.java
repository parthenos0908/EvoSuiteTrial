/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 05:56:51 GMT 2021
 */

package com.iluwatar.flyweight;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.flyweight.AlchemistShop;
import com.iluwatar.flyweight.Potion;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AlchemistShop_ESTest extends AlchemistShop_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AlchemistShop alchemistShop0 = new AlchemistShop();
      List<Potion> list0 = alchemistShop0.getBottomShelf();
      assertEquals(5, list0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AlchemistShop alchemistShop0 = new AlchemistShop();
      alchemistShop0.enumerate();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AlchemistShop alchemistShop0 = new AlchemistShop();
      List<Potion> list0 = alchemistShop0.getTopShelf();
      assertFalse(list0.isEmpty());
  }
}
