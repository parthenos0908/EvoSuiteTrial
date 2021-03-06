/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 03:12:45 GMT 2021
 */

package com.iluwatar.chain;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.chain.OrcCommander;
import com.iluwatar.chain.OrcOfficer;
import com.iluwatar.chain.OrcSoldier;
import com.iluwatar.chain.Request;
import com.iluwatar.chain.RequestHandler;
import com.iluwatar.chain.RequestType;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class OrcOfficer_ESTest extends OrcOfficer_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      OrcOfficer orcOfficer0 = new OrcOfficer((RequestHandler) null);
      // Undeclared exception!
      try { 
        orcOfficer0.handleRequest((Request) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.chain.Request.getRequestType()\" because \"req\" is null
         //
         verifyException("com.iluwatar.chain.OrcOfficer", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      RequestHandler requestHandler0 = mock(RequestHandler.class, new ViolatedAssumptionAnswer());
      OrcSoldier orcSoldier0 = new OrcSoldier(requestHandler0);
      OrcOfficer orcOfficer0 = new OrcOfficer(orcSoldier0);
      RequestType requestType0 = RequestType.TORTURE_PRISONER;
      Request request0 = new Request(requestType0, "");
      OrcCommander orcCommander0 = new OrcCommander(orcOfficer0);
      orcCommander0.handleRequest(request0);
      assertTrue(request0.isHandled());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      RequestHandler requestHandler0 = mock(RequestHandler.class, new ViolatedAssumptionAnswer());
      OrcCommander orcCommander0 = new OrcCommander(requestHandler0);
      OrcSoldier orcSoldier0 = new OrcSoldier(orcCommander0);
      OrcOfficer orcOfficer0 = new OrcOfficer(orcSoldier0);
      RequestType requestType0 = RequestType.COLLECT_TAX;
      Request request0 = new Request(requestType0, "");
      orcOfficer0.handleRequest(request0);
      assertEquals("", request0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      OrcOfficer orcOfficer0 = new OrcOfficer((RequestHandler) null);
      String string0 = orcOfficer0.toString();
      assertEquals("Orc officer", string0);
  }
}
