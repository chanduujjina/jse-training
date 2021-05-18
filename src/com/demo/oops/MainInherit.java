package com.demo.oops;

public class MainInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 ATT att = new ATT("a&t","1234","basic","ag123gg3","Naperville","Local");
	      Verison verison = new Verison("verison","4567","basic","hfh8990","Bolingbrook","Local");
	Carrier carrier = new Carrier(att,verison);	
	
	System.out.println(carrier);

	}
	

	}


