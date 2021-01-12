/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 12:37:53 GMT 2021
 */

package com.iluwatar.servicelayer.spellbook;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.servicelayer.spell.Spell;
import com.iluwatar.servicelayer.spellbook.Spellbook;
import com.iluwatar.servicelayer.wizard.Wizard;
import java.util.Set;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Spellbook_ESTest extends Spellbook_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Spellbook spellbook0 = new Spellbook("J -Ye");
      String string0 = spellbook0.toString();
      assertEquals("J -Ye", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Spellbook spellbook0 = new Spellbook();
      spellbook0.setName("");
      String string0 = spellbook0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Spellbook spellbook0 = new Spellbook();
      spellbook0.setWizards((Set<Wizard>) null);
      Set<Wizard> set0 = spellbook0.getWizards();
      assertNull(set0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Spellbook spellbook0 = new Spellbook();
      Wizard wizard0 = new Wizard();
      wizard0.addSpellbook(spellbook0);
      Set<Wizard> set0 = spellbook0.getWizards();
      assertFalse(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Spellbook spellbook0 = new Spellbook("");
      spellbook0.setSpells((Set<Spell>) null);
      Set<Spell> set0 = spellbook0.getSpells();
      assertNull(set0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Spellbook spellbook0 = new Spellbook();
      String string0 = spellbook0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Spellbook spellbook0 = new Spellbook(">Jx87jplVxHBcC");
      Long long0 = Long.valueOf(0L);
      spellbook0.setId(long0);
      Long long1 = spellbook0.getId();
      assertEquals(0L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Spellbook spellbook0 = new Spellbook("IiBsHke.v8Z~n");
      Long long0 = new Long(550L);
      spellbook0.setId(long0);
      Long long1 = spellbook0.getId();
      assertEquals(550L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Spellbook spellbook0 = new Spellbook((String) null);
      Long long0 = new Long((-1L));
      spellbook0.setId(long0);
      Long long1 = spellbook0.getId();
      assertEquals((-1L), (long)long1);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Spellbook spellbook0 = new Spellbook("IiBsHke.v8Z~n");
      Spell spell0 = new Spell();
      spellbook0.setSpells((Set<Spell>) null);
      // Undeclared exception!
      try { 
        spellbook0.addSpell(spell0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"java.util.Set.add(Object)\" because \"this.spells\" is null
         //
         verifyException("com.iluwatar.servicelayer.spellbook.Spellbook", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Spellbook spellbook0 = new Spellbook();
      Spell spell0 = new Spell();
      spellbook0.addSpell(spell0);
      Set<Spell> set0 = spellbook0.getSpells();
      assertFalse(set0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Spellbook spellbook0 = new Spellbook((String) null);
      Set<Wizard> set0 = spellbook0.getWizards();
      spellbook0.setWizards(set0);
      assertNull(spellbook0.getName());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Spellbook spellbook0 = new Spellbook("com.iluwatar.servicelayer.wizard.Wizard");
      spellbook0.setName("");
      String string0 = spellbook0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Spellbook spellbook0 = new Spellbook("com.iluwatar.servicelayer.wizard.Wizard");
      Long long0 = spellbook0.getId();
      assertNull(long0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      Spellbook spellbook0 = new Spellbook("com.iluwatar.servicelayer.wizard.Wizard");
      Set<Spell> set0 = spellbook0.getSpells();
      assertEquals(0, set0.size());
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      Spellbook spellbook0 = new Spellbook("com.iluwatar.servicelayer.wizard.Wizard");
      String string0 = spellbook0.getName();
      assertEquals("com.iluwatar.servicelayer.wizard.Wizard", string0);
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      Spellbook spellbook0 = new Spellbook();
      String string0 = spellbook0.toString();
      assertNull(string0);
  }
}
