package com.demo.exceptionDemo;

public class StudentExceptionDemo {

	public static void main(String[] args) throws Exception {
		
			
			int value = 0;
			try {
				value = getNumber("123");//ask question
			} catch (NumberFormatException e) {
				// TODO Auto-generated catch block
				throw new Exception("invalid data please provide valid integer value");
				
			}
			System.out.println(value);
			validateStudentData_id();
		}
		
		public static int getNumber(String value) {
			return Integer.parseInt(value);
		}
		
		public static void validateStudentData_id() throws ValidationException {
		StudentData data = new StudentData();
			
			data.setStudent_Id(1);
			data.setStudentName("Anu");
			data.setSsn("123@test");
			StudentValidationImpl	impl = new StudentValidationImpl(data);
			impl.validateStudentData();
		}
		// TODO Auto-generated method stub

	}


