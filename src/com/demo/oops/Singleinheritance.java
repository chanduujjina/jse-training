package com.demo.oops;
class Parent{
	void car() {
		System.out.println("Jaguar");
	}
	
}
 class Child extends Parent{
	 void bike() {
		 System.out.println("duke");
	 }
 }
public class Singleinheritance {
	public static void main(String[] args) {
		Child c = new Child();
		c.car();
		c.bike();
		
	}

}
