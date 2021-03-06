/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 02:24:30 GMT 2021
 */

package com.iluwatar.acyclicvisitor;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.acyclicvisitor.ConfigureForDosVisitor;
import com.iluwatar.acyclicvisitor.Hayes;
import com.iluwatar.acyclicvisitor.Zoom;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ConfigureForDosVisitor_ESTest extends ConfigureForDosVisitor_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ConfigureForDosVisitor configureForDosVisitor0 = new ConfigureForDosVisitor();
      Zoom zoom0 = new Zoom();
      configureForDosVisitor0.visit(zoom0);
      assertEquals("Zoom modem", zoom0.toString());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ConfigureForDosVisitor configureForDosVisitor0 = new ConfigureForDosVisitor();
      Hayes hayes0 = new Hayes();
      configureForDosVisitor0.visit(hayes0);
      assertEquals("Hayes modem", hayes0.toString());
  }
}
