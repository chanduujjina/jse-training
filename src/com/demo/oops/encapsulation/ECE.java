package com.demo.oops.encapsulation;

public class ECE extends College{
	

	private int branchId;
	
	private String branchName;
	
	private int noOfSections;
	
	public ECE(int branchId, String branchName, int noOfSections) {
		super();
		this.branchId = branchId;
		this.branchName = branchName;
		this.noOfSections = noOfSections;
	}




	
	

	@Override
	public String getBranchDetials() {
		
		return "branchId=" + branchId + ", branchName=" + branchName + ", noOfSections=" + noOfSections;
	}

}
