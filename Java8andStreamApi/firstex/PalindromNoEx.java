package com.yash.firstex;

import java.util.Scanner;
import java.util.stream.IntStream;
@FunctionalInterface
interface MyInterface {
    void reverseno(int n);
}
public class PalindromNoEx {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);  
    System.out.println("Enter the number: ");  
    int num=sc.nextInt();
    int number=num;
   // int sum=0;
    MyInterface mi=(n)->{
    	int sum=0;
    	 while(n>0)
  	   {    
        int r = n % 10;   
           sum = (sum*10)+r;    
          n = n/10;    
         }    
        if(number==sum)    
          System.out.println("It is a Palindrome number.");    
        else    
          System.out.println("Not a palindrome");  
    	
    	    	
    	
    };
    
    mi.reverseno(num);
    
}
}
