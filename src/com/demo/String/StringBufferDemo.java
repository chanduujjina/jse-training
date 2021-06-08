package com.demo.String;

public class StringBufferDemo {
	public static void main(String[] args) {
		//scenario 1
		EmployeeCriteria criteria = 	null;
		
		CustomQueryBuilder queryBuilder = new CustomQueryBuilder();
		//String sql =queryBuilder.getQuery(criteria);
		//System.out.println(sql);
		
		//scenario 2
		
		/*EmployeeCriteria criteria1 =  EmployeeCriteria.builder().id(1).build();
		String wherecaluse1 = queryBuilder.getQuery(criteria1);
		System.out.println(wherecaluse1);*/
		
		EmployeeCriteria criteria2 =  EmployeeCriteria.builder().name("test").gender("female").build();
		String wherecaluse2 = queryBuilder.getQuery(criteria2);
		System.out.println(wherecaluse2);
	}

}
