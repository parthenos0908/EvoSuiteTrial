/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 14:03:31 GMT 2021
 */

package com.iluwatar.updatemethod;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.updatemethod.Entity;
import com.iluwatar.updatemethod.Skeleton;
import com.iluwatar.updatemethod.Statue;
import com.iluwatar.updatemethod.World;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class World_ESTest extends World_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      World world0 = new World();
      LinkedList<Entity> linkedList0 = new LinkedList<Entity>();
      world0.entities = (List<Entity>) linkedList0;
      Statue statue0 = new Statue(0, 1413);
      Skeleton skeleton0 = new Skeleton(0, 0);
      List<Entity> list0 = List.of((Entity) skeleton0, (Entity) skeleton0, (Entity) skeleton0, (Entity) statue0, (Entity) skeleton0, (Entity) skeleton0);
      world0.entities = list0;
      // Undeclared exception!
      try { 
        world0.addEntity(skeleton0);
        fail("Expecting exception: UnsupportedOperationException");
      
      } catch(UnsupportedOperationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.ImmutableCollections", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      World world0 = new World();
      world0.entities = null;
      Statue statue0 = new Statue((-4756), (-1));
      // Undeclared exception!
      try { 
        world0.addEntity(statue0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"java.util.List.add(Object)\" because \"this.entities\" is null
         //
         verifyException("com.iluwatar.updatemethod.World", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      World world0 = new World();
      world0.addEntity((Entity) null);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      World world0 = new World();
      world0.run();
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      World world0 = new World();
      world0.stop();
  }
}