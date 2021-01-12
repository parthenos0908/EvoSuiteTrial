/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 10:11:44 GMT 2021
 */

package com.iluwatar.mutex;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.mutex.Mutex;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Mutex_ESTest extends Mutex_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Mutex mutex0 = new Mutex();
      mutex0.acquire();
      Thread thread0 = (Thread)mutex0.getOwner();
      //  // Unstable assertion: assertFalse(thread0.isDaemon());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Mutex mutex0 = new Mutex();
      mutex0.release();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Mutex mutex0 = new Mutex();
      mutex0.acquire();
      mutex0.release();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Mutex mutex0 = new Mutex();
      Object object0 = mutex0.getOwner();
      assertNull(object0);
  }
}
