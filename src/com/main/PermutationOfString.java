package com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PermutationOfString {

	public static void permutation(String str) {
		permutation("", str);
	}

	private static void permutation(String prefix, String str) {
		int n = str.length();
		if (n == 0)
			System.out.println(prefix);
		else {
			for (int i = 0; i < n; i++)
				permutation(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n));

		}
	}

	// return type list

	public static List<String> permutationList(String str) {
		char[] chs = str.toCharArray();
		Arrays.sort(chs);
		return permutationList("", chs.toString());
	}

	private static List<String> permutationList(String prefix, String str) {
		List<String> _output = new ArrayList<>();
		int n = str.length();
		if (n == 0)
			_output.add(prefix);
		else
			for (int i = 0; i < n; i++)
				_output.addAll(permutationList(prefix + str.charAt(i), str.substring(0, i) + str.substring(i + 1, n)));

		return _output;
	}
}
