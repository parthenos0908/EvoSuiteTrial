/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 11:18:38 GMT 2021
 */

package com.iluwatar.prototype;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.prototype.OrcMage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class OrcMage_ESTest extends OrcMage_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OrcMage orcMage0 = null;
      try {
        orcMage0 = new OrcMage((OrcMage) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot read field \"weapon\"
         //
         verifyException("com.iluwatar.prototype.OrcMage", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      OrcMage orcMage0 = new OrcMage((String) null);
      OrcMage orcMage1 = new OrcMage("");
      boolean boolean0 = orcMage0.equals(orcMage1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      OrcMage orcMage0 = new OrcMage("Do<o:pJ");
      OrcMage orcMage1 = new OrcMage(orcMage0);
      boolean boolean0 = orcMage0.equals(orcMage1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      OrcMage orcMage0 = new OrcMage("Do<o:pJ");
      boolean boolean0 = orcMage0.equals(orcMage0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      OrcMage orcMage0 = new OrcMage((String) null);
      boolean boolean0 = orcMage0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      OrcMage orcMage0 = new OrcMage((String) null);
      OrcMage orcMage1 = orcMage0.copy();
      boolean boolean0 = orcMage0.equals(orcMage1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      OrcMage orcMage0 = new OrcMage((String) null);
      String string0 = orcMage0.toString();
      assertEquals("Orcish mage attacks with null", string0);
  }
}