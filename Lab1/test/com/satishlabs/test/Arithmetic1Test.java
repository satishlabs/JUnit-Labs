package com.satishlabs.test;

import com.satishlabs.Arithmetic1;

import junit.framework.TestCase;

public class Arithmetic1Test extends TestCase{
	Arithmetic1 a1 = null;
	public void setUp() throws Exception {
		super.setUp();
		a1 = new Arithmetic1();
	}
	public void tearDown() throws Exception {
		super.tearDown();
		a1=null;
	}
	
	public void testSum2() {
		int x = a1.sum(10,20);
		assertEquals(30, x);
		x = a1.sum(100, 200);
		assertEquals(300, x);
		x = a1.sum(30, 20);
		assertEquals(50, x);
	}
	
	public void testSum3() {
		int x = a1.sum(10, 20, 30);
		assertEquals(60, x);
		x = a1.sum(100, 200, 300);
		assertEquals(600, x);
		x = a1.sum(30, 30, 30);
		assertEquals(90, x);
	}
	
	public void testSub() {
		int x = a1.sub(30, 20);
		assertEquals(10, x);
		x = a1.sub(500, 200);
		assertEquals(300, x);
	}
}
