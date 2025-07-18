/*
 * This file was automatically generated by EvoSuite
 * Wed Oct 23 16:43:42 GMT 2024
 */

package com.google.common.net;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import com.google.common.net.HostAndPort;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class HostAndPort_ESTest extends HostAndPort_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test00()  throws Throwable  {
      HostAndPort hostAndPort0 = HostAndPort.fromHost(":~5Yd#^9:n&=(|JLf");
      String string0 = hostAndPort0.toString();
      assertEquals("[:~5Yd#^9:n&=(|JLf]", string0);
  }

  @Test(timeout = 4000)
  public void test01()  throws Throwable  {
      HostAndPort hostAndPort0 = HostAndPort.fromHost("$r&");
      HostAndPort hostAndPort1 = HostAndPort.fromParts("$r&", 27);
      boolean boolean0 = hostAndPort0.equals(hostAndPort1);
      assertFalse(boolean0);
      assertFalse(hostAndPort1.equals((Object)hostAndPort0));
  }

  @Test(timeout = 4000)
  public void test02()  throws Throwable  {
      // Undeclared exception!
      try { 
        HostAndPort.fromString("[Fj:,NH]N");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Only a colon may follow a close bracket: java.lang.String@0000000001
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test03()  throws Throwable  {
      HostAndPort hostAndPort0 = HostAndPort.fromString("=:~O5aYd#^9:n&l(|JLf");
      assertEquals("=:~O5aYd#^9:n&l(|JLf", hostAndPort0.getHost());
  }

  @Test(timeout = 4000)
  public void test04()  throws Throwable  {
      HostAndPort hostAndPort0 = HostAndPort.fromString("");
      String string0 = hostAndPort0.toString();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test05()  throws Throwable  {
      HostAndPort hostAndPort0 = HostAndPort.fromHost("Later in 2020, we will remove GWT-RPC support for Guava types. You are seeing this warning because you are sending a Guava type over GWT-RPC, which will break. You can identify which type by looking at the class name in the attached stack trace.");
      HostAndPort hostAndPort1 = hostAndPort0.requireBracketsForIPv6();
      assertSame(hostAndPort0, hostAndPort1);
  }

  @Test(timeout = 4000)
  public void test06()  throws Throwable  {
      HostAndPort hostAndPort0 = HostAndPort.fromParts("", 31);
      int int0 = hostAndPort0.getPortOrDefault(867);
      assertEquals(31, int0);
  }

  @Test(timeout = 4000)
  public void test07()  throws Throwable  {
      HostAndPort hostAndPort0 = HostAndPort.fromString("");
      int int0 = hostAndPort0.getPortOrDefault((-2587));
      assertEquals((-2587), int0);
  }

  @Test(timeout = 4000)
  public void test08()  throws Throwable  {
      HostAndPort hostAndPort0 = HostAndPort.fromParts("com.google.common.base.CharMatcher$IsEither", 0);
      assertTrue(hostAndPort0.hasPort());
      
      int int0 = hostAndPort0.getPort();
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test09()  throws Throwable  {
      HostAndPort hostAndPort0 = HostAndPort.fromString("");
      String string0 = hostAndPort0.getHost();
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test10()  throws Throwable  {
      HostAndPort hostAndPort0 = HostAndPort.fromString("G/Pfo6$4&BA,ue:9");
      assertTrue(hostAndPort0.hasPort());
      assertEquals("G/Pfo6$4&BA,ue", hostAndPort0.getHost());
  }

  @Test(timeout = 4000)
  public void test11()  throws Throwable  {
      HostAndPort hostAndPort0 = HostAndPort.fromString("com.google.common.base.CharMatcher$JavaDigit");
      // Undeclared exception!
      try { 
        hostAndPort0.withDefaultPort((-40366234));
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test12()  throws Throwable  {
      HostAndPort hostAndPort0 = HostAndPort.fromString(";&Q@y");
      // Undeclared exception!
      try { 
        hostAndPort0.getPort();
        fail("Expecting exception: IllegalStateException");
      
      } catch(IllegalStateException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test13()  throws Throwable  {
      // Undeclared exception!
      try { 
        HostAndPort.fromString((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test14()  throws Throwable  {
      // Undeclared exception!
      try { 
        HostAndPort.fromParts((String) null, 3946);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test15()  throws Throwable  {
      // Undeclared exception!
      try { 
        HostAndPort.fromHost((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test16()  throws Throwable  {
      HostAndPort hostAndPort0 = HostAndPort.fromString("GoOVnz~-=}h&ePRp^");
      HostAndPort hostAndPort1 = hostAndPort0.withDefaultPort(0);
      boolean boolean0 = hostAndPort1.hasPort();
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test17()  throws Throwable  {
      HostAndPort hostAndPort0 = HostAndPort.fromString("1H@-I!*Fy/30 A");
      boolean boolean0 = hostAndPort0.hasPort();
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test18()  throws Throwable  {
      // Undeclared exception!
      try { 
        HostAndPort.fromParts("[s&i[e}-PX:]", 65536);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Port out of range: java.lang.Integer@0000000001
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test19()  throws Throwable  {
      HostAndPort hostAndPort0 = HostAndPort.fromParts("[[[[:~I>5aY#9:&l(|JL]", 65535);
      String string0 = hostAndPort0.toString();
      assertEquals("[[[[:~I>5aY#9:&l(|JL]:65535", string0);
  }

  @Test(timeout = 4000)
  public void test20()  throws Throwable  {
      HostAndPort hostAndPort0 = HostAndPort.fromString(";p&QB@y");
      HostAndPort hostAndPort1 = HostAndPort.fromHost(";p&QB@y");
      boolean boolean0 = hostAndPort0.equals(hostAndPort1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test21()  throws Throwable  {
      HostAndPort hostAndPort0 = HostAndPort.fromString(":~O5aYd^:n&l(|JLf");
      HostAndPort hostAndPort1 = HostAndPort.fromHost("+");
      boolean boolean0 = hostAndPort0.equals(hostAndPort1);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test22()  throws Throwable  {
      HostAndPort hostAndPort0 = HostAndPort.fromString("j");
      HostAndPort hostAndPort1 = HostAndPort.fromParts("j", 91);
      boolean boolean0 = hostAndPort1.equals(hostAndPort0);
      assertFalse(hostAndPort0.equals((Object)hostAndPort1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test23()  throws Throwable  {
      HostAndPort hostAndPort0 = HostAndPort.fromHost(";p&QB@y");
      boolean boolean0 = hostAndPort0.equals(hostAndPort0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test24()  throws Throwable  {
      HostAndPort hostAndPort0 = HostAndPort.fromParts("[[[[:~I>5aY#9:&l(|JL]", 65535);
      boolean boolean0 = hostAndPort0.equals("@");
      assertEquals("[[[:~I>5aY#9:&l(|JL", hostAndPort0.getHost());
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test25()  throws Throwable  {
      HostAndPort hostAndPort0 = HostAndPort.fromParts("[[[[:~I>5aY#9:&l(|JL]", 65535);
      hostAndPort0.requireBracketsForIPv6();
      assertEquals("[[[:~I>5aY#9:&l(|JL", hostAndPort0.getHost());
  }

  @Test(timeout = 4000)
  public void test26()  throws Throwable  {
      HostAndPort hostAndPort0 = HostAndPort.fromHost(":~5Yd#^9:n&=(|JLf");
      // Undeclared exception!
      try { 
        hostAndPort0.requireBracketsForIPv6();
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Possible bracketless IPv6 literal: java.lang.String@0000000002
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test27()  throws Throwable  {
      HostAndPort hostAndPort0 = HostAndPort.fromParts("[[[[:~I>5aY#9:&l(|JL]", 65535);
      HostAndPort hostAndPort1 = hostAndPort0.withDefaultPort(93);
      assertEquals("[[[:~I>5aY#9:&l(|JL", hostAndPort1.getHost());
      assertSame(hostAndPort1, hostAndPort0);
  }

  @Test(timeout = 4000)
  public void test28()  throws Throwable  {
      // Undeclared exception!
      try { 
        HostAndPort.fromString("[[[[[[[:OaY#1(}]2892");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Only a colon may follow a close bracket: java.lang.String@0000000001
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test29()  throws Throwable  {
      // Undeclared exception!
      try { 
        HostAndPort.fromHost("[OrXWBhe-:.ULdh3");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid bracketed host/port: java.lang.String@0000000001
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test30()  throws Throwable  {
      // Undeclared exception!
      try { 
        HostAndPort.fromString("[*\"=z99^MC`l(");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Invalid bracketed host/port: java.lang.String@0000000001
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test31()  throws Throwable  {
      // Undeclared exception!
      try { 
        HostAndPort.fromString(")wg:Rvq");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unparseable port number: )wg:Rvq
         //
         verifyException("com.google.common.net.HostAndPort", e);
      }
  }

  @Test(timeout = 4000)
  public void test32()  throws Throwable  {
      // Undeclared exception!
      try { 
        HostAndPort.fromString(":+N");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Unparseable port number: java.lang.String@0000000001
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test33()  throws Throwable  {
      // Undeclared exception!
      try { 
        HostAndPort.fromHost("GoOVnz~-=}h&ePRp^:0");
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Host has a port: java.lang.String@0000000002
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test34()  throws Throwable  {
      // Undeclared exception!
      try { 
        HostAndPort.fromParts("[[[[[[[[:OaY#1(}]:4892", 93);
        fail("Expecting exception: IllegalArgumentException");
      
      } catch(IllegalArgumentException e) {
         //
         // Host has a port: java.lang.String@0000000002
         //
         verifyException("com.google.common.base.Preconditions", e);
      }
  }

  @Test(timeout = 4000)
  public void test35()  throws Throwable  {
      HostAndPort hostAndPort0 = HostAndPort.fromHost("GoOVnz~-=}h&ePRp^");
      HostAndPort hostAndPort1 = hostAndPort0.withDefaultPort(0);
      int int0 = hostAndPort1.getPortOrDefault(0);
      assertTrue(hostAndPort1.hasPort());
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test36()  throws Throwable  {
      HostAndPort hostAndPort0 = HostAndPort.fromParts("[[[[:~I>5aY#9:&l(|JL]", 65535);
      assertTrue(hostAndPort0.hasPort());
      
      int int0 = hostAndPort0.getPort();
      assertEquals(65535, int0);
      assertEquals("[[[:~I>5aY#9:&l(|JL", hostAndPort0.getHost());
  }

  @Test(timeout = 4000)
  public void test37()  throws Throwable  {
      HostAndPort hostAndPort0 = HostAndPort.fromParts("[[[[:~I>5aY#9:&l(|JL]", 65535);
      hostAndPort0.hashCode();
      assertEquals("[[[:~I>5aY#9:&l(|JL", hostAndPort0.getHost());
  }

  @Test(timeout = 4000)
  public void test38()  throws Throwable  {
      HostAndPort hostAndPort0 = HostAndPort.fromString(":~O5aYd#^9:n&=(|JLf");
      String string0 = hostAndPort0.getHost();
      assertFalse(hostAndPort0.hasPort());
      assertNotNull(string0);
  }
}
