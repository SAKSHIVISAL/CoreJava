package com.edubridge.mockitodemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class MockitoDemo {
	private Calculator c;
	
	void setData()
	{
		c=mock();
	}

	@Test
	void testAdd()
	{
		Assertions.assertEquals(2,c.add(1, 1));
		verify(c).add(1,1);
	}
	@Test
	void testSub()
	{
		Assertions.assertEquals(0,c.sub(1, 1));
	}

}
