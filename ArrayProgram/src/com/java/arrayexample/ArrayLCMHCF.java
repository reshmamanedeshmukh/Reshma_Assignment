package com.java.arrayexample;

public class ArrayLCMHCF {
public static void main(String[] args) {
	   int a[]= {3,5,7};
       int lcm=1,fir=lcm,hcf=0;
       for(int i=0;i<a.length;i++)
       {
           int sec=a[i];
           lcm=(fir*sec)/gcd(fir,sec);
           fir=lcm;
       }
       for(int j=0;j<a.length;j++)
       {
           hcf=gcd(hcf,a[j]);
       }
       System.out.println("lcm is "+lcm+" "+"hcf is "+hcf);
   }
   
   public static int gcd(int a,int b)
   {
       if(b==0)
       {
           return a;
       }
       return gcd(b,a%b);
   }
}

