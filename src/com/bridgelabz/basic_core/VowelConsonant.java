package com.bridgelabz.basic_core;

import java.util.Scanner;

public class VowelConsonant {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a character : ");
		char ch = scanner.next().charAt(0);

		if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U') {
			System.out.println("Entered character is  Vowel");
		} else {
			System.out.println("Not an alphabet");
		}
	}
}
