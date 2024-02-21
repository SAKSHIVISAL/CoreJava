package com.edubridge.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class JunitAnnotationDemo {

	@Test
	void test() {
		System.out.println("Test method");
	}
	
	//@BeforeAll is executed first before each test method
	@BeforeEach
	void accept() {
		System.out.println("BeforeEach  method");
	}
	
	
	@Test
	//@Disabled is used to hide or disable the method and it will not executed
	@Disabled
	void display() {
		System.out.println("new Test method");
	}
	
	//@AterAll is used to execute a statement after all test method only once at  the end 
	@AfterAll
	 static void play() {
		System.out.println("Junit play");
	}
	
	//declare tags for filtering tests
	@Tag("demo")
	  void pla() {
		System.out.println("tag play");
	}

}
