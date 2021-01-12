/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Jan 11 13:17:19 GMT 2021
 */

package com.iluwatar.specification.selector;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class MassEqualSelector_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.iluwatar.specification.selector.MassEqualSelector"; 
    org.evosuite.runtime.GuiSupport.initialize(); 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfThreads = 100; 
    org.evosuite.runtime.RuntimeSettings.maxNumberOfIterationsPerLoop = 10000; 
    org.evosuite.runtime.RuntimeSettings.mockSystemIn = true; 
    org.evosuite.runtime.RuntimeSettings.sandboxMode = org.evosuite.runtime.sandbox.Sandbox.SandboxMode.RECOMMENDED; 
    org.evosuite.runtime.sandbox.Sandbox.initializeSecurityManagerForSUT(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.init();
    setSystemProperties();
    initializeClasses();
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
  } 

  @AfterClass 
  public static void clearEvoSuiteFramework(){ 
    Sandbox.resetDefaultSecurityManager(); 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
  } 

  @Before 
  public void initTestCase(){ 
    threadStopper.storeCurrentThreads();
    threadStopper.startRecordingTime();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().initHandler(); 
    org.evosuite.runtime.sandbox.Sandbox.goingToExecuteSUTCode(); 
    setSystemProperties(); 
    org.evosuite.runtime.GuiSupport.setHeadless(); 
    org.evosuite.runtime.Runtime.getInstance().resetRuntime(); 
    org.evosuite.runtime.agent.InstrumentingAgent.activate(); 
  } 

  @After 
  public void doneWithTestCase(){ 
    threadStopper.killAndJoinClientThreads();
    org.evosuite.runtime.jvm.ShutdownHookHandler.getInstance().safeExecuteAddedHooks(); 
    org.evosuite.runtime.classhandling.JDKClassResetter.reset(); 
    resetClasses(); 
    org.evosuite.runtime.sandbox.Sandbox.doneWithExecutingSUTCode(); 
    org.evosuite.runtime.agent.InstrumentingAgent.deactivate(); 
    org.evosuite.runtime.GuiSupport.restoreHeadlessMode(); 
  } 

  public static void setSystemProperties() {
 
    java.lang.System.setProperties((java.util.Properties) defaultProperties.clone()); 
    java.lang.System.setProperty("user.dir", "C:\\Users\\disto\\gitrepos\\EvoSuiteTrial"); 
    java.lang.System.setProperty("java.io.tmpdir", "C:\\Users\\disto\\AppData\\Local\\Temp\\"); 
  }

  private static void initializeClasses() {
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(MassEqualSelector_ESTest_scaffolding.class.getClassLoader() ,
      "com.iluwatar.specification.selector.MassEqualSelector",
      "com.iluwatar.specification.selector.AbstractSelector",
      "com.iluwatar.specification.property.Movement",
      "com.iluwatar.specification.selector.DisjunctionSelector",
      "com.iluwatar.specification.creature.Creature",
      "com.iluwatar.specification.property.Mass",
      "com.iluwatar.specification.property.Size",
      "com.iluwatar.specification.selector.NegationSelector",
      "com.iluwatar.specification.creature.AbstractCreature",
      "com.iluwatar.specification.selector.ConjunctionSelector",
      "com.iluwatar.specification.property.Color",
      "com.iluwatar.specification.creature.Shark"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(MassEqualSelector_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.iluwatar.specification.selector.AbstractSelector",
      "com.iluwatar.specification.selector.MassEqualSelector",
      "com.iluwatar.specification.property.Mass",
      "com.iluwatar.specification.creature.AbstractCreature",
      "com.iluwatar.specification.creature.Troll",
      "com.iluwatar.specification.property.Color",
      "com.iluwatar.specification.selector.NegationSelector",
      "com.iluwatar.specification.creature.Goblin",
      "com.iluwatar.specification.creature.Shark",
      "com.iluwatar.specification.creature.Dragon",
      "com.iluwatar.specification.selector.ConjunctionSelector",
      "com.iluwatar.specification.selector.DisjunctionSelector",
      "com.iluwatar.specification.creature.KillerBee",
      "com.iluwatar.specification.selector.SizeSelector",
      "com.iluwatar.specification.creature.Octopus",
      "com.iluwatar.specification.selector.MovementSelector",
      "com.iluwatar.specification.property.Size",
      "com.iluwatar.specification.property.Movement"
    );
  }
}
