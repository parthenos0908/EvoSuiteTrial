/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 12:29:07 GMT 2021
 */

package com.iluwatar.servant;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.servant.King;
import com.iluwatar.servant.Queen;
import com.iluwatar.servant.Royalty;
import com.iluwatar.servant.Servant;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Servant_ESTest extends Servant_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Servant servant0 = new Servant("aH3iW'K] _NT&NnD");
      LinkedList<Royalty> linkedList0 = new LinkedList<Royalty>();
      King king0 = new King();
      boolean boolean0 = linkedList0.add((Royalty) king0);
      boolean boolean1 = servant0.checkIfYouWillBeHanged(linkedList0);
      assertFalse(boolean1 == boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Servant servant0 = new Servant("aH3iW'K] _NT&NnD");
      // Undeclared exception!
      try { 
        servant0.giveWine((Royalty) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.servant.Royalty.getDrink()\" because \"r\" is null
         //
         verifyException("com.iluwatar.servant.Servant", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Servant servant0 = new Servant("");
      // Undeclared exception!
      try { 
        servant0.feed((Royalty) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.servant.Royalty.getFed()\" because \"r\" is null
         //
         verifyException("com.iluwatar.servant.Servant", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Servant servant0 = new Servant("com.iluwatar.servant.Servant");
      // Undeclared exception!
      try { 
        servant0.checkIfYouWillBeHanged((List<Royalty>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"java.util.List.stream()\" because \"tableGuests\" is null
         //
         verifyException("com.iluwatar.servant.Servant", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Servant servant0 = new Servant("aH3iW'K] _NT&NnD");
      King king0 = new King();
      servant0.feed(king0);
      assertFalse(king0.getMood());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Servant servant0 = new Servant("aH3iW'K] _NT&NnD");
      King king0 = new King();
      servant0.giveCompliments(king0);
      assertFalse(king0.getMood());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Servant servant0 = new Servant("$6Ji7gM-T#");
      LinkedList<Royalty> linkedList0 = new LinkedList<Royalty>();
      boolean boolean0 = servant0.checkIfYouWillBeHanged(linkedList0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Servant servant0 = new Servant((String) null);
      Queen queen0 = new Queen();
      servant0.giveWine(queen0);
      assertFalse(queen0.getMood());
  }
}
