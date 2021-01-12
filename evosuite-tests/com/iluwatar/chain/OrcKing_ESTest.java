/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 03:11:38 GMT 2021
 */

package com.iluwatar.chain;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.chain.OrcKing;
import com.iluwatar.chain.Request;
import com.iluwatar.chain.RequestType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class OrcKing_ESTest extends OrcKing_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OrcKing orcKing0 = new OrcKing();
      RequestType requestType0 = RequestType.TORTURE_PRISONER;
      Request request0 = new Request(requestType0, ".Yeof_/d2");
      orcKing0.makeRequest(request0);
      assertEquals(".Yeof_/d2", request0.getRequestDescription());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      OrcKing orcKing0 = new OrcKing();
      // Undeclared exception!
      try { 
        orcKing0.makeRequest((Request) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.chain.Request.getRequestType()\" because \"req\" is null
         //
         verifyException("com.iluwatar.chain.OrcCommander", e);
      }
  }
}
