package com.demo.exceptionDemo;

import java.util.ArrayList;
import java.util.List;

public class ValidationImpl_v1 {
	
private EmployeeData employeeData;
	
	public ValidationImpl_v1(EmployeeData employeeData) {
		super();
		this.employeeData = employeeData;
	}
	
	public List<ErrorInfo> validateEmployeeData() {
		ErrorInfo errorinfo = null;
		List<ErrorInfo> errorList = new ArrayList();
		
		if(employeeData.getId() <=0) {
			errorinfo = new ErrorInfo("id", "invalid employee id");
			errorList.add(errorinfo);
		}
		
		if(!employeeData.getName().matches("^[a-zA-Z]*$")) {
			errorinfo = new ErrorInfo("name", "incorrect name it should be alphabetical");
			errorList.add(errorinfo);
		}
		
		if(!employeeData.getSsn().matches("^[a-zA-Z0-9]+$")) {
			errorinfo = new ErrorInfo("ssn", "ssn should be aphanumeric");
			errorList.add(errorinfo);
		}
		return errorList;
	}
	


}
