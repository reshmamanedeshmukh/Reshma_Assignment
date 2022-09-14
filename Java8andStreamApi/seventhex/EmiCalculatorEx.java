package com.yash.seventhex;

import java.util.Scanner;

interface MyInterface {
	 double emiCalculation(double p,double r,double t);
}
public class EmiCalculatorEx {
public static void main(String[] args) {
	Scanner a = new Scanner(System.in);
    
    double principal, rate, emi;
int time;
    System.out.print("Enter principal: ");
    principal = a.nextFloat();
  
    System.out.print("Enter rate: ");
    rate = a.nextFloat();
  
    System.out.print("Enter time in monthhs: ");
    time = a.nextInt();
  
    rate=rate/(12*100); 
    
    MyInterface miemi=(p,r,t)->{
    	double e= (p*r*Math.pow(1+r,t))/(Math.pow(1+r,t)-1);
        return e;
    	
    };
    
    
    
    
    switch(time)
    {
    case 12:
    	emi=miemi.emiCalculation(principal, rate, time);
        
        System.out.println(emi);
        break;
    case  18:
    	emi=miemi.emiCalculation(principal, rate, time);
        
        System.out.println(emi);
        break;
    case 24:
    	emi=miemi.emiCalculation(principal, rate, time);
        
        System.out.println(emi);
        break;
    default:
        System.out.println("you are entered wrong no");
       break;
           
    }
   
     
}
}
