package com.main;

import java.util.ArrayList;
import java.util.List;

public class Palindrome {

	public static boolean isPalindome(int num) {
		int newNum = 0;
		for (int i = num; i > 0; i /= 10)
			newNum = newNum * 10  + (i%10);
		return newNum == num;
	}

	public static List<String> allPalindromicSubstrings(String str){
		List<String> _ruleOutput = new ArrayList<String>();

		for (int i = 1; i <= str.length(); i++) {
			for (int j = 0, k = i; k <= str.length(); k++, j++) {
				if(isPalindome(str.substring(j, k))) {
					_ruleOutput.add(str.substring(j, k));
				}
			}
		}

		return _ruleOutput;
	}

	public static boolean isRotaionOfPalindrome(String str) {
		String s = str + str;

		for(int i = 0; i < s.length() - str.length(); i++) {
			if(isPalindome(s.substring(i, i+str.length()))) {
				return true;
			}
		}

		return false;
	}

	public static boolean isPalindome(String str) {

		int start = 0;
		int end = str.length() - 1;

		while(start < end) {
			if(str.charAt(start) != str.charAt(end)) {
				return false;
			}

			start++;
			end--;
		}

		return true;
	}

	//RECURSIVE FUNCTION FOR isPalindrome()
	public static boolean isPalRec(String str) {
		int n = str.length();

		if (n == 0)
			return true;

		return isPalRec(str, 0, n - 1);
	}

	private static boolean isPalRec(String str, int s, int e) {
		if (s == e)
			return true;

		if (str.charAt(s) != str.charAt(e))
			return false;

		if (s < e + 1)
			return isPalRec(str, s + 1, e - 1);

		return true;
	}
}
