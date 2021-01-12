/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 04:21:54 GMT 2021
 */

package com.iluwatar.data.locality.game.component.manager;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.data.locality.game.component.manager.PhysicsComponentManager;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PhysicsComponentManager_ESTest extends PhysicsComponentManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      PhysicsComponentManager physicsComponentManager0 = new PhysicsComponentManager(1);
      physicsComponentManager0.update();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      PhysicsComponentManager physicsComponentManager0 = new PhysicsComponentManager(0);
      physicsComponentManager0.start();
  }
}
