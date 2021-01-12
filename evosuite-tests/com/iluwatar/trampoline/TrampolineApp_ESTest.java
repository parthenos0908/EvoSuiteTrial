/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 13:45:17 GMT 2021
 */

package com.iluwatar.trampoline;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.trampoline.Trampoline;
import com.iluwatar.trampoline.TrampolineApp;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TrampolineApp_ESTest extends TrampolineApp_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Trampoline<Integer> trampoline0 = TrampolineApp.loop(0, (-2360));
      assertNotNull(trampoline0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Trampoline<Integer> trampoline0 = TrampolineApp.loop((-410), 0);
      assertNotNull(trampoline0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      TrampolineApp trampolineApp0 = new TrampolineApp();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      String[] stringArray0 = new String[9];
      TrampolineApp.main(stringArray0);
      assertEquals(9, stringArray0.length);
  }
}
