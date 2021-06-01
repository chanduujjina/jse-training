package com.demo.oops.encapsulation;

public class InterfaceDemo1 {
	
	public static void main(String[] args) {
		ShapeFactory factory = new ShapeFactory();
		
		//Shape shape = new Rectangle()
	   Shape shape = factory.getShape("rectangle");
	  shape.draw();
	  
		//Shape shape = new Traigle()
	   Shape shape1 = factory.getShape("triangle");
	   shape1.draw();
		
		
	}

}
