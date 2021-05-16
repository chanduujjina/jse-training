package com.demo.oops;

public class Carrier {

	private String carrierName;
	
	private String carrierId;

	private String planType;

	private String planDetails;

	public Carrier(String carrierName, String carrierId, String planType, String planDetails) {
		super();
		this.carrierName = carrierName;
		this.carrierId = carrierId;
		this.planType = planType;
		this.planDetails = planDetails;
	}
	@Override
	public String toString() {
		return "Carrier [carrierName=" + carrierName + ", carrierId=" + carrierId + ", planType=" + planType
				+ ", planDetails=" + planDetails + "]";
	}

	

}

