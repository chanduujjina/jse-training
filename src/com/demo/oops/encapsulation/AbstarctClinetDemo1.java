package com.demo.oops.encapsulation;

public class AbstarctClinetDemo1 {

	public static void main(String[] args) {
	
		SpecilizationFactory specilizationFactory = new SpecilizationFactory();
		PrimaryPhysican primaryPhysican=	specilizationFactory.getPhysiacn("endocrinologist");
		System.out.println(primaryPhysican.getDignosisDetails());
		
		PrimaryPhysican primaryPhysican1=	specilizationFactory.getPhysiacn("cardiologist");
		System.out.println(primaryPhysican1.getDignosisDetails());
	}

}
