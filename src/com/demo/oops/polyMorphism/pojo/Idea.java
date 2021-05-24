package com.demo.oops.polyMorphism.pojo;

public class Idea extends Network{

	public Idea(int networkId, String networkName) {
		super(networkId, networkName);
		
	}
	
	@Override
	public String getNetowrkOffer() {
		return "2 gb data unlimited calls";
	}

}
