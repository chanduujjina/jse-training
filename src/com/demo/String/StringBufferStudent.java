package com.demo.String;

public class StringBufferStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StudentCriteriaBuilder criteria =null;
		AdministrationQueryBuilder queryBuilder=new AdministrationQueryBuilder();
		
		StudentCriteriaBuilder criteria1 =  StudentCriteriaBuilder.builder().studentID(1).build();
		String whereclause = queryBuilder.getQuery(criteria1);
		System.out.println(whereclause);
		StudentCriteriaBuilder criteria2 =  StudentCriteriaBuilder.builder().studentName("Anu").gender("female").build();
		String whereclause1 = queryBuilder.getQuery(criteria2);
		System.out.println(whereclause1);
		StudentCriteriaBuilder criteria3 =  StudentCriteriaBuilder.builder().studentName("Anu").gender("female").semester("third").build();
		String whereclause2 = queryBuilder.getQuery(criteria3);
		System.out.println(whereclause2);
		
	}

}
