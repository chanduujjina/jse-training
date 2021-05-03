package com.demo.basics;
import java.util.Scanner;
public class EvenOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);//used scanner for input 
		int a ;
		System.out.println("Enter the interger");
		a = input.nextInt();//created object
	if (a%2==0)
	{
		System.out.println("Number is Even");}
		else
		{
			System.out.println("Number is odd");
	}

	}

}
