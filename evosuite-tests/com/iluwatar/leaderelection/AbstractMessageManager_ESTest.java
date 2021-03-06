/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 09:02:41 GMT 2021
 */

package com.iluwatar.leaderelection;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.leaderelection.Instance;
import com.iluwatar.leaderelection.bully.BullyInstance;
import com.iluwatar.leaderelection.bully.BullyMessageManager;
import com.iluwatar.leaderelection.ring.RingInstance;
import java.util.HashMap;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AbstractMessageManager_ESTest extends AbstractMessageManager_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      HashMap<Integer, Instance> hashMap0 = new HashMap<Integer, Instance>();
      Integer integer0 = new Integer((-1));
      BullyMessageManager bullyMessageManager0 = new BullyMessageManager(hashMap0);
      BullyInstance bullyInstance0 = new BullyInstance(bullyMessageManager0, 2147483645, 1);
      hashMap0.put(integer0, bullyInstance0);
      bullyMessageManager0.sendHeartbeatInvokeMessage(2147483645);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      HashMap<Integer, Instance> hashMap0 = new HashMap<Integer, Instance>();
      BullyMessageManager bullyMessageManager0 = new BullyMessageManager(hashMap0);
      Integer integer0 = new Integer(882);
      RingInstance ringInstance0 = new RingInstance(bullyMessageManager0, 882, 882);
      hashMap0.put(integer0, ringInstance0);
      bullyMessageManager0.sendHeartbeatInvokeMessage(6);
  }
}
