package com.demo.oops.encapsulation;

public class IT extends Organisation{
	private String departmentName;
	private String departmentId;
	private String departmentCode;


public IT(String departmentName, String departmentId, String departmentCode) {
		super();
		this.departmentName = departmentName;
		this.departmentId = departmentId;
		this.departmentCode = departmentCode;
}

public String getDepartmentName() {
	return departmentName;
}
public String getDepartmentId() {
	return departmentId;
}
public String getDepartmentCode() {
	return departmentCode;
}

  @Override
public String getTeamDetails() {
	return "departmentName:"+departmentName+",departmentId"+departmentId+",departmentCode"+departmentCode;
}
  }