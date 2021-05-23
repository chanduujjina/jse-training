package com.demo.oops;

public class PremiumUser extends Naukari {
	
	
	private String dueDate;
	private String accountFeatures;
	public PremiumUser(int userId, String userName, String profileName, String dueDate, String accountFeatures) {
		super(userId, userName, profileName);
		this.dueDate = dueDate;
		this.accountFeatures = accountFeatures;
	}
	@Override
	public String toString() {
		return "PremiumUser [dueDate=" + dueDate + ", accountFeatures=" + accountFeatures + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}

	
	
	
	
	
	

}
