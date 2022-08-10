package com.lti.demo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.lti.demos.Calculator;

class ExceptionsTest {
	// dev writes exception - JUnit checks whether those exceptions are 
	// handled or not
	@Test
	void testExceptions() {
		Assertions.assertThrows(IllegalArgumentException.class,
									() -> {Integer.parseInt("One");}
								);
		
	}
	
	@Test
	public void testExMethod() {
		Calculator c = new Calculator();
		
		final Exception e = assertThrows(ArithmeticException.class, () -> c.searchEmp(0));
		
		Assertions.assertEquals("U enetered zero", e.getMessage());
	}

}
