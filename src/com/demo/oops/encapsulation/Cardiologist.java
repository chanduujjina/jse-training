package com.demo.oops.encapsulation;

public class Cardiologist  extends PrimaryPhysican{


	private String patientId;
	
	private String patientName;
	
	private String cardiocDignosisCode;
	
	public Cardiologist() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Cardiologist(String patientId, String patientName, String cardiocDignosisCode) {
		super();
		this.patientId = patientId;
		this.patientName = patientName;
		this.cardiocDignosisCode = cardiocDignosisCode;
	}
	
	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public void setCardiocDignosisCode(String cardiocDignosisCode) {
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
		
		return "patientId :"+patientId+","+"patientName:"+patientName+","+"cardiocDignosisCode:"+cardiocDignosisCode;
		
	}

}
