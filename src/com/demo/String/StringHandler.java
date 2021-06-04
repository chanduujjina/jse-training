package com.demo.String;

public class StringHandler {

	public static void main(String[] args) {
		// create String using literal

		String s1 = "test";

		// create String Object
		String s2 = new String("test");
		
		//copy data from heap area to constant pool area
		s2 =s2.intern();

		// why String

		String s3 = "test";

		// ==
		boolean value = s1 == s3 ;
		System.out.println("s1==s3:"+value);

		boolean value1 = s1 == s2;
		System.out.println("s1==s2:"+value1);
		
		//equals method will compare data
		
		boolean value2 =s1.equals(s2);
		System.out.println("s1.equals(s2)::"+value2);
		
		boolean value3 =s2.equals(s3);
		System.out.println("s2.equals(s3)"+value3);
		
		char data [] = {'t','e','s','t'};
		
		String s4 = new String(data);
		System.out.println(s4);
		
		String s5 ="test";
		String s6= new String("TEST");
		
		//first appoch
		boolean ignoreVal = s5.equalsIgnoreCase(s6);
		System.out.println(ignoreVal);
		
		boolean uppercase =s5.toUpperCase().equals(s6);
		System.out.println(uppercase);
		
		String iphoneModel = "Iphone 12";
		
		//result iphone-12
		
		String result = iphoneModel.toLowerCase().replace(" ", "-");
		System.out.println(result);
		
		//filePath = c:/test/abc.xml
		
		//result abc.xml
		
		String filePath = "c:/test/abc.xml";
		
		int indexval1= filePath.indexOf("/");
		System.out.println(indexval1);
		
		int indexval2=  filePath.lastIndexOf("/");
		System.out.println(indexval2);
		
		String subStringval = filePath.substring(filePath.lastIndexOf("/")+1, filePath.length());
		System.out.println(subStringval);
		
		
		
		
	}

}
