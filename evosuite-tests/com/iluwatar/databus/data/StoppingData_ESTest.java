/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 04:18:11 GMT 2021
 */

package com.iluwatar.databus.data;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.databus.data.StoppingData;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.time.MockLocalDateTime;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StoppingData_ESTest extends StoppingData_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ZoneOffset zoneOffset0 = ZoneOffset.MIN;
      LocalDateTime localDateTime0 = MockLocalDateTime.now((ZoneId) zoneOffset0);
      StoppingData stoppingData0 = (StoppingData)StoppingData.of(localDateTime0);
      LocalDateTime localDateTime1 = stoppingData0.getWhen();
      assertSame(localDateTime1, localDateTime0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      StoppingData stoppingData0 = new StoppingData((LocalDateTime) null);
      LocalDateTime localDateTime0 = stoppingData0.getWhen();
      assertNull(localDateTime0);
  }
}
