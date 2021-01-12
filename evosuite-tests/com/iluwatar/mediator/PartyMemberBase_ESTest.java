/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 09:40:37 GMT 2021
 */

package com.iluwatar.mediator;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.mediator.Action;
import com.iluwatar.mediator.Hunter;
import com.iluwatar.mediator.Party;
import com.iluwatar.mediator.PartyImpl;
import com.iluwatar.mediator.Rogue;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class PartyMemberBase_ESTest extends PartyMemberBase_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Rogue rogue0 = new Rogue();
      String string0 = rogue0.toString();
      assertEquals("Rogue", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Hunter hunter0 = new Hunter();
      // Undeclared exception!
      try { 
        hunter0.partyAction((Action) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.mediator.Action.getDescription()\" because \"action\" is null
         //
         verifyException("com.iluwatar.mediator.PartyMemberBase", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Rogue rogue0 = new Rogue();
      PartyImpl partyImpl0 = new PartyImpl();
      rogue0.party = (Party) partyImpl0;
      Action action0 = Action.NONE;
      rogue0.act(action0);
      assertEquals("Rogue", rogue0.toString());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Rogue rogue0 = new Rogue();
      Action action0 = Action.HUNT;
      rogue0.act(action0);
      assertEquals("Rogue", rogue0.toString());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Rogue rogue0 = new Rogue();
      Action action0 = Action.NONE;
      rogue0.partyAction(action0);
      assertEquals("Rogue", rogue0.toString());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Hunter hunter0 = new Hunter();
      PartyImpl partyImpl0 = new PartyImpl();
      hunter0.joinedParty(partyImpl0);
      assertEquals("Hunter", hunter0.toString());
  }
}
