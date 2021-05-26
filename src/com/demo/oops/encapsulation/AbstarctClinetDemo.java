package com.demo.oops.encapsulation;

public class AbstarctClinetDemo {

	public static void main(String[] args) {
	
		//PrimaryPhysican physican = new Cardiologist("CARD0011", "test", "CARDI1001");
		
		PrimaryPhysican physican = new Endocrinologist("ENDR001","test","ENDRCRO001");
		System.out.println(physican.getDignosisDetails());
	}

}
