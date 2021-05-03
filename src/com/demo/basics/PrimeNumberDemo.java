package com.demo.basics;

public class PrimeNumberDemo {

	public static void main(String[] args) {
		
		int inputNumber = 11;
		
		// 0,1,2
		int count=0;
		//i=1,2,3,4,5
		for(int i=1;i<=inputNumber;i++) {
			if(inputNumber%i==0) {
				//count++;
				count =count+1;
			}
		}
		
		if(count==2) {
			System.out.println("given number :"+inputNumber +" is a prime number");
		}
		else {
			System.out.println("given number :"+inputNumber +" is a not prime number");
		}

	}

}
