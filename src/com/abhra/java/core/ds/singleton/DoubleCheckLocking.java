package com.abhra.java.core.ds.singleton;

public class DoubleCheckLocking {
	
	private static DoubleCheckLocking obj = null;

	private DoubleCheckLocking() {
		
	}
	
	public static DoubleCheckLocking createInstance(String desc){
		
		if(obj == null){
			synchronized(DoubleCheckLocking.class){
				if(obj == null){
					obj = new DoubleCheckLocking();
				}
			}
		}
		
		return obj;
	}

}
