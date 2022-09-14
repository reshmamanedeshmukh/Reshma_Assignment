package com.yash.nineth;

import java.util.Arrays;
import java.util.Scanner;

public class CallerInfo {
  private double callersize[]=new double[10];

 
    public double[] getCallersize() {
	return callersize;
}


public void setCallersize(double[] callersize) {
	this.callersize = callersize;
}


	public CallerInfo(double[] callersize) {
	super();
	this.callersize = callersize;
}


	@Override
	public String toString() {
		return "CallerInfo [callersize=" + Arrays.toString(callersize) + "]";
	}


	public static void main(String[] args) {
		
    	Scanner sc=new Scanner(System.in);
    	int count=0;
    	double callersize[]=new double[10];
    	 double sd[]=new double[10];
    	 double sdn[]=new double[10];
    for(int i=0;i<10;i++) {
    		System.out.println("Enter size of +i+caller");
    		callersize[i]=sc.nextDouble();
    	       
    	   System.out.println("original number"+callersize[i]);
    	    // System.out.println("Integer form:"+(int)callersize[i]);
    	      sd[i]=(double) ((int)callersize[i]*2)/100;
    	   // System.out.println("After applying sd form:"+sd[i]);
    	      sdn[i]=((int)callersize[i])+sd[i];
    	    System.out.println("number after applying standard deviation"+sdn[i]);
    	    if(callersize[i]>sdn[i])
        	{
        		count=count+1;
        	}
    	    try {
    	        if(count>5) {
    	        	throw new CollarStandardDeviate("CollarStandardDeviateException");
    	    	}
    	    	}catch(CollarStandardDeviate e)
    	        {
    	    		System.out.println(e.getMessage());break;
    	        }
    	    
    }
   
    
	}
  
}
