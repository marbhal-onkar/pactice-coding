package com.main.simpleProgramms;

import java.util.Scanner;

public class CandidateCode {
	public static void main(String args[]) throws Exception {

		// Write code here
		Scanner sc = new java.util.Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int c = reverseNumber(a);
		int d = reverseNumber(b);

		System.out.println(Math.max(c, d));

		sc.close();
	}

	static int reverseNumber(int num) {
		int temp = 0;
		for (int i = num; i != 0; i = i / 10) {
			temp = temp * 10 + i % 10;
		}

		return temp;
	}
}