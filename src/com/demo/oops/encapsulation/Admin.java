package com.demo.oops.encapsulation;

public class Admin extends Organisation {
	
	
	private String adminBranch;
	private String adminAssistant;
	private int fee;
	public Admin(String adminBranch, String adminAssistant, int fee) {
		super();
		this.adminBranch = adminBranch;
		this.adminAssistant = adminAssistant;
		this.fee = fee;
	}
	public String getAdminBranch() {
		return adminBranch;
	}
	public String getAdminAssistant() {
		return adminAssistant;
	}
	public int getFee() {
		return fee;
	}
	
	@Override
	public String getTeamDetails() {
		return "adminBranch"+adminBranch+",adminAssistant"+adminAssistant+",fee"+fee;
	}
 }
	
	
	
	
	
	
	
	
	


