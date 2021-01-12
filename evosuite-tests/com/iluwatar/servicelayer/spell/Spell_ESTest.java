/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 12:36:40 GMT 2021
 */

package com.iluwatar.servicelayer.spell;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.servicelayer.spell.Spell;
import com.iluwatar.servicelayer.spellbook.Spellbook;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Spell_ESTest extends Spell_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Spell spell0 = new Spell();
      spell0.setName("c+W^6o,^H1");
      String string0 = spell0.toString();
      assertEquals("c+W^6o,^H1", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Spell spell0 = new Spell();
      spell0.setName("");
      String string0 = spell0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Spell spell0 = new Spell((String) null);
      Spellbook spellbook0 = new Spellbook();
      spell0.setSpellbook(spellbook0);
      Spellbook spellbook1 = spell0.getSpellbook();
      assertSame(spellbook1, spellbook0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Spell spell0 = new Spell();
      spell0.setName("R_e");
      String string0 = spell0.getName();
      assertEquals("R_e", string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Spell spell0 = new Spell();
      spell0.setName("");
      String string0 = spell0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Spell spell0 = new Spell();
      Long long0 = new Long(0L);
      spell0.setId(long0);
      Long long1 = spell0.getId();
      assertEquals(0L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Spell spell0 = new Spell();
      Long long0 = Long.valueOf(522L);
      spell0.setId(long0);
      Long long1 = spell0.getId();
      assertEquals(522L, (long)long1);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Spell spell0 = new Spell();
      Long long0 = new Long((-864L));
      spell0.setId(long0);
      Long long1 = spell0.getId();
      assertEquals((-864L), (long)long1);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Spell spell0 = new Spell((String) null);
      Spellbook spellbook0 = spell0.getSpellbook();
      assertNull(spellbook0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Spell spell0 = new Spell((String) null);
      String string0 = spell0.toString();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Spell spell0 = new Spell();
      String string0 = spell0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Spell spell0 = new Spell();
      Long long0 = spell0.getId();
      assertNull(long0);
  }
}
