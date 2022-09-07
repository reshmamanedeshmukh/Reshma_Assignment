package com.java.collection.firstex;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
public class CollectionAscendingDemo {
	public static void main(String[] args) {
		List<Integer> list=Arrays.asList(90,30,40,55,20);
		Collections.sort(list);
		System.out.println(list);
	}

}
