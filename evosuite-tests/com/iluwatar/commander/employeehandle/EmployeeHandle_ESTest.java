/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 03:41:04 GMT 2021
 */

package com.iluwatar.commander.employeehandle;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.commander.employeehandle.EmployeeDatabase;
import com.iluwatar.commander.employeehandle.EmployeeHandle;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.mock.java.lang.MockException;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EmployeeHandle_ESTest extends EmployeeHandle_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EmployeeDatabase employeeDatabase0 = new EmployeeDatabase();
      Exception[] exceptionArray0 = new Exception[6];
      MockException mockException0 = new MockException();
      exceptionArray0[0] = (Exception) mockException0;
      exceptionArray0[1] = (Exception) mockException0;
      exceptionArray0[2] = (Exception) mockException0;
      exceptionArray0[3] = (Exception) mockException0;
      exceptionArray0[4] = (Exception) mockException0;
      exceptionArray0[5] = (Exception) mockException0;
      EmployeeHandle employeeHandle0 = new EmployeeHandle(employeeDatabase0, exceptionArray0);
      Object[] objectArray0 = new Object[7];
      // Undeclared exception!
      try { 
        employeeHandle0.receiveRequest(objectArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot read field \"id\" because \"o\" is null
         //
         verifyException("com.iluwatar.commander.employeehandle.EmployeeHandle", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Exception[] exceptionArray0 = new Exception[0];
      EmployeeDatabase employeeDatabase0 = new EmployeeDatabase();
      EmployeeHandle employeeHandle0 = new EmployeeHandle(employeeDatabase0, exceptionArray0);
      // Undeclared exception!
      try { 
        employeeHandle0.updateDb((Object[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot load from object array because \"parameters\" is null
         //
         verifyException("com.iluwatar.commander.employeehandle.EmployeeHandle", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      MockException mockException0 = new MockException();
      EmployeeDatabase employeeDatabase0 = new EmployeeDatabase();
      Exception[] exceptionArray0 = new Exception[1];
      exceptionArray0[0] = (Exception) mockException0;
      EmployeeHandle employeeHandle0 = new EmployeeHandle(employeeDatabase0, exceptionArray0);
      // Undeclared exception!
      try { 
        employeeHandle0.updateDb(exceptionArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.evosuite.runtime.mock.java.lang.MockException cannot be cast to class com.iluwatar.commander.Order (org.evosuite.runtime.mock.java.lang.MockException is in unnamed module of loader 'app'; com.iluwatar.commander.Order is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @587fc138)
         //
         verifyException("com.iluwatar.commander.employeehandle.EmployeeHandle", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Exception[] exceptionArray0 = new Exception[0];
      EmployeeHandle employeeHandle0 = new EmployeeHandle((EmployeeDatabase) null, exceptionArray0);
      // Undeclared exception!
      try { 
        employeeHandle0.updateDb(exceptionArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("com.iluwatar.commander.employeehandle.EmployeeHandle", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Exception[] exceptionArray0 = new Exception[0];
      EmployeeHandle employeeHandle0 = new EmployeeHandle((EmployeeDatabase) null, exceptionArray0);
      // Undeclared exception!
      try { 
        employeeHandle0.receiveRequest(exceptionArray0);
        fail("Expecting exception: ArrayIndexOutOfBoundsException");
      
      } catch(ArrayIndexOutOfBoundsException e) {
         //
         // Index 0 out of bounds for length 0
         //
         verifyException("com.iluwatar.commander.employeehandle.EmployeeHandle", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      EmployeeHandle employeeHandle0 = null;
      try {
        employeeHandle0 = new EmployeeHandle((EmployeeDatabase) null, (Exception[]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      MockException mockException0 = new MockException();
      EmployeeDatabase employeeDatabase0 = new EmployeeDatabase();
      Exception[] exceptionArray0 = new Exception[1];
      exceptionArray0[0] = (Exception) mockException0;
      EmployeeHandle employeeHandle0 = new EmployeeHandle(employeeDatabase0, exceptionArray0);
      // Undeclared exception!
      try { 
        employeeHandle0.receiveRequest(exceptionArray0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // class org.evosuite.runtime.mock.java.lang.MockException cannot be cast to class com.iluwatar.commander.Order (org.evosuite.runtime.mock.java.lang.MockException is in unnamed module of loader 'app'; com.iluwatar.commander.Order is in unnamed module of loader org.evosuite.instrumentation.InstrumentingClassLoader @587fc138)
         //
         verifyException("com.iluwatar.commander.employeehandle.EmployeeHandle", e);
      }
  }
}
