package com.demo.String;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class EmployeeCriteria {
	
	private int id;
	
	private String name;
	
	private double salary;
	
	private String gender;
	
	private String deptName;

}
