package com.demo.exceptionDemo;

public class StudentValidationImpl {
	private StudentData studentData;

	public StudentValidationImpl(StudentData studentData) {
		super();
		this.studentData = studentData;
	}
	
	public void validateStudentData() throws ValidationException {
		if(studentData.getStudent_Id() <=0) {
			throw new ValidationException("invalid student id");
		}
		
		if(!studentData.getStudentName().matches("^[a-zA-Z]*$")) {
			throw new ValidationException("incorrect name it should be alphabetical");
		}
		
		if(!studentData.getSsn().matches("^[a-zA-Z0-9]+$")) {
			throw new ValidationException("ssn should be alphanumeric");
		}
		
	}

	public void validateStudentData1() {
		// TODO Auto-generated method stub
		
	}

}