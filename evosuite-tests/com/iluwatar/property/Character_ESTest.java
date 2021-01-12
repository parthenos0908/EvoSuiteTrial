/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 11:09:31 GMT 2021
 */

package com.iluwatar.property;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.property.Character;
import com.iluwatar.property.Prototype;
import com.iluwatar.property.Stats;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Character_ESTest extends Character_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Character.Type character_Type0 = Character.Type.ROGUE;
      Character character0 = new Character();
      Character character1 = new Character(character_Type0, character0);
      Character.Type character_Type1 = character1.type();
      assertSame(character_Type0, character_Type1);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Character character0 = new Character();
      Character character1 = new Character("FUi-Y57n", character0);
      String string0 = character1.name();
      assertEquals("FUi-Y57n", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Character character0 = new Character();
      Character character1 = new Character("", character0);
      String string0 = character1.name();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Character character0 = new Character();
      Stats stats0 = Stats.ATTACK_POWER;
      Integer integer0 = new Integer(0);
      character0.set(stats0, integer0);
      Integer integer1 = character0.get(stats0);
      assertEquals(0, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Character character0 = new Character();
      Stats stats0 = Stats.ATTACK_POWER;
      Integer integer0 = new Integer(7);
      character0.set(stats0, integer0);
      Integer integer1 = character0.get(stats0);
      assertEquals(7, (int)integer1);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Character character0 = new Character();
      Stats stats0 = Stats.RAGE;
      Integer integer0 = character0.get(stats0);
      assertNull(integer0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Character.Type character_Type0 = Character.Type.ROGUE;
      Character character0 = new Character(character_Type0, (Prototype) null);
      // Undeclared exception!
      try { 
        character0.toString();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.property.Prototype.get(com.iluwatar.property.Stats)\" because \"this.prototype\" is null
         //
         verifyException("com.iluwatar.property.Character", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Character character0 = null;
      try {
        character0 = new Character("pbx?", (Character) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot read field \"type\"
         //
         verifyException("com.iluwatar.property.Character", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Character.Type character_Type0 = Character.Type.ROGUE;
      Character character0 = new Character(character_Type0, (Prototype) null);
      Stats stats0 = Stats.ENERGY;
      // Undeclared exception!
      try { 
        character0.get(stats0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.property.Prototype.get(com.iluwatar.property.Stats)\" because \"this.prototype\" is null
         //
         verifyException("com.iluwatar.property.Character", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Character character0 = new Character();
      Stats stats0 = Stats.ATTACK_POWER;
      Integer integer0 = new Integer((-2158));
      character0.set(stats0, integer0);
      Integer integer1 = character0.get(stats0);
      assertEquals((-2158), (int)integer1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Character.Type character_Type0 = Character.Type.WARRIOR;
      Character character0 = new Character();
      Character character1 = new Character(character_Type0, character0);
      String string0 = character1.toString();
      assertEquals("Character type: WARRIOR\nStats:\n", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Character character0 = new Character();
      Character character1 = new Character("", character0);
      String string0 = character1.toString();
      assertEquals("Player: \nStats:\n", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Character character0 = new Character();
      Stats stats0 = Stats.RAGE;
      Integer integer0 = new Integer(2);
      character0.set(stats0, integer0);
      boolean boolean0 = character0.has(stats0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Character character0 = new Character();
      Stats stats0 = Stats.AGILITY;
      boolean boolean0 = character0.has(stats0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Character character0 = new Character();
      String string0 = character0.name();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Character character0 = new Character();
      character0.type();
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Character character0 = new Character();
      Stats stats0 = Stats.ATTACK_POWER;
      Integer integer0 = new Integer(7);
      character0.set(stats0, integer0);
      String string0 = character0.toString();
      assertEquals("Stats:\n - ATTACK_POWER:7\n", string0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      Character character0 = new Character();
      Stats stats0 = Stats.ATTACK_POWER;
      character0.remove(stats0);
      String string0 = character0.toString();
      assertEquals("Stats:\n", string0);
  }
}