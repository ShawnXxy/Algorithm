package stringandhashtable.algorithm;

import java.util.HashSet;

public class UniqueCharacters {

	/*
	 *  Determine if the characters of a given string are all unique.
	 *  
	 */
	
	public boolean unique(String input) {
		if (input == null || input.length() == 0) {
			return true;
		}
		HashSet<Character> set = new HashSet<>();
		for (int i = 0; i < input.length(); i++) {
			if (!set.contains(input.charAt(i))) {
				set.add(input.charAt(i));
			} else {
				return false;
			}
		}
		return true;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
