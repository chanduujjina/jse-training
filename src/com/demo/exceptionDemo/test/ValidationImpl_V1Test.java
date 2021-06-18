package com.demo.exceptionDemo.test;

import java.util.List;

import org.junit.Test;

import com.demo.exceptionDemo.EmployeeData;
import com.demo.exceptionDemo.ErrorInfo;
import com.demo.exceptionDemo.ValidationException;
import com.demo.exceptionDemo.ValidationImpl;
import com.demo.exceptionDemo.ValidationImpl_v1;

public class ValidationImpl_V1Test {
	ValidationImpl_v1 impl =null;
	@Test
	public void testvalidateEmployeeData_id() throws ValidationException {
		EmployeeData data = new EmployeeData();
		
		data.setId(-1);
		data.setName("chandu");
		data.setSsn("Chandu123");
		impl = new ValidationImpl_v1(data);
		List<ErrorInfo> errorList =impl.validateEmployeeData();
		System.out.println(errorList);
	}
	
	@Test
	public void testvalidateEmployeeData_id_name() throws ValidationException {
		EmployeeData data = new EmployeeData();
		
		data.setId(-1);
		data.setName("chandu123");
		data.setSsn("Chandu123");
		impl = new ValidationImpl_v1(data);
		List<ErrorInfo> errorList =impl.validateEmployeeData();
		System.out.println(errorList);
	}
	@Test
	
	public void testvalidateEmployeeData_id_name_ssn() throws ValidationException {
		EmployeeData data = new EmployeeData();
		
		data.setId(-1);
		data.setName("chandu123");
		data.setSsn("Chandu123@");
		impl = new ValidationImpl_v1(data);
		List<ErrorInfo> errorList =impl.validateEmployeeData();
		System.out.println(errorList);
	}
}
