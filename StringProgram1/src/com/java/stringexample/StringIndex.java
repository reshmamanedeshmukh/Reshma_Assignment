
/*create a program in each to string is input by the user and after that user will enter index in first string  where we
 *  want to insert second string that index and create w new string */
package com.java.stringexample;

import java.util.Scanner;

public class StringIndex {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
    
    
    System.out.println("Enter the first String: ");
    String firStr = input.nextLine();
    
   
    System.out.println("Enter the String to be Inserted: ");
    String secStr = input.nextLine();
    
    //Input the index after which the string should be inserted
    System.out.println("Enter the Index: ");
    int index = input.nextInt();

    String newStr = new String(); 

    for (int i = 0; i < firStr.length(); i++) { 
        
    	 newStr += firStr.charAt(i); 
       
        if (i == index) { 
        	
            newStr += secStr; 
        } 
    } 

    // Output 
    System.out.println("New String After Insertion: "+ newStr);
	
}
}
