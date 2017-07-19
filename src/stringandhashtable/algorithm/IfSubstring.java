package stringandhashtable.algorithm;

import java.util.HashSet;

public class IfSubstring {

	/*
	 * Determine if a small string is a substring of another large string.
	 * Return the index of the first occurrence of the small string in the large string.
	 * Return -1 if the small string is not a substring of the large string.
	 */
	
	public int strStr (String large, String small) {
		if (large == null || small == null || large.length() == 0 || small.length() == 0 || large.length() < small.length()) {
			return -1;
		}
		for (int i = 0; i < large.length() - small.length(); i++) {
			if (equals(large, i, small)) {
				return i;
			}
		}
		return -1;
	}
	private boolean equals (String large, int index, String small) {
		for (int i = 0; i < small.length(); i++) {
			if (large.charAt(i + index) == small.charAt(i)) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		IfSubstring solution = new IfSubstring();
		// test case 1:
		String large = "";
		String small = "";
		int result = solution.strStr(large, small);
		System.out.println(result);
		// test case 2:
		large = "large";
		small = "small";
		result = solution.strStr(large, small);
		System.out.println(result);
		// test case 1:
		large = "believe";
		small = "lie";
		result = solution.strStr(large, small);
		System.out.println(result);
	}

}
