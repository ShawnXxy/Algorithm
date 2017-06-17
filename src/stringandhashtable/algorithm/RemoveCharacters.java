package stringandhashtable.algorithm;

import java.util.HashSet;

public class RemoveCharacters {
	
	/* 
	 *  Remove given characters in input string, the relative order of other characters should be remained. Return the new string after deletion.
	 */

	public String remove (String input, String target) {
		if (input == null || input.length() == 0 || target == null || target.length() == 0) {
			return input;
		}
		HashSet<Character> set = new HashSet<>();
		for (int i = 0; i < target.length(); i++) {
			set.add(target.charAt(i));
		}
		char[] arrayInput = input.toCharArray();
		int slow = 0;
		for (int fast = 0; fast < arrayInput.length; fast++) {
			if (!set.contains(arrayInput[fast])){
				arrayInput[slow++] = arrayInput[fast];
			}
		}
		return new String(arrayInput, 0, slow);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
