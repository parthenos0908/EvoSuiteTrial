/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 09:37:07 GMT 2021
 */

package com.iluwatar.mediator;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.mediator.Action;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Action_ESTest extends Action_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Action[] actionArray0 = Action.values();
      assertEquals(5, actionArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Action action0 = Action.valueOf("NONE");
      assertEquals("", action0.getDescription());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Action action0 = Action.NONE;
      String string0 = action0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Action action0 = Action.GOLD;
      String string0 = action0.getDescription();
      assertEquals("takes his share of the gold", string0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Action action0 = Action.GOLD;
      String string0 = action0.toString();
      assertEquals("found gold", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Action action0 = Action.NONE;
      String string0 = action0.getDescription();
      assertEquals("", string0);
  }
}
