/**
 * Scaffolding file used to store all the setups needed to run 
 * tests automatically generated by EvoSuite
 * Mon Jan 11 03:35:14 GMT 2021
 */

package com.iluwatar.commander;

import org.evosuite.runtime.annotation.EvoSuiteClassExclude;
import org.junit.BeforeClass;
import org.junit.Before;
import org.junit.After;
import org.junit.AfterClass;
import org.evosuite.runtime.sandbox.Sandbox;
import org.evosuite.runtime.sandbox.Sandbox.SandboxMode;

@EvoSuiteClassExclude
public class AppMessagingFailCases_ESTest_scaffolding {

  @org.junit.Rule 
  public org.evosuite.runtime.vnet.NonFunctionalRequirementRule nfr = new org.evosuite.runtime.vnet.NonFunctionalRequirementRule();

  private static final java.util.Properties defaultProperties = (java.util.Properties) java.lang.System.getProperties().clone(); 

  private org.evosuite.runtime.thread.ThreadStopper threadStopper =  new org.evosuite.runtime.thread.ThreadStopper (org.evosuite.runtime.thread.KillSwitchHandler.getInstance(), 3000);


  @BeforeClass 
  public static void initEvoSuiteFramework() { 
    org.evosuite.runtime.RuntimeSettings.className = "com.iluwatar.commander.AppMessagingFailCases"; 
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
    org.evosuite.runtime.classhandling.ClassStateSupport.initializeClasses(AppMessagingFailCases_ESTest_scaffolding.class.getClassLoader() ,
      "com.iluwatar.commander.Commander",
      "com.iluwatar.commander.Database",
      "com.iluwatar.commander.messagingservice.MessagingDatabase",
      "com.iluwatar.commander.Retry$Operation",
      "com.iluwatar.commander.Order$MessageSent",
      "com.iluwatar.commander.queue.Queue",
      "com.iluwatar.commander.paymentservice.PaymentDatabase",
      "com.iluwatar.commander.queue.QueueDatabase",
      "com.iluwatar.commander.User",
      "com.iluwatar.commander.Retry$HandleErrorIssue",
      "com.iluwatar.commander.Order$PaymentStatus",
      "com.iluwatar.commander.employeehandle.EmployeeHandle",
      "com.iluwatar.commander.employeehandle.EmployeeDatabase",
      "com.iluwatar.commander.Service",
      "com.iluwatar.commander.Retry",
      "com.iluwatar.commander.Order",
      "com.iluwatar.commander.shippingservice.ShippingService$ShippingRequest",
      "com.iluwatar.commander.AppMessagingFailCases",
      "com.iluwatar.commander.messagingservice.MessagingService",
      "com.iluwatar.commander.shippingservice.ShippingService",
      "com.iluwatar.commander.paymentservice.PaymentService",
      "com.iluwatar.commander.exceptions.IsEmptyException",
      "com.iluwatar.commander.shippingservice.ShippingDatabase",
      "com.iluwatar.commander.exceptions.DatabaseUnavailableException"
    );
  } 

  private static void resetClasses() {
    org.evosuite.runtime.classhandling.ClassResetter.getInstance().setClassLoader(AppMessagingFailCases_ESTest_scaffolding.class.getClassLoader()); 

    org.evosuite.runtime.classhandling.ClassStateSupport.resetClasses(
      "com.iluwatar.commander.AppMessagingFailCases",
      "com.iluwatar.commander.Service",
      "com.iluwatar.commander.paymentservice.PaymentService",
      "com.iluwatar.commander.Database",
      "com.iluwatar.commander.paymentservice.PaymentDatabase",
      "com.iluwatar.commander.shippingservice.ShippingService",
      "com.iluwatar.commander.shippingservice.ShippingDatabase",
      "com.iluwatar.commander.messagingservice.MessagingService",
      "com.iluwatar.commander.messagingservice.MessagingDatabase",
      "com.iluwatar.commander.exceptions.DatabaseUnavailableException",
      "com.iluwatar.commander.employeehandle.EmployeeHandle",
      "com.iluwatar.commander.employeehandle.EmployeeDatabase",
      "com.iluwatar.commander.queue.QueueDatabase",
      "com.iluwatar.commander.queue.Queue",
      "com.iluwatar.commander.Commander",
      "com.iluwatar.commander.User",
      "com.iluwatar.commander.Order",
      "com.iluwatar.commander.Order$PaymentStatus",
      "com.iluwatar.commander.Order$MessageSent",
      "com.iluwatar.commander.Retry",
      "com.iluwatar.commander.shippingservice.ShippingService$ShippingRequest"
    );
  }
}
