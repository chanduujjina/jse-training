package com.demo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Student {
	
	private int studentId;
	
	private String studentName;
	
	private String gender;

}
