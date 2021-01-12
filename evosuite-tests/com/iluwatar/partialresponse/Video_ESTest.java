/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 10:26:43 GMT 2021
 */

package com.iluwatar.partialresponse;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.partialresponse.Video;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Video_ESTest extends Video_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Integer integer0 = new Integer(2893);
      Video video0 = new Video(integer0, (String) null, integer0, "", "", "");
      assertEquals("{\"id\": 2893,\"title\": \"null\",\"length\": 2893,\"description\": \"\",\"director\": \"\",\"language\": \"\",}", video0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Integer integer0 = new Integer((-1));
      Video video0 = new Video(integer0, "", integer0, "", (String) null, "");
      assertEquals("{\"id\": -1,\"title\": \"\",\"length\": -1,\"description\": \"\",\"director\": \"null\",\"language\": \"\",}", video0.toString());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Integer integer0 = new Integer(2454);
      Integer integer1 = new Integer(2454);
      Video video0 = new Video(integer0, "~f\rf~Tu", integer1, "~f\rf~Tu", "~f\rf~Tu", "");
      assertEquals("{\"id\": 2454,\"title\": \"~f\rf~Tu\",\"length\": 2454,\"description\": \"~f\rf~Tu\",\"director\": \"~f\rf~Tu\",\"language\": \"\",}", video0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Video video0 = new Video((Integer) null, "[BZCR)EqE", (Integer) null, "[BZCR)EqE", "[BZCR)EqE", "[BZCR)EqE");
      String string0 = video0.toString();
      assertEquals("{\"id\": null,\"title\": \"[BZCR)EqE\",\"length\": null,\"description\": \"[BZCR)EqE\",\"director\": \"[BZCR)EqE\",\"language\": \"[BZCR)EqE\",}", string0);
  }
}
