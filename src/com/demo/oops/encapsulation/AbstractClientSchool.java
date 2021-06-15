package com.demo.oops.encapsulation;

public class AbstractClientSchool {
	public static void main(String[] args) {
    School school = new Maths(3, "suguna teacher", 2);
    String subjectDetails = school.getSubjectDetails();
    System.out.println(subjectDetails);
	}
}
