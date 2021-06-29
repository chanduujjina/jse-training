package com.demo.exceptionDemo.test;

import java.util.List;

import org.junit.Test;

import com.demo.exceptionDemo.ErrorInfo;
import com.demo.exceptionDemo.StudentData;
import com.demo.exceptionDemo.ValidationException;
import com.demo.exceptionDemo.StudentValidationImpl;
import com.demo.exceptionDemo.StudentValidationImpl_v;
public class StudentValidationImpl_V1Test {
	StudentValidationImpl_v impl =null;
	@Test
	public void testvalidateEmployeeData_id() throws ValidationException {
	StudentData data = new StudentData();
		
		data.setStudent_Id(-1);
		data.setStudentName("chandu");
		data.setSsn("Chandu123");
		impl = new StudentValidationImpl_v(data);
		List<ErrorInfo> errorList =impl.validateStudentData();
		System.out.println(errorList);
	}
	
	
	

}
