package com.demo.oops;

public class PremiumUser extends Naukari {
	
	@Override
	public String toString() {
		return "PremiumUser [dueDate=" + dueDate + ", accountFeatures=" + accountFeatures + "]";
	}
	private String dueDate;
	private String accountFeatures;
	public PremiumUser(int userId, String userName, String profileName, String dueDate, String accountFeatures) {
		super(userId, userName, profileName);
		this.dueDate = dueDate;
		this.accountFeatures = accountFeatures;
	}

	
	
	
	
	
	

}
