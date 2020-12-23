/*
 * This file was automatically generated by EvoSuite
 * Wed Dec 23 01:24:32 GMT 2020
 */


import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class File_ESTest extends File_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      File file0 = new File("", 1627);
      int int0 = file0.getSize();
      assertEquals(1627, int0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      File file0 = new File((String) null, (-2688));
      int int0 = file0.getSize();
      assertEquals((-2688), int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      File file0 = new File("Entry", 0);
      file0.getName();
      assertEquals(0, file0.getSize());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      File file0 = new File("", 0);
      file0.getName();
      assertEquals(0, file0.getSize());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      File file0 = new File((String) null, (-291));
      // Undeclared exception!
      try { 
        file0.accept((Visitor) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"Visitor.visit(File)\" because \"<parameter1>\" is null
         //
         verifyException("File", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      File file0 = new File((String) null, 0);
      int int0 = file0.getSize();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      File file0 = new File((String) null, 0);
      file0.getName();
      assertEquals(0, file0.getSize());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      File file0 = new File((String) null, 0);
      ListVisitor listVisitor0 = new ListVisitor();
      file0.accept(listVisitor0);
      assertEquals(0, file0.getSize());
  }
}