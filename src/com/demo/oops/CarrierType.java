package com.demo.oops;

public class CarrierType {

	private String carrier1;
	private String carrier2;
	public CarrierType(String carrier1, String carrier2) {
		super();
		this.carrier1 = carrier1;
		this.carrier2 = carrier2;
	}
	
	@Override
	public String toString() {
		return "CarrierType [carrier1=" + carrier1 + ", carrier2=" + carrier2 + "]";
	}

}
