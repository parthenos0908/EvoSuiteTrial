/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 14:07:28 GMT 2021
 */

package com.iluwatar.versionnumber;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.versionnumber.VersionMismatchException;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class VersionMismatchException_ESTest extends VersionMismatchException_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      VersionMismatchException versionMismatchException0 = new VersionMismatchException("");
  }
}
