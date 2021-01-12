/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 02:51:09 GMT 2021
 */

package com.iluwatar.builder;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.builder.HairType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class HairType_ESTest extends HairType_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HairType[] hairTypeArray0 = HairType.values();
      assertEquals(5, hairTypeArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HairType hairType0 = HairType.valueOf("BALD");
      assertEquals(HairType.BALD, hairType0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      HairType hairType0 = HairType.BALD;
      String string0 = hairType0.toString();
      assertEquals("bald", string0);
  }
}
