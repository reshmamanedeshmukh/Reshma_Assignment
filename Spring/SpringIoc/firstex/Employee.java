package com.yash.SpringIocEx.firstex;

public class Employee {
	
	private String empId;
	private String empName;
	private String empRoll;
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpRoll() {
		return empRoll;
	}
	public void setEmpRoll(String empRoll) {
		this.empRoll = empRoll;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empRoll=" + empRoll + "]";
	}
	
	
	
}
