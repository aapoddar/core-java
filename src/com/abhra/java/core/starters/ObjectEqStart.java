package com.abhra.java.core.starters;

import com.abhra.java.core.common.pojo.Person;

public class ObjectEqStart {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		Person p2 = new Person();
		
		System.out.println("p1 == p2 :"+(p1==p2));
		System.out.println("p1 equals p2 : "+(p1.equals(p2)));
		System.out.println("Object hashcodes p1 : "+(p1.hashCode()));
		System.out.println("Object hashcodes p2 : "+(p2.hashCode()));
		
		Person p3 = p1;
		System.out.println("p1 == p3 :"+(p1==p3));
		System.out.println("Object hashcodes p3 : "+(p3.hashCode()));
		
		//if makes clone then objects are equal as hashcodes are same.
		Person p1Clone = (Person)p1.clone();
		System.out.println(String.format("if clone then hashcodes are '%s' & '%s", 
				p1.hashCode(),p3.hashCode()));
		
		// is their reference same ? - NO
		System.out.println("is their reference same = "+(p1==p1Clone));
		
	}

}
