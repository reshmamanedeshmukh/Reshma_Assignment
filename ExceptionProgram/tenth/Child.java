package com.yash.tenth;

import java.util.Arrays;

public class Child extends Parent {
	void largest(int[] arr) {
		try {
			System.out.println("I am from Child class");
			Arrays.sort(arr);
			System.out.println(Arrays.toString(arr));

		} catch (NumberFormatException | NullPointerException e) {
			System.out.println(e);
		}

	}
}
