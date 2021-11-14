package com.satishlabs.test;

import static org.junit.Assert.assertEquals;

import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.satishlabs.Arithmetic2;

@RunWith(value = Parameterized.class)
public class Arithmetic2Test {
	Arithmetic2 a2 = null;
	int a;
	int b;
	int c;
	public Arithmetic2Test(int a, int b, int c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	@Parameters
	public static Collection getData() {
		System.out.println("getData()");
		return TestData.getData();
	}
	
	@Before
	public static void initBeforeClass() {
		System.out.println("initBeforeClass");
	}
	
	@After
	public static void cleanAfterClass() {
		System.out.println("cleanAfterClass()");
	}
	
	@Before
	public void init1() {
		System.out.println("init1()");
		a2 = new Arithmetic2();
	}
	
	@Before
	public void init2() {
		System.out.println("init2()");
	}
	
	@After
	public void clean1() {
		System.out.println("clean1()");
		a2= null;
	}
	
	@After
	public void clean2() {
		System.out.println("clean2()");
	}
	
	@Test
	public void testMul2() {
		System.out.println("testMul2()");
		int x = a2.mul(a, b);
		assertEquals(a*b, x);
	}
	
	@Test
	public void testMul3() {
		System.out.println("testMul3()");
		int x = a2.mul(a, b, c);
		assertEquals(a*b*c, x);
	}
	
	@Test
	public void testDiv() {
		System.out.println("testDiv");
		int x = a2.div(a, b);
		assertEquals(a/b, x);
	}
}

