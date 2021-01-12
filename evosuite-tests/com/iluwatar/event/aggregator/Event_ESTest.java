/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 04:51:52 GMT 2021
 */

package com.iluwatar.event.aggregator;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.event.aggregator.Event;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Event_ESTest extends Event_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Event[] eventArray0 = Event.values();
      assertEquals(3, eventArray0.length);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Event event0 = Event.valueOf("STARK_SIGHTED");
      assertEquals(Event.STARK_SIGHTED, event0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Event event0 = Event.WARSHIPS_APPROACHING;
      String string0 = event0.toString();
      assertEquals("Warships approaching", string0);
  }
}
