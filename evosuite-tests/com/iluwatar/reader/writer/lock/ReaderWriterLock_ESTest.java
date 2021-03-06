/*
 * This file was automatically generated by EvoSuite
 * Mon Jan 11 11:46:25 GMT 2021
 */

package com.iluwatar.reader.writer.lock;

import org.junit.Test;
import static org.junit.Assert.*;
import com.iluwatar.reader.writer.lock.ReaderWriterLock;
import java.util.concurrent.locks.Lock;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ReaderWriterLock_ESTest extends ReaderWriterLock_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      ReaderWriterLock readerWriterLock0 = new ReaderWriterLock();
      Lock lock0 = readerWriterLock0.writeLock();
      assertNotNull(lock0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      ReaderWriterLock readerWriterLock0 = new ReaderWriterLock();
      Lock lock0 = readerWriterLock0.readLock();
      assertNotNull(lock0);
  }
}
