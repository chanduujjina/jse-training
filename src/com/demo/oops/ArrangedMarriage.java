package com.demo.oops;

public class ArrangedMarriage extends BrideBaseInfo{
	

	private String caste;
	
	private int dowry;
	
	private String familyDetails;
	
	private int kundali;

	public ArrangedMarriage(String brideName, int age, String education, String occupation, String caste, int dowry,
			String familyDetails, int kundali) {
		super(brideName, age, education, occupation);
		this.caste = caste;
		this.dowry = dowry;
		this.familyDetails = familyDetails;
		this.kundali = kundali;
	}


	@Override
	public String toString() {
		return "ArrangedMarriage [caste=" + caste + ", dowry=" + dowry + ", familyDetails=" + familyDetails
				+ ", kundali=" + kundali + "]";
	}

}
