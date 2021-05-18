package com.demo.oops;

public class BaseNetworkInfo {
@Override
	public String toString() {
		return "BaseNetworkInfo [carrierName=" + carrierName + ", carrierId=" + carrierId + ", planType=" + planType
				+ ", planDetails=" + planDetails + "]";
	}

public BaseNetworkInfo(String carrierName, String carrierId, String planType, String planDetails) {
		super();
		this.carrierName = carrierName;
		this.carrierId = carrierId;
		this.planType = planType;
		this.planDetails = planDetails;
	}

private String carrierName;
	
	private String carrierId;

	private String planType;

	private String planDetails;

}
