package com.demo.oops.polyMorphism.pojo;

public class Network {


	private int networkId;
	
	private String networkName;
	
	
	

	public Network(int networkId, String networkName) {
		super();
		this.networkId = networkId;
		this.networkName = networkName;
	}
	
	public int getNetworkId() {
		return networkId;
	}

	public String getNetworkName() {
		return networkName;
	}
	
	public String getNetowrkOffer() {
		return "1 gb data unlimited calls";
	}
	
	
	

}
