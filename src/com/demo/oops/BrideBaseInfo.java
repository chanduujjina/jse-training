package com.demo.oops;


import lombok.Builder;
import lombok.Data;

public class BrideBaseInfo {
	

	@Override
	public String toString() {
		return "BrideBaseInfo [brideName=" + brideName + ", age=" + age + ", education=" + education + ", occupation="
				+ occupation + "]";
	}

	public BrideBaseInfo(String brideName, int age, String education, String occupation) {
		super();
		this.brideName = brideName;
		this.age = age;
		this.education = education;
		this.occupation = occupation;
	}

	private String brideName;
	
	private int age;
	
	private String education;
	
	private String occupation;
	
	


}
