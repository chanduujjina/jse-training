package com.demo.client;

import com.demo.Address;
import com.demo.Student;

public class StudentClient {

	public static void main(String[] args) {
		Address add1 = Address.builder().cityName("hyd").district("Rangareddy").houseNo("1-112").build();
		Student student1 = Student.builder().studentId(1).studentName("test").gender("male").adress(add1).build();
		Student student2 = Student.builder().studentId(2).studentName("test1").gender("male").build();
		Student student3 = Student.builder().studentId(3).studentName("test2").gender("male").build();
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);

	}

}
