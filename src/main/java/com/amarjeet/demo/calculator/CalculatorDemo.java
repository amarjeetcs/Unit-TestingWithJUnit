package com.amarjeet.demo.calculator;

public class CalculatorDemo {
	public int add(int a, int b) {
		if (a > b) {
			return a;
		} else {
			return a + b;
		}
	}

	public int sub(int a, int b) {
		if (a > b) {
			return a - b;
		} else {
			return b;
		}
	}

	public int mul(int a, int b) {

		return a * b;

	}

}
