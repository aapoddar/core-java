package com.abhra.java.core.generics;

import com.abhra.java.core.common.pojo.Person;

public class GenericTest {

	public static void main(String[] args) {

		/** Generic class **/
		
		GenericClass<Person> genObj1 = new GenericClass(new Person());
		
		Person obj1 = genObj1.getObject();
		
		System.out.println("the object belongs to  :"+obj1.getClass());
		
		
		
		GenericClass<Integer> genObj2 = new GenericClass(new Integer(90));
		
		Integer obj2 = genObj2.getObject();
		
		System.out.println("the object belongs to  :"+obj2.getClass());
		
		AnyClass<String> anyClsObj = new AnyClass<String>("Any class obj");
		System.out.println("the object belongs to  :"+anyClsObj.getClass());

	}
	
	public static <T> GenericClass<? extends Object> getGenClass(T obj){
		return (GenericClass<? extends Object>) obj;
	}

}
