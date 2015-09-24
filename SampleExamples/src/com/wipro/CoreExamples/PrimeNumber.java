package com.wipro.CoreExamples;

import java.util.Scanner;

public class PrimeNumber {
	static boolean isprime(int num) {
		for (int i = 2; i < num; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int i2 = 9;
		Integer integer = Integer.valueOf(i2);
		System.out.println("vijay " + "\t" + integer);
		int i1 = integer.intValue();
		System.out.println(i1);
		Scanner scanner = new Scanner(System.in);
		System.out.println("entere the num ");
		int number = scanner.nextInt();
		for (int i = 2; i <= number; i++) {
			if (isprime(i)) {
				System.out.println(i);
			}
		}
		scanner.close();
	}
}
