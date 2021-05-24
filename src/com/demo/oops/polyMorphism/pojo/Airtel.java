package com.demo.oops.polyMorphism.pojo;

public class Airtel extends Network{

	public Airtel(int networkId, String networkName) {
		super(networkId, networkName);
		
	}
	
	
	@Override
	public String getNetowrkOffer() {
		return "3 gb data unlimited calls";
	}

}
