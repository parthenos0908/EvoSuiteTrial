/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 03:26:49 GMT 2021
 */

package com.iluwatar.collectionpipeline;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.collectionpipeline.Car;
import com.iluwatar.collectionpipeline.Category;
import com.iluwatar.collectionpipeline.ImperativeProgramming;
import com.iluwatar.collectionpipeline.Person;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ImperativeProgramming_ESTest extends ImperativeProgramming_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Category category0 = Category.SEDAN;
      Car car0 = new Car((String) null, (String) null, 2034, category0);
      Car car1 = new Car((String) null, (String) null, 0, category0);
      List<Car> list0 = List.of(car0, car1);
      Person person0 = new Person(list0);
      List<Person> list1 = List.of(person0, person0, person0, person0, person0, person0, person0);
      List<Car> list2 = ImperativeProgramming.getSedanCarsOwnedSortedByDate(list1);
      assertTrue(list2.contains(car0));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Category category0 = Category.JEEP;
      Car car0 = new Car("-C", (String) null, 3042, category0);
      Car car1 = new Car((String) null, "!ZDBlKWE9", 2131, category0);
      List<Car> list0 = List.of(car1, car0, car1, car1, car0);
      List<String> list1 = ImperativeProgramming.getModelsAfter2000(list0);
      assertTrue(list1.contains("!ZDBlKWE9"));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<Car> linkedList0 = new LinkedList<Car>();
      Category category0 = Category.JEEP;
      Car car0 = new Car("", "com.iluwatar.collectionpipeline.Category", 2000, category0);
      linkedList0.add(car0);
      List<String> list0 = ImperativeProgramming.getModelsAfter2000(linkedList0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Category category0 = Category.SEDAN;
      Car car0 = new Car((String) null, (String) null, 0, category0);
      List<Car> list0 = List.of(car0, car0);
      List<String> list1 = ImperativeProgramming.getModelsAfter2000(list0);
      assertEquals(0, list1.size());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<Car> linkedList0 = new LinkedList<Car>();
      Map<Category, List<Car>> map0 = ImperativeProgramming.getGroupingOfCarsByCategory(linkedList0);
      assertTrue(map0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      // Undeclared exception!
      try { 
        ImperativeProgramming.getSedanCarsOwnedSortedByDate((List<Person>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"java.util.List.iterator()\"
         //
         verifyException("com.iluwatar.collectionpipeline.ImperativeProgramming", e);
      }
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      LinkedList<Car> linkedList0 = new LinkedList<Car>();
      linkedList0.add((Car) null);
      // Undeclared exception!
      try { 
        ImperativeProgramming.getModelsAfter2000(linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.collectionpipeline.Car.getYear()\" because \"car\" is null
         //
         verifyException("com.iluwatar.collectionpipeline.ImperativeProgramming", e);
      }
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      LinkedList<Car> linkedList0 = new LinkedList<Car>();
      linkedList0.add((Car) null);
      // Undeclared exception!
      try { 
        ImperativeProgramming.getGroupingOfCarsByCategory(linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.collectionpipeline.Car.getCategory()\" because \"car\" is null
         //
         verifyException("com.iluwatar.collectionpipeline.ImperativeProgramming", e);
      }
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      LinkedList<Car> linkedList0 = new LinkedList<Car>();
      LinkedList<Person> linkedList1 = new LinkedList<Person>();
      Category category0 = Category.JEEP;
      Car car0 = new Car("", "com.iluwatar.collectionpipeline.Category", 2000, category0);
      linkedList0.add(car0);
      Person person0 = new Person(linkedList0);
      linkedList1.add(person0);
      List<Car> list0 = ImperativeProgramming.getSedanCarsOwnedSortedByDate(linkedList1);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test9()  throws Throwable  {
      Category category0 = Category.SEDAN;
      Car car0 = new Car((String) null, (String) null, 2034, category0);
      List<Car> list0 = List.of(car0, car0);
      Map<Category, List<Car>> map0 = ImperativeProgramming.getGroupingOfCarsByCategory(list0);
      assertFalse(map0.isEmpty());
  }
}
