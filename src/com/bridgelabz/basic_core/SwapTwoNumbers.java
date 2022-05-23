package com.bridgelabz.basic_core;

import java.util.Scanner;

public class SwapTwoNumbers {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the First number");
        float first = scanner.nextInt();
        System.out.println("The First number is =" +first);

        System.out.println("Enter the Second number");
        float second = scanner.nextInt();
        System.out.println("The Second number is =" +second);


        System.out.println("Before swap");

        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);

        float temp = first;
        first = second;
        second = temp;

        System.out.println("After swap");
        System.out.println("First number = " + first);
        System.out.println("Second number = " + second);
    }
}

