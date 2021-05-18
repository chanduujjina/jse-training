package com.demo.oops;

public class NonPremiumUser extends Naukari {


private String accountUpgrade;
private String dueDate;

public NonPremiumUser(String accountUpgrade, String dueDate) {
	super();
	this.accountUpgrade = accountUpgrade;
	this.dueDate = dueDate;
}
@Override
public String toString() {
	return "NonPremiumUser [accountUpgrade=" + accountUpgrade + ", dueDate=" + dueDate + ", getClass()="
			+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
}}