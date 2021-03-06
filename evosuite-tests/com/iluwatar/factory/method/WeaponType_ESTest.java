/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 05:34:44 GMT 2021
 */

package com.iluwatar.factory.method;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.factory.method.WeaponType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class WeaponType_ESTest extends WeaponType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WeaponType[] weaponTypeArray0 = WeaponType.values();
      assertEquals(4, weaponTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      WeaponType weaponType0 = WeaponType.valueOf("AXE");
      assertEquals("axe", weaponType0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      WeaponType weaponType0 = WeaponType.UNDEFINED;
      String string0 = weaponType0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      WeaponType weaponType0 = WeaponType.SHORT_SWORD;
      String string0 = weaponType0.toString();
      assertEquals("short sword", string0);
  }
}
