package com.demo.oops;

public class MainInheritance {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		PremiumUser premiumUser = new PremiumUser(34,"Anu","Anudhark","23-10-2012","Golden Package");
	   NonPremiumUser nonpremiumUser = new NonPremiumUser(23,"Aadee","Aadeedhar","After year","28-10-2016");
	   NaukariCategory naukariCategory = new NaukariCategory(premiumUser, nonpremiumUser);
	   System.out.println(naukariCategory);

}
}
