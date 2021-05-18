package com.demo.oops;

public class Carrier {

@Override
	public String toString() {
		return "Carrier [att=" + att + ", verison=" + verison + "]";
	}
public Carrier(ATT att, Verison verison) {
		super();
		this.att = att;
		this.verison = verison;
	}
private ATT att;
private Verison verison;

	

}

