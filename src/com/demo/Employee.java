package com.demo;

public class Employee {
	
	

   // instance variables or global variables
	private int empID;
	
	private String empName;
	
	private Double salary;
	
	private String gender;
	
	private String deptName;
	
	//default constructor
	
	public Employee() {
		System.out.println("inside default constructor");
		
	}
	
	//5 arg constructor
	
	public Employee(int empID,String empName,Double salary,String gender,String deptName) {
		this.empID = empID;
		this.empName = 	empName;
		this.salary = salary;
		this.gender = gender;
		this.deptName = deptName;
	}
	
	
	// 4 arg consrtuctor
	public Employee(int empID,String empName,Double salary,String gender) {
		this.empID = empID;
		this.empName = 	empName;
		this.salary = salary;
		this.gender = gender;
	}
	
	// 3 arg consrtuctor
		public Employee(int empID,String empName,Double salary) {
			
			this(empID,empName);
			
		}
		
		private Employee(int empID,String empName) {
			this.empID = empID;
			this.empName = 	empName;
		}
	
	
	
	
	
	public int getEmpID() {
		return empID;
	}
  
	//local variable
	public void setEmpID(int empID) {
		this.empID = empID;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	

	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", salary=" + salary + ", gender=" + gender
				+ ", deptName=" + deptName + "]";
	}
	

}
