package com.demo.client;

import com.demo.Student;

public class StudentClient {

	public static void main(String[] args) {
		Student student1 = Student.builder().studentId(1).studentName("test").gender("male").build();
		Student student2 = Student.builder().studentId(2).studentName("test1").gender("male").build();
		Student student3 = Student.builder().studentId(3).studentName("test2").gender("male").build();
		System.out.println(student1);
		System.out.println(student2);
		System.out.println(student3);

	}

}
