package com.demo;

public class Sample {

	

	

	public void setSampleID(int sampleID) {
		this.sampleID = sampleID;
	}

	public void setSampleName(String sampleName) {
		this.sampleName = sampleName;
	}

	public void setLabName(String labName) {
		this.labName = labName;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public void setAdmissionType(String admissionType) {
		this.admissionType = admissionType;
	}

	public void setCovidTest(String covidTest) {
		this.covidTest = covidTest;
	}

	private int sampleID;

	private String sampleName;

	private String labName;
	private String address;
	private String deptName;
	private String admissionType;
	private String covidTest;
	
	public Sample(int sampleID, String sampleName, String labName, String address,String deptName,String admissionType,String covidTest) {
		super();//ask
		this.sampleID = sampleID;
		this.sampleName = sampleName;
		this.labName = labName;
		this.address = address;
		this.deptName = deptName;
		this.admissionType = admissionType;
		this.covidTest= covidTest;
	}
	
	public Sample(int sampleID, String sampleName, String labName ,String address,String deptName) {
		super();
		this.sampleID = sampleID;
		this.sampleName = sampleName;
		this.labName = labName;
		this.address = address;
		this.deptName = deptName;
	}
	
	
	public Sample(int sampleID, String sampleName, String labName, String address) {
		super();
		this.sampleID = sampleID;
		this.sampleName = sampleName;
		this.labName = labName;
		this.address = address;
	
}
	
	public int getSampleID() {
		return sampleID;
	}

	public String getSampleName() {
		return sampleName;
	}

	public String getLabName() {
		return labName;
	}

	public String getAddress() {
		return address;
	}

	public String getDeptName() {
		return deptName;
	}

	public String getAdmissionType() {
		return admissionType;
	}

	public String getCovidTest() {
		return covidTest;
	}
	@Override
	public String toString() {
		return "Sample [sampleID=" + sampleID + ", sampleName=" + sampleName + ", labName=" + labName + ", address="
				+ address + ", deptName=" + deptName + ", admissionType=" + admissionType + ", covidTest=" + covidTest
				+ "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + ((admissionType == null) ? 0 : admissionType.hashCode());
		result = prime * result + ((deptName == null) ? 0 : deptName.hashCode());
		result = prime * result + ((labName == null) ? 0 : labName.hashCode());
		result = prime * result + sampleID;
		result = prime * result + ((sampleName == null) ? 0 : sampleName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Sample other = (Sample) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (admissionType == null) {
			if (other.admissionType != null)
				return false;
		} else if (!admissionType.equals(other.admissionType))
			return false;
		if (deptName == null) {
			if (other.deptName != null)
				return false;
		} else if (!deptName.equals(other.deptName))
			return false;
		if (labName == null) {
			if (other.labName != null)
				return false;
		} else if (!labName.equals(other.labName))
			return false;
		if (sampleID != other.sampleID)
			return false;
		if (sampleName == null) {
			if (other.sampleName != null)
				return false;
		} else if (!sampleName.equals(other.sampleName))
			return false;
		return true;
	}
	
	
	
	
	
	

}
