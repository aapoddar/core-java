package com.abhra.java.core.datastructure.custom.queue;
public class PrintQueue {
	private LinkList list;

    public PrintQueue() {
        list = new LinkList();
    }

    public void push(Documents x) {
        list.insert(x);
    }

    public void pop() {
        list.remove();

    }
    
    /*public void displayList() {
        list.display();
    }*/
    
   public LinkList getList(){
	   return list;
   }
   
   public int size (){
	   return list.size();
	   
   }


}
