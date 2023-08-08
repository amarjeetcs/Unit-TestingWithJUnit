package com.amarjeet.demo;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

public class AppTest 
{
	@BeforeClass
	public static void beforeOnlyOnceForallTestCases() {
		System.out.println("BOOFAT");
	}
	
	@Before
	public void setUp() {
		System.out.println("===setup()===");
	}
	
	@org.junit.Test
	public void testM1() {
		System.out.println("===testM1()===");
	}
	
	@org.junit.Test
	public void testM2() {
		System.out.println("===testM2()===");
	}
	
	@After
	public void tierDown() {
		System.out.println("===tierDown()===");
	}
	
	@AfterClass
	public static void afterOnlyOnceForallTestCases() {
		System.out.println("AOOFAT");
	}
	
	
}