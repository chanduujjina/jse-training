package com.demo.exceptionDemo.test;

import org.junit.Test;

import com.demo.exceptionDemo.EmployeeData;
import com.demo.exceptionDemo.ValidationException;
import com.demo.exceptionDemo.ValidationImpl;

public class ValidationImplTest {
	
	
	ValidationImpl impl =null;
	@Test(expected = ValidationException.class)
	public void testvalidateEmployeeData_id() throws ValidationException {
		EmployeeData data = new EmployeeData();
		
		data.setId(-1);
		
		impl = new ValidationImpl(data);
		impl.validateEmployeeData();
	}
	
	@Test(expected = ValidationException.class)
	public void testvalidateEmployeeData_name() throws ValidationException {
		EmployeeData data = new EmployeeData();
		data.setId(1);
		data.setName("Chandu129");
		
		impl = new ValidationImpl(data);
		impl.validateEmployeeData();
	}
	
	

}
