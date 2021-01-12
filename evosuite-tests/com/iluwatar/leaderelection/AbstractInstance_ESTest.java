/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 09:01:34 GMT 2021
 */

package com.iluwatar.leaderelection;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.leaderelection.Instance;
import com.iluwatar.leaderelection.Message;
import com.iluwatar.leaderelection.MessageManager;
import com.iluwatar.leaderelection.MessageType;
import com.iluwatar.leaderelection.bully.BullyInstance;
import com.iluwatar.leaderelection.bully.BullyMessageManager;
import com.iluwatar.leaderelection.ring.RingInstance;
import com.iluwatar.leaderelection.ring.RingMessageManager;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AbstractInstance_ESTest extends AbstractInstance_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HashMap<Integer, Instance> hashMap0 = new HashMap<Integer, Instance>();
      BullyMessageManager bullyMessageManager0 = new BullyMessageManager(hashMap0);
      MessageType messageType0 = MessageType.ELECTION_INVOKE;
      Message message0 = new Message(messageType0, (String) null);
      MessageType messageType1 = MessageType.LEADER_INVOKE;
      message0.setType(messageType1);
      BullyInstance bullyInstance0 = new BullyInstance(bullyMessageManager0, (-2), (-5572));
      bullyInstance0.onMessage(message0);
      // Undeclared exception!
      bullyInstance0.run();
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HashMap<Integer, Instance> hashMap0 = new HashMap<Integer, Instance>();
      BullyMessageManager bullyMessageManager0 = new BullyMessageManager(hashMap0);
      Integer integer0 = new Integer((-112));
      RingInstance ringInstance0 = new RingInstance(bullyMessageManager0, (-112), 0);
      hashMap0.put(integer0, ringInstance0);
      bullyMessageManager0.sendHeartbeatInvokeMessage(0);
      Integer integer1 = new Integer(0);
      BullyInstance bullyInstance0 = new BullyInstance(bullyMessageManager0, 1289, (-711));
      hashMap0.put(integer1, bullyInstance0);
      // Undeclared exception!
      ringInstance0.run();
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      HashMap<Integer, Instance> hashMap0 = new HashMap<Integer, Instance>();
      BullyMessageManager bullyMessageManager0 = new BullyMessageManager(hashMap0);
      RingInstance ringInstance0 = new RingInstance(bullyMessageManager0, 3, (-2187));
      Integer integer0 = new Integer(379);
      hashMap0.put(integer0, ringInstance0);
      bullyMessageManager0.sendLeaderMessage(3, (-996));
      // Undeclared exception!
      try { 
        ringInstance0.run();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.leaderelection.Instance.isAlive()\" because \"leaderInstance\" is null
         //
         verifyException("com.iluwatar.leaderelection.bully.BullyMessageManager", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HashMap<Integer, Instance> hashMap0 = new HashMap<Integer, Instance>();
      RingMessageManager ringMessageManager0 = new RingMessageManager(hashMap0);
      MessageType messageType0 = MessageType.ELECTION;
      Message message0 = new Message(messageType0, "");
      BullyInstance bullyInstance0 = new BullyInstance(ringMessageManager0, (-609), 2);
      bullyInstance0.onMessage(message0);
      // Undeclared exception!
      bullyInstance0.run();
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HashMap<Integer, Instance> hashMap0 = new HashMap<Integer, Instance>();
      BullyMessageManager bullyMessageManager0 = new BullyMessageManager(hashMap0);
      BullyInstance bullyInstance0 = new BullyInstance(bullyMessageManager0, (-1394), (-1231));
      boolean boolean0 = bullyInstance0.isAlive();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HashMap<Integer, Instance> hashMap0 = new HashMap<Integer, Instance>();
      RingMessageManager ringMessageManager0 = new RingMessageManager(hashMap0);
      BullyInstance bullyInstance0 = new BullyInstance(ringMessageManager0, (-550), 0);
      assertTrue(bullyInstance0.isAlive());
      
      bullyInstance0.setAlive(false);
      boolean boolean0 = bullyInstance0.isAlive();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HashMap<Integer, Instance> hashMap0 = new HashMap<Integer, Instance>();
      BullyMessageManager bullyMessageManager0 = new BullyMessageManager(hashMap0);
      Message message0 = new Message();
      MessageType messageType0 = MessageType.ELECTION_INVOKE;
      message0.setType(messageType0);
      BullyInstance bullyInstance0 = new BullyInstance(bullyMessageManager0, (-339), (-609));
      bullyInstance0.onMessage(message0);
      // Undeclared exception!
      try { 
        bullyInstance0.run();
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      RingInstance ringInstance0 = new RingInstance((MessageManager) null, 0, 4667);
      // Undeclared exception!
      try { 
        ringInstance0.onMessage((Message) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HashMap<Integer, Instance> hashMap0 = new HashMap<Integer, Instance>();
      RingMessageManager ringMessageManager0 = new RingMessageManager(hashMap0);
      BullyInstance bullyInstance0 = new BullyInstance(ringMessageManager0, 4, 4);
      Message message0 = new Message();
      MessageType messageType0 = MessageType.ELECTION_INVOKE;
      message0.setType(messageType0);
      bullyInstance0.onMessage(message0);
      // Undeclared exception!
      bullyInstance0.run();
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HashMap<Integer, Instance> hashMap0 = new HashMap<Integer, Instance>();
      BullyMessageManager bullyMessageManager0 = new BullyMessageManager(hashMap0);
      BullyInstance bullyInstance0 = new BullyInstance(bullyMessageManager0, (-112), 45);
      MessageType messageType0 = MessageType.HEARTBEAT;
      Message message0 = new Message(messageType0, "Instance ");
      bullyInstance0.onMessage(message0);
      // Undeclared exception!
      bullyInstance0.run();
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HashMap<Integer, Instance> hashMap0 = new HashMap<Integer, Instance>();
      RingMessageManager ringMessageManager0 = new RingMessageManager(hashMap0);
      MessageType messageType0 = MessageType.LEADER;
      Message message0 = new Message(messageType0, "");
      RingInstance ringInstance0 = new RingInstance(ringMessageManager0, (-1185), 56);
      ringInstance0.onMessage(message0);
      // Undeclared exception!
      try { 
        ringInstance0.run();
        fail("Expecting exception: NumberFormatException");
      
      } catch(NumberFormatException e) {
         //
         // For input string: \"\"
         //
         verifyException("java.lang.NumberFormatException", e);
      }
  }
}