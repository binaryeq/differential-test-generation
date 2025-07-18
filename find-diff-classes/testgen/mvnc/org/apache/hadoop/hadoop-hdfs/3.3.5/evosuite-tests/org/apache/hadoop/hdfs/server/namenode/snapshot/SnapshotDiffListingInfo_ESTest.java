/*
 * This file was automatically generated by EvoSuite
 * Sun Nov 10 23:19:13 GMT 2024
 */

package org.apache.hadoop.hdfs.server.namenode.snapshot;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.shaded.org.mockito.Mockito.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.io.IOException;
import java.util.Set;
import org.apache.hadoop.fs.permission.FsPermission;
import org.apache.hadoop.fs.permission.PermissionStatus;
import org.apache.hadoop.hdfs.protocol.SnapshotDiffReportListing;
import org.apache.hadoop.hdfs.server.namenode.INodeDirectory;
import org.apache.hadoop.hdfs.server.namenode.INodeFile;
import org.apache.hadoop.hdfs.server.namenode.LeaseManager;
import org.apache.hadoop.hdfs.server.namenode.snapshot.DirectoryWithSnapshotFeature;
import org.apache.hadoop.hdfs.server.namenode.snapshot.Snapshot;
import org.apache.hadoop.hdfs.server.namenode.snapshot.SnapshotDiffListingInfo;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.evosuite.runtime.ViolatedAssumptionAnswer;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SnapshotDiffListingInfo_ESTest extends SnapshotDiffListingInfo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      FsPermission fsPermission0 = FsPermission.getCachePoolDefault();
      PermissionStatus permissionStatus0 = new PermissionStatus("fs.permissions.umask-mode", "fs.permissions.umask-mode", fsPermission0);
      INodeDirectory iNodeDirectory0 = new INodeDirectory(10, byteArray0, permissionStatus0, 10);
      iNodeDirectory0.addSnapshottableFeature();
      Snapshot snapshot0 = new Snapshot(18, iNodeDirectory0, iNodeDirectory0);
      SnapshotDiffListingInfo snapshotDiffListingInfo0 = new SnapshotDiffListingInfo(iNodeDirectory0, iNodeDirectory0, (Snapshot) null, snapshot0, 3423);
      Snapshot snapshot1 = snapshotDiffListingInfo0.getEarlier();
      assertSame(snapshot1, snapshot0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      FsPermission fsPermission0 = FsPermission.getCachePoolDefault();
      PermissionStatus permissionStatus0 = new PermissionStatus("fs.permissions.umask-mode", "fs.permissions.umask-mode", fsPermission0);
      INodeDirectory iNodeDirectory0 = new INodeDirectory(1916L, byteArray0, permissionStatus0, 10);
      iNodeDirectory0.addSnapshottableFeature();
      SnapshotDiffListingInfo snapshotDiffListingInfo0 = new SnapshotDiffListingInfo(iNodeDirectory0, iNodeDirectory0, (Snapshot) null, (Snapshot) null, 0);
      // Undeclared exception!
      try { 
        snapshotDiffListingInfo0.addFileDiff((INodeFile) null, (byte[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.hadoop.hdfs.DFSUtilClient", e);
      }
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      FsPermission fsPermission0 = FsPermission.getCachePoolDefault();
      PermissionStatus permissionStatus0 = new PermissionStatus("fs.permissions.umask-mode", "fs.permissions.umask-mode", fsPermission0);
      INodeDirectory iNodeDirectory0 = new INodeDirectory(10, byteArray0, permissionStatus0, 10);
      iNodeDirectory0.addSnapshottableFeature();
      SnapshotDiffListingInfo snapshotDiffListingInfo0 = new SnapshotDiffListingInfo(iNodeDirectory0, iNodeDirectory0, (Snapshot) null, (Snapshot) null, 2);
      snapshotDiffListingInfo0.setLastIndex(0);
      DirectoryWithSnapshotFeature.ChildrenDiff directoryWithSnapshotFeature_ChildrenDiff0 = new DirectoryWithSnapshotFeature.ChildrenDiff();
      directoryWithSnapshotFeature_ChildrenDiff0.create(iNodeDirectory0);
      // Undeclared exception!
      try { 
        snapshotDiffListingInfo0.addDirDiff(839L, (byte[][]) null, directoryWithSnapshotFeature_ChildrenDiff0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.hadoop.hdfs.server.namenode.snapshot.SnapshotDiffListingInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      FsPermission fsPermission0 = FsPermission.getCachePoolDefault();
      PermissionStatus permissionStatus0 = new PermissionStatus("fs.permissions.umask-mode", "fs.permissions.umask-mode", fsPermission0);
      INodeDirectory iNodeDirectory0 = new INodeDirectory(10, byteArray0, permissionStatus0, 10);
      iNodeDirectory0.addSnapshottableFeature();
      SnapshotDiffListingInfo snapshotDiffListingInfo0 = new SnapshotDiffListingInfo(iNodeDirectory0, iNodeDirectory0, (Snapshot) null, (Snapshot) null, 268435455);
      snapshotDiffListingInfo0.setLastIndex(0);
      DirectoryWithSnapshotFeature.ChildrenDiff directoryWithSnapshotFeature_ChildrenDiff0 = new DirectoryWithSnapshotFeature.ChildrenDiff();
      boolean boolean0 = snapshotDiffListingInfo0.addDirDiff(10, (byte[][]) null, directoryWithSnapshotFeature_ChildrenDiff0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      FsPermission fsPermission0 = FsPermission.getCachePoolDefault();
      PermissionStatus permissionStatus0 = new PermissionStatus("fs.permissions.umask-mode", "fs.permissions.umask-mode", fsPermission0);
      INodeDirectory iNodeDirectory0 = new INodeDirectory(10, byteArray0, permissionStatus0, 10);
      iNodeDirectory0.addSnapshottableFeature();
      SnapshotDiffListingInfo snapshotDiffListingInfo0 = new SnapshotDiffListingInfo(iNodeDirectory0, iNodeDirectory0, (Snapshot) null, (Snapshot) null, 0);
      byte[][] byteArray1 = new byte[1][7];
      boolean boolean0 = snapshotDiffListingInfo0.addDirDiff((-2533), byteArray1, (DirectoryWithSnapshotFeature.ChildrenDiff) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      FsPermission fsPermission0 = FsPermission.getCachePoolDefault();
      PermissionStatus permissionStatus0 = new PermissionStatus("fs.permissions.umask-mode", "fs.permissions.umask-mode", fsPermission0);
      INodeDirectory iNodeDirectory0 = new INodeDirectory(10, byteArray0, permissionStatus0, 10);
      iNodeDirectory0.addSnapshottableFeature();
      SnapshotDiffListingInfo snapshotDiffListingInfo0 = new SnapshotDiffListingInfo(iNodeDirectory0, iNodeDirectory0, (Snapshot) null, (Snapshot) null, (-559038737));
      byte[][] byteArray1 = new byte[2][3];
      snapshotDiffListingInfo0.setLastPath(byteArray1);
      assertEquals(2, byteArray1.length);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      FsPermission fsPermission0 = FsPermission.getCachePoolDefault();
      PermissionStatus permissionStatus0 = new PermissionStatus("fs.permissions.umask-mode", "fs.permissions.umask-mode", fsPermission0);
      INodeDirectory iNodeDirectory0 = new INodeDirectory(10, byteArray0, permissionStatus0, 10);
      iNodeDirectory0.addSnapshottableFeature();
      Snapshot snapshot0 = new Snapshot(2, iNodeDirectory0, iNodeDirectory0);
      Snapshot.Root snapshot_Root0 = snapshot0.getRoot();
      SnapshotDiffListingInfo snapshotDiffListingInfo0 = new SnapshotDiffListingInfo(iNodeDirectory0, snapshot_Root0, snapshot0, (Snapshot) null, (-559038737));
      boolean boolean0 = snapshotDiffListingInfo0.isFromEarlier();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      FsPermission fsPermission0 = FsPermission.getCachePoolDefault();
      PermissionStatus permissionStatus0 = PermissionStatus.createImmutable("fs.permissions.umask-mode", "fs.permissions.umask-mode", fsPermission0);
      INodeDirectory iNodeDirectory0 = new INodeDirectory(10, byteArray0, permissionStatus0, 10);
      iNodeDirectory0.addSnapshottableFeature();
      SnapshotDiffListingInfo snapshotDiffListingInfo0 = new SnapshotDiffListingInfo(iNodeDirectory0, iNodeDirectory0, (Snapshot) null, (Snapshot) null, (-559038732));
      boolean boolean0 = snapshotDiffListingInfo0.isFromEarlier();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      FsPermission fsPermission0 = FsPermission.getCachePoolDefault();
      PermissionStatus permissionStatus0 = new PermissionStatus("fs.permissions.umask-mode", "fs.permissions.umask-mode", fsPermission0);
      INodeDirectory iNodeDirectory0 = new INodeDirectory(10, byteArray0, permissionStatus0, 10);
      iNodeDirectory0.addSnapshottableFeature();
      SnapshotDiffListingInfo snapshotDiffListingInfo0 = new SnapshotDiffListingInfo(iNodeDirectory0, iNodeDirectory0, (Snapshot) null, (Snapshot) null, 268435455);
      Snapshot snapshot0 = snapshotDiffListingInfo0.getLater();
      assertNull(snapshot0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      FsPermission fsPermission0 = FsPermission.getCachePoolDefault();
      PermissionStatus permissionStatus0 = new PermissionStatus("fs.permissions.umask-mode", "fs.permissions.umask-mode", fsPermission0);
      INodeDirectory iNodeDirectory0 = new INodeDirectory(10, byteArray0, permissionStatus0, 10);
      iNodeDirectory0.addSnapshottableFeature();
      INodeFile iNodeFile0 = null;
      FsPermission.getFileDefault();
      byte[][] byteArrayArray0 = null;
      LeaseManager leaseManager0 = mock(LeaseManager.class, new ViolatedAssumptionAnswer());
      doReturn((Set) null).when(leaseManager0).getINodeWithLeases(any(org.apache.hadoop.hdfs.server.namenode.INodeDirectory.class));
      try { 
        iNodeDirectory0.addSnapshot(161311, "fs.permissions.umask-mode", leaseManager0, true, 10, 18);
        fail("Expecting exception: IOException");
      
      } catch(IOException e) {
         //
         // Failed to add snapshot: Unable to capture all open files under the snapshot dir \u0000\u0000\u0000 for snapshot 'fs.permissions.umask-mode'
         //
         verifyException("org.apache.hadoop.hdfs.server.namenode.snapshot.DirectorySnapshottableFeature", e);
      }
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      FsPermission fsPermission0 = FsPermission.getCachePoolDefault();
      PermissionStatus permissionStatus0 = new PermissionStatus("fs.permissions.umask-mode", "fs.permissions.umask-mode", fsPermission0);
      INodeDirectory iNodeDirectory0 = new INodeDirectory(10, byteArray0, permissionStatus0, 10);
      iNodeDirectory0.addSnapshottableFeature();
      SnapshotDiffListingInfo snapshotDiffListingInfo0 = new SnapshotDiffListingInfo(iNodeDirectory0, iNodeDirectory0, (Snapshot) null, (Snapshot) null, 268435455);
      snapshotDiffListingInfo0.setLastIndex(0);
      SnapshotDiffReportListing snapshotDiffReportListing0 = snapshotDiffListingInfo0.generateReport();
      assertFalse(snapshotDiffReportListing0.getIsFromEarlier());
      assertEquals(0, snapshotDiffReportListing0.getLastIndex());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      FsPermission fsPermission0 = FsPermission.getCachePoolDefault();
      PermissionStatus permissionStatus0 = new PermissionStatus("fs.permissions.umask-mode", "fs.permissions.umask-mode", fsPermission0);
      INodeDirectory iNodeDirectory0 = new INodeDirectory(10, byteArray0, permissionStatus0, 10);
      iNodeDirectory0.addSnapshottableFeature();
      SnapshotDiffListingInfo snapshotDiffListingInfo0 = new SnapshotDiffListingInfo(iNodeDirectory0, iNodeDirectory0, (Snapshot) null, (Snapshot) null, (-559038737));
      snapshotDiffListingInfo0.setLastIndex(33);
      SnapshotDiffReportListing snapshotDiffReportListing0 = snapshotDiffListingInfo0.generateReport();
      assertFalse(snapshotDiffReportListing0.getIsFromEarlier());
      assertEquals(33, snapshotDiffReportListing0.getLastIndex());
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      FsPermission fsPermission0 = FsPermission.getCachePoolDefault();
      PermissionStatus permissionStatus0 = new PermissionStatus("fs.permissions.umask-mode", "fs.permissions.umask-mode", fsPermission0);
      INodeDirectory iNodeDirectory0 = new INodeDirectory(10, byteArray0, permissionStatus0, 10);
      iNodeDirectory0.addSnapshottableFeature();
      Snapshot snapshot0 = new Snapshot((-3090), "fs.permissions.umask-mode", iNodeDirectory0);
      SnapshotDiffListingInfo snapshotDiffListingInfo0 = new SnapshotDiffListingInfo(iNodeDirectory0, iNodeDirectory0, (Snapshot) null, snapshot0, 1);
      SnapshotDiffReportListing snapshotDiffReportListing0 = snapshotDiffListingInfo0.generateReport();
      assertEquals((-1), snapshotDiffReportListing0.getLastIndex());
      assertTrue(snapshotDiffReportListing0.getIsFromEarlier());
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      FsPermission fsPermission0 = FsPermission.getCachePoolDefault();
      PermissionStatus permissionStatus0 = new PermissionStatus("fs.permissions.umask-mode", "fs.permissions.umask-mode", fsPermission0);
      INodeDirectory iNodeDirectory0 = new INodeDirectory(10, byteArray0, permissionStatus0, 10);
      iNodeDirectory0.addSnapshottableFeature();
      SnapshotDiffListingInfo snapshotDiffListingInfo0 = new SnapshotDiffListingInfo(iNodeDirectory0, iNodeDirectory0, (Snapshot) null, (Snapshot) null, (-559038737));
      byte[][] byteArray1 = new byte[2][3];
      boolean boolean0 = snapshotDiffListingInfo0.addDirDiff(1L, byteArray1, (DirectoryWithSnapshotFeature.ChildrenDiff) null);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      FsPermission fsPermission0 = FsPermission.getCachePoolDefault();
      PermissionStatus permissionStatus0 = new PermissionStatus("fs.permissions.umask-mode", "fs.permissions.umask-mode", fsPermission0);
      INodeDirectory iNodeDirectory0 = new INodeDirectory(10, byteArray0, permissionStatus0, 10);
      iNodeDirectory0.addSnapshottableFeature();
      SnapshotDiffListingInfo snapshotDiffListingInfo0 = new SnapshotDiffListingInfo(iNodeDirectory0, iNodeDirectory0, (Snapshot) null, (Snapshot) null, 2);
      DirectoryWithSnapshotFeature.ChildrenDiff directoryWithSnapshotFeature_ChildrenDiff0 = new DirectoryWithSnapshotFeature.ChildrenDiff();
      // Undeclared exception!
      try { 
        snapshotDiffListingInfo0.addDirDiff(2, (byte[][]) null, directoryWithSnapshotFeature_ChildrenDiff0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.hadoop.thirdparty.com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      SnapshotDiffListingInfo snapshotDiffListingInfo0 = null;
      try {
        snapshotDiffListingInfo0 = new SnapshotDiffListingInfo((INodeDirectory) null, (INodeDirectory) null, (Snapshot) null, (Snapshot) null, (-396));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.hadoop.hdfs.server.namenode.snapshot.SnapshotDiffListingInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      FsPermission fsPermission0 = FsPermission.getCachePoolDefault();
      PermissionStatus permissionStatus0 = new PermissionStatus("fs.permissions.umask-mode", "fs.permissions.umask-mode", fsPermission0);
      INodeDirectory iNodeDirectory0 = new INodeDirectory(10, byteArray0, permissionStatus0, 10);
      iNodeDirectory0.addSnapshottableFeature();
      SnapshotDiffListingInfo snapshotDiffListingInfo0 = new SnapshotDiffListingInfo(iNodeDirectory0, iNodeDirectory0, (Snapshot) null, (Snapshot) null, 2);
      // Undeclared exception!
      try { 
        snapshotDiffListingInfo0.addFileDiff((INodeFile) null, (byte[][]) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.hadoop.hdfs.server.namenode.snapshot.SnapshotDiffListingInfo", e);
      }
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      FsPermission fsPermission0 = FsPermission.getCachePoolDefault();
      PermissionStatus permissionStatus0 = new PermissionStatus("fs.permissions.umask-mode", "fs.permissions.umask-mode", fsPermission0);
      INodeDirectory iNodeDirectory0 = new INodeDirectory(18, byteArray0, permissionStatus0, (-242L));
      iNodeDirectory0.addSnapshottableFeature();
      SnapshotDiffListingInfo snapshotDiffListingInfo0 = new SnapshotDiffListingInfo(iNodeDirectory0, iNodeDirectory0, (Snapshot) null, (Snapshot) null, (-1));
      byte[][] byteArray1 = new byte[8][3];
      boolean boolean0 = snapshotDiffListingInfo0.addFileDiff((INodeFile) null, byteArray1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      FsPermission fsPermission0 = FsPermission.getCachePoolDefault();
      PermissionStatus permissionStatus0 = new PermissionStatus("fs.permissions.umask-mode", "fs.permissions.umask-mode", fsPermission0);
      INodeDirectory iNodeDirectory0 = new INodeDirectory(10, byteArray0, permissionStatus0, 10);
      iNodeDirectory0.addSnapshottableFeature();
      Snapshot snapshot0 = new Snapshot((-3090), "fs.permissions.umask-mode", iNodeDirectory0);
      SnapshotDiffListingInfo snapshotDiffListingInfo0 = new SnapshotDiffListingInfo(iNodeDirectory0, iNodeDirectory0, (Snapshot) null, snapshot0, 1);
      Snapshot snapshot1 = snapshotDiffListingInfo0.getLater();
      assertSame(snapshot0, snapshot1);
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      FsPermission fsPermission0 = FsPermission.getCachePoolDefault();
      PermissionStatus permissionStatus0 = new PermissionStatus("fs.permissions.umask-mode", "fs.permissions.umask-mode", fsPermission0);
      INodeDirectory iNodeDirectory0 = new INodeDirectory(18, byteArray0, permissionStatus0, 0L);
      iNodeDirectory0.addSnapshottableFeature();
      Snapshot snapshot0 = new Snapshot((-1), "", iNodeDirectory0);
      SnapshotDiffListingInfo snapshotDiffListingInfo0 = new SnapshotDiffListingInfo(iNodeDirectory0, iNodeDirectory0, snapshot0, (Snapshot) null, (-1));
      Snapshot snapshot1 = snapshotDiffListingInfo0.getEarlier();
      assertEquals(2147483646, Snapshot.CURRENT_STATE_ID);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      FsPermission fsPermission0 = FsPermission.getCachePoolDefault();
      PermissionStatus permissionStatus0 = new PermissionStatus("fs.permissions.umask-mode", "fs.permissions.umask-mode", fsPermission0);
      INodeDirectory iNodeDirectory0 = new INodeDirectory(10, byteArray0, permissionStatus0, 10);
      iNodeDirectory0.addSnapshottableFeature();
      SnapshotDiffListingInfo snapshotDiffListingInfo0 = new SnapshotDiffListingInfo(iNodeDirectory0, iNodeDirectory0, (Snapshot) null, (Snapshot) null, 268435455);
      Snapshot snapshot0 = snapshotDiffListingInfo0.getEarlier();
      assertNull(snapshot0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      FsPermission fsPermission0 = FsPermission.getCachePoolDefault();
      PermissionStatus permissionStatus0 = new PermissionStatus("fs.permissions.umask-mode", "fs.permissions.umask-mode", fsPermission0);
      INodeDirectory iNodeDirectory0 = new INodeDirectory(10, byteArray0, permissionStatus0, 10);
      iNodeDirectory0.addSnapshottableFeature();
      SnapshotDiffListingInfo snapshotDiffListingInfo0 = new SnapshotDiffListingInfo(iNodeDirectory0, iNodeDirectory0, (Snapshot) null, (Snapshot) null, (-559038737));
      snapshotDiffListingInfo0.setLastIndex(18);
      DirectoryWithSnapshotFeature.ChildrenDiff directoryWithSnapshotFeature_ChildrenDiff0 = new DirectoryWithSnapshotFeature.ChildrenDiff();
      // Undeclared exception!
      try { 
        snapshotDiffListingInfo0.addDirDiff((-559038737), (byte[][]) null, directoryWithSnapshotFeature_ChildrenDiff0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 18, Size: 0
         //
         verifyException("java.util.AbstractList", e);
      }
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      FsPermission fsPermission0 = FsPermission.getCachePoolDefault();
      PermissionStatus permissionStatus0 = PermissionStatus.createImmutable("fs.permissions.umask-mode", "fs.permissions.umask-mode", fsPermission0);
      INodeDirectory iNodeDirectory0 = new INodeDirectory(10, byteArray0, permissionStatus0, 10);
      iNodeDirectory0.addSnapshottableFeature();
      SnapshotDiffListingInfo snapshotDiffListingInfo0 = new SnapshotDiffListingInfo(iNodeDirectory0, iNodeDirectory0, (Snapshot) null, (Snapshot) null, 268435455);
      snapshotDiffListingInfo0.setLastIndex((-109));
      DirectoryWithSnapshotFeature.ChildrenDiff directoryWithSnapshotFeature_ChildrenDiff0 = new DirectoryWithSnapshotFeature.ChildrenDiff();
      // Undeclared exception!
      try { 
        snapshotDiffListingInfo0.addDirDiff((-109), (byte[][]) null, directoryWithSnapshotFeature_ChildrenDiff0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: -109, Size: 0
         //
         verifyException("java.util.AbstractList", e);
      }
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      FsPermission fsPermission0 = FsPermission.getCachePoolDefault();
      PermissionStatus permissionStatus0 = new PermissionStatus("fs.permissions.umask-mode", "fs.permissions.umask-mode", fsPermission0);
      INodeDirectory iNodeDirectory0 = new INodeDirectory(10, byteArray0, permissionStatus0, 10);
      INodeDirectory iNodeDirectory1 = new INodeDirectory(2, byteArray0, permissionStatus0, 18);
      iNodeDirectory1.addSnapshottableFeature();
      SnapshotDiffListingInfo snapshotDiffListingInfo0 = null;
      try {
        snapshotDiffListingInfo0 = new SnapshotDiffListingInfo(iNodeDirectory1, iNodeDirectory0, (Snapshot) null, (Snapshot) null, 10);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.hadoop.thirdparty.com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      byte[] byteArray0 = new byte[9];
      FsPermission fsPermission0 = FsPermission.getFileDefault();
      PermissionStatus permissionStatus0 = new PermissionStatus("fs.permissions.umask-mode", "fs.permissions.umask-mode", fsPermission0);
      INodeDirectory iNodeDirectory0 = new INodeDirectory(10, byteArray0, permissionStatus0, 10);
      SnapshotDiffListingInfo snapshotDiffListingInfo0 = null;
      try {
        snapshotDiffListingInfo0 = new SnapshotDiffListingInfo(iNodeDirectory0, iNodeDirectory0, (Snapshot) null, (Snapshot) null, 10);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("org.apache.hadoop.thirdparty.com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      byte[] byteArray0 = new byte[3];
      FsPermission fsPermission0 = FsPermission.getCachePoolDefault();
      PermissionStatus permissionStatus0 = new PermissionStatus("fs.permissions.umask-mode", "fs.permissions.umask-mode", fsPermission0);
      INodeDirectory iNodeDirectory0 = new INodeDirectory(10, byteArray0, permissionStatus0, 10);
      iNodeDirectory0.addSnapshottableFeature();
      SnapshotDiffListingInfo snapshotDiffListingInfo0 = new SnapshotDiffListingInfo(iNodeDirectory0, iNodeDirectory0, (Snapshot) null, (Snapshot) null, 18);
      DirectoryWithSnapshotFeature.ChildrenDiff directoryWithSnapshotFeature_ChildrenDiff0 = new DirectoryWithSnapshotFeature.ChildrenDiff();
      directoryWithSnapshotFeature_ChildrenDiff0.create(iNodeDirectory0);
      byte[][] byteArray1 = new byte[8][1];
      boolean boolean0 = snapshotDiffListingInfo0.addDirDiff((-1), byteArray1, directoryWithSnapshotFeature_ChildrenDiff0);
      assertTrue(boolean0);
  }
}
