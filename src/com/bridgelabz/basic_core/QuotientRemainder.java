package com.bridgelabz.basic_core;

import java.util.Scanner;

public class QuotientRemainder {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Dividend number");
		int dividend = scanner.nextInt();
		System.out.println("The Dividend number is =" + dividend);
		System.out.println("Enter the Divisor number");
		int divisor = scanner.nextInt();
		System.out.println("The Divisor number is =" + divisor);
		int quotient = dividend / divisor;
		int remainder = dividend % divisor;
		System.out.println("Quotient is = " + quotient);
		System.out.println("Remainder is = " + remainder);

	}

}
