package com.edubridge.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.platform.suite.api.SuiteDisplayName;
//program to demonstrate on simple test case using junit5
class SimpleJunitDemo {
	//@Test annotation ensures that to perform unit testing on the given block of code

	@Test
	//@DisplayName 
	@DisplayName("displayOutput")
	void test() {
		int a=10,b=5;
		System.out.println("addition is:"+a+b);
		
	}

}
