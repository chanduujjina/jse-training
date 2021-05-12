package com.demo;

public class Employee {
	
	//instance/global varibles
	// 0, 1
    private int employeeID;
	
    //null,test1
	private String employeeName;
	
	//null it
	private String deptName;
	//null
	private String gender;
	
	
	private double salary;
	
	public Employee() {
		
	}
	// 5 arg constructtor
	public Employee(int employeeID,String employeeName,String deptName,String gender,double salary)
	{
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.deptName = deptName;
		this.gender = gender;
		this.salary = salary;
		
	}
	
	// 4 arg constructtor
	public Employee(int employeeID,String employeeName,String deptName,String gender) {
		this.employeeID = employeeID;
		this.employeeName = employeeName;
		this.deptName = deptName;
		this.gender = gender;
	}
	
	// 3 arg constructtor
		public Employee(int employeeID,String employeeName,String deptName) {
			this(employeeID,employeeName);
			
		}
		
		private Employee(int employeeID,String employeeName) {//ask
			this.employeeID = employeeID;
			this.employeeName = employeeName;
		}
		
		
	
	
	
	public int getEmployeeID() {
		return employeeID;
	}


	public void setEmployeeID(int employeeID) {
		this.employeeID = employeeID;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}


	public String getDeptName() {
		return deptName;
	}


	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public double getSalary() {
		return salary;
	}


	public void setSalary(double salary) {
		this.salary = salary;
	}


	
	

}
