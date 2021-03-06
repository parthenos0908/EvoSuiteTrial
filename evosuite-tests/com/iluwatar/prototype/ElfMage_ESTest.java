/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 11:13:03 GMT 2021
 */

package com.iluwatar.prototype;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.prototype.ElfMage;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ElfMage_ESTest extends ElfMage_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ElfMage elfMage0 = null;
      try {
        elfMage0 = new ElfMage((ElfMage) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot read field \"helpType\"
         //
         verifyException("com.iluwatar.prototype.ElfMage", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ElfMage elfMage0 = new ElfMage((String) null);
      ElfMage elfMage1 = new ElfMage("Elven mage helps in null");
      boolean boolean0 = elfMage0.equals(elfMage1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ElfMage elfMage0 = new ElfMage("TYC2p?4\"7?`");
      ElfMage elfMage1 = new ElfMage(elfMage0);
      boolean boolean0 = elfMage1.equals(elfMage0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ElfMage elfMage0 = new ElfMage((String) null);
      boolean boolean0 = elfMage0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      ElfMage elfMage0 = new ElfMage("");
      boolean boolean0 = elfMage0.equals(elfMage0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      ElfMage elfMage0 = new ElfMage((String) null);
      ElfMage elfMage1 = elfMage0.copy();
      boolean boolean0 = elfMage1.equals(elfMage0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      ElfMage elfMage0 = new ElfMage((String) null);
      String string0 = elfMage0.toString();
      assertEquals("Elven mage helps in null", string0);
  }
}
