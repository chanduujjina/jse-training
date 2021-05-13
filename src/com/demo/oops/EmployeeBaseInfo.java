package com.demo.oops;

public class EmployeeBaseInfo {
	
   

	private int employeeId;
	
	private String employeeName;
	
	private String gender;
	
	private String deptName;
	
	private String address;
	
	public EmployeeBaseInfo(int employeeId, String employeeName, String gender, String deptName, String address) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.gender = gender;
		this.deptName = deptName;
		this.address = address;
	}
	
	 

		@Override
		public String toString() {
			return "EmployeeBaseInfo [employeeId=" + employeeId + ", employeeName=" + employeeName + ", gender=" + gender
					+ ", deptName=" + deptName + ", address=" + address + "]";
		}
}
