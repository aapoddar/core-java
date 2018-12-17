package com.abhra.java.core.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;




public class CreateV1Book {
	
	public static void doSerialize(Object obj){
		Book book = (Book)obj;
		System.out.println("Book hash code before serialization : "+book.hashCode());
		String filename = "file2.ser"; 
		
	     try {
			
			FileOutputStream file2 = new FileOutputStream(filename); 
		     ObjectOutputStream out2 = new ObjectOutputStream(file2);
		     out2.writeObject(book);
		     
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
	}
	
	public static void main(String args []){
		
		StoryBook sbook = new StoryBook();
		sbook.setAuthor("Syed Mujtaba Ali");
		sbook.setBookname("Deshe-bideshe");
		sbook.setType("Travel");
		
		doSerialize(sbook);
	}
	
    

}
