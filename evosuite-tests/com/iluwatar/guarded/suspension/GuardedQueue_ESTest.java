/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 06:12:57 GMT 2021
 */

package com.iluwatar.guarded.suspension;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.guarded.suspension.GuardedQueue;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class GuardedQueue_ESTest extends GuardedQueue_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      GuardedQueue guardedQueue0 = new GuardedQueue();
      Integer integer0 = new Integer(0);
      guardedQueue0.put(integer0);
      Integer integer1 = guardedQueue0.get();
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      GuardedQueue guardedQueue0 = new GuardedQueue();
      Integer integer0 = new Integer(1);
      guardedQueue0.put(integer0);
      Integer integer1 = guardedQueue0.get();
      assertEquals(1, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      GuardedQueue guardedQueue0 = new GuardedQueue();
      guardedQueue0.put((Integer) null);
      Integer integer0 = guardedQueue0.get();
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      GuardedQueue guardedQueue0 = new GuardedQueue();
      Integer integer0 = Integer.getInteger("", (-132));
      guardedQueue0.put(integer0);
      Integer integer1 = guardedQueue0.get();
      assertEquals((-132), (int)integer1);
  }
}
