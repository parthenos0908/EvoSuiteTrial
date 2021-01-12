/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 04:19:17 GMT 2021
 */

package com.iluwatar.databus;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.databus.AbstractDataType;
import com.iluwatar.databus.DataBus;
import com.iluwatar.databus.members.MessageCollectorMember;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DataBus_ESTest extends DataBus_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      DataBus dataBus0 = new DataBus();
      MessageCollectorMember messageCollectorMember0 = new MessageCollectorMember("-xv$}~L$y&OqjD/hh");
      dataBus0.subscribe(messageCollectorMember0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      DataBus dataBus0 = new DataBus();
      MessageCollectorMember messageCollectorMember0 = new MessageCollectorMember("-xv$}~L$y&OqjD/hh");
      dataBus0.unsubscribe(messageCollectorMember0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      DataBus dataBus0 = DataBus.getInstance();
      AbstractDataType abstractDataType0 = new AbstractDataType();
      dataBus0.publish(abstractDataType0);
      DataBus.getInstance();
      dataBus0.publish(abstractDataType0);
      AbstractDataType abstractDataType1 = new AbstractDataType();
      dataBus0.publish(abstractDataType1);
      assertNotSame(abstractDataType1, abstractDataType0);
  }
}