package com.main.multithreading.waitNotify;

public class WaitNotifyTest {

	public static void main(String[] args) {
		Message msg = new Message("process it");

		//		Message msg1 = new Message("process it custome");


		Waiter waiter = new Waiter(msg);
		Thread t1 = new Thread(waiter,"W1");
		t1.start();

		Waiter waiter1 = new Waiter(msg);
		Thread t2 = new Thread(waiter1, "W2");
		t2.start();

		Notifier notifier = new Notifier(msg);
		new Thread(notifier, "N").start();

		System.out.println("All the threads are started");
	}

}