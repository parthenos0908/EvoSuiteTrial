/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 03:38:51 GMT 2021
 */

package com.iluwatar.commander;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.commander.employeehandle.EmployeeDatabase;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Database_ESTest extends Database_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      EmployeeDatabase employeeDatabase0 = new EmployeeDatabase();
  }
}
