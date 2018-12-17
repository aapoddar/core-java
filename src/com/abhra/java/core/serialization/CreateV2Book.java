package com.abhra.java.core.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class CreateV2Book {
	
	public static void doDeseralize() {
	
	String filename = "file2.ser"; 
	FileInputStream file3;
	try {
		file3 = new FileInputStream(filename);
		ObjectInputStream in2 = new ObjectInputStream(file3);
		StoryBook o2 = (StoryBook)in2.readObject();
		System.out.println(o2.hashCode());
		System.out.println("Book type is : "+o2.getType());
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	
public static void main(String args []){
		
		doDeseralize();
	}
	

}
