package stringandhashtable.algorithm;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharacters {

	/*
	 *  Determine if the characters of a given string are all unique.
	 *  
	 */
	
	public boolean isUnique(String input) {
		if (input == null || input.length() == 0) {
			return true;
		}
		Set<Character> used = new HashSet<>();
		for (int i = 0; i < input.length(); i++) {
			if (used.contains(input.charAt(i))) {
				return false;
			}
			used.add(input.charAt(i));
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UniqueCharacters solution = new UniqueCharacters();
		// test case 1:
		String input = "a";
		boolean result = solution.isUnique(input);
		System.out.println(result);
	}

}
