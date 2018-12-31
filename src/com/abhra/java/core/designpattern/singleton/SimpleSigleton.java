package com.abhra.java.core.designpattern.singleton;

public class SimpleSigleton {
	
	private String description;
	private static SimpleSigleton obj = null;

	private SimpleSigleton(String description) {
		this.description = description;
	}
	
	public static SimpleSigleton createInstance(String desc){
		
		if(obj == null){
			obj = new SimpleSigleton("simple singleton");
		}
		
		return obj;
	}

}
