package com.java.collection.fourthex;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class RemoveDuplicateName {
	public static void main(String[] args) {
		List<String> nameList=Arrays.asList("mobile","tv","washingmachine","mobile");
		
		
		Set<String>setList=new TreeSet<>(nameList);
		  Set<String> reverseNames = new TreeSet<>(Collections.reverseOrder());
	        reverseNames.addAll(setList);
	 
	 
	        // 2.2 Iterating using enhanced for-loop
	        for(String revName : reverseNames){
	            System.out.println(revName);
	}
}
}
