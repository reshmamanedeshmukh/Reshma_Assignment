package com.java.arrayexample;

public class PerfectPrimeEvenOddArray {
	

public static void main(String[] args) {
	 int a[]= {1,2,3,4,5,6,28};
     int p=0;
     for (int i = 0; i < a.length; i++) {
         if(a[i]%2==0) {
             System.out.println("Even Number : "+a[i]);
         }else {
             System.out.println("Odd Number : "+a[i]);
         }
                 int sum=0;
             for(int k=i+1;k<=i ;k++)
             {
                 if(a[i]%k==0)
                 {
                     sum=sum+k;
                     
                 }
                 
             }
                 if(sum==a[i])
                 {
                     System.out.println("Perfect no is " +a[i]);    
                     
                 }
             }
            


       
          
    
     for(int y=1; y<a.length; y++){
         boolean isPrime = true;
         for (int j=2; j<y; j++){
             if(a[y]%j==0){
                 isPrime = false;
                 break;
             }
         }
         if(isPrime) {
             System.out.println(a[y] + " are the prime numbers");
         }
}
}
}

