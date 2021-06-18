package com.demo.String;

public class AdministrationQueryBuilder {
public  String getQuery(StudentCriteriaBuilder studentCriteria) {
		
		StringBuffer buffer = new StringBuffer();
		buffer.append("select * from student ");
		System.out.println(buffer.toString());
         
		if(studentCriteria!= null) {
	    buffer.append("where ");
	    System.out.println(buffer.toString());
     }
       else {
	   return buffer.toString();
       }
	   int count =0;
		if(studentCriteria.getStudentID()>0) {
			buffer.append("  Sid= "+studentCriteria.getStudentID());
			//System.out.println(buffer.toString());
			count++;
			
		}

if(studentCriteria.getStudentName()!=null) {
	if(count>0) {
		buffer.append(" and");
	}
	buffer.append("name ="+studentCriteria.getStudentName());
	System.out.println(buffer.toString());
	count++;
	
}


if (studentCriteria.getGender()!=null) {
	if(count>0) {
		buffer.append(" and ");
		System.out.println(buffer.toString());
	}
	buffer.append("gender ="+studentCriteria.getGender());
}



if(studentCriteria.getSemester()!=null) {
	if(count>0) {
		buffer.append(" and ");
		System.out.println(buffer.toString());
	}
	buffer.append("semester ="+studentCriteria.getSemester());
}

return buffer.toString();
}
}


