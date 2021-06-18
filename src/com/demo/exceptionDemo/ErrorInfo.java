package com.demo.exceptionDemo;

public class ErrorInfo {
	
    @Override
	public String toString() {
		return "ErrorInfo [fieldName=" + fieldName + ", errorMessage=" + errorMessage + "]";
	}
	private String fieldName;
	
	private String errorMessage;
	public ErrorInfo(String fieldName, String errorMessage) {
		super();
		this.fieldName = fieldName;
		this.errorMessage = errorMessage;
	}

	

}
