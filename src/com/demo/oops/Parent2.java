package com.demo.oops;

public class Parent2 {
	


	// instance varibles
    private String name;
	
	private String assetDetails;
	
	public Parent2(String name, String assetDetails) {
		super();
		this.name = name;
		this.assetDetails = assetDetails;
	}
	

	public String getName() {
		return name;
	}

	public String getAssetDetails() {
		return assetDetails;
	}
	
	/**
	 * @return
	 * purpose of this method is to get name  and asset details of parent
	 */
	public String getParentDetails() {
		return "name "+name+","+"assetDetails "+assetDetails;
	}
}
