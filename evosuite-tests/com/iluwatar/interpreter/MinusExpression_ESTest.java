/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 08:39:21 GMT 2021
 */

package com.iluwatar.interpreter;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.interpreter.Expression;
import com.iluwatar.interpreter.MinusExpression;
import com.iluwatar.interpreter.MultiplyExpression;
import com.iluwatar.interpreter.NumberExpression;
import com.iluwatar.interpreter.PlusExpression;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class MinusExpression_ESTest extends MinusExpression_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      NumberExpression numberExpression0 = new NumberExpression(0);
      PlusExpression plusExpression0 = new PlusExpression(numberExpression0, numberExpression0);
      MultiplyExpression multiplyExpression0 = new MultiplyExpression(plusExpression0, numberExpression0);
      MinusExpression minusExpression0 = new MinusExpression(multiplyExpression0, numberExpression0);
      int int0 = minusExpression0.interpret();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      NumberExpression numberExpression0 = new NumberExpression(266);
      PlusExpression plusExpression0 = new PlusExpression(numberExpression0, numberExpression0);
      MultiplyExpression multiplyExpression0 = new MultiplyExpression(plusExpression0, numberExpression0);
      MinusExpression minusExpression0 = new MinusExpression(numberExpression0, multiplyExpression0);
      int int0 = minusExpression0.interpret();
      assertEquals((-141246), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MinusExpression minusExpression0 = new MinusExpression((Expression) null, (Expression) null);
      // Undeclared exception!
      try { 
        minusExpression0.interpret();
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.interpreter.Expression.interpret()\" because \"this.leftExpression\" is null
         //
         verifyException("com.iluwatar.interpreter.MinusExpression", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      NumberExpression numberExpression0 = new NumberExpression(266);
      PlusExpression plusExpression0 = new PlusExpression(numberExpression0, numberExpression0);
      MultiplyExpression multiplyExpression0 = new MultiplyExpression(plusExpression0, numberExpression0);
      MinusExpression minusExpression0 = new MinusExpression(multiplyExpression0, plusExpression0);
      int int0 = minusExpression0.interpret();
      assertEquals(140980, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      MinusExpression minusExpression0 = new MinusExpression((Expression) null, (Expression) null);
      String string0 = minusExpression0.toString();
      assertEquals("-", string0);
  }
}