/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 04:25:45 GMT 2021
 */

package com.iluwatar.datamapper;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.datamapper.Student;
import com.iluwatar.datamapper.StudentDataMapperImpl;
import java.util.List;
import java.util.Optional;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class StudentDataMapperImpl_ESTest extends StudentDataMapperImpl_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      StudentDataMapperImpl studentDataMapperImpl0 = new StudentDataMapperImpl();
      Student student0 = new Student(1, "com.iluwatar.datamapper.StudentDataMapperImpl", 'F');
      studentDataMapperImpl0.insert(student0);
      studentDataMapperImpl0.update(student0);
      assertEquals("com.iluwatar.datamapper.StudentDataMapperImpl", student0.getName());
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      StudentDataMapperImpl studentDataMapperImpl0 = new StudentDataMapperImpl();
      Student student0 = new Student(299, "com.iluwatar.datamapper.Student", 'x');
      studentDataMapperImpl0.insert(student0);
      List<Student> list0 = studentDataMapperImpl0.getStudents();
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      StudentDataMapperImpl studentDataMapperImpl0 = new StudentDataMapperImpl();
      Student student0 = new Student(299, "com.iluwatar.datamapper.Student", 'x');
      try { 
        studentDataMapperImpl0.update(student0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Student [com.iluwatar.datamapper.Student] is not found
         //
         verifyException("com.iluwatar.datamapper.StudentDataMapperImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      StudentDataMapperImpl studentDataMapperImpl0 = new StudentDataMapperImpl();
      // Undeclared exception!
      try { 
        studentDataMapperImpl0.insert((Student) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.datamapper.Student.getStudentId()\" because \"studentToBeInserted\" is null
         //
         verifyException("com.iluwatar.datamapper.StudentDataMapperImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      StudentDataMapperImpl studentDataMapperImpl0 = new StudentDataMapperImpl();
      Student student0 = new Student((-1130), "1vx", '7');
      try { 
        studentDataMapperImpl0.delete(student0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Student [1vx] is not found
         //
         verifyException("com.iluwatar.datamapper.StudentDataMapperImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      StudentDataMapperImpl studentDataMapperImpl0 = new StudentDataMapperImpl();
      List<Student> list0 = studentDataMapperImpl0.getStudents();
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      StudentDataMapperImpl studentDataMapperImpl0 = new StudentDataMapperImpl();
      Optional<Student> optional0 = studentDataMapperImpl0.find((-4223));
      assertNotNull(optional0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      StudentDataMapperImpl studentDataMapperImpl0 = new StudentDataMapperImpl();
      // Undeclared exception!
      try { 
        studentDataMapperImpl0.delete((Student) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.datamapper.Student.getName()\" because \"studentToBeDeleted\" is null
         //
         verifyException("com.iluwatar.datamapper.StudentDataMapperImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      StudentDataMapperImpl studentDataMapperImpl0 = new StudentDataMapperImpl();
      Student student0 = new Student(0, "", '1');
      studentDataMapperImpl0.insert(student0);
      studentDataMapperImpl0.delete(student0);
      assertEquals('1', student0.getGrade());
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      StudentDataMapperImpl studentDataMapperImpl0 = new StudentDataMapperImpl();
      Student student0 = new Student(1, "com.iluwatar.datamapper.StudentDataMapperImpl", 'F');
      studentDataMapperImpl0.insert(student0);
      try { 
        studentDataMapperImpl0.insert(student0);
        fail("Expecting exception: RuntimeException");
      
      } catch(RuntimeException e) {
         //
         // Student already [com.iluwatar.datamapper.StudentDataMapperImpl] exists
         //
         verifyException("com.iluwatar.datamapper.StudentDataMapperImpl", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      StudentDataMapperImpl studentDataMapperImpl0 = new StudentDataMapperImpl();
      // Undeclared exception!
      try { 
        studentDataMapperImpl0.update((Student) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.datamapper.Student.getName()\" because \"studentToBeUpdated\" is null
         //
         verifyException("com.iluwatar.datamapper.StudentDataMapperImpl", e);
      }
  }
}