package com.demo.immutable.topics;

public final class Customer {
	

	private final int cusomerId;
	
	private final String customerName;
	
	private final String address;
	

	public Customer(int cusomerId, String customerName, String address) {
		super();
		this.cusomerId = cusomerId;
		this.customerName = customerName;
		this.address = address;
	}
	
	public int getCusomerId() {
		return cusomerId;
	}


	public String getCustomerName() {
		return customerName;
	}


	public String getAddress() {
		return address;
	}
	
	@Override
	public String toString() {
		return "Customer [cusomerId=" + cusomerId + ", customerName=" + customerName + ", address=" + address + "]";
	}
	

}
