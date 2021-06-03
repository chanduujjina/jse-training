package com.demo.oops.encapsulation;

public class CSE extends  College{
    
	@Override
	public String toString() {
		return "CSE [branchId=" + branchId + ", branchName=" + branchName + ", noOfSections=" + noOfSections + "]";
	}


	private int branchId;
	
	private String branchName;
	
	private int noOfSections;
	
	 public CSE(int branchId, String branchName, int noOfSections) {
			super();
			this.branchId = branchId;
			this.branchName = branchName;
			this.noOfSections = noOfSections;
		}


	@Override
	String getBranchDetials() {
	
		 return "branchId=" + branchId + ", branchName=" + branchName + ", noOfSections=" + noOfSections;
	} 
}
