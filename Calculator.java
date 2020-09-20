package com.home.calculator;

import java.util.Scanner;

public class Calculator extends RomanArabicConverter {

	private static boolean arabicNumbers = true;
	private static boolean checknumber1;
	private static boolean checknumber2;
	private static boolean checknumber;

	public static void main(String[] args) {
		try {
			System.out.print("Введите выражение: ");
			Scanner scanner = new Scanner(System.in);
			String input = scanner.nextLine();
			String[] arrinput = input.split(" ");
			String operation = arrinput[1];

			try {
				
				Operation.number1 = Integer.parseInt(arrinput[0]);
				Operation.number2 = Integer.parseInt(arrinput[2]);
			} catch (NumberFormatException e) {
				System.out.println("Римские цифры!");
				arabicNumbers = false;
				Operation.number1 = romanToArabic(arrinput[0]);
				Operation.number2 = romanToArabic(arrinput[2]);
			}
			checknumber1 = (Operation.number1 >= 1 && Operation.number1 <= 10);
			checknumber2 = (Operation.number2 >= 1 && Operation.number2 <= 10);
			checknumber = (checknumber1 && checknumber2);

			if (checknumber) {

					if (operation.equals("+")) {
						Operation.sum();
					} else if (operation.equals("-")) {
						Operation.subtraction();
					} else if (operation.equals("/") || operation.equals(":")) {
						Operation.division();
					} else if (operation.equals("*") || operation.equals("x")) {
						Operation.multiplication();
					}
					if (arabicNumbers) {
						System.out.println(Operation.result);
					} else {
						System.out.println(arabicToRoman(Operation.result));
					}

			} else {
				System.out.println("Ошибка введитеот от 1 до 10");
			}
		} catch (Exception e) {
			System.out.println("Ошибка ввода!");
		}
	}
}
