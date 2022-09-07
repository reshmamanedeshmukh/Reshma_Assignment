package com.java.oops.fifthex;

public class CalAbsDemo extends C{


	@Override
	void div(int a, int b) {
		System.out.println(a/b);
		
	}
	public static void main(String[] args) {
		CalAbsDemo d=new CalAbsDemo();
		d.sum(10, 20);
		d.sub(20, 10);
		d.mul(10, 10);
		d.div(100, 10);
	}
}
