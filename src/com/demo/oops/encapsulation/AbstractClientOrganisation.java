package com.demo.oops.encapsulation;

public class AbstractClientOrganisation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  Organisation org = new IT("SalesForce","DES345","CD234");
  System.out.println(org.getTeamDetails());
  Organisation org1 = new Admin("NASA","Kevin",1006);
  System.out.println(org1.getTeamDetails());
  
	}

}
