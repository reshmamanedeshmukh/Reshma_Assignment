
/* WAP to print the all alphabets of string in assending and desndeing order*/



package com.java.stringexample;

public class StringAsendeingaAndDesending {
	
	public static void main(String[] args) {
		
		String str="defachbg";
		char ch[]=str.toCharArray();
		   for(int i=0;i<ch.length;i++)
	        {
	            for(int j=i+1;j<ch.length;j++)
	            {
	                if(ch[i]>ch[j])
	                {
	                    char temp=ch[i];
	                    ch[i]=ch[j];
	                   ch[j]=temp;
	                }
	                
	                    
	            }
	        }
		   System.out.println("Asending order String");
		   for(int i=0;i<ch.length;i++)
	        {
			   System.out.print(ch[i]);
	        }
		   System.out.println();
		   for(int i=0;i<ch.length;i++)
	        {
	            for(int j=i+1;j<ch.length;j++)
	            {
	                if(ch[i]<ch[j])
	                {
	                    char temp=ch[i];
	                    ch[i]=ch[j];
	                   ch[j]=temp;
	                }
	                
	                    
	            }
	        }
		   System.out.println("Desending order String");
		   for(int i=0;i<ch.length;i++)
	        {
			   System.out.print(ch[i]);
	        }
	}

}
