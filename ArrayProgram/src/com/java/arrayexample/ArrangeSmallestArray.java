package com.java.arrayexample;

public class ArrangeSmallestArray {
	 public static void main(String[] args) {
		 
		        String[] str = { "this", "is", "java", "program" };
		        String str2;
		        for (int i = 0; i < str.length; i++) {
		            for (int j = 0; j < str.length; j++) {
		                if (str[i].length() < str[j].length()) {
		                    str2 = str[i];
		                    str[i] = str[j];
		                    str[j] = str2;
		                }
		            }
		        }
		        for (int i = 0; i < str.length; i++) {
		            System.out.println(str[i]);
		        }
		 }
}