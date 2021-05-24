package com.demo.client;

import com.demo.oops.polyMorphism.pojo.ArithematicOpeartions;

public class CompileTimePolyDemo {

	public static void main(String[] args) {
		ArithematicOpeartions arithematicOpeartions  = new ArithematicOpeartions();
		
		int result1 = arithematicOpeartions.add(12, 11);
		
		int result2 = arithematicOpeartions.add(12, 11,13);
		
		double result3 =arithematicOpeartions.add(12d, 11d);
		
		String result4= arithematicOpeartions.add("test", "test1");

	}
	
	

}
