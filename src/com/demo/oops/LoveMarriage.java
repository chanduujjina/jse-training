package com.demo.oops;

import com.demo.oops.BrideBaseInfo;

public class LoveMarriage extends BrideBaseInfo{
	
	

	@Override
	public String toString() {
		return "LoveMarriage [fistMeetingplace=" + fistMeetingplace + ", whoProposedfirst=" + whoProposedfirst
				+ ", yearsOflove=" + yearsOflove + "]";
	}

	public LoveMarriage(String brideName, int age, String education, String occupation, String fistMeetingplace,
			String whoProposedfirst, int yearsOflove) {
		super(brideName, age, education, occupation);
		this.fistMeetingplace = fistMeetingplace;
		this.whoProposedfirst = whoProposedfirst;
		this.yearsOflove = yearsOflove;
	}

	private String fistMeetingplace;
	
	private String whoProposedfirst;
	
	private int yearsOflove;
	

	
}
