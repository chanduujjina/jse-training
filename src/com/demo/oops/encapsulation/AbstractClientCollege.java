package com.demo.oops.encapsulation;

public class AbstractClientCollege {
 public static void main(String[] args) {
	College  clg = new ECE(4, "electronic and communication engineering", 2);
	String branchDetails = clg.getBranchDetials();
	System.out.println(branchDetails);
}
}
