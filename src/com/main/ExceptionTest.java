package com.main;

public class ExceptionTest {
	public static void main(String[] args) {

		try {
			System.out.println("In try..");
			throw new Exception("error"); //try throwing error exception
		} catch (Throwable e) { // try here Exception, Error, Throwable
			System.out.println("exeception");
		} finally {
			System.out.println("finally");
		}
	}
}
