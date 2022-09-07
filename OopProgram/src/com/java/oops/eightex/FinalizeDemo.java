package com.java.oops.eightex;

public class FinalizeDemo {
	static int count=0;
	FinalizeDemo()
    {
        count++;
    }
    public static void main(String[] args) 
    {
    	FinalizeDemo obj1 = new FinalizeDemo();
    	FinalizeDemo obj2 = new FinalizeDemo();
    	FinalizeDemo obj3 = new FinalizeDemo();
       
    	 System.out.println(obj1.hashCode());   
    	   
         obj1 = null;   
         // calling garbage collector    
         System.gc();   
         System.out.println("end of garbage collection"); 
        
    }
    @Override  
    protected void finalize()   
    {   
        System.out.println("finalize method called");
        System.out.println("Number of objects created:"+count);
    }
      
}
