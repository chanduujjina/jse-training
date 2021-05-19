package com.demo.oops;



public class MarriageType {
	
	
     public MarriageType(LoveMarriage lovemarriage, ArrangedMarriage arrangedmarriage) {
		super();
		this.lovemarriage = lovemarriage;
		this.arrangedmarriage = arrangedmarriage;
	}

	private LoveMarriage lovemarriage;
		
	private  ArrangedMarriage arrangedmarriage;

	@Override
	public String toString() {
		return "MarriageType [lovemarriage=" + lovemarriage + ", arrangedmarriage=" + arrangedmarriage + "]";
	}

}

	

	
     
     
