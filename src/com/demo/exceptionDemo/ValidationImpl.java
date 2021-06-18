package com.demo.exceptionDemo;

public class ValidationImpl {
	
	private EmployeeData employeeData;
	
	public ValidationImpl(EmployeeData employeeData) {
		super();
		this.employeeData = employeeData;
	}
	
	public void validateEmployeeData() throws ValidationException {
		if(employeeData.getId() <=0) {
			throw new ValidationException("invalid employee id");
		}
		
		if(!employeeData.getName().matches("^[a-zA-Z]*$")) {
			throw new ValidationException("incorrect name it should be alphabetical");
		}
		
		if(!employeeData.getSsn().matches("^[a-zA-Z0-9]+$")) {
			throw new ValidationException("ssn should be aphanumeric");
		}
		
		
	}

	

}
