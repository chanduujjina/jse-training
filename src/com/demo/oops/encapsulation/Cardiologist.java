package com.demo.oops.encapsulation;

public class Cardiologist  extends PrimaryPhysican{

	private String patientId;
	
	private String patientName;
	
	private String cardiocDignosisCode;
	
	public Cardiologist(String patientId, String patientName, String cardiocDignosisCode) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.cardiocDignosisCode = cardiocDignosisCode;
	}

	public String getPatientId() {
		return patientId;
	}

	public String getPatientName() {
		return patientName;
	}

	public String getCardiocDignosisCode() {
		return cardiocDignosisCode;
	}
	 
	@Override
	public String getDignosisDetails() {
		
		return cardiocDignosisCode;
	}

}
