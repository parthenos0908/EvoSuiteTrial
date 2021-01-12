/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 04:49:58 GMT 2021
 */

package com.iluwatar.doubledispatch;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.doubledispatch.FlamingAsteroid;
import com.iluwatar.doubledispatch.GameObject;
import com.iluwatar.doubledispatch.Meteoroid;
import com.iluwatar.doubledispatch.SpaceStationIss;
import com.iluwatar.doubledispatch.SpaceStationMir;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SpaceStationMir_ESTest extends SpaceStationMir_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      SpaceStationMir spaceStationMir0 = new SpaceStationMir(0, 4, 2, 0);
      spaceStationMir0.collisionResolve(spaceStationMir0);
      assertTrue(spaceStationMir0.isDamaged());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      SpaceStationIss spaceStationIss0 = new SpaceStationIss(3, (-605), 3, 0);
      // Undeclared exception!
      try { 
        spaceStationIss0.collisionResolve((SpaceStationIss) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"Object.getClass()\" because \"iss\" is null
         //
         verifyException("com.iluwatar.doubledispatch.SpaceStationMir", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      SpaceStationMir spaceStationMir0 = new SpaceStationMir(730, 0, 730, 0);
      // Undeclared exception!
      try { 
        spaceStationMir0.collisionResolve((Meteoroid) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"Object.getClass()\" because \"meteoroid\" is null
         //
         verifyException("com.iluwatar.doubledispatch.SpaceStationMir", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SpaceStationMir spaceStationMir0 = new SpaceStationMir(0, 4, 2, 0);
      // Undeclared exception!
      try { 
        spaceStationMir0.collisionResolve((FlamingAsteroid) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"Object.getClass()\" because \"asteroid\" is null
         //
         verifyException("com.iluwatar.doubledispatch.SpaceStationMir", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SpaceStationIss spaceStationIss0 = new SpaceStationIss(2426, 131, 0, 4);
      // Undeclared exception!
      try { 
        spaceStationIss0.collisionResolve((SpaceStationMir) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"Object.getClass()\"
         //
         verifyException("com.iluwatar.doubledispatch.SpaceStationMir", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      SpaceStationMir spaceStationMir0 = new SpaceStationMir((-418), 1227, 4, 131);
      SpaceStationIss spaceStationIss0 = new SpaceStationIss(2426, 131, 0, 4);
      spaceStationMir0.collisionResolve(spaceStationIss0);
      assertTrue(spaceStationMir0.isDamaged());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SpaceStationMir spaceStationMir0 = new SpaceStationMir(0, 4, 2, 0);
      Meteoroid meteoroid0 = new Meteoroid(164, 3720, 2564, (-2056));
      spaceStationMir0.collisionResolve(meteoroid0);
      assertTrue(spaceStationMir0.isDamaged());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      SpaceStationMir spaceStationMir0 = new SpaceStationMir((-3398), 0, 1244, 0);
      spaceStationMir0.collision(spaceStationMir0);
      assertTrue(spaceStationMir0.isDamaged());
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      SpaceStationIss spaceStationIss0 = new SpaceStationIss(257, 257, (-2572), (-2572));
      FlamingAsteroid flamingAsteroid0 = new FlamingAsteroid(257, 436, 257, 0);
      spaceStationIss0.collisionResolve(flamingAsteroid0);
      assertTrue(spaceStationIss0.isOnFire());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      SpaceStationIss spaceStationIss0 = new SpaceStationIss(172, 172, 172, 172);
      // Undeclared exception!
      try { 
        spaceStationIss0.collision((GameObject) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.doubledispatch.GameObject.collisionResolve(com.iluwatar.doubledispatch.SpaceStationIss)\" because \"gameObject\" is null
         //
         verifyException("com.iluwatar.doubledispatch.SpaceStationIss", e);
      }
  }
}