package com.demo;

public class Inventory implements Comparable<Inventory>{
	
	public int getId() {
		return id;
	}

	public String getInvetoryNmae() {
		return invetoryNmae;
	}

	public String getIntoryType() {
		return intoryType;
	}

	@Override
	public String toString() {
		return "Inventory [id=" + id + ", invetoryNmae=" + invetoryNmae + ", intoryType=" + intoryType + "]";
	}

	public Inventory(int id, String invetoryNmae, String intoryType) {
		super();
		this.id = id;
		this.invetoryNmae = invetoryNmae;
		this.intoryType = intoryType;
	}

	private int id;
	
	private String invetoryNmae;
	
	private String intoryType;

	@Override
	public int compareTo(Inventory obj) {
		
		return this.getInvetoryNmae().compareToIgnoreCase(obj.getInvetoryNmae());
	}

	

	

}
