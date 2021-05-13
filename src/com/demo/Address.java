package com.demo;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Address {
	
	private String district;
	
	private String cityName;
	
	private String StreetName;
	
	private String houseNo;

}
