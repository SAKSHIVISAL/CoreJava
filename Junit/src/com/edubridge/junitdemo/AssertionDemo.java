package com.edubridge.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class AssertionDemo {

	@Test
	@DisplayName("AssertTrue")
	void test() {
		//if expression is true it will pass or it will fail
		assertTrue(12>=4);
	}
	
	@Test
	@DisplayName("AssertFalse")
	void test1() {
		//if expression is true it will pass or it will fail
		assertFalse(14>=4);
	}
	
	
	
	
	@Test

	void acceptt() {
		//if expected and actual value are same then it will pass else fails
		assertEquals(12,5);
	}
	
	@Test

	void accept() {
		//when it is null it will be fails else it will pass
		assertNotNull(12);
	}
	
	
	
	
	

}
