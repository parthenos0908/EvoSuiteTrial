/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 11:56:56 GMT 2021
 */

package com.iluwatar.roleobject;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.roleobject.ApplicationRoleObject;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ApplicationRoleObject_ESTest extends ApplicationRoleObject_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ApplicationRoleObject applicationRoleObject0 = new ApplicationRoleObject();
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String[] stringArray0 = new String[11];
      ApplicationRoleObject.main(stringArray0);
      assertEquals(11, stringArray0.length);
  }
}
