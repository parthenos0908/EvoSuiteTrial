/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 06:04:32 GMT 2021
 */

package com.iluwatar.gameloop;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.gameloop.FrameBasedGameLoop;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FrameBasedGameLoop_ESTest extends FrameBasedGameLoop_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      FrameBasedGameLoop frameBasedGameLoop0 = new FrameBasedGameLoop();
      frameBasedGameLoop0.processGameLoop();
      assertFalse(frameBasedGameLoop0.isGameRunning());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      FrameBasedGameLoop frameBasedGameLoop0 = new FrameBasedGameLoop();
      frameBasedGameLoop0.update();
      assertFalse(frameBasedGameLoop0.isGameRunning());
  }
}
