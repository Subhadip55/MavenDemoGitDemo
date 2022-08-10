package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import com.lti.demos.Calculator;

class TestBeforeAfter {
	Calculator c = new Calculator();
	int sum = 0;
	
	@BeforeEach	// before all the test cases
	public void testStartUp() {
		sum = 0;
		System.out.println("Sum is "+sum);
	}
	@BeforeAll	// only once - at first
	public static void testStartUpDBConnection() {
		System.out.println("DB connection is up - only once");
	}
	
	@Test
	public void testAddTwoNos() {
		int result = c.addNos(100, 200);
		Assertions.assertEquals(300, result);
	}
	
	@Test
	public void testSubTwoNos() {
		Assertions.assertEquals(-3, c.subNos(-5, -2), "Plz check substraction method code.");
	}

	@AfterEach	// after each test case
	public void testShutDown() {
		System.out.println("some objects null");
	}
	
	@AfterAll	// only once - at last
	public static void testShutDownDBConnection() {
		System.out.println("Shut down the db connection.- only once");
	}
}
