/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 05:21:59 GMT 2021
 */

package com.iluwatar.facade;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.facade.DwarvenTunnelDigger;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DwarvenTunnelDigger_ESTest extends DwarvenTunnelDigger_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DwarvenTunnelDigger dwarvenTunnelDigger0 = new DwarvenTunnelDigger();
      String string0 = dwarvenTunnelDigger0.name();
      assertEquals("Dwarven tunnel digger", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DwarvenTunnelDigger dwarvenTunnelDigger0 = new DwarvenTunnelDigger();
      dwarvenTunnelDigger0.work();
      assertEquals("Dwarven tunnel digger", dwarvenTunnelDigger0.name());
  }
}
