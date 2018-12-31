package com.abhra.java.core.thread;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import com.abhra.java.core.common.pojo.Message;

public class Notifier implements Runnable{
	
	private Message msg;
	
	private DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

	public Notifier(Message msg) {
		this.msg = msg;
	}

	@Override
	public void run() {
		
		String threadName = Thread.currentThread().getName();
		System.out.println(String.format("the thread %s is going to give the notification "
				+ "and the current time = %s", threadName , LocalDateTime.now()));
		try{
			Thread.sleep(10000);
			synchronized (msg) {
				msg.setDesc("Hello ! this is wait-notify test");
				msg.notify();
				
			}
		}catch(Exception ee){
			ee.printStackTrace();
		}
		
	}

}
