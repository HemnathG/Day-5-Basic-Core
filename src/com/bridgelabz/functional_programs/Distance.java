package com.bridgelabz.functional_programs;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		int x, y;
		System.out.println("enter the values of x,y");
		Scanner scanner = new Scanner(System.in);
		x = scanner.nextInt();
		y = scanner.nextInt();

		double distance = Math.sqrt(x * x + y * y);
		System.out.println("distance from (" + x + "," + y + ") to (0,0)= " + distance);
	}
}
