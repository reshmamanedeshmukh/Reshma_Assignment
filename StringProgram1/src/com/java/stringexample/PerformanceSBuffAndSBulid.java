package com.java.stringexample;

public class PerformanceSBuffAndSBulid {
public static void main(String[] args) {
	 long startTime = System.currentTimeMillis();  
     StringBuffer sb = new StringBuffer("Java");  
     for (int i=0; i<5; i++){  
         System.out.println(sb);  
     }  
     System.out.println("Time taken by StringBuffer: " + (System.currentTimeMillis() - startTime) + "ms");  
     startTime = System.currentTimeMillis();  
     StringBuilder sb2 = new StringBuilder("Java");  
     for (int i=0; i<5; i++){  
        System.out.println(sb2);  
     }  
     System.out.println("Time taken by StringBuilder: " + (System.currentTimeMillis() - startTime) + "ms");  
}
}
