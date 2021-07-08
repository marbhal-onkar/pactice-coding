package com.main;

public class Factorial {

	static double perform(int n) {

		if(n == 1)
			return 1;

		return perform(n -1) * n;
	}
}
