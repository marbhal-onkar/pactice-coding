package com.main;

import java.util.Scanner;

public class MasterCardTest {

	public static void main(String args[]) throws Exception {

		// Write code here
		Scanner sc = new Scanner(System.in);
		int amt = -1;
		try {
			amt = sc.nextInt();
			if (amt <= 0) {
				System.out.println("Error: Invalid Amount");
				sc.close();
				return;
			}
		} catch (Exception e) {
			System.out.println("Error: Invalid Amount");
			sc.close();
			return;
		}

		if (amt % 10 != 0) {
			System.out.println("Error: The amount entered needs to be in multiples of 10");
			sc.close();
			return;
		}

		int note50 = 0;
		int note20 = 0;
		int note10 = 0;

		note50 = amt / 50;
		int r = amt % 50;

		note20 = r / 20;
		r = r % 20;

		note10 = r / 10;

		System.out.println(note50 + "*50 " + note20 + "*20 " + note10 + "*10");
		sc.close();
	}
}
