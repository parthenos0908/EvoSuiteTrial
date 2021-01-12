/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 08:54:32 GMT 2021
 */

package com.iluwatar.layers.view;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.layers.service.CakeBakingService;
import com.iluwatar.layers.view.CakeViewImpl;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CakeViewImpl_ESTest extends CakeViewImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      CakeBakingService cakeBakingService0 = mock(CakeBakingService.class, new ViolatedAssumptionAnswer());
      doReturn((List) null).when(cakeBakingService0).getAllCakes();
      CakeViewImpl cakeViewImpl0 = new CakeViewImpl(cakeBakingService0);
      // Undeclared exception!
      try { 
        cakeViewImpl0.render();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"java.util.List.forEach(java.util.function.Consumer)\" because the return value of \"com.iluwatar.layers.service.CakeBakingService.getAllCakes()\" is null
         //
         verifyException("com.iluwatar.layers.view.CakeViewImpl", e);
      }
  }
}
