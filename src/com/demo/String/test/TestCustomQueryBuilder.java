package com.demo.String.test;

import org.junit.Test;

import com.demo.String.CustomQueryBuilder;
import com.demo.String.EmployeeCriteria;

import junit.framework.Assert;

public class TestCustomQueryBuilder {
	CustomQueryBuilder querybuider = new CustomQueryBuilder();
	
	@Test
	public void testGetQueryById() {
		String sql =querybuider.getQuery(EmployeeCriteria.builder().id(1).build());
		Assert.assertEquals("select * from employee where id=1", sql);
	}
	
	@Test
	public void testGetQueryByName() {
		String sql =querybuider.getQuery(EmployeeCriteria.builder().name("test").build());
		Assert.assertEquals("select * from employee where name=test", sql);
	}
	
	@Test
	public void testGetQueryByNameAndID() {
		String sql =querybuider.getQuery(EmployeeCriteria.builder().id(1).name("test").build());
		Assert.assertEquals("select * from employee where id =1 and name=test", sql);
	}
	
	@Test
	public void testGetQueryByNameAndIDAndGender() {
		String sql =querybuider.getQuery(EmployeeCriteria.builder().id(1).name("test").gender("female").build());
		System.out.println(sql);
		Assert.assertEquals("select * from employee where id=1 and name=test and gender=female", sql);
	}

}
