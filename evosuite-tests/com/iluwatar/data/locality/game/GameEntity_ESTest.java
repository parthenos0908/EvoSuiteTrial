/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 04:22:16 GMT 2021
 */

package com.iluwatar.data.locality.game;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.data.locality.game.GameEntity;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class GameEntity_ESTest extends GameEntity_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GameEntity gameEntity0 = new GameEntity(0);
      gameEntity0.update();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GameEntity gameEntity0 = new GameEntity(0);
      gameEntity0.start();
  }
}
