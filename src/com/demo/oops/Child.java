package com.demo.oops;

public class Child extends Parent1{
	
     private String childName;
	
	private String relationWithParent;

	public Child(String name, String assetDetails, String childName, String relationWithParent) {
		super(name, assetDetails);
		this.childName = childName;
		this.relationWithParent = relationWithParent;
		
	}

	
	public String getChildName() {
		return childName;
	}


	public String getRelationWithParent() {
		return relationWithParent;
	}
	
	public String getChildInfo() {
		return "childName "+childName+","+"relationWithParent"+relationWithParent;
	}
	
	
	
	/**
	 * Purpose of this method is to call current class method
	 */
	public void callgetChildInfo() {
		getChildInfo();
	}
	
	/**
	 * Purpose of this method to call method in parent class
	 * 
	 */
	public void callgetParentDetails() {
		
		//method call
		getParentDetails();
	}
	
	
	
	
	
	
	

}
