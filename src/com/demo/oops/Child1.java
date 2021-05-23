package com.demo.oops;

public class Child1 extends Parent1{
	//instance varibles
     private String childName;
	
	private String relationWithParent;
  // parametorized constrctor
	public Child1(String name, String assetDetails, String childName, String relationWithParent) {
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
	
	
	
	
	
	
	
	
	
	
	

}
