/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 02:15:24 GMT 2021
 */

package com.iluwatar.abstractfactory;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.abstractfactory.ElfArmy;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ElfArmy_ESTest extends ElfArmy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ElfArmy elfArmy0 = new ElfArmy();
      String string0 = elfArmy0.getDescription();
      assertEquals("This is the Elven Army!", string0);
  }
}