package com.demo.oops;

public class NaukariCategory {
	
    private PremiumUser premiumUser;
	private NonPremiumUser nonpremiumUser;

	public NaukariCategory(PremiumUser premiumUser, NonPremiumUser nonpremiumUser) {
		super();
		this.premiumUser = premiumUser;
		this.nonpremiumUser = nonpremiumUser;
	}
	@Override
	public String toString() {
		return "NaukariCategory [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
}


