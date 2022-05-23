package com.bridgelabz.functional_programs;

import java.util.Scanner;

public class Quadratic {
	public static void main(String[] args) {
		double a, b, c, delta, root1, root2;
		System.out.println("Enter the values of a,b & c : ");
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		c = scanner.nextInt();
		delta = ((Math.pow(b, 2)) - (4 * a * c));
		System.out.println(delta);
		if (delta > 0) {
			root1 = (double) ((-b + Math.sqrt(delta)) / (2 * a));
			root2 = (double) ((-b + Math.sqrt(delta)) / (2 * a));
			System.out.println(" Roots of the Equation ax^2+bx+c : ");
			System.out.println("Root1 = " + root1 + " Root2 = " + root2);
		} else
			System.out.println("Imaginary roots have entered");
	}
}
