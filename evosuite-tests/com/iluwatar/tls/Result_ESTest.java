/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 13:42:39 GMT 2021
 */

package com.iluwatar.tls;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.tls.Result;
import java.util.Date;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Result_ESTest extends Result_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Result result0 = new Result();
      List<Date> list0 = result0.getDateList();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Result result0 = new Result();
      List<String> list0 = result0.getExceptionList();
      assertTrue(list0.isEmpty());
  }
}
