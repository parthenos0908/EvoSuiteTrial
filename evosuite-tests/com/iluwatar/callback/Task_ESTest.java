/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 03:09:19 GMT 2021
 */

package com.iluwatar.callback;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.callback.Callback;
import com.iluwatar.callback.SimpleTask;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Task_ESTest extends Task_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SimpleTask simpleTask0 = new SimpleTask();
      simpleTask0.execute();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SimpleTask simpleTask0 = new SimpleTask();
      simpleTask0.executeWith((Callback) null);
  }
}
