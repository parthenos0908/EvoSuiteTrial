/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 12:11:38 GMT 2021
 */

package com.iluwatar.saga.orchestration;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.saga.orchestration.ChapterResult;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ChapterResult_ESTest extends ChapterResult_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ChapterResult.State chapterResult_State0 = ChapterResult.State.SUCCESS;
      ChapterResult<String> chapterResult0 = new ChapterResult<String>("", chapterResult_State0);
      assertTrue(chapterResult0.isSuccess());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ChapterResult<String> chapterResult0 = ChapterResult.failure((String) null);
      Object object0 = chapterResult0.getValue();
      assertNull(object0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      ChapterResult<String> chapterResult0 = ChapterResult.success("");
      boolean boolean0 = chapterResult0.isSuccess();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      ChapterResult<String> chapterResult0 = ChapterResult.success("");
      ChapterResult<Object> chapterResult1 = ChapterResult.failure((Object) chapterResult0);
      boolean boolean0 = chapterResult1.isSuccess();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Object object0 = new Object();
      ChapterResult<Object> chapterResult0 = ChapterResult.success(object0);
      Object object1 = chapterResult0.getValue();
      assertSame(object0, object1);
  }
}
