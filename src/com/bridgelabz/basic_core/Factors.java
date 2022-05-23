package com.bridgelabz.basic_core;

import java.util.Scanner;

public class Factors {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Number Factors");
		int n = scanner.nextInt();
		System.out.println("Number to find the Prime Factors is =" + n);

		for (int i = 2; i < n; i++) {
			while (n % i == 0) {
				System.out.println(i);
				n = n / i;
			}
		}
		if (n > 2) {
			System.out.println(n);
		}
	}

}
