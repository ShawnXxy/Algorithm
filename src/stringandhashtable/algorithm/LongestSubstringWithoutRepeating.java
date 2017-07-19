package stringandhashtable.algorithm;

import java.util.HashSet;

public class LongestSubstringWithoutRepeating {
	
	/*
	 *  Given a string, find the longest substring without any repeating characters and return the length of it. The input string is guaranteed to be not null.
	 *  
	 *  For example, the longest substring without repeating letters for "bcdfbd" is "bcdf", we should return 4 in this case.
	 */

	public int substring (String input) {
		if (input == null || input.length() == 0) {
			return -1;
		}
		int slow = 0;
		int fast = 0;
		int result = 0;
		HashSet<Character> set = new HashSet<>();
		while (fast < input.length()) {
			if (set.contains(input.charAt(fast))) {
				set.remove(input.charAt(slow++));
			} else {
				set.add(input.charAt(fast++));
				result = Math.max(result, fast - slow);
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestSubstringWithoutRepeating solution = new LongestSubstringWithoutRepeating();
		// test case 1:
		String input = null;
		int result = solution.substring(input);
		System.out.println(result);
		// test case 2:
		input = "";
		result = solution.substring(input);
		System.out.println(result);
		// test case 3:
		input = "aaaaa";
		result = solution.substring(input);
		System.out.println(result);
		// test case 4:
		input = "aabbbcccc";
		result = solution.substring(input);
		System.out.println(result);
	}

}
