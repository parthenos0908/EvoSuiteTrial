/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 23 01:25:55 GMT 2020
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Visitor_ESTest extends Visitor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ListVisitor listVisitor0 = new ListVisitor();
      // Undeclared exception!
      try { 
        listVisitor0.visit((Directory) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"Directory.getName()\" because \"<parameter1>\" is null
         //
         verifyException("ListVisitor", e);
      }
  }
}