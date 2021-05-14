package com.demo.oops;



public class Organization {
	
    @Override
	public String toString() {
		return "Organization [organizationName=" + organizationName + ", perEmployee=" + perEmployee
				+ ", contractEmployee=" + contractEmployee + "]";
	}


	private String organizationName;
	
	private PermanentEmployee  perEmployee;
	
	private ContractEmployee contractEmployee;

	
	public Organization(String organizationName, PermanentEmployee perEmployee, ContractEmployee contractEmployee) {
		super();
		this.organizationName = organizationName;
		this.perEmployee = perEmployee;
		this.contractEmployee = contractEmployee;
	}

	
}
