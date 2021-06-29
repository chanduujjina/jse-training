package com.demo.exceptionDemo.test;

import org.junit.Test;

import com.demo.exceptionDemo.StudentData;
import com.demo.exceptionDemo.ValidationException;
import com.demo.exceptionDemo.StudentValidationImpl;

public class StudentValidationImplTest {
	StudentValidationImpl impl =null;
	@Test(expected = ValidationException.class)
	public void testvalidateEmployeeData_id() throws ValidationException {
		StudentData data = new StudentData();
		
		data.setStudent_Id(-1);
		
		impl = new StudentValidationImpl(data);
		impl.validateStudentData();
	}
	
	@Test(expected = ValidationException.class)
	public void testvalidateEmployeeData_name() throws ValidationException {
		StudentData data = new StudentData();
		data.setStudent_Id(1);
		data.setStudentName("Chandu129");
		
		impl = new StudentValidationImpl(data);
		impl.validateStudentData();
	}
	@Test(expected= ValidationException.class)
	public void testvalidateEmployeeData_ssn() throws ValidationException {
		StudentData data = new StudentData();
		data.setStudent_Id(1);
		data.setStudentName("Chandu");
		data.setSsn("test@123");
		impl = new StudentValidationImpl(data);
		impl.validateStudentData();
	}
	
	

}


