package com.main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StringExe {

	public static void main(String[] args) {
		String[] arr = {"A", "B", "C"};
		List<String> l1 = Arrays.asList(arr);
		List<String> l2 = new ArrayList<String>(Arrays.asList(arr));
		List<String> l3 = new ArrayList<String>(Arrays.asList("A", new String("B"), "C"));

		System.out.println(l1.equals(l2));
		System.out.println(l1.equals(l3));
	}

}
