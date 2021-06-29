package com.demo.ioStreams;

import java.io.Serializable;

import lombok.Data;

@Data


public class EmployeeObject implements Serializable {

	public EmployeeObject(int employeeId, String employeeName, String employee) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employee = employee;
	}
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;


private int employeeId;
private String employeeName;
private String employee;
}