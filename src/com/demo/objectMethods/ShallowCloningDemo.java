package com.demo.objectMethods;

public class ShallowCloningDemo {

	public static void main(String[] args) throws CloneNotSupportedException {

		Product product1 = new Product();
		product1.setProductId(1);
		product1.setProductName("T-Shirt");
		product1.setPrice(500);
		System.out.println("product1 data::" + product1);

		// shallow clone
		Product product2 = product1;

		System.out.println("product2 data::" + product2);
		product2.setPrice(600);

		System.out.println("product1 data after mutating from product2 refrence::" + product1);

		System.out.println("product2 data after mutating from product2 refrence::" + product2);

		Product product3 = new Product();
		product3.setProductId(3);
		product3.setProductName("Travel Bag");
		product3.setPrice(1500);

		// Deep cloning

		Product product4 = (Product) product3.clone();

		System.out.println("details of product4 ::" + product4);
		System.out.println("details of product3 ::" + product3);

		// mutating data using product4 refrence

		product4.setPrice(600);

		System.out.println("details of product4 after mutating with product4 rfrence::" + product4);
		System.out.println("details of product3 after mutating with product4 rfrence ::" + product3);

	}

}
