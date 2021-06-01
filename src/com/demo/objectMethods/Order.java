package com.demo.objectMethods;

import java.io.Serializable;

public class Order implements Serializable {
	


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int orderId;
	
	private String productName;
	
	private String productDescrption;
	
	
	
	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescrption() {
		return productDescrption;
	}

	public void setProductDescrption(String productDescrption) {
		this.productDescrption = productDescrption;
	}
	
	
	
	

}
