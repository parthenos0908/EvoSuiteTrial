/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 09:05:28 GMT 2021
 */

package com.iluwatar.leaderelection;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.leaderelection.Message;
import com.iluwatar.leaderelection.MessageType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Message_ESTest extends Message_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      MessageType messageType0 = MessageType.ELECTION;
      Message message0 = new Message(messageType0, "");
      MessageType messageType1 = message0.getType();
      assertSame(messageType1, messageType0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      MessageType messageType0 = MessageType.LEADER;
      Message message0 = new Message(messageType0, "P");
      String string0 = message0.getContent();
      assertEquals("P", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Message message0 = new Message();
      message0.setContent("");
      String string0 = message0.getContent();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      MessageType messageType0 = MessageType.LEADER;
      Message message0 = new Message(messageType0, "P");
      Message message1 = new Message(messageType0, "");
      boolean boolean0 = message0.equals(message1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Message message0 = new Message();
      Message message1 = new Message();
      boolean boolean0 = message0.equals(message1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Message message0 = new Message();
      boolean boolean0 = message0.equals((Object) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Message message0 = new Message();
      boolean boolean0 = message0.equals(message0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Message message0 = new Message();
      Object object0 = new Object();
      boolean boolean0 = message0.equals(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Message message0 = new Message();
      message0.setType((MessageType) null);
      assertNull(message0.getType());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      MessageType messageType0 = MessageType.HEARTBEAT_INVOKE;
      Message message0 = new Message(messageType0, "");
      Message message1 = new Message();
      boolean boolean0 = message1.equals(message0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Message message0 = new Message();
      String string0 = message0.getContent();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Message message0 = new Message();
      message0.getType();
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Message message0 = new Message();
      message0.hashCode();
  }
}
