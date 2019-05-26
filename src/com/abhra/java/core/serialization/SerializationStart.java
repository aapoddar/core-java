package com.abhra.java.core.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationStart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Book book1 = new StoryBook();
		book1.setBookname("Nameshake");
		book1.setAuthor("Arundhati");
		
		StoryBook book2 = new StoryBook();
		book2.setAuthor("Tagore");
		book2.setBookname("Chokher bali");
book2.setType("novel");
		
		try{
		String filename = "file.ser"; 
		FileOutputStream file = new FileOutputStream(filename); 
        ObjectOutputStream out = new ObjectOutputStream(file);
        out.writeObject(book1);
        
        FileInputStream file1 = new FileInputStream(filename);
        ObjectInputStream in = new ObjectInputStream(file1);
        Book o1 = (Book)in.readObject();
        
        
        System.out.println("After de-serialization for first book :"+o1.getBookname());
        
        
         filename = "file2.ser"; 
		FileOutputStream file2 = new FileOutputStream(filename); 
        ObjectOutputStream out2 = new ObjectOutputStream(file2);
        out2.writeObject(book2);
        
        FileInputStream file3 = new FileInputStream(filename);
        ObjectInputStream in2 = new ObjectInputStream(file3);
        StoryBook o2 = (StoryBook)in2.readObject();
        
        System.out.println("After de-serialization for second book:"+o2.getType());
        in2.close();
        
        
        
        // Serial version uid test.''
        
       
        CreateV2Book.doDeseralize();
        
        
		}catch(Exception e){
			e.printStackTrace();
		}
		
		
	}

}
