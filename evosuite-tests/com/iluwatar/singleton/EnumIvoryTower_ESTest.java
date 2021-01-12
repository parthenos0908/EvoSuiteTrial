/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 12:51:46 GMT 2021
 */

package com.iluwatar.singleton;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.singleton.EnumIvoryTower;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EnumIvoryTower_ESTest extends EnumIvoryTower_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EnumIvoryTower[] enumIvoryTowerArray0 = EnumIvoryTower.values();
      assertEquals(1, enumIvoryTowerArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EnumIvoryTower enumIvoryTower0 = EnumIvoryTower.valueOf("INSTANCE");
      assertEquals(EnumIvoryTower.INSTANCE, enumIvoryTower0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      EnumIvoryTower enumIvoryTower0 = EnumIvoryTower.INSTANCE;
      String string0 = enumIvoryTower0.toString();
      assertNotNull(string0);
  }
}