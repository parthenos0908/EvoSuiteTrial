/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 14:01:41 GMT 2021
 */

package com.iluwatar.updatemethod;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.updatemethod.Statue;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Statue_ESTest extends Statue_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Statue statue0 = new Statue((-3013), (-1));
      statue0.delay = 113;
      statue0.update();
      assertEquals(0, statue0.getPosition());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Statue statue0 = new Statue((-2046), 1);
      statue0.setPosition(1667);
      statue0.update();
      assertEquals(1667, statue0.getPosition());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Statue statue0 = new Statue(1765);
      statue0.update();
      assertEquals(0, statue0.getPosition());
  }
}