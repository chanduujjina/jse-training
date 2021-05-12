package com.demo.client;

import com.demo.Employee;

public class EmployeeClient {

	public static void main(String[] args) {
		
		//create first employee object
		Employee employee1 = new Employee();
		
		//set data to the object using setter/mutator method
		
		employee1.setEmployeeID(1);
		employee1.setEmployeeName("test1");
		employee1.setGender("male");
		employee1.setSalary(100);
		employee1.setDeptName("it");
		
		System.out.println(employee1.getEmployeeName());
		
		//create second employee object
		Employee employee2 = new Employee();
		
		employee2.setEmployeeID(2);
		employee2.setEmployeeName("test2");
		employee2.setGender("male");
		employee2.setSalary(100);
		employee2.setDeptName("it");
		System.out.println(employee1.getEmployeeID());
		
		//create a third object using constrctor
		
		Employee employee3 = new Employee(3,"test3","it","male",100);
		System.out.println(employee3.getEmployeeID());
		System.out.println(employee3.getEmployeeName());
		System.out.println(employee3.getDeptName());

		System.out.println(employee3.getGender());
		System.out.println(employee3.getSalary());
		
		//create a third object using 4 arg constructor
		
		Employee employee4= new Employee(4,"test3","it","male");
		
	}

}
