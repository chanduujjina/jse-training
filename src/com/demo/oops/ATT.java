package com.demo.oops;


	public class ATT extends Carrier {
		
		
		private String attCrrierCenter;
		private String attNetworkInfo;
		public ATT(String carrierName, String carrierId, String planType, String planDetails, String attCrrierCenter,
				String attNetworkInfo) {
			super(carrierName, carrierId, planType, planDetails);
			this.attCrrierCenter = attCrrierCenter;
			this.attNetworkInfo = attNetworkInfo;
		}
		@Override
		public String toString() {
			return "ATT [attCrrierCenter=" + attCrrierCenter + ", attNetworkInfo=" + attNetworkInfo + "]";
		}
		


}
