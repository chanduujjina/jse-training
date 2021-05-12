package com.demo.basics;

public class MethodDemo {
	
	public static void main(String[] args) {
		// iam calucalting sum
		// average
		
		int i=10;
		int j=20;
		int quantity =2;
		
		int addresult = addValues(i,j);
		
		int avreageResult = addresult/quantity;
		System.out.println("avreageResult::"+avreageResult);
	}
	
	

private  static int addValues(int i,int j) {
	return i+j;
}

}




