package com.abhra.java.core.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class LinklistTest {

	public static void main(String[] args) {
		LinkedList<String> ll = new LinkedList<>();
		ll.add("Sayanti");
		ll.add("Abhra");
		ll.add("Mummum");
		ll.add("Tutul");
		
		Iterator<String> itr = ll.iterator();
		while(itr.hasNext()){
			System.out.println("Name :"+itr.next());
		}
		
		ArrayList<String> al = new ArrayList<>();
		al.add("Sayanti");
		al.add("Abhra");
		al.add("Mummum");
		al.add("Tutul");
		
		Iterator<String> itrAl= al.iterator();
		while(itrAl.hasNext()){
			System.out.println("Name :"+itrAl.next());
		}

	}
	
	



}
