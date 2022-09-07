package com.java.arrayexample;

import java.util.Scanner;

public class ArrayCountDuplicate {
	public static void main(String args[])
	{
	
		int[] arr = {2,2,2,5,5,7,7,8};
		    int size = arr.length;
    int i,j;
for (i = 0; i < size; i++){
   
    int count = 1;

    for ( j = i+1; j < size; j++){
        if (arr[i] == arr[j]){
            count++;
          
        }else
        {
        	  break;	
        }
    }
i=j-1;
    
  if(count > 1){
      System.out.println("The element is " + arr[i] 
                         + " and its frequency is " + count);
  }
}
}
}
