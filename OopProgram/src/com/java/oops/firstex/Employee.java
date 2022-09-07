package com.java.oops.firstex;

public class Employee extends Person {

	private double salary;
	private String date_of_joining;
	private String base_location;
	private Department deptobj;
	private int contactno;
	private String emailid;
	
	
	public Employee() {
		super();
	}
	public Employee(int pid, String pname, String paddress, String dob) {
		super(pid, pname, paddress, dob);
		// TODO Auto-generated constructor stub
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getDate_of_joining() {
		return date_of_joining;
	}
	public void setDate_of_joining(String date_of_joining) {
		this.date_of_joining = date_of_joining;
	}
	public String getBase_location() {
		return base_location;
	}
	public void setBase_location(String base_location) {
		this.base_location = base_location;
	}
	public Department getDeptobj() {
		return deptobj;
	}
	public int getContactno() {
		return contactno;
	}
	public void setContactno(int contactno) {
		this.contactno = contactno;
	}
	public String getEmailid() {
		return emailid;
	}
	public void setEmailid(String emailid) {
		this.emailid = emailid;
	}
	
	public Employee(int pid, String pname, String paddress, String dob, double salary, String date_of_joining,
			String base_location, Department deptobj, int contactno, String emailid) {
		
		super(pid, pname, paddress, dob);
		this.salary = salary;
		this.date_of_joining = date_of_joining;
		this.base_location = base_location;
		this.deptobj = deptobj;
		this.contactno = contactno;
		this.emailid = emailid;
	}
	@Override
	public String toString() {
		return "Employee [salary=" + salary + ", date_of_joining=" + date_of_joining + ", base_location="
				+ base_location + ", deptobj=" + deptobj + ", contactno=" + contactno + ", emailid=" + emailid + "]";
	}

	
}