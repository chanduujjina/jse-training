package com.demo.client;

import com.demo.Sample;

public class SampleClient {

	public static void main(String[] args) {
		// to access that class first we need to create  an object
		
		Sample  s1 = new  Sample(1, "blood", "HemoCnter", "test","pathology","general","positive");
		Sample  s2 = new  Sample(2, "chemo", "CancerCnter", "test1","pathology");
		Sample  s3 = new  Sample(2, "chemo", "CancerCnter", "test1","Cancer");
		Sample  s4 = new  Sample(2, "chemo", "CancerCnter", "test1","Mr");
		
		System.out.println(s1);
		System.out.println(s2);
		
		//print hashcode of object 1
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());
		
		
		//verify whether data in object is same or not needs to override hashcode and equals method
		
		System.out.println(s3.equals(s4));

	}

}
