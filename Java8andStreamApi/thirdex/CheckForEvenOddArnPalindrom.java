package com.yash.thirdex;
import java.io.*;
import java.util.*;
import java.util.stream.IntStream;



interface FuncInterfaceForEven
{
    
    void abstractFun1(int x);
  
}
interface FuncInterfaceForOdd
{
    
    void abstractFun2(int x);
  
}
interface FuncInterfaceForArum
{
    
    void abstractFun3(int x);
  
}
interface FuncInterfaceForPalindrom
{
    
    void abstractFun4(int x);
  
}
public class CheckForEvenOddArnPalindrom {
public static void main(String[] args) throws NumberFormatException, IOException {
		

	Scanner sc = new Scanner(System.in);  
	  System.out.println("choose option 1 for  even option 2 for odd 3 for arumstong and 4 for palindom");
    int num=sc.nextInt();
    switch(num)
    {
    case 1:
    	System.out.println("Enter number");
    	int n=sc.nextInt();
                 
                	 FuncInterfaceForEven fobj = (int x)->{
                		 if(x%2==0) {
                			 System.out.println("number is Even");
                		 }else
                			 { System.out.println("Enter only  odd no");}
                	 };
                	  
                    
                     fobj.abstractFun1(n);
                           
                         
                break;
    case 2:
      System.out.println("Enter number");
    	int n1=sc.nextInt();
                 
                	 FuncInterfaceForOdd fobj1 = (int x)->{
                		 if(x%2!=0) {
                			 System.out.println("number is Odd");
                		 }else
                			 { System.out.println("Enter only  odd no");}
                	 };
                	  
                    
                     fobj1.abstractFun2(n1);
                           
                         
                break;
    case 3:
         System.out.println("Enter number");
    	int n3=sc.nextInt();
                 
                	 FuncInterfaceForArum fobj2 = (int x)->{
                	 
              int  originalNumber, remainder, result = 0;

        originalNumber = n3;

        while (originalNumber != 0)
        {
            remainder = originalNumber % 10;
            result += Math.pow(remainder, 3);
            originalNumber /= 10;
        }

        if(result == n3)
            System.out.println(n3 + " is an Armstrong number.");
        else
            System.out.println(n3 + " is not an Armstrong number.");  	 
           };     	 
                	 
         fobj2.abstractFun3(n3);       	 
                	 
            break;
   case 4:
        System.out.println("Enter the number: ");  
    int n4=sc.nextInt();
    int number=n4;
   // int sum=0;
    FuncInterfaceForPalindrom fobj4=(np)->{
    	int sum=0;
    	 while(np>0)
  	   {    
        int r = np % 10;   
           sum = (sum*10)+r;    
          np = np/10;    
         }    
        if(number==sum)    
          System.out.println("It is a Palindrome number.");    
        else    
          System.out.println("Not a palindrome");  
    	
    	    	
    	
    };
    
    fobj4.abstractFun4(n4);
    
        break;
     default:
         System.out.println("you are entered wrong chracter ,enter only capital character");
        break;
            
     }
		
		 
}
}
