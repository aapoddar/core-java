package com.abhra.java.core.datastructure.custom.queue;
public class Node {
	public Documents iData;
    public Node next;

    public Node(Documents x) {
        iData = x;
    }

    public Documents displayNode() {
       return iData;
    }

}
