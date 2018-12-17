package com.abhra.java.core.ds.singleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SingletonTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleSigleton obj1 = SimpleSigleton.createInstance("Simple singleton - lazy loading..1");
		System.out.println(obj1.hashCode());
		
		SimpleSigleton obj2 = SimpleSigleton.createInstance("Simple singleton - lazy loading..2");
		System.out.println(obj2.hashCode());
		
		//Double check locking
		
		DoubleCheckLocking dcl = DoubleCheckLocking.createInstance("double check lock");
		System.out.println(dcl.hashCode());
		
		// Serializable singleton
		String file ="SerializedSingleton.ser";
		try{
		FileOutputStream fos = new FileOutputStream(file);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		SerializedSingleton serializedObj = SerializedSingleton.createInstance("Serialized singleton ");
		oos.writeObject(serializedObj);
		
		FileInputStream fis = new FileInputStream(file);
		ObjectInputStream ois = new ObjectInputStream(fis);
		SerializedSingleton deserializedObj = (SerializedSingleton) ois.readObject();
		deserializedObj = (SerializedSingleton)deserializedObj.readResolved("uu");
		
		System.out.println(String.format
				("hashcode of serialized object  & de-serialized objects are %s & %s" ,
						serializedObj.hashCode() ,deserializedObj.hashCode()));
		
		
		}catch(Exception e){
			e.printStackTrace();
		}
		

	}

}
