package com.demo.oops;

public class Child2 extends Parent1{
	public String getChildName() {
		return childName;
	}

	public String getRelationWithParent() {
		return relationWithParent;
	}

	//instance varibles
    private String childName;
	
	private String relationWithParent;

	public Child2(String name, String assetDetails, String childName, String relationWithParent) {
		super(name, assetDetails);
		this.childName = childName;
		this.relationWithParent = relationWithParent;
	}
	
	
	public String getChildInfo() {
		return "childName "+childName+","+"relationWithParent"+relationWithParent;
	}
	
}
