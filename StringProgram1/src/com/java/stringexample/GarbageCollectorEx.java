package com.java.stringexample;

public class GarbageCollectorEx {
	String name;
	GarbageCollectorEx(String name){
	      this.name = name;
	   }
	   protected void finalize() throws Throwable {
	      System.out.println(this.name + " successfully garbage collected");
	   }
	   public static void main(String args[]){
		   GarbageCollectorEx obj = new GarbageCollectorEx("Object1");
	      obj = null;
	      System.gc();
	   }
}
