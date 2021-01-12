/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 05:01:23 GMT 2021
 */

package com.iluwatar.event.asynchronous;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.event.asynchronous.Event;
import com.iluwatar.event.asynchronous.EventManager;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EventManager_ESTest extends EventManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      EventManager eventManager0 = new EventManager();
      try { 
        eventManager0.cancel(0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 0 does not exist.
         //
         verifyException("com.iluwatar.event.asynchronous.EventManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      EventManager eventManager0 = new EventManager();
      try { 
        eventManager0.start(0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 0 does not exist.
         //
         verifyException("com.iluwatar.event.asynchronous.EventManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Random.setNextRandom((-635));
      EventManager eventManager0 = new EventManager();
      int int0 = eventManager0.create((-635));
      assertEquals(636, eventManager0.numOfCurrentlyRunningSyncEvent());
      assertEquals(636, int0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      EventManager eventManager0 = new EventManager();
      assertEquals((-1), eventManager0.numOfCurrentlyRunningSyncEvent());
      
      eventManager0.create(1000);
      int int0 = eventManager0.numOfCurrentlyRunningSyncEvent();
      assertEquals(1, int0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      EventManager eventManager0 = new EventManager();
      eventManager0.createAsync(1);
      Map<Integer, Event> map0 = eventManager0.getEventPool();
      assertEquals(1, map0.size());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      EventManager eventManager0 = new EventManager();
      try { 
        eventManager0.createAsync(1800);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximum event time allowed is 1800 seconds. Please try again.
         //
         verifyException("com.iluwatar.event.asynchronous.EventManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      EventManager eventManager0 = new EventManager();
      // Undeclared exception!
      try { 
        eventManager0.completedEventHandler((-361));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.event.asynchronous.Event.status()\" because the return value of \"java.util.Map.get(Object)\" is null
         //
         verifyException("com.iluwatar.event.asynchronous.EventManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      EventManager eventManager0 = new EventManager();
      eventManager0.createAsync(1);
      // Undeclared exception!
      eventManager0.create(1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      EventManager eventManager0 = new EventManager();
      eventManager0.create(1000);
      assertEquals(1, eventManager0.numOfCurrentlyRunningSyncEvent());
      
      eventManager0.completedEventHandler(1);
      assertEquals((-1), eventManager0.numOfCurrentlyRunningSyncEvent());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      EventManager eventManager0 = new EventManager();
      eventManager0.createAsync(1000);
      eventManager0.completedEventHandler(1);
      assertEquals(1, EventManager.MIN_ID);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      EventManager eventManager0 = new EventManager();
      eventManager0.create(1000);
      // Undeclared exception!
      eventManager0.createAsync(1);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      EventManager eventManager0 = new EventManager();
      eventManager0.create(1000);
      eventManager0.status(1);
      assertEquals(1, eventManager0.numOfCurrentlyRunningSyncEvent());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      EventManager eventManager0 = new EventManager();
      try { 
        eventManager0.status(0);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // 0 does not exist.
         //
         verifyException("com.iluwatar.event.asynchronous.EventManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      EventManager eventManager0 = new EventManager();
      eventManager0.create((-2646));
      assertEquals(1, eventManager0.numOfCurrentlyRunningSyncEvent());
      
      eventManager0.cancel(1);
      assertEquals((-1), eventManager0.numOfCurrentlyRunningSyncEvent());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EventManager eventManager0 = new EventManager();
      int int0 = eventManager0.createAsync(1000);
      assertEquals(1, int0);
      
      eventManager0.start(1);
      assertEquals((-1), eventManager0.numOfCurrentlyRunningSyncEvent());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      EventManager eventManager0 = new EventManager();
      try { 
        eventManager0.create(3391);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Maximum event time allowed is 1800 seconds. Please try again.
         //
         verifyException("com.iluwatar.event.asynchronous.EventManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      EventManager eventManager0 = new EventManager();
      eventManager0.create(1000);
      try { 
        eventManager0.create(1);
        fail("Expecting exception: Exception");
      
      } catch(Exception e) {
         //
         // Event [1] is still running. Please wait until it finishes and try again.
         //
         verifyException("com.iluwatar.event.asynchronous.EventManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      EventManager eventManager0 = new EventManager();
      int int0 = eventManager0.numOfCurrentlyRunningSyncEvent();
      assertEquals((-1), int0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      EventManager eventManager0 = new EventManager();
      eventManager0.statusOfAllEvents();
      assertEquals((-1), eventManager0.numOfCurrentlyRunningSyncEvent());
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      EventManager eventManager0 = new EventManager();
      int int0 = eventManager0.createAsync(1);
      assertEquals(1, int0);
      
      eventManager0.cancel(1);
      assertEquals((-1), eventManager0.numOfCurrentlyRunningSyncEvent());
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      EventManager eventManager0 = new EventManager();
      eventManager0.getEventPool();
      assertEquals((-1), eventManager0.numOfCurrentlyRunningSyncEvent());
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      EventManager eventManager0 = new EventManager();
      eventManager0.shutdown();
      assertEquals((-1), eventManager0.numOfCurrentlyRunningSyncEvent());
  }
}
