package com.abhra.java.core.thread;

public class SampleThread implements Runnable {

	@Override
	public void run() {
		System.out.println("The current thread name :"+Thread.currentThread().getName());
		
	}

}
