/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 13:17:12 GMT 2021
 */

package com.iluwatar.specification.selector;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.iluwatar.specification.selector.AbstractSelector;
import com.iluwatar.specification.selector.ConjunctionSelector;
import com.iluwatar.specification.selector.DisjunctionSelector;
import com.iluwatar.specification.selector.NegationSelector;
import java.lang.reflect.Array;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class DisjunctionSelector_ESTest extends DisjunctionSelector_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      AbstractSelector<String>[] abstractSelectorArray0 = (AbstractSelector<String>[]) Array.newInstance(AbstractSelector.class, 0);
      DisjunctionSelector<String> disjunctionSelector0 = new DisjunctionSelector<String>(abstractSelectorArray0);
      boolean boolean0 = disjunctionSelector0.test("K.ZdfOW8n)'e6");
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      AbstractSelector<Integer>[] abstractSelectorArray0 = (AbstractSelector<Integer>[]) Array.newInstance(AbstractSelector.class, 1);
      NegationSelector<Integer> negationSelector0 = new NegationSelector<Integer>((AbstractSelector<Integer>) null);
      abstractSelectorArray0[0] = (AbstractSelector<Integer>) negationSelector0;
      DisjunctionSelector<Integer> disjunctionSelector0 = new DisjunctionSelector<Integer>(abstractSelectorArray0);
      Integer integer0 = new Integer(1001);
      // Undeclared exception!
      try { 
        disjunctionSelector0.test(integer0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // Cannot invoke \"com.iluwatar.specification.selector.AbstractSelector.test(Object)\" because \"this.component\" is null
         //
         verifyException("com.iluwatar.specification.selector.NegationSelector", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      AbstractSelector<Object>[] abstractSelectorArray0 = (AbstractSelector<Object>[]) Array.newInstance(AbstractSelector.class, 3);
      AbstractSelector<Object>[] abstractSelectorArray1 = (AbstractSelector<Object>[]) Array.newInstance(AbstractSelector.class, 3);
      AbstractSelector<Object> abstractSelector0 = (AbstractSelector<Object>) mock(AbstractSelector.class, new ViolatedAssumptionAnswer());
      doReturn(false, false, false).when(abstractSelector0).test(any());
      NegationSelector<Object> negationSelector0 = new NegationSelector<Object>(abstractSelector0);
      abstractSelectorArray1[0] = (AbstractSelector<Object>) negationSelector0;
      abstractSelectorArray1[1] = (AbstractSelector<Object>) negationSelector0;
      abstractSelectorArray1[2] = (AbstractSelector<Object>) negationSelector0;
      ConjunctionSelector<Object> conjunctionSelector0 = new ConjunctionSelector<Object>(abstractSelectorArray1);
      abstractSelectorArray0[0] = (AbstractSelector<Object>) conjunctionSelector0;
      abstractSelectorArray0[1] = (AbstractSelector<Object>) negationSelector0;
      abstractSelectorArray0[2] = (AbstractSelector<Object>) negationSelector0;
      DisjunctionSelector<Object> disjunctionSelector0 = new DisjunctionSelector<Object>(abstractSelectorArray0);
      Object object0 = new Object();
      boolean boolean0 = disjunctionSelector0.test(object0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      AbstractSelector<Object>[] abstractSelectorArray0 = (AbstractSelector<Object>[]) Array.newInstance(AbstractSelector.class, 3);
      DisjunctionSelector<Object> disjunctionSelector0 = null;
      try {
        disjunctionSelector0 = new DisjunctionSelector<Object>(abstractSelectorArray0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.Objects", e);
      }
  }
}
