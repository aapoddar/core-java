package com.abhra.java.core.thread;

import com.abhra.java.core.common.pojo.Message;

public class WaitNotifyTest {

	public static void main(String[] args) {
		Message msg = new Message();
		msg.setDesc("Intial description..");
		Waiter wait1 = new Waiter(msg);
		Waiter wait2 = new Waiter(msg);
		Notifier notifier = new Notifier(msg);
		
		Thread thNotifier = new Thread(notifier ,"Notifier thread");
		Thread thWaiter1 = new Thread(wait1 ,"Waiter thread-1");
		Thread thWaiter2 = new Thread(wait2 ,"Waiter thread-2");
		
		System.out.println("main method...");
		thWaiter1.start();
		thNotifier.start();
		
	}

}
