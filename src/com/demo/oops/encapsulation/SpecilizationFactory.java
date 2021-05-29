package com.demo.oops.encapsulation;

public class SpecilizationFactory {
	
	public PrimaryPhysican getPhysiacn(String type) {
		if(type.equals("cardiologist")) {
			return  new Cardiologist("CARD0011", "test", "CARDI1001");
		}
		else if(type.equals("endocrinologist")) {
			return  new Endocrinologist("ENDR001","test","ENDRCRO001");
		}
		return  null;
	}

}
