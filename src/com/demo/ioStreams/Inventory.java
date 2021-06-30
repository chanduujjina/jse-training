package com.demo.ioStreams;

import java.io.Serializable;

public class Inventory implements Serializable{
	
	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int inventoryId;
	
	private String inventoryName;
	
	private String location;
	
	public Inventory(int inventoryId, String inventoryName, String location) {
		super();
		this.inventoryId = inventoryId;
		this.inventoryName = inventoryName;
		this.location = location;
	}
	
	
	
	

}
