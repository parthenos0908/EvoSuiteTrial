/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 11:51:32 GMT 2021
 */

package com.iluwatar.resource.acquisition.is.initialization;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.resource.acquisition.is.initialization.SlidingDoor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SlidingDoor_ESTest extends SlidingDoor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SlidingDoor slidingDoor0 = new SlidingDoor();
      slidingDoor0.close();
  }
}