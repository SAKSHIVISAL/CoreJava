package com.edubridge.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

class RepeatedTestCaseDemo {

	//@RepeatTest annotation is used to repeat a test for a given times
	@RepeatedTest(2)
	void test() {
		for(int i=1;i<=3;i++)
			//i=1-3 and repeatedTest is 2=3*2=5 times
			System.out.println("EduBridge");
	}

}
