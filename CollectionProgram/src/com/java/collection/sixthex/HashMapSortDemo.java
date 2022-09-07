package com.java.collection.sixthex;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class HashMapSortDemo {
	public static void main(String[] args) {
		Map<String,Integer>mapList=new HashMap<>();
		mapList.put("pune", 45000);
		mapList.put("Delhi", 75000);
		mapList.put("Hadapsar", 25000);
		Map<String,Integer>mapSet=new TreeMap<>(mapList);
		for (Map.Entry<String, Integer> entry : mapSet.entrySet()) {
			System.out.println(entry.getKey()+" "+entry.getValue()); 
		}
	}

}
