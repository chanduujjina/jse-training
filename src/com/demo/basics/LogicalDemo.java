package com.demo.basics;

public class LogicalDemo {

	public static void main(String[] args) {
		
		int inputNumber = 1578;
		
		
		verifyNumberIsOddOrEven(inputNumber);
		validateandGetPrimeNumber(inputNumber);
		reverseNumber(inputNumber);
		//reverse a number 
		
		//verfy whether the  given number is palindrome(11-11)
		//print a right angle traingle using *
		

	}

	private static void verifyNumberIsOddOrEven(int inputNumber) {
		
		if(inputNumber%2==0) {
			System.out.println("given number :"+inputNumber +" is a even number");
		}
		else {
			System.out.println("given number :"+inputNumber +" is a odd number");
		}
		
	}
        private static void reverseNumber(int inputNumber) {
        int reverse = 0;
        while (inputNumber!= 0) {
        	int digit = inputNumber%10;
        	
        reverse = reverse*10+digit;
        inputNumber=inputNumber/10;
       
        }
        System.out.println("The reverse is " +reverse);
        }
        	
        
	    private static void validateandGetPrimeNumber(int inputNumber) {
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
