/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 08:37:08 GMT 2021
 */

package com.iluwatar.interpreter;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.interpreter.App;
import com.iluwatar.interpreter.Expression;
import com.iluwatar.interpreter.MinusExpression;
import com.iluwatar.interpreter.MultiplyExpression;
import com.iluwatar.interpreter.NumberExpression;
import com.iluwatar.interpreter.PlusExpression;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class App_ESTest extends App_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      // Undeclared exception!
      try { 
        App.isOperator((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      // Undeclared exception!
      try { 
        App.getOperatorInstance((String) null, (Expression) null, (Expression) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"String.hashCode()\" because \"<local3>\" is null
         //
         verifyException("com.iluwatar.interpreter.App", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      NumberExpression numberExpression0 = new NumberExpression(0);
      PlusExpression plusExpression0 = new PlusExpression(numberExpression0, numberExpression0);
      MultiplyExpression multiplyExpression0 = new MultiplyExpression(numberExpression0, plusExpression0);
      Expression expression0 = App.getOperatorInstance("-", multiplyExpression0, plusExpression0);
      assertEquals("-", expression0.toString());
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      NumberExpression numberExpression0 = new NumberExpression((-2095172152));
      MinusExpression minusExpression0 = new MinusExpression(numberExpression0, numberExpression0);
      PlusExpression plusExpression0 = new PlusExpression(minusExpression0, numberExpression0);
      Expression expression0 = App.getOperatorInstance("+", minusExpression0, plusExpression0);
      assertNotSame(plusExpression0, expression0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      NumberExpression numberExpression0 = new NumberExpression((-2095172152));
      Expression expression0 = App.getOperatorInstance("*", numberExpression0, numberExpression0);
      assertEquals("*", expression0.toString());
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      boolean boolean0 = App.isOperator("-");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      boolean boolean0 = App.isOperator(",");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      boolean boolean0 = App.isOperator("+");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      boolean boolean0 = App.isOperator("*");
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      Expression expression0 = App.getOperatorInstance("&RzcF<3Z0..Fc", (Expression) null, (Expression) null);
      Expression expression1 = App.getOperatorInstance(",", expression0, (Expression) null);
      assertNotSame(expression0, expression1);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      String[] stringArray0 = new String[9];
      App.main(stringArray0);
      assertEquals(9, stringArray0.length);
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      App app0 = new App();
  }
}
