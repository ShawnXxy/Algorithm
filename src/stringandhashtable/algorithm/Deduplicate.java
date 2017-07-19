package stringandhashtable.algorithm;

public class Deduplicate {
	
	/*
	 *  Remove adjacent, repeated characters in a given string, leaving only one character for each group of such characters.
	 */

	public String deduplicate (String input) {
		if (input == null || input.length() == 0) {
			return input;
		}
		char[] arrayInput = input.toCharArray();
		int index = 1;
		for (int i = 1; i < arrayInput.length; i++) {
			if (arrayInput[i] == arrayInput[i - 1]) {
				continue;
			}
			arrayInput[index++] = arrayInput[i];
		}
		return new String(arrayInput, 0, index);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deduplicate solution = new Deduplicate();
		// test case 1:
		String input = null;
		String result = solution.deduplicate(input);
		System.out.println(result);
		// test case 2:
		input = "";
		result = solution.deduplicate(input);
		System.out.println(result);
		// test case 3:
		input = "abc";
		result = solution.deduplicate(input);
		System.out.println(result);
		// test case 4:
		input = "aabbbccccd";
		result = solution.deduplicate(input);
		System.out.println(result);
	}

}
