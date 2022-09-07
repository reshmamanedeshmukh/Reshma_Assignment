package com.java.collection.thirdex;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateDemo {
	public static void main(String[] args) {
		List<Integer>list=Arrays.asList(25,11,32,25,15,31,36);
		Set<Integer>sList=new TreeSet<>(list);
		System.out.println(sList);
	}
}
