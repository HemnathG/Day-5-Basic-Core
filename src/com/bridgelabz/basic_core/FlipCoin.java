package com.bridgelabz.basic_core;

import java.util.Random;

public class FlipCoin {

	public static void main(String[] args) {
		
		Random random = new Random();
		int flipcoin = random.nextInt(2);
		if (flipcoin == 0)
			System.out.println("Flipped Coin is HEAD");
		else
			System.out.println("Flipped Coin is TAIL");
	}
}
