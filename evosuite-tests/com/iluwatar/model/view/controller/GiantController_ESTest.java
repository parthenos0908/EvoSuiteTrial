/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 09:48:31 GMT 2021
 */

package com.iluwatar.model.view.controller;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.model.view.controller.Fatigue;
import com.iluwatar.model.view.controller.GiantController;
import com.iluwatar.model.view.controller.GiantModel;
import com.iluwatar.model.view.controller.GiantView;
import com.iluwatar.model.view.controller.Health;
import com.iluwatar.model.view.controller.Nourishment;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class GiantController_ESTest extends GiantController_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Health health0 = Health.HEALTHY;
      Fatigue fatigue0 = Fatigue.SLEEPING;
      Nourishment nourishment0 = Nourishment.SATURATED;
      GiantModel giantModel0 = new GiantModel(health0, fatigue0, nourishment0);
      GiantView giantView0 = new GiantView();
      GiantController giantController0 = new GiantController(giantModel0, giantView0);
      giantController0.updateView();
      assertEquals(Fatigue.SLEEPING, giantController0.getFatigue());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Health health0 = Health.WOUNDED;
      Fatigue fatigue0 = Fatigue.ALERT;
      Nourishment nourishment0 = Nourishment.STARVING;
      GiantModel giantModel0 = new GiantModel(health0, fatigue0, nourishment0);
      GiantView giantView0 = new GiantView();
      GiantController giantController0 = new GiantController(giantModel0, giantView0);
      giantController0.setNourishment(nourishment0);
      assertEquals(Nourishment.STARVING, giantController0.getNourishment());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Health health0 = Health.WOUNDED;
      Fatigue fatigue0 = Fatigue.ALERT;
      Nourishment nourishment0 = Nourishment.STARVING;
      GiantModel giantModel0 = new GiantModel(health0, fatigue0, nourishment0);
      GiantView giantView0 = new GiantView();
      GiantController giantController0 = new GiantController(giantModel0, giantView0);
      Nourishment nourishment1 = giantController0.getNourishment();
      assertSame(nourishment0, nourishment1);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      GiantView giantView0 = new GiantView();
      GiantController giantController0 = new GiantController((GiantModel) null, giantView0);
      Health health0 = Health.DEAD;
      // Undeclared exception!
      try { 
        giantController0.setHealth(health0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.model.view.controller.GiantModel.setHealth(com.iluwatar.model.view.controller.Health)\" because \"this.giant\" is null
         //
         verifyException("com.iluwatar.model.view.controller.GiantController", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      GiantView giantView0 = new GiantView();
      GiantController giantController0 = new GiantController((GiantModel) null, giantView0);
      Fatigue fatigue0 = Fatigue.ALERT;
      // Undeclared exception!
      try { 
        giantController0.setFatigue(fatigue0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.model.view.controller.GiantModel.setFatigue(com.iluwatar.model.view.controller.Fatigue)\" because \"this.giant\" is null
         //
         verifyException("com.iluwatar.model.view.controller.GiantController", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      GiantView giantView0 = new GiantView();
      GiantController giantController0 = new GiantController((GiantModel) null, giantView0);
      // Undeclared exception!
      try { 
        giantController0.getHealth();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.model.view.controller.GiantModel.getHealth()\" because \"this.giant\" is null
         //
         verifyException("com.iluwatar.model.view.controller.GiantController", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      GiantView giantView0 = new GiantView();
      GiantController giantController0 = new GiantController((GiantModel) null, giantView0);
      // Undeclared exception!
      try { 
        giantController0.getFatigue();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.model.view.controller.GiantModel.getFatigue()\" because \"this.giant\" is null
         //
         verifyException("com.iluwatar.model.view.controller.GiantController", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      GiantView giantView0 = new GiantView();
      GiantController giantController0 = new GiantController((GiantModel) null, giantView0);
      // Undeclared exception!
      try { 
        giantController0.updateView();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.model.view.controller.GiantModel.toString()\" because \"giant\" is null
         //
         verifyException("com.iluwatar.model.view.controller.GiantView", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Health health0 = Health.WOUNDED;
      Fatigue fatigue0 = Fatigue.ALERT;
      Nourishment nourishment0 = Nourishment.STARVING;
      GiantModel giantModel0 = new GiantModel(health0, fatigue0, nourishment0);
      GiantView giantView0 = new GiantView();
      GiantController giantController0 = new GiantController(giantModel0, giantView0);
      Health health1 = giantController0.getHealth();
      assertEquals(Health.WOUNDED, health1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Health health0 = Health.WOUNDED;
      Fatigue fatigue0 = Fatigue.ALERT;
      Nourishment nourishment0 = Nourishment.STARVING;
      GiantModel giantModel0 = new GiantModel(health0, fatigue0, nourishment0);
      GiantView giantView0 = new GiantView();
      GiantController giantController0 = new GiantController(giantModel0, giantView0);
      giantController0.setFatigue(fatigue0);
      assertEquals(Health.WOUNDED, giantController0.getHealth());
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      GiantView giantView0 = new GiantView();
      GiantController giantController0 = new GiantController((GiantModel) null, giantView0);
      Nourishment nourishment0 = Nourishment.SATURATED;
      // Undeclared exception!
      try { 
        giantController0.setNourishment(nourishment0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.model.view.controller.GiantModel.setNourishment(com.iluwatar.model.view.controller.Nourishment)\" because \"this.giant\" is null
         //
         verifyException("com.iluwatar.model.view.controller.GiantController", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Health health0 = Health.WOUNDED;
      Fatigue fatigue0 = Fatigue.ALERT;
      Nourishment nourishment0 = Nourishment.STARVING;
      GiantModel giantModel0 = new GiantModel(health0, fatigue0, nourishment0);
      GiantView giantView0 = new GiantView();
      GiantController giantController0 = new GiantController(giantModel0, giantView0);
      giantController0.setHealth(health0);
      assertEquals(Fatigue.ALERT, giantController0.getFatigue());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Health health0 = Health.WOUNDED;
      Fatigue fatigue0 = Fatigue.ALERT;
      Nourishment nourishment0 = Nourishment.STARVING;
      GiantModel giantModel0 = new GiantModel(health0, fatigue0, nourishment0);
      GiantView giantView0 = new GiantView();
      GiantController giantController0 = new GiantController(giantModel0, giantView0);
      Fatigue fatigue1 = giantController0.getFatigue();
      assertSame(fatigue1, fatigue0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      GiantController giantController0 = new GiantController((GiantModel) null, (GiantView) null);
      // Undeclared exception!
      try { 
        giantController0.getNourishment();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.model.view.controller.GiantModel.getNourishment()\" because \"this.giant\" is null
         //
         verifyException("com.iluwatar.model.view.controller.GiantController", e);
      }
  }
}
