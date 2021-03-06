/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 04:03:18 GMT 2021
 */

package com.iluwatar.cqrs.domain.model;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.cqrs.domain.model.Author;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Author_ESTest extends Author_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      Author author0 = new Author("b;d\"u]T>;E7VQm=H", "b;d\"u]T>;E7VQm=H", "");
      assertEquals("b;d\"u]T>;E7VQm=H", author0.getUsername());
      assertEquals("Author [name=b;d\"u]T>;E7VQm=H, email=]", author0.toString());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      Author author0 = new Author();
      String string0 = author0.getUsername();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      Author author0 = new Author("", "", "");
      author0.setUsername("|o^EmEmX0wNy\u0000");
      String string0 = author0.getUsername();
      assertEquals("|o^EmEmX0wNy\u0000", string0);
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      Author author0 = new Author();
      String string0 = author0.getName();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      Author author0 = new Author();
      author0.setName("");
      String string0 = author0.getName();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      Author author0 = new Author("com.iluwatar.cqrs.domain.model.Author", "", "");
      author0.setId(1444L);
      long long0 = author0.getId();
      assertEquals(1444L, long0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      Author author0 = new Author("", "", "");
      author0.setId((-992L));
      long long0 = author0.getId();
      assertEquals((-992L), long0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      Author author0 = new Author();
      String string0 = author0.getEmail();
      assertNull(string0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      Author author0 = new Author("", "", "");
      author0.setEmail("=N;>8ABcYem9k_H5Lo");
      String string0 = author0.getEmail();
      assertEquals("=N;>8ABcYem9k_H5Lo", string0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Author author0 = new Author("", "", "");
      long long0 = author0.getId();
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      Author author0 = new Author("", "", "");
      String string0 = author0.getEmail();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Author author0 = new Author("", "", "");
      String string0 = author0.getUsername();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      Author author0 = new Author();
      String string0 = author0.toString();
      assertEquals("Author [name=null, email=null]", string0);
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      Author author0 = new Author("com.iluwatar.cqrs.domain.model.Author", "com.iluwatar.cqrs.domain.model.Author", "com.iluwatar.cqrs.domain.model.Author");
      String string0 = author0.getName();
      assertEquals("com.iluwatar.cqrs.domain.model.Author", string0);
  }
}
