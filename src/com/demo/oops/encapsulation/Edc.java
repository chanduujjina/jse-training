package com.demo.oops.encapsulation;

public class Edc extends Bhojreddy{
	private string subject;
	private string faculty;
	private int result;
	public string getSubject() {
		return subject;
	}
	public void setSubject(string subject) {
		this.subject = subject;
	}
	public string getFaculty() {
		return faculty;
	}
	public void setFaculty(string faculty) {
		this.faculty = faculty;
	}
	public int getResult() {
		return result;
	}
	public void setResult(int result) {
		this.result = result;
	}
	public Edc(string subject, string faculty, int result) {
		super();
		this.subject = subject;
		this.faculty = faculty;
		this.result = result;
	}
	

}
