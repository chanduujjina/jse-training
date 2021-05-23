package com.demo.client;

import com.demo.oops.Child1;
import com.demo.oops.Parent1;

public class InheritanceTest1 {
	
	public static void main(String[] args) {
		
		
		Child1 child = new Child1("parent1", "2 bhk flat ,10 k amount,car", "child", "Son");
		
		
		// child can inherit parent varibles
		System.out.println(child.globalVal);
		
		//child can inherit parent  methods
		String parentDetails = child.getParentDetails();
		System.out.println("parentDetails::"+parentDetails);
		
		String cildInfo = child.getChildInfo();
		
		System.out.println("cildInfo::"+cildInfo);
		
		
		Parent1 parent = new Parent1("parent1", "2 bhk flat ,10 k amount,car");
		//parent cannot inherit child data if you attempt same it gives compilation error
		//parent.getChildInfo();
	}

}
