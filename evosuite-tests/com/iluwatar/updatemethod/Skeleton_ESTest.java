/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 14:01:35 GMT 2021
 */

package com.iluwatar.updatemethod;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.updatemethod.Skeleton;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Skeleton_ESTest extends Skeleton_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Skeleton skeleton0 = new Skeleton(0);
      skeleton0.setPosition(470);
      skeleton0.update();
      assertEquals(471, skeleton0.getPosition());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Skeleton skeleton0 = new Skeleton(3012, 3012);
      skeleton0.setPosition(3012);
      skeleton0.patrollingLeft = true;
      skeleton0.update();
      assertEquals(3011, skeleton0.getPosition());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Skeleton skeleton0 = new Skeleton(100);
      skeleton0.setPosition(98);
      skeleton0.update();
      skeleton0.update();
      assertEquals(100, skeleton0.getPosition());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Skeleton skeleton0 = new Skeleton(0);
      skeleton0.update();
      skeleton0.patrollingLeft = true;
      skeleton0.update();
      assertEquals(0, skeleton0.getPosition());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Skeleton skeleton0 = new Skeleton(107);
      skeleton0.patrollingLeft = true;
      skeleton0.update();
      assertEquals((-1), skeleton0.getPosition());
  }
}
