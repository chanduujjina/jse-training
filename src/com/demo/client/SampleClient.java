package com.demo.client;

import com.demo.Sample;

public class SampleClient {

	public static void main(String[] args) {
		// to access that class first we need to create an object

		Sample s1 = new Sample(1, "blood", "HemoCnter", "test", "pathology", "general", "positive");
		Sample s2 = new Sample(2, "chemo", "CancerCnter", "test1", "pathology");
		Sample s3 = new Sample(2, "chemo", "CancerCnter", "test1", "Cancer");
		Sample s4 = new Sample(2, "chemo", "CancerCnter", "test1", "Mr");

		System.out.println(s1);
		System.out.println(s2);

		// print hashcode of object 1

		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		System.out.println(s4.hashCode());

		// verify whether data in object is same or not needs to override hashcode and
		// equals method

		System.out.println(s3.equals(s4));

		//unrefenceObject(s1);
		//System.out.println(s1.getSampleID());
		
		mutateObjectData(s1);
		System.out.println(s1);

	}

	/**
	 * @param sample
	 * Purpose of this method to demonstrate pass by value.
	 * when sending an object as arguement to the method it will share proxy refrence instead of original refrence
	 * if someone unrfrence the the object reference it will no more associated with object.But don't have any effect for original reference
	 */
	public static void unrefenceObject(Sample sample) {
		sample = null;
	}
	
	public static void mutateObjectData(Sample sample) {
		sample.setSampleName("HemoCnter1");
	}

}
