package com.demo.String;

public class CustomQueryBuilder {
	
	public String getQuery(EmployeeCriteria employeeCriteria) {
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("select * from employee ");
		System.out.println(buffer.toString());
		
		if(employeeCriteria!= null) {
			buffer.append("where ");
			System.out.println(buffer.toString());
		}
		else {
			return buffer.toString();
		}
		int count =0;
		if(employeeCriteria.getId()>0) {
			buffer.append("id="+employeeCriteria.getId());
			System.out.println(buffer.toString());
			count++;
			
		}
		
		//select * from employee where id =1 and name ="test"
		
		if(employeeCriteria.getName()!=null) {
			if(count>0) {
				buffer.append(" and ");
			}
			buffer.append("name="+employeeCriteria.getName());
			System.out.println(buffer.toString());
			count++;
			
		}
		
		if (employeeCriteria.getGender()!=null) {
			if(count>0) {
				buffer.append(" and ");
				System.out.println(buffer.toString());
			}
			buffer.append("gender="+employeeCriteria.getGender());
			
			
		}
		
		if(employeeCriteria.getDeptName()!=null) {
			if(count>0) {
				buffer.append(" and ");
				System.out.println(buffer.toString());
			}
			buffer.append("deptName="+employeeCriteria.getDeptName());
		}
		
		return buffer.toString();
	}

}
