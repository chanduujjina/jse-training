package com.demo.oops;


public class PermanentEmployee extends EmployeeBaseInfo{
	
	

	@Override
	public String toString() {
		return "PermanentEmployee [doj=" + doj + ", passportNo=" + passportNo + "]";
	}

	private String doj;
	
	private String passportNo;
	
	public PermanentEmployee(int employeeId, String employeeName, String gender, String deptName, String address,
			String doj, String passportNo) {
		//super(arg1,arg2)
		//it will super class consrtuctor
		super(employeeId, employeeName, gender, deptName, address);
		this.doj = doj;
		this.passportNo = passportNo;
	}
	
	

}
