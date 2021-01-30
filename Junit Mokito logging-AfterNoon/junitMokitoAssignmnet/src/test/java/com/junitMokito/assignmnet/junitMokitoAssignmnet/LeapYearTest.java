package com.junitMokito.assignmnet.junitMokitoAssignmnet;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class LeapYearTest {
	
	LeapYearTest leapyeartest;
	@BeforeEach
    public void beforeEachTest() {
		this.leapyeartest=new LeapYearTest();
	}
	
	@AfterEach
	public void afterEachTest()
	{
		this.leapyeartest=null;
	}

	@Test
	void test1() {
		LeapYear lp=new LeapYear();
		boolean result=lp.checkLeapYear(2019);
		assertEquals(false,result);
		
	}
	@Test
	void test2() {
		LeapYear lp=new LeapYear();
		boolean result=lp.checkLeapYear(2000);
		assertEquals(true,result);
		
	}
	@Test
	void test3() {
		LeapYear lp=new LeapYear();
		boolean result=lp.checkLeapYear(2020);
		assertEquals(true,result);
		
	}
	@Test
	void test4() {
		LeapYear lp=new LeapYear();
		boolean result=lp.checkLeapYear(2036);
		assertEquals(true,result);
		
	}
	@Test
	void test5() {
		LeapYear lp=new LeapYear();
		boolean result=lp.checkLeapYear(2034);
		assertEquals(false,result);
		
	}
	@Test
	void test6() {
		LeapYear lp=new LeapYear();
		boolean result=lp.checkLeapYear(2040);
		assertEquals(true,result);
		
	}

}
