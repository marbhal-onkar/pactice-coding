package com.main.trickyQuestions;

public class Test {

	public static void main(String[] args) {
		//		method(null);

		System.out.println(0.1*3 == 0.3);
		System.out.println(0.1*2 == 0.2);
	}

	public static void method(Object o) {
		System.out.println("Object method");
	}

	public static void method(String s) {
		System.out.println("String method");
	}
}