package com.demo.exceptionDemo;

public class ExceptionDemo {

	public static void main(String[] args) throws Exception {
		
		int value = 0;
		try {
			value = getNumber("abc");
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			throw new Exception("invalid data please provide valid integer value");
			
		}
		System.out.println(value);
	}
	
	public static int getNumber(String value) {
		return Integer.parseInt(value);
	}
	
	public static void validateEmployeeData_id() throws ValidationException {
		EmployeeData data = new EmployeeData();
		
		data.setId(-1);
		
		ValidationImpl	impl = new ValidationImpl(data);
		impl.validateEmployeeData();
	}

}
