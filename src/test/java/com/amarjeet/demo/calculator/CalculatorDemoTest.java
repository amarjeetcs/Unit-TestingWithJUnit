package com.amarjeet.demo.calculator;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CalculatorDemoTest {
	CalculatorDemo calculatorDemo = null;

	@Before
	public void setUp() throws Exception {
		calculatorDemo = new CalculatorDemo();
	}

	@Test
	public void testAdd_For_positive_Numbers() {
		int result = calculatorDemo.add(10, 20);
		Assert.assertEquals(30, result);
	}

	@Test
	public void testAdd_For_negative_Numbers() {
		int result = calculatorDemo.add(-10, -20);
		Assert.assertEquals(-10, result);
	}

	@Test
	public void testAdd_For_positiveAndNegative_Numbers() {
		int result = calculatorDemo.add(10, -20);
		Assert.assertEquals(10, result);
	}

	@Test
	public void testAdd_For_LargePositive_Numbers() {
		int result = calculatorDemo.add(100000, 200000);
		Assert.assertEquals(300000, result);
	}

	@Test
	public void testSub_For_positive_Numbers() {
		int result = calculatorDemo.add(10, 20);
		Assert.assertEquals(30, result);
	}

	@Test
	public void testSub_For_positiveAndNegative_Numbers() {
		int result = calculatorDemo.add(-10, -20);
		Assert.assertEquals(-10, result);
	}
	
	@Test
	public void testMulNumbers() {
		int result = calculatorDemo.add(10, 20);
		Assert.assertEquals(30, result);
	}
	
	@After
	public void tearDown() throws Exception {
	}

}
