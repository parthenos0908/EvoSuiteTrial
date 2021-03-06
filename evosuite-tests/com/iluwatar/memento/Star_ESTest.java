/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 09:45:04 GMT 2021
 */

package com.iluwatar.memento;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.memento.Star;
import com.iluwatar.memento.StarMemento;
import com.iluwatar.memento.StarType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Star_ESTest extends Star_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StarType starType0 = StarType.DEAD;
      Star star0 = new Star(starType0, 0, 2);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StarType starType0 = StarType.SUPERNOVA;
      Star star0 = new Star(starType0, 1984, 1984);
      String string0 = star0.toString();
      assertEquals("supernova age: 1984 years mass: 1984 tons", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Star star0 = new Star((StarType) null, 0, 0);
      // Undeclared exception!
      try { 
        star0.timePasses();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.memento.StarType.ordinal()\" because \"this.type\" is null
         //
         verifyException("com.iluwatar.memento.Star", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StarType starType0 = StarType.WHITE_DWARF;
      Star star0 = new Star(starType0, (-3877), (-3877));
      // Undeclared exception!
      try { 
        star0.setMemento((StarMemento) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.memento.Star$StarMementoInternal.getType()\" because \"state\" is null
         //
         verifyException("com.iluwatar.memento.Star", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StarType starType0 = StarType.WHITE_DWARF;
      Star star0 = new Star(starType0, 1984, 1984);
      star0.timePasses();
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StarType starType0 = StarType.SUPERNOVA;
      Star star0 = new Star(starType0, 1984, 1984);
      star0.timePasses();
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StarType starType0 = StarType.SUN;
      Star star0 = new Star(starType0, 1662, 1662);
      star0.timePasses();
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StarType starType0 = StarType.DEAD;
      Star star0 = new Star(starType0, (-2366), (-2366));
      star0.timePasses();
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StarType starType0 = StarType.RED_GIANT;
      Star star0 = new Star(starType0, 3292, 3292);
      star0.timePasses();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StarType starType0 = StarType.DEAD;
      Star star0 = new Star(starType0, 1, 1);
      StarMemento starMemento0 = star0.getMemento();
      star0.setMemento(starMemento0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Star star0 = new Star((StarType) null, (-1036), (-1036));
      // Undeclared exception!
      try { 
        star0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.memento.StarType.toString()\" because \"this.type\" is null
         //
         verifyException("com.iluwatar.memento.Star", e);
      }
  }
}
