package com.demo.oops;

public class InheritanceDemo1 {

	public static void main(String[] args) {
		
		//create Object for thr Permanent Employee
		
		PermanentEmployee permanentEmployee = new PermanentEmployee(1, "test", "male", "it", "1-123,hyd", "12-APR-2021", "DSCF901");
		
		//create Object for ContractEmplloyee
		
		ContractEmployee contractEmployee = new ContractEmployee(2, "test1", "male", "it", "1-124,hyd", "IBM", "IBM");
		
		//create object for the Organization
		
		
		Organization organization = new Organization("Infosys", permanentEmployee, contractEmployee);
		
		System.out.println(organization);
	}

}
