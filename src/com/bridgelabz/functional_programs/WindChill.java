package com.bridgelabz.functional_programs;

import java.util.Scanner;

public class WindChill {
	public static void main(String[] args) {
		double t, v;
		System.out.println("enter the value of temperature and velocity");
		Scanner scanner = new Scanner(System.in);

		t = scanner.nextDouble();
		v = scanner.nextDouble();

		double windChillTemp = 35.74 + 0.6215 * t + (0.4275 * t - 35.75) * Math.pow(v, 0.16);
		System.out.println("windChillTemp=" + windChillTemp);
	}
}
