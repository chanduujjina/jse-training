package com.demo.oops;

public class NonPremiumUser extends Naukari {





private String accountUpgrade;
private String dueDate;

public NonPremiumUser(int userId, String userName, String profileName, String accountUpgrade, String dueDate) {
	super(userId, userName, profileName);
	this.accountUpgrade = accountUpgrade;
	this.dueDate = dueDate;
}


@Override
public String toString() {
	return "NonPremiumUser [accountUpgrade=" + accountUpgrade + ", dueDate=" + dueDate + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}}