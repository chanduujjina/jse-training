package com.demo.exceptionDemo;

public class RuntimeExceptionDemo {
	
	public int getIntgerFromString(String value) throws Exception {
		
		//"123" -->123
		
		try {
		return Integer.parseInt(value);
		}
		catch(NumberFormatException ex) {
			throw new Exception("incorrect data the value must be intger::"+ex.getMessage());
		}
		
	}
	
	public int getLength(String name) {
		int length =0;
		if(null != name) {
			length =name.length();
	   }
		return length;
	}
	
	
	
	public  int getValue(int num1,int num2) throws Exception {
		
		try {
		return num1/num2;
		
		}
		catch(ArithmeticException ex) {
			throw new Exception("infinite value for the given input data:");
		}
		
	}
	
	

}
