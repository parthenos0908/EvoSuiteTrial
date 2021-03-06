/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 13:51:19 GMT 2021
 */

package com.iluwatar.twin;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.twin.BallItem;
import com.iluwatar.twin.BallThread;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class BallItem_ESTest extends BallItem_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      BallItem ballItem0 = new BallItem();
      // Undeclared exception!
      try { 
        ballItem0.click();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.twin.BallThread.suspendMe()\" because \"this.twin\" is null
         //
         verifyException("com.iluwatar.twin.BallItem", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      BallItem ballItem0 = new BallItem();
      BallThread ballThread0 = new BallThread();
      ballItem0.setTwin(ballThread0);
      ballItem0.click();
      ballItem0.click();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      BallItem ballItem0 = new BallItem();
      ballItem0.doDraw();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      BallItem ballItem0 = new BallItem();
      ballItem0.move();
  }
}
