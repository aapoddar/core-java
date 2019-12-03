package com.abhra.java.core.datastructure.custom.queue;
public class Test {
	public static void main(String args[]){
		PDF pdf1 = new PDF();
		pdf1.setName("A.pdf");
		Word w1 = new Word();
		w1.setName("b.rtf");
		
		PrintQueue q = new PrintQueue();
		q.push(pdf1);
		q.push(w1);
		
		//q.displayList();
		
		LinkList lst = q.getList();
		  
       for(int i =0;i<q.size();i++){
    	   
       }
		
		q.pop();
		
		//q.displayList();
		
		/*LinkList lst = q.getList();
		  
		        Node current = lst.first;

		        while (current != null) {
		            current.displayNode();
		            System.out.println(current.iData.name);
		            current = current.next;
		        }

		       */
		    
		
		
	}

}
