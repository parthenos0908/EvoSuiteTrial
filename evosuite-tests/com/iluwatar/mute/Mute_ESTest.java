/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 10:04:25 GMT 2021
 */

package com.iluwatar.mute;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.mute.CheckedRunnable;
import com.iluwatar.mute.Mute;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Mute_ESTest extends Mute_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CheckedRunnable checkedRunnable0 = mock(CheckedRunnable.class, new ViolatedAssumptionAnswer());
      Mute.mute(checkedRunnable0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CheckedRunnable checkedRunnable0 = mock(CheckedRunnable.class, new ViolatedAssumptionAnswer());
      Mute.loggedMute(checkedRunnable0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Mute.loggedMute((CheckedRunnable) null);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        Mute.mute((CheckedRunnable) null);
        fail("Expecting exception: AssertionError");
      
      } catch(AssertionError e) {
         //
         // java.lang.NullPointerException: Cannot invoke \"com.iluwatar.mute.CheckedRunnable.run()\" because \"runnable\" is null
         //
      }
  }
}