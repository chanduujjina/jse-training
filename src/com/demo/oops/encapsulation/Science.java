package com.demo.oops.encapsulation;

public class Science extends School{
   
	 @Override
	public String toString() {
		return "Science [subjectid=" + subjectid + ", teachername=" + teachername + ", noofsections=" + noofsections
				+ "]";
	}

	public Science(int subjectid, String teachername, int noofsections) {
		super();
		this.subjectid = subjectid;
		this.teachername = teachername;
		this.noofsections = noofsections;
	}

	 private int subjectid ;
	 
	 private String teachername;
	 
	 private int noofsections ;

	@Override
	String getSubjectDetails() {
		// TODO Auto-generated method stub
		return " It has boilogy, physics, chemistry";
	}
	   
}
