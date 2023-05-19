package com.javajunit.testdemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MathUtil {

//	@Test
//	void testAdd() {
//		fail("Not yet implemented");
	//}
	@Test
	void testadd()
	{
		MathUtilTest mth =new MathUtilTest();
		int expected=2;
		int actual= mth.add(1,1);
		assertEquals(expected,actual);
	}
	
	@Test
	void testsub()
	{
		MathUtilTest mth2 =new MathUtilTest();
		int actual= mth2.sub(4,1);
		int expected=3;
		assertEquals(expected,actual);
	}
	
}
