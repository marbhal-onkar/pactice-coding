package com.main;

public class DisariumNumbers {

	static boolean isDisariumNumber(int num){
		int sum = 0;
		int len = 0;

		for (int i = num; i > 0; i = i/10) {
			len++;
		}

		for (int i = num, j = len; i > 0; i = i/10, j--) {
			sum += Math.pow(i%10, j);
		}
		return sum == num;
	}
}
