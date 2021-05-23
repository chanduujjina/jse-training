package com.demo.client;

import com.demo.oops.Child1;
import com.demo.oops.Child2;
import com.demo.oops.Parent1;

public class InheritanceTest2 {
	static Parent1 parent1 = null;
	

	public static void main(String[] args) {
		
		
		
		//create child1 object
		
		Child1 child1 = new Child1("parent1", "2 bhk flat ,10 k amount,car", "child", "Son");
		System.out.println(child1.getParentDetails());
		System.out.println(child1.getChildInfo());
		
		//with super class refrence you can hold subclass object
		
		 parent1 = new Child1("parent1", "2 bhk flat ,10 k amount,car", "child", "Son") ;
		System.out.println(parent1.getParentDetails());
		
		 parent1 = new Child2("parent1", "2 bhk flat ,10 k amount,car", "child", "daughter") ;
		 System.out.println(parent1.getParentDetails());
		
		

	}

}
