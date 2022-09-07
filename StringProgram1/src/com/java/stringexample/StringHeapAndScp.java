package com.java.stringexample;

public class StringHeapAndScp {
public static void main(String[] args) {
	//Creating string objects using literals
	 
    String s1 = "abc";

    String s2 = "abc";

    System.out.println(s1 == s2);        //Output : true

    //Creating string objects using new operator

    String s3 = new String("abc");

    String s4 = new String("abc");

    System.out.println(s3 == s4);   
}
}
