/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 05:12:10 GMT 2021
 */

package com.iluwatar.event.sourcing.processor;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.event.sourcing.event.DomainEvent;
import com.iluwatar.event.sourcing.processor.JsonFileJournal;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class JsonFileJournal_ESTest extends JsonFileJournal_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      JsonFileJournal jsonFileJournal0 = new JsonFileJournal();
      // Undeclared exception!
      try { 
        jsonFileJournal0.write((DomainEvent) null);
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/gson/Gson
         //
         verifyException("com.iluwatar.event.sourcing.processor.JsonFileJournal", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Journal.json");
      FileSystemHandling.createFolder(evoSuiteFile0);
      JsonFileJournal jsonFileJournal0 = null;
      try {
        jsonFileJournal0 = new JsonFileJournal();
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // java.io.FileNotFoundException
         //
         verifyException("com.iluwatar.event.sourcing.processor.JsonFileJournal", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      JsonFileJournal jsonFileJournal0 = new JsonFileJournal();
      jsonFileJournal0.reset();
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile("Journal.json");
      FileSystemHandling.appendStringToFile(evoSuiteFile0, "dP*V*{zVO-LN@7:\"!");
      JsonFileJournal jsonFileJournal0 = new JsonFileJournal();
      // Undeclared exception!
      try { 
        jsonFileJournal0.readNext();
        fail("Expecting exception: NoClassDefFoundError");
      
      } catch(NoClassDefFoundError e) {
         //
         // com/google/gson/JsonParser
         //
         verifyException("com.iluwatar.event.sourcing.processor.JsonFileJournal", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      JsonFileJournal jsonFileJournal0 = new JsonFileJournal();
      DomainEvent domainEvent0 = jsonFileJournal0.readNext();
      assertNull(domainEvent0);
  }
}