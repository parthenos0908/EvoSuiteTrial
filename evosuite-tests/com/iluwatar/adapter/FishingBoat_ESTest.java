/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 02:29:20 GMT 2021
 */

package com.iluwatar.adapter;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.adapter.FishingBoat;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FishingBoat_ESTest extends FishingBoat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FishingBoat fishingBoat0 = new FishingBoat();
      fishingBoat0.sail();
  }
}
