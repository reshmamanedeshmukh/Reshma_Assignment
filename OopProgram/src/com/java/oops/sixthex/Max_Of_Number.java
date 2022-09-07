package com.java.oops.sixthex;

public class Max_Of_Number implements MaxOFNumber{
	public static void main(String[] args) {
		Max_Of_Number test=new Max_Of_Number();
		test.maxThreeDigit(100, 999);
		test.maxFourDigit(1000, 9999);
		int[] arr= {10,20,30,40,50};
		test.maxOfNNumbers(arr);

	}

	@Override
	public void maxThreeDigit(int first, int last) {
		int max=0,min=0,temp=0;
		for(int i=first;i<=last;i++) {
			if(i>max) {
				temp=i;
				min=max;
				max=temp;
			}
		}
		System.out.println(max);
	}

	@Override
	public void maxFourDigit(int first, int last) {
		int max=0,min=0,temp=0;
		for(int i=first;i<=last;i++) {
			if(i>max) {
				temp=i;
				min=max;
				max=temp;
			}
		}
		System.out.println(max);
		
	}
	public void maxOfNNumbers(int[] arr) {
		int temp,max=0,min=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]>max) {
				temp=arr[i];
				min=max;
				max=temp;
			}
		}
		System.out.println(max);
	}

}
