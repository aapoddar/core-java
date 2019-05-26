package com.abhra.java.core.thread;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.abhra.java.core.common.pojo.Message;

public class Waiter implements Runnable{
	
	private Message msg;
	private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	public Waiter(Message msg) {
		this.msg = msg;
	}

	


	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();
		
		
		synchronized(msg){
			try{
				System.out.println(String.format("the thread %s is waiting for the notification "
						+ "and the current time = %s", threadName , LocalDateTime.now()));
				msg.wait();
			}catch(Exception ex){
				ex.printStackTrace();
			}
		}
		
		System.out.println(String.format("the thread %s has got the notification "
				+ "and the current time = %s", threadName , LocalDateTime.now()));
		
		System.out.println("the object mesaage description is "+msg.getDesc());
		
	}

}
