package com.satishlabs.test;

import com.satishlabs.Arithmetic2;

import junit.framework.TestCase;

public class Arithmetic2Test extends TestCase{
	Arithmetic2 a2 = null;
	public void setUp() throws Exception {
		super.setUp();
		a2 = new Arithmetic2();
	}
	
	public void tearDown() throws Exception {
		super.tearDown();
		a2 = null;
	}
	
	public void testMul2() {
		int x = a2.mul(10, 20);
		assertEquals(200, x);
		x = a2.mul(10, 5);
		assertEquals(50, x);
	}
	
	public void testMul3() {
		int x = a2.mul(2, 5, 10);
		assertEquals(100, x);
	}
	
	public void testDiv() {
		int x = a2.div(100, 5);
		assertEquals(20, x);
	}
}
