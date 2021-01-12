/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 02:18:43 GMT 2021
 */

package com.iluwatar.abstractfactory;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.abstractfactory.Army;
import com.iluwatar.abstractfactory.Castle;
import com.iluwatar.abstractfactory.ElfKingdomFactory;
import com.iluwatar.abstractfactory.King;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ElfKingdomFactory_ESTest extends ElfKingdomFactory_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ElfKingdomFactory elfKingdomFactory0 = new ElfKingdomFactory();
      Army army0 = elfKingdomFactory0.createArmy();
      assertEquals("This is the Elven Army!", army0.getDescription());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ElfKingdomFactory elfKingdomFactory0 = new ElfKingdomFactory();
      King king0 = elfKingdomFactory0.createKing();
      assertEquals("This is the Elven king!", king0.getDescription());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ElfKingdomFactory elfKingdomFactory0 = new ElfKingdomFactory();
      Castle castle0 = elfKingdomFactory0.createCastle();
      assertEquals("This is the Elven castle!", castle0.getDescription());
  }
}