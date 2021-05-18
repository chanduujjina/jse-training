package com.demo.oops;

public class PremiumUser extends Naukari {
	
	public PremiumUser(String dueDate, String accountFeatures) {
		super();
		this.dueDate = dueDate;
		this.accountFeatures = accountFeatures;
	}
	@Override
	public String toString() {
		return "PremiumUser [dueDate=" + dueDate + ", accountFeatures=" + accountFeatures + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	private String dueDate;
	private String accountFeatures;
	
	

}
