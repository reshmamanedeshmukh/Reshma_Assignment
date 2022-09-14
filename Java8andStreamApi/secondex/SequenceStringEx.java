package com.yash.secondex;
import java.util.Arrays;
public class SequenceStringEx {
	public static void main(String[] args) {
		String given[] = {"Taj is situated in Agra"};
		String find="ast";
		boolean anyMatch = Arrays.stream(given).anyMatch(s->s.contains(find));
		
		if(anyMatch==true) {
			System.out.println(find+" String found");
		}else
		System.out.println(find+" String not found");
		
		

	}
}
