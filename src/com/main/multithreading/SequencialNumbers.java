package com.main.multithreading;

public class SequencialNumbers {

	static int i = 0;

	public static void main(String[] args) {

		Thread t = new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println(++i);
			}
		});

		t.start();
	}

}
