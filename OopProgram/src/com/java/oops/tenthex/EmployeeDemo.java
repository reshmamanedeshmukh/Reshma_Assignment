package com.java.oops.tenthex;



import java.util.Calendar;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class EmployeeDemo {
	int empid;
	String empname,empaddress;
	double empsalary; 
	Date emp_dob, emp_doj;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getEmpaddress() {
		return empaddress;
	}
	public void setEmpaddress(String empaddress) {
		this.empaddress = empaddress;
	}
	public double getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(double empsalary) {
		this.empsalary = empsalary;
	}
	public Date getEmp_dob() {
		return emp_dob;
	}
	public void setEmp_dob(Date emp_dob) {
		this.emp_dob = emp_dob;
	}
	public Date getEmp_doj() {
		return emp_doj;
	}
	public void setEmp_doj(Date emp_doj) {
		this.emp_doj = emp_doj;
	}
	public EmployeeDemo(int empid, String empname, String empaddress, double empsalary, Date emp_dob, Date emp_doj) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empaddress = empaddress;
		this.empsalary = empsalary;
		this.emp_dob = emp_dob;
		this.emp_doj = emp_doj;
	}
	@Override
	public String toString() {
		return "EmployeeDemo [empid=" + empid + ", empname=" + empname + ", empaddress=" + empaddress + ", empsalary="
				+ empsalary + ", emp_dob=" + emp_dob + ", emp_doj=" + emp_doj + "]";
	}
	public static void main(String[] args) {
		
		
		
		
		Date dob = new Date(1995,3, 7);
		
		Date doj = new Date(2022, 8, 18);
		
		/*String pattern = "yyyy-MM-dd";
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);

		try {
			Date date1 = simpleDateFormat.parse("2018-09-09");
		} catch (ParseException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	    */

		EmployeeDemo e = new EmployeeDemo(101,"ABC","Pune",50000,dob, doj);
         System.out.println(e);
         
	}
}
