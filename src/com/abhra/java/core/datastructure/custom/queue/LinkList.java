package com.abhra.java.core.datastructure.custom.queue;
public class LinkList {
	
	public Node first;

    public LinkList() {
        first = null;
    }

    public boolean isEmpty() {
        return first == null;
    }

    public void insert(Documents x) {
        Node newNode = new Node(x);
        Node current = first;
        
        if(first == null){
        	first = current = newNode;
        }else{
        	current.next=newNode;
        	current = newNode;
        }
      
    }

    public Node remove() {
        Node current = first;
        Node temp = null;
        int count = 0;
        
        if(!isEmpty()){
        	temp = first;
        	first = current.next;
        }

        return temp;
    }
    
    public Node get(int index) {
        Node current = first;
        Node temp = null;
        
        if(!isEmpty()){
        	temp = first;
        	first = current.next;
        }

        return temp;
    }

    public void display() {
        Node current = first;

        while (current != null) {
            current.displayNode();
            current = current.next;
        }

        System.out.println(" ");
    }
    
    public int size (){
    	Node current = first;
    	int count = 0;

        while (current != null) {
            current.displayNode();
            current = current.next;
            count ++;
        }
        return count;

    }


}
