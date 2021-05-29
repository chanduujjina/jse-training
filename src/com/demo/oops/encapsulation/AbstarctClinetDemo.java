package com.demo.oops.encapsulation;

public class AbstarctClinetDemo {

	public static void main(String[] args) {
	
		PrimaryPhysican physican = new Cardiologist("CARD0011", "test", "CARDI1001");
		System.out.println(physican.getDignosisDetails());
		
		PrimaryPhysican physican1 = new Endocrinologist("ENDR001","test","ENDRCRO001");
		System.out.println(physican1.getDignosisDetails());
	}

}
