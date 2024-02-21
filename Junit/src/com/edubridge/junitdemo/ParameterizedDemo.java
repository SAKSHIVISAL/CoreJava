package com.edubridge.junitdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterizedDemo {
//for all value we have to show  use@Test
	@ParameterizedTest
	@ValueSource(strings= {"sakshi","shifa"})
	void test(String word) {
		System.out.println(word);
	
	}

	
	
	@ParameterizedTest
	@ValueSource(ints= {22,33,44})
	void display(int word) {
		System.out.println(word);
	
	}

}
