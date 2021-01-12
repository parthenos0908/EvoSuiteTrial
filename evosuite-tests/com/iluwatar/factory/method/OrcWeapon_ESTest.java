/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 05:33:38 GMT 2021
 */

package com.iluwatar.factory.method;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.factory.method.OrcWeapon;
import com.iluwatar.factory.method.WeaponType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class OrcWeapon_ESTest extends OrcWeapon_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WeaponType weaponType0 = WeaponType.SHORT_SWORD;
      OrcWeapon orcWeapon0 = new OrcWeapon(weaponType0);
      WeaponType weaponType1 = orcWeapon0.getWeaponType();
      assertEquals(WeaponType.SHORT_SWORD, weaponType1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      OrcWeapon orcWeapon0 = new OrcWeapon((WeaponType) null);
      String string0 = orcWeapon0.toString();
      assertEquals("Orcish null", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      OrcWeapon orcWeapon0 = new OrcWeapon((WeaponType) null);
      orcWeapon0.getWeaponType();
  }
}