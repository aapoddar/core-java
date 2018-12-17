package com.abhra.java.core.ds.singleton;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {
	
	private static SerializedSingleton obj = null;

	private SerializedSingleton(String description) {
		
	}
	
	public static SerializedSingleton createInstance(String desc){
		
		if(obj == null){
			obj = new SerializedSingleton("simple singleton");
		}
		
		return obj;
	}
	
	public  Object readResolved(String desc){
		return createInstance( desc);
	}

}
