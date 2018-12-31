package com.abhra.java.core.thread;

public class ThreadJoinTest {

	public static void main(String[] args) {

		try{
		// Creating a Thread by using runnable.
		SampleThread sampleTh = new SampleThread();
		Thread t1  = new Thread(sampleTh ,"1st-Thread");
		Thread t2  = new Thread(sampleTh ,"2nd-Thread");
		Thread t3  = new Thread(sampleTh ,"3rd-Thread");
		
		// Starts the 1st Thread.
		t1.start();
		
		// next thread starts 
		 t2.start();
		
		// Use Join in order to ensure that next thread won't be started until t1 is dead
		t1.join();
		
		// Use Join in order to ensure that next thread won't be started after some times
		t2.join(200000);
		
		// next thread - t3 starts 
		t3.start();
		
		
		
		}catch(Exception ex){
			ex.printStackTrace();
		}
	}

}
