package com.demo.oops.encapsulation;

public class Maths extends School{
	
	@Override
	public String toString() {
		return "Maths [subjectid=" + subjectid + ", teachername=" + teachername + ", noofsections=" + noofsections
				+ "]";
	}

	public Maths(int subjectid, String teachername, int noofsections) {
		super();
		this.subjectid = subjectid;
		this.teachername = teachername;
		this.noofsections = noofsections;
	}

	private int subjectid ;
	 
	 private String teachername;
	 
	 private int noofsections ;

	@Override
	public String getSubjectDetails() {
		
		return " It has algebra, geometry" ;
	}
	   
}
