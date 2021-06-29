package com.demo.exceptionDemo;
import java.util.ArrayList;  // ask question
import java.util.List;

public class StudentValidationImpl_v {
	private StudentData studentData;

	public StudentValidationImpl_v(StudentData studentData) {
		super();
		this.studentData = studentData;
	}
	
	public List<ErrorInfo> validateStudentData() {
		ErrorInfo errorinfo = null;
		List<ErrorInfo> errorList = new ArrayList();
		
		if(studentData.getStudent_Id() <=0) {
			errorinfo = new ErrorInfo("id", "invalid student id");
			errorList.add(errorinfo);
		}
		if(!studentData.getStudentName().matches("^[a-zA-Z]*$")) {
			errorinfo = new ErrorInfo("Studentname", "invalid studentname");
			errorList.add(errorinfo);
			
		}
		return errorList;
		}
}