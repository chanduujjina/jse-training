package com.demo.exceptionDemo;

public class RuntimeExceptionDemo {
	
	/**
	 * @param value
	 * @return
	 * @throws Exception
	 * Purpose of this
	 */
	public int getIntgerFromString(String value) throws Exception {
		
		//"123" -->123
		
		try {
		return Integer.parseInt(value);
		}
		catch(NumberFormatException ex) {
			throw new Exception("incorrect data the value must be intger::"+ex.getMessage());
		}
		
	}
	
//Chandu@129
	
	/**
	 * @param name
	 * @return
	 * purpose of this method to verify a nullpointer condition
	 */
	public int getLength(String name) {
		int length =0;
		if(null != name) {
			length =name.length();
	   }
		return length;
	}
	
	
	
	/**
	 * @param num1
	 * @param num2
	 * @return
	 * @throws Exception
	 * Purpose of this method to handle infinite value
	 */
	public  int getValue(int num1,int num2) throws Exception {
		
		try {
		return num1/num2;
		
		}
		catch(ArithmeticException ex) {
			throw new Exception("infinite value for the given input data:");
		}
		
	}
	
	

}
