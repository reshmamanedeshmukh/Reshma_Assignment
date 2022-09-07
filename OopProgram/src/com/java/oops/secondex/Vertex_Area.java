package com.java.oops.secondex;

import java.util.Scanner;

interface Shape {
    public void area();

   
}



class Rectangle implements Shape {

	Scanner sc=new Scanner(System.in);
	@Override
	public void area() {
		int a,b,c,h;
		int area;
		System.out.println("plz enter two point of contact for base ");
		b=sc.nextInt();
		a=sc.nextInt();
		System.out.println("plz enter height for rectangle ");
		h=sc.nextInt();
		c=b-a;
		area=c*h;
		System.out.println(area);
		
	}
}
class Square implements Shape{
	
	Scanner sc=new Scanner(System.in);
	@Override
	public void area() {
		int x1,x2,y1,y2,side1,side2;;
		int area;
		System.out.println("plz enter x1 & x2 point ");
		x1=sc.nextInt();
		x2=sc.nextInt();
		System.out.println("plz enter y1 & y2 point ");
		y1=sc.nextInt();
		y2=sc.nextInt();
		side1=x2-x1;
		side2=y2-y1;
		area=side1*side2;
		System.out.println("area of square "+area);
	}
}

 class Triangle implements Shape{
		
		Scanner sc=new Scanner(System.in);
	@Override
	public void area() {
		int a,b,c,d,e,f,g,h,i,j;
		int area;
		System.out.println("plz enter co-ordinate for point A ");
		a=sc.nextInt();
		b=sc.nextInt();
		System.out.println("plz enter co-ordinate for point B ");
		c=sc.nextInt();
		d=sc.nextInt();
		System.out.println("plz enter co-ordinate for point C ");
		e=sc.nextInt();
		f=sc.nextInt();
		
		g=a-c;
		h=b-d;
		
		i=a-e;
		j=b-f;
		
		area=((g*j)-(h*i)/2);
		System.out.println("area of triangle: "+area);
	}
	}
	
public class Vertex_Area {



   public static void main(String[] args) {
        
	   Triangle triangle=new Triangle();
		triangle.area();
		Square square=new Square();
		//square.area();
		Rectangle rectangle=new Rectangle();
		//rectangle.area();



   }

}