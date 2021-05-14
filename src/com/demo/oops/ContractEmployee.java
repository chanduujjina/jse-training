package com.demo.oops;

public class ContractEmployee extends EmployeeBaseInfo{
	
	
	

	@Override
	public String toString() {
		return "ContractEmployee [contractCompany=" + contractCompany + ", payRoll=" + payRoll + "]";
	}

	private String contractCompany;
	
	private String payRoll;
	
	public ContractEmployee(int employeeId, String employeeName, String gender, String deptName, String address,
			String contractCompany, String payRoll) {
		super(employeeId, employeeName, gender, deptName, address);
		this.contractCompany = contractCompany;
		this.payRoll = payRoll;
	}

}
