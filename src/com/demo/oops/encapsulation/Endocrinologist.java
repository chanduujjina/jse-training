package com.demo.oops.encapsulation;

public class Endocrinologist extends PrimaryPhysican{



private String patientId;
	
private String patientName;

private String dignosisCode;



public Endocrinologist() {
	
}

public Endocrinologist(String patientId, String patientName, String dignosisCode) {
	super();
	this.patientId = patientId;
	this.patientName = patientName;
	this.dignosisCode = dignosisCode;
}



public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public void setDignosisCode(String dignosisCode) {
		this.dignosisCode = dignosisCode;
	}

public String getPatientId() {
	return patientId;
}

public String getPatientName() {
	return patientName;
}

public String getDignosisCode() {
	return dignosisCode;
}

@Override
public String getDignosisDetails() {
		
		 return "patientId :"+patientId+","+"patientName:"+patientName+","+"dignosisCode:"+dignosisCode;
	}

}
