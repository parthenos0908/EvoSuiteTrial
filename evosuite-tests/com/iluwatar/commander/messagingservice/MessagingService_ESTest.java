/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 03:42:49 GMT 2021
 */

package com.iluwatar.commander.messagingservice;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.commander.messagingservice.MessagingDatabase;
import com.iluwatar.commander.messagingservice.MessagingService;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MessagingService_ESTest extends MessagingService_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MessagingDatabase messagingDatabase0 = new MessagingDatabase();
      Exception[] exceptionArray0 = new Exception[0];
      MessagingService messagingService0 = new MessagingService(messagingDatabase0, exceptionArray0);
      // Undeclared exception!
      try { 
        messagingService0.updateDb((Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot load from object array because \"parameters\" is null
         //
         verifyException("com.iluwatar.commander.messagingservice.MessagingService", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MessagingService.MessageToSend[] messagingService_MessageToSendArray0 = MessagingService.MessageToSend.values();
      MessagingDatabase messagingDatabase0 = new MessagingDatabase();
      Exception[] exceptionArray0 = new Exception[0];
      MessagingService messagingService0 = new MessagingService(messagingDatabase0, exceptionArray0);
      // Undeclared exception!
      try { 
        messagingService0.updateDb(messagingService_MessageToSendArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class com.iluwatar.commander.messagingservice.MessagingService$MessageToSend cannot be cast to class com.iluwatar.commander.messagingservice.MessagingService$MessageRequest (com.iluwatar.commander.messagingservice.MessagingService$MessageToSend and com.iluwatar.commander.messagingservice.MessagingService$MessageRequest are in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @27281c5)
         //
         verifyException("com.iluwatar.commander.messagingservice.MessagingService", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      MessagingDatabase messagingDatabase0 = new MessagingDatabase();
      Exception[] exceptionArray0 = new Exception[0];
      MessagingService messagingService0 = new MessagingService(messagingDatabase0, exceptionArray0);
      // Undeclared exception!
      try { 
        messagingService0.updateDb(exceptionArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("com.iluwatar.commander.messagingservice.MessagingService", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Exception[] exceptionArray0 = new Exception[0];
      MessagingDatabase messagingDatabase0 = new MessagingDatabase();
      MessagingService messagingService0 = new MessagingService(messagingDatabase0, exceptionArray0);
      // Undeclared exception!
      try { 
        messagingService0.sendMessage((MessagingService.MessageToSend) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.commander.messagingservice.MessagingService$MessageToSend.equals(Object)\" because \"m\" is null
         //
         verifyException("com.iluwatar.commander.messagingservice.MessagingService", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      MessagingDatabase messagingDatabase0 = new MessagingDatabase();
      Exception[] exceptionArray0 = new Exception[0];
      MessagingService messagingService0 = new MessagingService(messagingDatabase0, exceptionArray0);
      // Undeclared exception!
      try { 
        messagingService0.receiveRequest((Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot load from object array because \"parameters\" is null
         //
         verifyException("com.iluwatar.commander.messagingservice.MessagingService", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      MessagingService.MessageToSend[] messagingService_MessageToSendArray0 = MessagingService.MessageToSend.values();
      MessagingDatabase messagingDatabase0 = new MessagingDatabase();
      Exception[] exceptionArray0 = new Exception[0];
      MessagingService messagingService0 = new MessagingService(messagingDatabase0, exceptionArray0);
      // Undeclared exception!
      try { 
        messagingService0.receiveRequest(messagingService_MessageToSendArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class com.iluwatar.commander.messagingservice.MessagingService$MessageToSend cannot be cast to class java.lang.Integer (com.iluwatar.commander.messagingservice.MessagingService$MessageToSend is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @27281c5; java.lang.Integer is in module java.base of loader 'bootstrap')
         //
         verifyException("com.iluwatar.commander.messagingservice.MessagingService", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      MessagingDatabase messagingDatabase0 = new MessagingDatabase();
      Exception[] exceptionArray0 = new Exception[0];
      MessagingService messagingService0 = new MessagingService(messagingDatabase0, exceptionArray0);
      // Undeclared exception!
      try { 
        messagingService0.receiveRequest(exceptionArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("com.iluwatar.commander.messagingservice.MessagingService", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      MessagingDatabase messagingDatabase0 = new MessagingDatabase();
      MessagingService messagingService0 = null;
      try {
        messagingService0 = new MessagingService(messagingDatabase0, (Exception[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Exception[] exceptionArray0 = new Exception[6];
      MockException mockException0 = new MockException("PAYMENT_TRYING");
      exceptionArray0[0] = (Exception) mockException0;
      exceptionArray0[1] = (Exception) mockException0;
      exceptionArray0[2] = (Exception) mockException0;
      exceptionArray0[3] = (Exception) mockException0;
      exceptionArray0[4] = (Exception) mockException0;
      exceptionArray0[5] = (Exception) mockException0;
      MessagingService messagingService0 = new MessagingService((MessagingDatabase) null, exceptionArray0);
      MessagingService.MessageToSend messagingService_MessageToSend0 = MessagingService.MessageToSend.PAYMENT_TRYING;
      String string0 = messagingService0.sendMessage(messagingService_MessageToSend0);
      assertEquals("Msg: There was an error in your payment process, we are working on it and will return back to you shortly. Meanwhile, your order has been placed and will be shipped.", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Exception[] exceptionArray0 = new Exception[0];
      MessagingDatabase messagingDatabase0 = new MessagingDatabase();
      MessagingService messagingService0 = new MessagingService(messagingDatabase0, exceptionArray0);
      MessagingService.MessageToSend messagingService_MessageToSend0 = MessagingService.MessageToSend.PAYMENT_SUCCESSFUL;
      MessagingService.MessageRequest messagingService_MessageRequest0 = messagingService0.new MessageRequest("ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890", messagingService_MessageToSend0);
      Object[] objectArray0 = new Object[2];
      objectArray0[0] = (Object) messagingService_MessageRequest0;
      messagingService0.updateDb(objectArray0);
      String string0 = messagingService0.updateDb(objectArray0);
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      MessagingDatabase messagingDatabase0 = new MessagingDatabase();
      Exception[] exceptionArray0 = new Exception[0];
      MessagingService messagingService0 = new MessagingService(messagingDatabase0, exceptionArray0);
      MessagingService.MessageToSend messagingService_MessageToSend0 = MessagingService.MessageToSend.PAYMENT_FAIL;
      String string0 = messagingService0.sendMessage(messagingService_MessageToSend0);
      assertEquals("Msg: There was an error in your payment process. Your order is placed and has been converted to COD. Please reach us on CUSTOMER-CARE-NUBER in case of any queries. Thank you for shopping with us!", string0);
  }
}