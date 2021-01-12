/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 13:09:06 GMT 2021
 */

package com.iluwatar.specification.creature;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.specification.creature.Octopus;
import com.iluwatar.specification.property.Color;
import com.iluwatar.specification.property.Mass;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Octopus_ESTest extends Octopus_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Mass mass0 = new Mass(0.0);
      Octopus octopus0 = new Octopus(mass0);
      assertEquals("Octopus", octopus0.getName());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Octopus octopus0 = new Octopus();
      assertEquals(Color.DARK, octopus0.getColor());
  }
}