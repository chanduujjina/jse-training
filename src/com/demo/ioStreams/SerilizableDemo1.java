package com.demo.ioStreams;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerilizableDemo1 {

	public static void main(String[] args) throws IOException {
		
		
		// create object
		
		Inventory inventory = new Inventory(1, "clothes", "test");
		//create a file
		File file = new File("D://chandu//projects//File_handler//abc.text");
		
		//how to write data into file
		
		//
		
		FileWriter writer = new FileWriter("D://chandu//projects//File_handler/chandu.txt");
		writer.write("hi this is chandu");
		
		writer.close();
		
		boolean isFileCreated =file.createNewFile();
		System.out.println(isFileCreated);
		
		

	}
	
	
	
	public void writeByteCodeDataIntofile(Inventory inventory) throws IOException {
		FileOutputStream fout =null;
		ObjectOutputStream out = null;
		try {
			fout = new FileOutputStream("abc.txt");
			 out = new ObjectOutputStream(fout);
			out.writeObject(inventory);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		finally {
			fout.close();
			out.close();
		}
	}

}
