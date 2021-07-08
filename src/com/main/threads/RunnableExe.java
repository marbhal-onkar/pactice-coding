package com.main.threads;

public class RunnableExe implements Runnable {

	public static void main(String[] args) throws InterruptedException {

		Thread t = new Thread(() -> {
			System.out.println("Functional Interface Runnable..");
		});
		Thread t1 = new ThreadExe();
		Thread t2 = new Thread(new RunnableExe());

		t.start();
		t1.start();
		t2.start();

		Thread ts = new Thread();
	}

	@Override
	public void run() {
		System.out.println("RunnableExe Method...!");
	}
}
