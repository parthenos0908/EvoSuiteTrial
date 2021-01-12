/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 05:03:19 GMT 2021
 */

package com.iluwatar.eda.handler;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.eda.event.UserUpdatedEvent;
import com.iluwatar.eda.handler.UserUpdatedEventHandler;
import com.iluwatar.eda.model.User;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class UserUpdatedEventHandler_ESTest extends UserUpdatedEventHandler_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      UserUpdatedEventHandler userUpdatedEventHandler0 = new UserUpdatedEventHandler();
      User user0 = new User("V7'uNN^V4^?u]Y(K");
      UserUpdatedEvent userUpdatedEvent0 = new UserUpdatedEvent(user0);
      userUpdatedEventHandler0.onEvent(userUpdatedEvent0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      UserUpdatedEventHandler userUpdatedEventHandler0 = new UserUpdatedEventHandler();
      // Undeclared exception!
      try { 
        userUpdatedEventHandler0.onEvent((UserUpdatedEvent) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.eda.event.UserUpdatedEvent.getUser()\" because \"event\" is null
         //
         verifyException("com.iluwatar.eda.handler.UserUpdatedEventHandler", e);
      }
  }
}
