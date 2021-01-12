/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 03:53:54 GMT 2021
 */

package com.iluwatar.composite;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.composite.Letter;
import com.iluwatar.composite.LetterComposite;
import com.iluwatar.composite.Sentence;
import com.iluwatar.composite.Word;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class LetterComposite_ESTest extends LetterComposite_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Letter letter0 = new Letter('m');
      List<Letter> list0 = List.of(letter0, letter0, letter0);
      Word word0 = new Word(list0);
      int int0 = word0.count();
      assertEquals(3, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<Word> linkedList0 = new LinkedList<Word>();
      Sentence sentence0 = new Sentence(linkedList0);
      sentence0.printThisBefore();
      assertEquals(0, sentence0.count());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Letter letter0 = new Letter('D');
      letter0.add((LetterComposite) null);
      // Undeclared exception!
      try { 
        letter0.print();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ArrayList", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Letter letter0 = new Letter('V');
      letter0.print();
      assertEquals(0, letter0.count());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Letter letter0 = new Letter('');
      letter0.printThisAfter();
      assertEquals(0, letter0.count());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LinkedList<Word> linkedList0 = new LinkedList<Word>();
      Sentence sentence0 = new Sentence(linkedList0);
      int int0 = sentence0.count();
      assertEquals(0, int0);
  }
}
