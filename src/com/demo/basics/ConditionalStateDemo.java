package com.demo.basics;

public class  ConditionalStateDemo {

	public static void main(String[] args) {
		String communicationType = getCommunicationType(2)  ;
		System.out.println(communicationType);
		String communicationType1 = getCommunicationType_v1(1)  ;
		System.out.println(communicationType1);
		String communicationType2 = getCommunicationType_v2(1)  ;
		System.out.println(communicationType2);


	}
	
	private static String getCommunicationType(int code) {
		if(code == 1) {
			return  "message";
		}
		else if(code ==2) {
			return "phone call";
		}
		else if(code==3) {
			return "email";
		}
		else if(code ==4) {
			return "letter";
		}
		return "no communication";
	}
	
	
	private static String getCommunicationType_v1(int code) {
		switch (code) {
		case 1:
			return  "message";
			
		case 2:
			return  "phone call";
			
		case 3:
			return "email";
			
			
		case 4:
			return "letter";

		default:
			return null ;
		}
	
	}
	private static String getCommunicationType_v2(int code) {
		String communicationType = null;
		switch (code) {
		case 1:
			communicationType="message";
		  	break;
	    case 2:
	        communicationType=  "phone call";
	        break;
			
		case 3:
			 communicationType = "email";
			break;
			
		case 4:
			 communicationType = "letter";

		default:
			communicationType = null ;
		}
		
		return communicationType;
	
	}
}
