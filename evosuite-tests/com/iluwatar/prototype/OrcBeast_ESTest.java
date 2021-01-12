/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 11:17:31 GMT 2021
 */

package com.iluwatar.prototype;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.prototype.OrcBeast;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class OrcBeast_ESTest extends OrcBeast_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OrcBeast orcBeast0 = null;
      try {
        orcBeast0 = new OrcBeast((OrcBeast) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot read field \"weapon\"
         //
         verifyException("com.iluwatar.prototype.OrcBeast", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      OrcBeast orcBeast0 = new OrcBeast("!Z!5PBBtiW44[");
      OrcBeast orcBeast1 = new OrcBeast(orcBeast0);
      assertEquals("Orcish wolf attacks with !Z!5PBBtiW44[", orcBeast1.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      OrcBeast orcBeast0 = new OrcBeast((String) null);
      OrcBeast orcBeast1 = new OrcBeast("vFC`");
      boolean boolean0 = orcBeast0.equals(orcBeast1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      OrcBeast orcBeast0 = new OrcBeast("!Z!5PBBtiW44[");
      OrcBeast orcBeast1 = orcBeast0.copy();
      boolean boolean0 = orcBeast1.equals(orcBeast0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      OrcBeast orcBeast0 = new OrcBeast("!Z!5PBBtiW44[");
      Object object0 = new Object();
      boolean boolean0 = orcBeast0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      OrcBeast orcBeast0 = new OrcBeast("");
      boolean boolean0 = orcBeast0.equals(orcBeast0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      OrcBeast orcBeast0 = new OrcBeast("!Z!5PBBtiW44[");
      String string0 = orcBeast0.toString();
      assertEquals("Orcish wolf attacks with !Z!5PBBtiW44[", string0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      OrcBeast orcBeast0 = new OrcBeast((String) null);
      OrcBeast orcBeast1 = orcBeast0.copy();
      boolean boolean0 = orcBeast1.equals(orcBeast0);
      assertTrue(boolean0);
  }
}