package com.java.oops.fourthex;

import java.util.Scanner;

public class Area_By_Sides {
public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int side;
		System.out.println("how many side u want to enter ");
		side=sc.nextInt();
		if(side==2) {
			int side1,side2;
			System.out.println("plz enter first side ");
			side1=sc.nextInt();
			System.out.println("plz enter second side ");
			side2=sc.nextInt();
			System.out.println("area of "+ side1*side2);
		}
		else if(side==3) {
			int side1,side2,side3;
			System.out.println("plz enter first side ");
			side1=sc.nextInt();
			System.out.println("plz enter second side ");
			side2=sc.nextInt();
			System.out.println("plz enter third side ");
			side3=sc.nextInt();
			System.out.println(side1*side2*side3);
		}
		else if(side==4) {
			int side1,side2,side3,side4;
			System.out.println("plz enter first side ");
			side1=sc.nextInt();
			System.out.println("plz enter second side ");
			side2=sc.nextInt();
			System.out.println("plz enter third side ");
			side3=sc.nextInt();
			System.out.println("plz enter third side ");
			side4=sc.nextInt();
			System.out.println(side1*side2*side3*side4);
		}
	}

}
