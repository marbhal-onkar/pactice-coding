package com.main.multithreading;

public class ThreadRunExample {

	/*
	 * Once we start any thread, it’s execution depends on the OS implementation of time slicing and we can’t control their execution.
	 * However we can set threads priority but even then it doesn’t guarantee that higher priority thread will be executed first.
	 * */
	public static void main(String[] args){
		Thread t1 = new Thread(new HeavyWorkRunnable(), "t1");
		Thread t2 = new Thread(new HeavyWorkRunnable(), "t2");

		System.out.println("Starting Runnable threads");
		t1.start();
		t2.start();
		System.out.println("Runnable Threads has been started");

		Thread t3 = new MyThread("t3");
		Thread t4 = new MyThread("t4");

		System.out.println("Starting MyThreads");
		t3.start();
		t4.start();
		System.out.println("MyThreads has been started");
	}
}