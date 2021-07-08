package com.main.simpleProgramms;

public class Anagram {

	public static void main(String[] args) {
		isAnagram("CAT", "CAT");
	}

	public static boolean isAnagram(String a, String b) {

		//		if(a.length() != b.length()) {
		//			return false;
		//		}else {
		//			char[] arr = a.toCharArray();
		//			char[] brr = b.toCharArray();
		//
		//			Arrays.sort(arr);
		//			Arrays.sort(brr);
		//
		//			for (int i = 0; i < arr.length; i++) {
		//				if(arr[i] != brr[i]) {
		//					return false;
		//				}
		//			}
		//		}
		//
		//		return true;

		int Number_Of_Chars = 256;

		int count[] = new int[Number_Of_Chars];

		if(a.length() != b.length()) {
			return false;
		}

		char[] arr = a.toCharArray();
		char[] brr = b.toCharArray();

		for(int i = 0; i < arr.length; i++) {
			count[arr[i]]++;
			count[brr[i]]--;
		}

		for(int i = 0; i < Number_Of_Chars; i++) {
			if(count[i] != 0) {
				return false;
			}
		}

		return true;
	}
}
