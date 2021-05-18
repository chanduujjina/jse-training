package com.demo.oops;


import lombok.Builder;
import lombok.Data;

@Data

@Builder
public class BrideBaseInfo {
	

	private String brideName;
	
	private int age;
	
	private String education;
	
	private String occupation;
	
	


/*@Override
	public String toString() {
		return "BaseInfo [employeeId=" + employeeId + ", employeeName=" + employeeName + ", gender=" + gender
				+ ", address=" + address + "]";
	}


protected BaseInfo(int employeeId, String employeeName, String gender, String address) {
		
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.gender = gender;
		this.address =  address;
		
	}
	
	
	public int getEmployeeId() {
		return employeeId;
	}


	public String getEmployeeName() {
		return employeeName;
	}


	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	 public String getAddress() {
			return address;
		}

	*/

}
