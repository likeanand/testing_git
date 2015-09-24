package com.wipro.CoreExamples;

import java.util.Scanner;

public class StringApplication {
	static void stringRevers(String str) {
		for (int i = str.length() - 1; i >= 0; i--) {
			System.out.println(str.charAt(i));
		}
	}

	static void stringOccurece(String str) {
		for (int i = 0; i < str.length(); i++) {
			for (int j = i + 1; j < str.length(); j++) {
				if (str.charAt(j) == str.charAt(i)) {
					System.out.println(str.charAt(i));
				}
			}
		}
	}

	static int stringOccuareceCount(String str, char c) {
		int count = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == c) {
				count++;
			}
		}
		return count;
	}

	static boolean isPrime(int num) {

		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		System.out.println(isPrime(9));
		System.out.println(stringOccuareceCount("vijaykrishkkna", 'k'));
		stringOccurece("vijaykriaashna");
		stringRevers("vijaykrishna");
		int count = 15;
		int[] feb = new int[count];
		feb[0] = 0;
		feb[1] = 1;
		for (int i = 2; i < count; i++) {
			feb[i] = feb[i - 1] + feb[i - 2];

		}
		for (int i = 1; i < count; i++) {
			System.out.println(feb[i]);
		}
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the string");
		String org, rev = "";
		org = scanner.nextLine();
		int length = org.length();
		for (int i = length - 1; i >= 0; i--) {
			rev = rev + org.charAt(i);
		}
		if (rev.equals(org)) {
			System.out.println("same");
		} else {
			System.out.println("not same");
		}
		scanner.close();
	}
}
