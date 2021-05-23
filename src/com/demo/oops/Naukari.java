package com.demo.oops;

public class Naukari {
	
	private int userId;
	private String userName;
	
	private String profileName;
	
	public Naukari(int userId, String userName, String profileName) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.profileName = profileName;
	}

	@Override
	public String toString() {
		return "Naukari [userId=" + userId + ", userName=" + userName + ", profileName=" + profileName + "]";
	}

	
}
