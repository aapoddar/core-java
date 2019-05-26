package com.abhra.java.core.algo;

public class CustomLinkedListTest {

	public static void main(String[] args) {

		Book b1 = new Book();
		b1.setBookName("B1");
		b1.setPrice(100);
		
		Node nb1 = new Node();
		nb1.setBook(b1);
		
		Book b2 = new Book();
		b2.setBookName("B2");
		b2.setPrice(101);
		
		Node nb2 = new Node();
		nb2.setBook(b2);
		

		Book b3 = new Book();
		b3.setBookName("B3");
		b3.setPrice(102);
		
		Node nb3 = new Node();
		nb3.setBook(b3);
		
		
		CustomLinkedList ll = new CustomLinkedList();
		ll.add(nb1);
		ll.add(nb2);
		ll.add(nb3);
		
		ll.print();
		System.out.println("AFTER DELETING...");
		ll.delete(nb2);
		ll.print();
		

	}

}
