package com.main;

public class TryCatchIssue {

	/*
Yes, finally will be called after the execution of the try or catch code blocks.

The only times finally won't be called are:

If you invoke System.exit()
If you invoke Runtime.getRuntime().halt(exitStatus)
If the JVM crashes first
If the JVM reaches an infinite loop (or some other non-interruptable, non-terminating statement) in the try or catch block
If the OS forcibly terminates the JVM process; e.g., kill -9 <pid> on UNIX
If the host system dies; e.g., power failure, hardware error, OS panic, et cetera
If the finally block is going to be executed by a daemon thread and all other non-daemon threads exit before finally is called

	 */


	public static void main(String[] args) {

		try {
			System.out.println("In try block..");

			int i = 0;
			int j = 1;
			int k = j/i;
		} catch (Exception e) {
			System.out.println("In Catch block..");
		}
		finally {
			System.out.println("In finally block..");
		}

		System.out.println(" --------------------END------------------");
	}
}
