package com.yash.eight;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test {

	public static void printPassowrdStrength(String input) {
		int lowercount = 1;
		int uppercount = 1;
		int digitcount = 1;
		int specialCharcount = 1;
		int n = input.length();
		boolean hasLower = false, hasUpper = false, hasDigit = false, specialChar = false;
		
		Set<Character> set = new HashSet<Character>(Arrays.asList('!', '@', '#', '$', '%', '^', '&', '*', '-', '+'));
		
		for (char i : input.toCharArray()) {
			
			
			if (Character.isLowerCase(i)) {
				hasLower = true;
				lowercount++;
			}
			if (Character.isUpperCase(i)) {
				hasUpper = true;
				uppercount++;
			}
			if (Character.isDigit(i)) {
				hasDigit = true;
				digitcount++;
			}
			if (set.contains(i)) {
				specialChar = true;
				specialCharcount++;
			}
		}

		if ((lowercount > 2) && (uppercount > 2) && (digitcount > 2) && (specialCharcount > 2) && (n > 8))
			System.out.print("Welcome you have entered correct password");

		else
			throw new PasswordFormatException("Password Format Exception");
	}

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the passoword");
		String input = scanner.nextLine();
		printPassowrdStrength(input);
	}

}
