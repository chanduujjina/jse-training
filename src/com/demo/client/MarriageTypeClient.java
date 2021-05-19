package com.demo.client;

import com.demo.oops.ArrangedMarriage;
import com.demo.oops.LoveMarriage;
import com.demo.oops.MarriageType;

public class MarriageTypeClient {

	public static void main(String[] args) {
	//create Marriage Type object
		
		LoveMarriage lovemarriage = new  LoveMarriage("priya", 28, "b.com", "IT", "college", "boy friend", 7 );
				
	     ArrangedMarriage arrangedmarriage= new ArrangedMarriage("Akshara",28,"b.tech","it","goud",10000,"bussiness",32);
	     
	     MarriageType marriageType = new MarriageType(lovemarriage, arrangedmarriage);
	     System.out.println(marriageType);
					
	}

}
