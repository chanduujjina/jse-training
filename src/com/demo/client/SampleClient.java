package com.demo.client;

import com.demo.Sample;

public class SampleClient {

	public static void main(String[] args) {
		// to access that class first we need to create an object

		Sample s1 = new Sample(1, "blood", "HemoCnter", "test", "pathology", "general", "positive");
		Sample s2 = new Sample(2, "blood", "HemoCnter", "test", "pathology", "general", "negative");
		Sample s3 = new Sample(3, "chemo", "CancerCnter", "test1", "pathology");
		Sample s4 = new Sample(4, "chemo", "CancerCnter", "test1", "Cancer");
		Sample s5 = new Sample(5, "chemo", "CancerCnter", "test1", "Mr");

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

		unrefenceObject(s1);
		System.out.println(s1.getSampleID());
		
		mutateObjectData(s1,"positive");
		System.out.println(s1);
		
		//postive case
		Sample positivesample =getCovidPositiveReport(s1);
		System.out.println(positivesample);
		
		//negative case
		Sample negativesample =getCovidPositiveReport(s2);
		System.out.println(negativesample);
		
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
	
	/**
	 * @param sample
	 * @param covidReport
	 * 
	 * Purpose of this method is to mutate object data with proxy reference
	 */
	public static void mutateObjectData(Sample sample,String covidReport) {
		if(sample.getCovidTest().equals("positive")) {
			sample.setLabName("test1");
		}
		
	}	
		/**
		 * @param sample
		 * @return
		 * purpose of this method is to filter covid positive samples
		 */
		public static Sample getCovidPositiveReport(Sample sample) {
			if(sample.getCovidTest().equals("positive")) {
				return sample;
			}
			return null;
		}
		
	

}
