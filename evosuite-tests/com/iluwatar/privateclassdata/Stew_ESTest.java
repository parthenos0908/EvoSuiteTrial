/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 10:44:17 GMT 2021
 */

package com.iluwatar.privateclassdata;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.privateclassdata.Stew;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Stew_ESTest extends Stew_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Stew stew0 = new Stew(0, 0, 0, 0);
      stew0.taste();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Stew stew0 = new Stew((-1), (-1), (-1), (-1));
      stew0.taste();
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Stew stew0 = new Stew(646, 1, (-849), 646);
      stew0.taste();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Stew stew0 = new Stew(2, 2, 2, (-71));
      stew0.taste();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Stew stew0 = new Stew((-660), (-660), (-660), 2476);
      stew0.mix();
  }
}
