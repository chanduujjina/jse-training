package com.demo.exceptionDemo.test;

import org.junit.Test;

import com.demo.exceptionDemo.RuntimeExceptionDemo;

import junit.framework.Assert;



public class TestRuntimeException {
	
	RuntimeExceptionDemo demo = new RuntimeExceptionDemo();
	
	@Test
	public void testGetValue() throws Exception {
		int result =demo.getValue(100, 10);
		Assert.assertEquals(10, result);
	}
	
	@Test(expected = Exception.class)
	public void testGetValue_exception() throws Exception {
		int result =demo.getValue(100, 0);
	}
	
	@Test
	public void testGetLength() {
		int length = demo.getLength("test");
		Assert.assertEquals(4, length);
	}
	
	@Test
	public void testGetLength_exception() {
		int length = demo.getLength(null);
		Assert.assertEquals(0, length);
	}
	
	@Test
	
	public void testGetIntgerFromString() throws Exception {
		int result =demo.getIntgerFromString("123");
		Assert.assertEquals(123, result);
		
	}
	
   @Test(expected = Exception.class)
	
	public void testGetIntgerFromString_exception() throws Exception {
		int result =demo.getIntgerFromString("abc");
		
		
	}

}
