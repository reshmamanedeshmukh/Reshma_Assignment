package com.java.collection.ninethex;
import java.util.concurrent.CopyOnWriteArrayList;
public class EmpDemo {
	public static void main(String[] args) {
		CopyOnWriteArrayList<Employee>empList=new CopyOnWriteArrayList<>();
		Employee employee1=new Employee(101, "abc", 65000, "dev", "pune");
		Employee employee2=new Employee(103, "pqr", 55000, "dev", "baramati");
		Employee employee3=new Employee(102, "lmn", 75000, "dev", "hadapsar");
		
		empList.add(employee1);
		empList.add(employee2);
		empList.add(employee3);
		for (Employee employee : empList) {
			int objectElement=employee.getEid();
			 int index=objectElement%10;
			 empList.add(index, employee);
		}
		empList.forEach(System.out::println);
	}

}
