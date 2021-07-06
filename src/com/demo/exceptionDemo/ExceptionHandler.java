package com.demo.exceptionDemo;

public class ExceptionHandler {
	
	public static void main(String[] args) {
		
		
		try {
			int a=10,b=20;
			int result =a/b;//ArithmeticException
	      int number= Integer.parseInt("abc");//NumberFormatException
	      System.out.println(number);
		} catch (Exception ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
			
		}
		
		
	    
		
	}

}
