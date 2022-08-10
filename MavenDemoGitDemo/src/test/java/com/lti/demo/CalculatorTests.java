package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.lti.demos.Calculator;

class CalculatorTests {
	Calculator c = new Calculator();

//	@Test
//	void test() {
//		fail("Not yet implemented");
//	}
	@Disabled
	@Test
	public void testCalcSayHello() {
		Assertions.assertEquals("Hello LTI", c.sayHello());
	}
	@Disabled
	@Test
	public void testAddTwoNos() {
		int result = c.addNos(100, 200);
		Assertions.assertEquals(300, result);
	}
	@Disabled
	@Test
	public void testSubTwoNos() {
		Assertions.assertEquals(-3, c.subNos(-5, -2), "Plz check substraction method code.");
	}
	@Disabled
	@Test
	public void testAssertNulls() {
		String s1 = null;
		String s2 = "Nikhil";
		Assertions.assertNull(s1);
		Assertions.assertNotNull(s2);
	}
	@Disabled
	@Test
	public void testAssertFalse() {
		Assertions.assertFalse("Sumit".length()==10);
		Assertions.assertFalse(10>20, "10 is smaller");
		Assertions.assertNotEquals("hello", "Hello");
	}
	
	@Test
	public void testArrays() {
		ArrayList<Integer> myList = new ArrayList<>();
		Assertions.assertEquals(0, myList.size());
		Assertions.assertTrue(myList.isEmpty());
		
		myList.add(100);
		myList.add(200);
		Assertions.assertEquals(2, myList.size());
	}
}
