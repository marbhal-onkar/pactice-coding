package com.main.serialization.interfaceInheritance;

public interface A {

	/*
	 * For Variables only
	 * 1. public
	 * 2. static
	 * 3. final
	 * */
	final static String USER_NAME = "Onkar";

	/*
	 * For method
	 * 1. public
	 * 2. static
	 * 3. private - JAVA 9
	 * 4. abstact
	 * 5. default - JAVA 8
	 * 6. strictfp
	 * */
	private void test() {
		System.out.println("In A Interface ...");
	}
}
