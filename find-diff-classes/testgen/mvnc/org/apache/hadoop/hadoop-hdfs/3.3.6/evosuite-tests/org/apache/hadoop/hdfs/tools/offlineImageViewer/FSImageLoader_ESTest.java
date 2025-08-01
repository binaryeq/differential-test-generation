/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 10 23:37:43 GMT 2024
 */

package org.apache.hadoop.hdfs.tools.offlineImageViewer;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.ByteArrayInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import org.apache.hadoop.hdfs.server.namenode.FsImageProto;
import org.apache.hadoop.hdfs.tools.offlineImageViewer.FSImageLoader;
import org.apache.hadoop.thirdparty.protobuf.ByteString;
import org.apache.hadoop.thirdparty.protobuf.DescriptorProtos;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.evosuite.runtime.testdata.EvoSuiteFile;
import org.evosuite.runtime.testdata.FileSystemHandling;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class FSImageLoader_ESTest extends FSImageLoader_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[2];
      byteArray0[0] = (byte)61;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        FSImageLoader.loadStringTable(byteArrayInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Protocol message contained an invalid tag (zero).
         //
         verifyException("org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException", e);
      }
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      byteArray0[0] = (byte) (-104);
      byteArray0[1] = (byte) (-18);
      byteArray0[3] = (byte)77;
      byteArray0[8] = (byte)30;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        FSImageLoader.loadStringTable(byteArrayInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Protocol message tag had invalid wire type.
         //
         verifyException("org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        FSImageLoader.loadStringTable((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.hadoop.thirdparty.protobuf.AbstractParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        FSImageLoader.loadStringTable(pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte)41;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        FSImageLoader.loadINodeReferenceSection(byteArrayInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Protocol message contained an invalid tag (zero).
         //
         verifyException("org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException", e);
      }
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[6];
      byteArray0[1] = (byte)41;
      byteArray0[2] = (byte)87;
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      try { 
        FSImageLoader.loadINodeReferenceSection(byteArrayInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Protocol message tag had invalid wire type.
         //
         verifyException("org.apache.hadoop.thirdparty.protobuf.InvalidProtocolBufferException", e);
      }
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      // Undeclared exception!
      try { 
        FSImageLoader.loadINodeReferenceSection((InputStream) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.hadoop.thirdparty.protobuf.AbstractParser", e);
      }
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      PipedInputStream pipedInputStream0 = new PipedInputStream();
      try { 
        FSImageLoader.loadINodeReferenceSection(pipedInputStream0);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Pipe not connected
         //
         verifyException("java.io.PipedInputStream", e);
      }
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      // Undeclared exception!
      try { 
        FSImageLoader.load((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockRandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      try { 
        FSImageLoader.load("Cannot resolve PropertyFilter with id '");
        fail("Expecting exception: FileNotFoundException");
      
      } catch(FileNotFoundException e) {
         //
         // File does not exist, and RandomAccessFile is not open in write mode
         //
         verifyException("org.evosuite.runtime.mock.java.io.MockRandomAccessFile", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      // Undeclared exception!
      try { 
        FSImageLoader.getFileSize((FsImageProto.INodeSection.INodeFile) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.hadoop.hdfs.tools.offlineImageViewer.FSImageLoader", e);
      }
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      Enumeration<SequenceInputStream> enumeration0 = (Enumeration<SequenceInputStream>) mock(Enumeration.class, new ViolatedAssumptionAnswer());
      doReturn(false).when(enumeration0).hasMoreElements();
      SequenceInputStream sequenceInputStream0 = new SequenceInputStream(enumeration0);
      DescriptorProtos.FieldDescriptorProto descriptorProtos_FieldDescriptorProto0 = DescriptorProtos.FieldDescriptorProto.parseFrom((InputStream) sequenceInputStream0);
      ByteString byteString0 = descriptorProtos_FieldDescriptorProto0.getExtendeeBytes();
      FsImageProto.INodeSection.INodeFile fsImageProto_INodeSection_INodeFile0 = FsImageProto.INodeSection.INodeFile.parseFrom(byteString0);
      long long0 = FSImageLoader.getFileSize(fsImageProto_INodeSection_INodeFile0);
      assertEquals(0L, long0);
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      FSImageLoader.loadStringTable(byteArrayInputStream0);
      assertEquals(6, byteArrayInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[7];
      ByteArrayInputStream byteArrayInputStream0 = new ByteArrayInputStream(byteArray0);
      FSImageLoader.loadINodeReferenceSection(byteArrayInputStream0);
      assertEquals(0, byteArrayInputStream0.available());
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      EvoSuiteFile evoSuiteFile0 = new EvoSuiteFile(" 2a<V(jkG)EDoCN");
      FileSystemHandling.appendLineToFile(evoSuiteFile0, "");
      try { 
        FSImageLoader.load(" 2a<V(jkG)EDoCN");
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Unrecognized FSImage
         //
         verifyException("org.apache.hadoop.hdfs.tools.offlineImageViewer.FSImageLoader", e);
      }
  }
}
