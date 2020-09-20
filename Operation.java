package com.home.calculator;

public class Operation {
	static int number1;
	static int number2;
	static int result;

	public static void sum() {
		result = number1 + number2;
	}

	public static void subtraction() {
		result = number1 - number2;
	}

	public static void multiplication() {
		result = number1 * number2;
	}

	public static void division() {
		try {
			result = number1 / number2;
		} catch (ArithmeticException e) {
			System.out.println("Делить на ноль невозможно!");
		}
		return; 
	}

}
