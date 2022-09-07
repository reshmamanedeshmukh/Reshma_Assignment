package com.java.arrayexample;

public class PythagorousArray {
	  public static void main(String[] args) {
	        
	        int arr[] = {2,3,4,5,6,7};
	        
	        int a,b,c;
	        for(int i=0;i<arr.length-2;i++)
	        {
	            for(int j=i+1;j<arr.length-1;j++)
	            {
	                for(int k=i+2;k<arr.length;k++)
	                {
	                  a = arr[i];
	                  b = arr[j];
	                  c = arr[k];
	                  if(a*a + b*b == c*c) 
	                  {
	                      
	                      System.out.println("pythagores Numbers are : "+a +"  "+b+"  "+c);
	                  }
	                  
	                }
	                
	              }
	          }
	    }
}
