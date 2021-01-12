/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 12:57:43 GMT 2021
 */

package com.iluwatar.spatialpartition;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.spatialpartition.Bubble;
import com.iluwatar.spatialpartition.Point;
import java.util.Collection;
import java.util.Hashtable;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Bubble_ESTest extends Bubble_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Bubble bubble0 = new Bubble(0, 0, 0, 0);
      Hashtable<Integer, Bubble> hashtable0 = new Hashtable<Integer, Bubble>();
      bubble0.move();
      bubble0.move();
      Bubble bubble1 = new Bubble((-1), (-3), (-1), 0);
      hashtable0.put((Integer) (-1), bubble0);
      List<Bubble> list0 = List.of(bubble1, bubble1, bubble1, bubble1);
      bubble0.handleCollision(list0, hashtable0);
      assertEquals((-2), bubble0.coordinateX);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Bubble bubble0 = new Bubble(0, 0, 0, 0);
      Hashtable<Integer, Bubble> hashtable0 = new Hashtable<Integer, Bubble>();
      Bubble bubble1 = new Bubble((-1509), 0, (-2864), (-2864));
      Bubble bubble2 = new Bubble(0, (-3), 0, (-3));
      hashtable0.put((Integer) 0, bubble2);
      List<Bubble> list0 = List.of(bubble0, bubble0, bubble0);
      bubble1.handleCollision(list0, hashtable0);
      assertTrue(hashtable0.isEmpty());
      assertEquals(0, hashtable0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Bubble bubble0 = new Bubble(0, 0, 0, 0);
      Bubble bubble1 = new Bubble((-1509), 0, (-2864), (-2864));
      boolean boolean0 = bubble0.touches(bubble1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Bubble bubble0 = new Bubble(0, (-3), 0, (-3));
      bubble0.move();
      assertEquals((-4), bubble0.coordinateY);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Bubble bubble0 = new Bubble((-2493), 1, 1015, (-2493));
      // Undeclared exception!
      try { 
        bubble0.touches((Bubble) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot read field \"coordinateX\"
         //
         verifyException("com.iluwatar.spatialpartition.Bubble", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Bubble bubble0 = new Bubble(1, 0, 1, 1);
      // Undeclared exception!
      try { 
        bubble0.pop((Hashtable<Integer, Bubble>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"java.util.Hashtable.remove(Object)\" because \"allBubbles\" is null
         //
         verifyException("com.iluwatar.spatialpartition.Bubble", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Bubble bubble0 = new Bubble(0, 0, (-1791), (-757));
      Hashtable<Integer, Bubble> hashtable0 = new Hashtable<Integer, Bubble>();
      // Undeclared exception!
      try { 
        bubble0.handleCollision((Collection<? extends Point>) null, hashtable0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"java.util.Collection.iterator()\" because \"toCheck\" is null
         //
         verifyException("com.iluwatar.spatialpartition.Bubble", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Bubble bubble0 = new Bubble(0, 0, 0, 0);
      Hashtable<Integer, Bubble> hashtable0 = new Hashtable<Integer, Bubble>();
      hashtable0.put((Integer) 0, bubble0);
      Bubble bubble1 = new Bubble(937, 1032256, 1032256, 0);
      List<Bubble> list0 = List.of(bubble0, bubble1, bubble1);
      bubble1.handleCollision(list0, hashtable0);
      assertFalse(hashtable0.isEmpty());
      assertEquals(1, hashtable0.size());
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Bubble bubble0 = new Bubble(0, 0, 0, 0);
      Hashtable<Integer, Bubble> hashtable0 = new Hashtable<Integer, Bubble>();
      hashtable0.put((Integer) 0, bubble0);
      List<Bubble> list0 = List.of(bubble0, bubble0, bubble0);
      bubble0.handleCollision(list0, hashtable0);
      assertEquals(1, hashtable0.size());
      assertFalse(hashtable0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Bubble bubble0 = new Bubble(0, 0, 0, 0);
      Bubble bubble1 = new Bubble((-1), (-3), (-1), 0);
      boolean boolean0 = bubble1.touches(bubble0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Bubble bubble0 = new Bubble(0, 0, 0, 0);
      Hashtable<Integer, Bubble> hashtable0 = new Hashtable<Integer, Bubble>();
      bubble0.pop(hashtable0);
      assertEquals(0, bubble0.id);
  }
}
