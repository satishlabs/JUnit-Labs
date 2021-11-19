package com.satishlabs;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;
import java.util.EmptyStackException;
import java.util.Stack;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(value=Parameterized.class)
public class StackTest {
	Stack<String> stack;
	private String email;
	
	public StackTest(String email) {
		this.email = email;
	}
	
	public static Collection data() {
		Object[][] data =  new Object[][] {
			{"sat@gmail"},
			{"test1@gmail"},
			{"test2@gmail.com"}
			};
		return Arrays.asList(data);
	}
	
	@Before
	public void init() {
		System.out.println("Resource is created...");
		stack = new Stack<String>();
	}
	
	@After
	public void cleanup() {
		System.out.println("Resoruce is released...");
		stack = null;
	}
	
	@Test
	public void pushTest() {
		System.out.println("pushTest()-"+email);
		stack.push(email);
		assertEquals(stack.peek(), email);
	}
	
	@Test(expected = EmptyStackException.class)
	public void peekTest() {
		System.out.println("peekTest()-"+email);
		stack = new Stack<String>();
		stack.peek();
	}
	
	@Test
	public void emptyTest() {
		System.out.println("emptyTest()-"+email);
		stack = new Stack<String>();
		assertTrue(stack.isEmpty());
	}
}
