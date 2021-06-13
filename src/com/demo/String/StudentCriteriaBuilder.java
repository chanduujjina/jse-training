package com.demo.String;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
class StudentCriteriaBuilder {
	private int studentID;
	private String studentName;
	private String gender;
	private String semester;
	private String branch;
	private int fee;

}
