package com.demo.oops;

	public class Verison extends Carrier {
		
		
		private String verizonCrrierCenter;
		
		private String verizonNetworkInfo;
		
		public Verison(String carrierName, String carrierId, String planType, String planDetails,
				String verizonCrrierCenter, String verizonNetworkInfo) {
			super(carrierName, carrierId, planType, planDetails);
			this.verizonCrrierCenter = verizonCrrierCenter;
			this.verizonNetworkInfo = verizonNetworkInfo;
		}
		@Override
		public String toString() {
			return "Verison [verizonCrrierCenter=" + verizonCrrierCenter + ", verizonNetworkInfo=" + verizonNetworkInfo
					+ "]";
		}

	}



