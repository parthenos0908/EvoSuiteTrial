/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 05:19:46 GMT 2021
 */

package com.iluwatar.facade;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.facade.DwarvenGoldmineFacade;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DwarvenGoldmineFacade_ESTest extends DwarvenGoldmineFacade_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DwarvenGoldmineFacade dwarvenGoldmineFacade0 = new DwarvenGoldmineFacade();
      dwarvenGoldmineFacade0.startNewDay();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DwarvenGoldmineFacade dwarvenGoldmineFacade0 = new DwarvenGoldmineFacade();
      dwarvenGoldmineFacade0.endDay();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DwarvenGoldmineFacade dwarvenGoldmineFacade0 = new DwarvenGoldmineFacade();
      dwarvenGoldmineFacade0.digOutGold();
  }
}
