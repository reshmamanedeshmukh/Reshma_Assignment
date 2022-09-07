package com.java.arrayexample;

public class ThirdMaxNoArray {
	  public static void main(String[] args) {
	        
	        int arr[]= {90,100,1,3,67,78,66,91,200};
	        int temp;
	        int len =arr.length;
	        for(int i=0;i<arr.length;i++) {
	            
	            for(int j=i+1;j<arr.length;j++) {
	            
	            if(arr[i]>arr[j]) {
	                temp=arr[i];
	                arr[i]=arr[j];
	                arr[j]=temp;
	            }
	        }
	        }
	        System.out.println("Third-max number is "+arr[len-3]);
	        System.out.println("second-max number is "+arr[len-2]);
	        System.out.println("max number is "+arr[len-1]);
	        
	    }
}
