/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 10:15:54 GMT 2021
 */

package com.iluwatar.objectmother;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.objectmother.King;
import com.iluwatar.objectmother.Queen;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Queen_ESTest extends Queen_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Queen queen0 = new Queen();
      assertFalse(queen0.isFlirty());
      
      queen0.setFlirtiness(true);
      boolean boolean0 = queen0.isFlirty();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Queen queen0 = new Queen();
      queen0.setFlirtiness(true);
      // Undeclared exception!
      try { 
        queen0.getFlirted((King) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot read field \"isHappy\" because \"king\" is null
         //
         verifyException("com.iluwatar.objectmother.Queen", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Queen queen0 = new Queen();
      assertFalse(queen0.isFlirty());
      
      queen0.setFlirtiness(true);
      King king0 = new King();
      king0.isHappy = true;
      king0.isDrunk = true;
      boolean boolean0 = queen0.getFlirted(king0);
      assertTrue(queen0.isFlirty());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Queen queen0 = new Queen();
      assertFalse(queen0.isFlirty());
      
      queen0.setFlirtiness(true);
      King king0 = new King();
      king0.makeHappy();
      boolean boolean0 = queen0.getFlirted(king0);
      assertTrue(queen0.isFlirty());
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Queen queen0 = new Queen();
      assertFalse(queen0.isFlirty());
      
      queen0.setFlirtiness(true);
      King king0 = new King();
      boolean boolean0 = queen0.getFlirted(king0);
      assertTrue(queen0.isFlirty());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Queen queen0 = new Queen();
      King king0 = new King();
      boolean boolean0 = queen0.getFlirted(king0);
      assertFalse(queen0.isFlirty());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Queen queen0 = new Queen();
      queen0.makeUnhappy();
      assertFalse(queen0.isFlirty());
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Queen queen0 = new Queen();
      boolean boolean0 = queen0.isFlirty();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Queen queen0 = new Queen();
      queen0.makeHappy();
      assertFalse(queen0.isFlirty());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Queen queen0 = new Queen();
      queen0.makeSober();
      assertFalse(queen0.isFlirty());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Queen queen0 = new Queen();
      queen0.makeDrunk();
      assertFalse(queen0.isFlirty());
  }
}