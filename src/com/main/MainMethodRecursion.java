package com.main;

public class MainMethodRecursion {

	static int i = 0;

	public static void main(String[] args) {

		if(i < 3) {
			i++;
			main(null);
		}else {
			return;
		}

		System.out.println("In main method...");
	}
}
