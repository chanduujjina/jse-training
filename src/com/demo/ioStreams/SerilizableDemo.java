package com.demo.ioStreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerilizableDemo {
  public static void main(String[] args) throws IOException, ClassNotFoundException {
	Activity activity = new Activity(1,"pull","test");
	
	//serilizae the activity object
	
	FileOutputStream fout = new FileOutputStream("abc.ser");																																																																																																																																																			
	
	ObjectOutputStream out = new ObjectOutputStream(fout);
	
	out.writeObject(activity);
	
	//desarlize object
	
	FileInputStream fin = new FileInputStream("abc.ser");
	
	ObjectInputStream in = new ObjectInputStream(fin);
	
	 activity =(Activity)in.readObject();
	 System.out.println(activity);
	
  }
  }