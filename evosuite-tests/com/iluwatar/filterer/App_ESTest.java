/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 05:39:29 GMT 2021
 */

package com.iluwatar.filterer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.filterer.App;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class App_ESTest extends App_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String[] stringArray0 = new String[8];
      // Undeclared exception!
      try { 
        App.main(stringArray0);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/common/collect/ImmutableList
         //
         verifyException("com.iluwatar.filterer.threat.SimpleThreatAwareSystem", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      App app0 = new App();
  }
}