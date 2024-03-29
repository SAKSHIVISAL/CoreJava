package com.edubridge.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assumptions;
import org.junit.jupiter.api.Test;

class AssumptionDemo {

	@Test
	void test() {
	System.setProperty("sakshi","sakshi");
	//when it is true it will pass as well as execute and when it is false it will run but it will skip
	Assumptions.assumeTrue("shakshi".equals(System.getProperty("sakshi")));//it will skip
	}
	
	

	@Test
	void test1() {
	System.setProperty("sakshi","sakshi");
	Assumptions.assumeFalse("shakshi".equals(System.getProperty("shakshi")));
	}


	

	@Test
	void test2() {
	int x=10,y=10;
	//@assumingThat can rather have true or false it will execute
	Assumptions.assumingThat(x==y,()->{
		System.out.println("Assuming that");
	});
	System.out.println("this method will skip");
	}
	
}
