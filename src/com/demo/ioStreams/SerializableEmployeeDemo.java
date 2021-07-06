package com.demo.ioStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializableEmployeeDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		EmployeeObject empobj = new EmployeeObject(1,"Anu","Tech");
		
		//serilizae the activity object
		
		FileOutputStream fout = new FileOutputStream("test1.ser");																																																																																																																																																			
		
		ObjectOutputStream out = new ObjectOutputStream(fout);
		
		out.writeObject(empobj);
		
		//desarlize object
		
		FileInputStream fin = new FileInputStream("test1.ser");
		
		ObjectInputStream in = new ObjectInputStream(fin);
		
		empobj =(EmployeeObject)in.readObject();
		 System.out.println(empobj);
		
	  }
	  }


