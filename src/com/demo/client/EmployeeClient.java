package com.demo.client;

import com.demo.Employee;

public class EmployeeClient {

	public static void main(String[] args) {
		
		//create first object
		
		Employee emp1 = new Employee();
		emp1.setEmpID(1);
		emp1.setEmpName("Anu");
		emp1.setGender("Female");
		emp1.setSalary(100000.0);
		emp1.setDeptName("it");
		
		System.out.println("employee 1 deatils::"+emp1);
		
		Employee emp2 = new Employee();
		
		emp2.setEmpID(2);
		emp2.setEmpName("Test");
		emp2.setGender("Female");
		emp2.setSalary(100000.0);
		emp2.setDeptName("it");
		
		System.out.println("employee 2 deatils::"+emp2);
		
		Employee emp3 = new Employee(3,"test",100000.0,"Male","it");
		
		System.out.println("employee 3 deatils::"+emp3);
		
		Employee emp4 = new Employee(3,"test",100000.0,"Male");
		
		System.out.println("employee 4 deatils::"+emp4);
		
		Employee emp5 = new Employee(3,"test",100000.0);
		System.out.println("employee 4 deatils::"+emp5);
		
		
		
		

	}

}
