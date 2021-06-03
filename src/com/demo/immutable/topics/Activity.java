package com.demo.immutable.topics;

public final class Activity {
	
	public final int activityId =1;
	
	
	
	public static void main(String[] args) {
		Activity activity = new Activity();
		//activity.activityId =2;
		
		
	}
	
	public final int getActivityId() {
		return activityId;
	}

}
