/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 10:23:10 GMT 2021
 */

package com.iluwatar.observer;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.observer.Orcs;
import com.iluwatar.observer.WeatherType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Orcs_ESTest extends Orcs_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Orcs orcs0 = new Orcs();
      WeatherType weatherType0 = WeatherType.WINDY;
      orcs0.update(weatherType0);
  }
}
