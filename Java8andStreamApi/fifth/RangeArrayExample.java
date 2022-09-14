package com.yash.fifth;


interface Range {
	void printMissing(int arr[],int n);
}




public class RangeArrayExample {
	
	public static void main(String[] args)
    {
		int arr1[] = {1,2,3,4,6,7,8,11,13,14,15,19,20,21};
        int n1 = arr1.length;
      
	Range r=(int arr[],int n)->{
	
		 
        int LIMIT = 30;
 
        boolean seen[] = new boolean[LIMIT];
 
      
        for (int i = 0; i < LIMIT; i++)
            seen[i] = false;
 
       
        for (int i = 0; i < n1; i++)
        {
            if (arr1[i] < LIMIT)
                seen[arr1[i]] = true;
          
        }
 
               int i = 0;
        while (i < LIMIT)
        {
            
            if (seen[i] == true)
            {
                
                int j = i+1;
                while (j < LIMIT && seen[j] == true)
                	 j++;
               
                int p = j-1;
                System.out.println(i+1==j ? i : i + "-" + p);
 
              
                i = j;
            }
            else
                i++;
        }
    };
	
 r.printMissing(arr1, n1);
  
    
    }
}