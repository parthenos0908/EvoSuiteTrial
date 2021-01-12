/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 03:50:03 GMT 2021
 */

package com.iluwatar.commander;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.commander.Retry;
import java.lang.reflect.Array;
import java.util.LinkedList;
import java.util.List;
import java.util.function.Predicate;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.Random;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Retry_ESTest extends Retry_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Predicate<Exception>[] predicateArray0 = (Predicate<Exception>[]) Array.newInstance(Predicate.class, 2);
      Predicate<Exception> predicate0 = Predicate.isEqual((Object) null);
      Predicate<Exception> predicate1 = Predicate.not((Predicate<? super Exception>) predicate0);
      predicateArray0[0] = predicate1;
      predicateArray0[1] = predicate1;
      LinkedList<Exception> linkedList0 = new LinkedList<Exception>();
      Retry.HandleErrorIssue<Integer> retry_HandleErrorIssue0 = (Retry.HandleErrorIssue<Integer>) mock(Retry.HandleErrorIssue.class, new ViolatedAssumptionAnswer());
      Retry<Integer> retry0 = new Retry<Integer>((Retry.Operation) null, retry_HandleErrorIssue0, 21, (-1998L), predicateArray0);
      Integer integer0 = new Integer(26);
      Random.setNextRandom(1172);
      // Undeclared exception!
      try { 
        retry0.perform(linkedList0, integer0);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // timeout value is negative
         //
         verifyException("java.lang.Thread", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Retry.HandleErrorIssue<String> retry_HandleErrorIssue0 = (Retry.HandleErrorIssue<String>) mock(Retry.HandleErrorIssue.class, new ViolatedAssumptionAnswer());
      Predicate<Exception> predicate0 = Predicate.isEqual((Object) null);
      Predicate<Exception> predicate1 = Predicate.not((Predicate<? super Exception>) predicate0);
      Predicate<Exception>[] predicateArray0 = (Predicate<Exception>[]) Array.newInstance(Predicate.class, 6);
      predicateArray0[0] = predicate0;
      predicateArray0[1] = predicate0;
      predicateArray0[2] = predicate1;
      predicateArray0[3] = predicate1;
      predicateArray0[4] = predicate1;
      predicateArray0[5] = predicate0;
      Retry<String> retry0 = new Retry<String>((Retry.Operation) null, retry_HandleErrorIssue0, 49, 0, predicateArray0);
      LinkedList<Exception> linkedList0 = new LinkedList<Exception>();
      retry0.perform(linkedList0, "z`");
      assertEquals(0, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Retry.Operation retry_Operation0 = mock(Retry.Operation.class, new ViolatedAssumptionAnswer());
      Predicate<Exception>[] predicateArray0 = (Predicate<Exception>[]) Array.newInstance(Predicate.class, 2);
      Integer integer0 = new Integer((-1));
      Predicate<Exception> predicate0 = Predicate.isEqual((Object) integer0);
      predicateArray0[0] = predicate0;
      predicateArray0[1] = predicate0;
      Retry<Exception> retry0 = new Retry<Exception>(retry_Operation0, (Retry.HandleErrorIssue<Exception>) null, (-1), (-632L), predicateArray0);
      MockException mockException0 = new MockException("");
      List<Exception> list0 = List.of((Exception) mockException0, (Exception) mockException0, (Exception) mockException0, (Exception) mockException0, (Exception) mockException0, (Exception) mockException0);
      retry0.perform(list0, mockException0);
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Predicate<Exception>[] predicateArray0 = (Predicate<Exception>[]) Array.newInstance(Predicate.class, 1);
      MockException mockException0 = new MockException("");
      Predicate<Exception> predicate0 = Predicate.isEqual((Object) mockException0);
      predicateArray0[0] = predicate0;
      Retry<String> retry0 = new Retry<String>((Retry.Operation) null, (Retry.HandleErrorIssue<String>) null, (-1), (-843), predicateArray0);
      // Undeclared exception!
      try { 
        retry0.perform((List<Exception>) null, "");
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.commander.Retry$HandleErrorIssue.handleIssue(Object, java.lang.Exception)\" because \"this.handleError\" is null
         //
         verifyException("com.iluwatar.commander.Retry", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Predicate<Exception>[] predicateArray0 = (Predicate<Exception>[]) Array.newInstance(Predicate.class, 2);
      Predicate<Exception> predicate0 = Predicate.isEqual((Object) null);
      predicateArray0[0] = predicate0;
      predicateArray0[1] = predicate0;
      LinkedList<Exception> linkedList0 = new LinkedList<Exception>();
      Retry.HandleErrorIssue<Integer> retry_HandleErrorIssue0 = (Retry.HandleErrorIssue<Integer>) mock(Retry.HandleErrorIssue.class, new ViolatedAssumptionAnswer());
      Retry<Integer> retry0 = new Retry<Integer>((Retry.Operation) null, retry_HandleErrorIssue0, 21, (-1998L), predicateArray0);
      Integer integer0 = new Integer(26);
      retry0.perform(linkedList0, integer0);
      assertEquals(0, linkedList0.size());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Retry.HandleErrorIssue<String> retry_HandleErrorIssue0 = (Retry.HandleErrorIssue<String>) mock(Retry.HandleErrorIssue.class, new ViolatedAssumptionAnswer());
      Predicate<Exception>[] predicateArray0 = (Predicate<Exception>[]) Array.newInstance(Predicate.class, 2);
      Retry<String> retry0 = null;
      try {
        retry0 = new Retry<String>((Retry.Operation) null, retry_HandleErrorIssue0, 0, (-2736L), predicateArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.stream.ReduceOps$2ReducingSink", e);
      }
  }
}