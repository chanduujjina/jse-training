package com.demo.oops;

public class Parent1 {
	
	public String globalVal = "test";
	
	// instance varibles
    private String name;
	
	private String assetDetails;
	

	//parametorized constructor
	public Parent1(String name, String assetDetails) {
	   this.name = name;
		this.assetDetails = assetDetails;
	}
	
	
	//getter methods
	public String getName() {
		return name;
	}

	public String getAssetDetails() {
		return assetDetails;
	}


	
	
	public String getParentDetails() {
		return "name "+name+","+"assetDetails "+assetDetails;
	}

}
