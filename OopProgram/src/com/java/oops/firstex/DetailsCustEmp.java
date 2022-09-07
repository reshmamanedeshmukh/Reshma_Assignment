package com.java.oops.firstex;

public class DetailsCustEmp {
public static void main(String[] args) {
	Employee e1 = new Employee();
	e1.setPid(1001);
	System.out.println(e1.getPid());
	
	e1.setPname("ABC");
	System.out.println(e1.getPname());
	
	e1.setPaddress("pune");
	System.out.println(e1.getPaddress());
	
	e1.setDob("1/10/2020");
	System.out.println(e1.getDob());

	Department d1[]=new Department[2];
	
	d1[0]= new Department(11,"testing");
	d1[1]= new Department(12,"Development");
	
		
	Employee e2 = new Employee(101, "pqr", "indore", "02/04/2021", 15000.0, "02/06/2018", "pune", d1[0], 989313, "pqr@yash.com");
	
	System.out.println(e2);
	
	Employee e3=new Employee(102,"xyz","mumbai","3/4/2011",45000.0,"3/5/2017","pune",d1[1],9876543,"xyz@yash.com");
System.out.println(e3);	

	Customer c1=new Customer(121, "lmn", "nigidi", "06/12/1995", "15/08/2022", "Pune", 12345678, "lmn@yash.com");
	System.out.println(c1);	
}
}
