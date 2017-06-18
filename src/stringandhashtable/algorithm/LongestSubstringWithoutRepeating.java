package stringandhashtable.algorithm;

import java.util.HashSet;

public class LongestSubstringWithoutRepeating {
	
	/*
	 *  Given a string, find the longest substring without any repeating characters and return the length of it. The input string is guaranteed to be not null.
	 *  
	 *  For example, the longest substring without repeating letters for "bcdfbd" is "bcdf", we should return 4 in this case.
	 */

	public int length(String input) {
		if (input == null || input.length() == 0) {
			return -1;
		}
		// two pointers iterate string and use hashtable to save repeated elements
		// fast pointer moves when current element is not in hashset while slow pointer moves when current element exists in hashset
		HashSet<Character> substring = new HashSet<>();
		int left = 0;
		int right = 0;
		int longest = 0;
		while (left < input.length()) {
			if (substring.contains(input.charAt(right))) {
				substring.remove(input.charAt(left++));
			} else {
				substring.add(input.charAt(right++));
				longest = Math.max(longest, right - left);
			}
		}
		return longest;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
