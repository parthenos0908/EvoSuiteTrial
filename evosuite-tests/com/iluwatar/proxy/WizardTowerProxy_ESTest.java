/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 11:22:15 GMT 2021
 */

package com.iluwatar.proxy;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.proxy.IvoryTower;
import com.iluwatar.proxy.Wizard;
import com.iluwatar.proxy.WizardTower;
import com.iluwatar.proxy.WizardTowerProxy;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class WizardTowerProxy_ESTest extends WizardTowerProxy_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      WizardTowerProxy wizardTowerProxy0 = new WizardTowerProxy((WizardTower) null);
      // Undeclared exception!
      try { 
        wizardTowerProxy0.enter((Wizard) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.proxy.WizardTower.enter(com.iluwatar.proxy.Wizard)\" because \"this.tower\" is null
         //
         verifyException("com.iluwatar.proxy.WizardTowerProxy", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      IvoryTower ivoryTower0 = new IvoryTower();
      WizardTowerProxy wizardTowerProxy0 = new WizardTowerProxy(ivoryTower0);
      wizardTowerProxy0.enter((Wizard) null);
      wizardTowerProxy0.enter((Wizard) null);
      wizardTowerProxy0.enter((Wizard) null);
      wizardTowerProxy0.enter((Wizard) null);
  }
}
