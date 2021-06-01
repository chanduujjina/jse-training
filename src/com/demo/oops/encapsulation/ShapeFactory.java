package com.demo.oops.encapsulation;

public class ShapeFactory {
	
	public Shape getShape(String type) {
		if(type.equals("rectangle")) {
			return new Rectangle();
		}
		else if(type.equals("triangle")) {
			return new Triangle();
		}
		
		return null;
	}

}
