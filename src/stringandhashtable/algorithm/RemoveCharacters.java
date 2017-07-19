package stringandhashtable.algorithm;

import java.util.HashSet;

public class RemoveCharacters {
	
	/* 
	 *  Remove given characters in input string, the relative order of other characters should be remained. Return the new string after deletion.
	 */

	public String remove (String input, String target) {
		if (input == null || input.length() == 0) {
			return input;
		}
		HashSet<Character> set = new HashSet<>();
		for (int i = 0; i < target.length(); i++) {
			set.add(target.charAt(i));
		}
		int index = 0;
		char[] inputArray = input.toCharArray();
		for (int i = 0; i < inputArray.length; i++) {
			if (set.contains(inputArray[i])) {
				continue;
			}
			inputArray[index++] = inputArray[i];
		}
		return new String(inputArray, 0, index);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveCharacters solution = new RemoveCharacters();
		// test case 1:
		String input = "believe";
		String target ="lie";
		String result = solution.remove(input, target);
		System.out.println(result);
	}

}
