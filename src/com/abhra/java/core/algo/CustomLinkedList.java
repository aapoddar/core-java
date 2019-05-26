package com.abhra.java.core.algo;

public class CustomLinkedList {
	Node first = null;
	public void add (Node newBook){
		newBook.setNext(first);
		first = newBook;
	}
	
	public void print ()
	{
		Node printNode = first;
		while(printNode!=null){
		 System.out.println("Current Linked List :"+printNode.getBook().getBookName());
		 printNode = printNode.getNext();
		}
	}
	
	public void delete (Node toBeDeletedBook){
		Node delNode = first;
		Node prev = null;
		while(delNode!=null){

			if(toBeDeletedBook.getBook().getBookName().equalsIgnoreCase(delNode.getBook().getBookName())){
				prev.setNext(delNode.getNext());
				break;
			}else{
				prev = delNode;
				delNode = delNode.getNext();
			}
		}
	}

}
