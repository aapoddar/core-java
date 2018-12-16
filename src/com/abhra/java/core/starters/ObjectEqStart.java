package com.abhra.java.core.starters;

import com.abhra.java.core.common.pojo.Person;

public class ObjectEqStart {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person p2 = new Person();
		
		System.out.println("Object == "+(p1==p2));
		System.out.println("Object equal : "+(p1.equals(p2)));
		System.out.println("Object hashcodes p1 : "+(p1.hashCode()));
		System.out.println("Object hashcodes p2 : "+(p2.hashCode()));
		
		
	}

}
