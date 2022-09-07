package com.java.collection.secondex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BinarySearchExample {
	public static void main(String[] args) {
		List<Integer> list= new ArrayList<>();
		
		list.add(25);
		list.add(15);
		list.add(45);
		list.add(23);
		list.add(35);
		
		
		
		int[] number = new int[list.size()];
		for (int i = 0; i < list.size(); i++)
			number[i] = list.get(i);
		
		for(int i=0;i<number.length-1;i++) {
			for(int j=i+1;j<number.length;j++) {
				if(number[i]>number[j]) {
					int temp=number[i];
					number[i]=number[j];
					number[j]=temp;
				}
			}
		}
		for(int k=0;k<number.length;k++) {
			System.out.println(number[k]);
		}
		int index=25;
		BinarySearchExample.binarySearch(number,index);
	}
	public static void binarySearch(int[] arr,int element) {
		int start=0,end=arr.length-1,mid=(end-start)/2;
		if(element==arr[mid]) {
			System.out.println(" Index element in the middle of the array "+element);
		}
		else if(arr[mid]>element) {
			for(int i=0;i<=mid;i++) {
				if(arr[i]==element) {
					System.out.println(" Index Element in the left side of the array "+element);
				}
			}
			System.out.println("element is not present ");
		}
		else if(arr[mid]<element) {
			for(int i=mid;i<=end;i++) {
				if(arr[i]==element) {
					System.out.println(" Index Element in the right side of the array "+element);
				}
			}
				System.out.println("element is not present ");
		}
		
	}
}


