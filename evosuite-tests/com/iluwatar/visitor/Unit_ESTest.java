/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 14:12:25 GMT 2021
 */

package com.iluwatar.visitor;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.visitor.Commander;
import com.iluwatar.visitor.Sergeant;
import com.iluwatar.visitor.SoldierVisitor;
import com.iluwatar.visitor.Unit;
import com.iluwatar.visitor.UnitVisitor;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Unit_ESTest extends Unit_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Unit[] unitArray0 = new Unit[0];
      Sergeant sergeant0 = new Sergeant(unitArray0);
      SoldierVisitor soldierVisitor0 = new SoldierVisitor();
      sergeant0.accept(soldierVisitor0);
      assertEquals("sergeant", sergeant0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Unit[] unitArray0 = new Unit[0];
      Commander commander0 = new Commander(unitArray0);
      // Undeclared exception!
      try { 
        commander0.accept((UnitVisitor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.visitor.UnitVisitor.visitCommander(com.iluwatar.visitor.Commander)\" because \"visitor\" is null
         //
         verifyException("com.iluwatar.visitor.Commander", e);
      }
  }
}
