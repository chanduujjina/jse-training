package com.demo.ioStreams;

import java.io.Serializable;

import lombok.Data;

@Data

public class Activity implements Serializable{
	
	public Activity(int activityId, String activityName, String actor) {
		super();
		this.activityId = activityId;
		this.activityName = activityName;
		this.actor = actor;
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int activityId;
	
	private String activityName;
	
	
	private String actor;

}
