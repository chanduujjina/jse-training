package com.demo.client;

import com.demo.oops.Child;
import com.demo.oops.Parent1;

public class InheritanceTest1 {
	
	public static void main(String[] args) {
		
		
		Child child = new Child("Parent", "2 bhk flat ,10 k amount,car", "child", "Son");
		
		System.out.println(child.globalVal);
		
		String parentDetails = child.getParentDetails();
		System.out.println("parentDetails::"+parentDetails);
		
		String cildInfo = child.getChildInfo();
		
		System.out.println("cildInfo::"+cildInfo);
		
		
		Parent1 parent = new Parent1("parent1", "2 bhk flat ,10 k amount,car");
		//parent cannot inherit child data
		//parent.getChildInfo();
	}

}
