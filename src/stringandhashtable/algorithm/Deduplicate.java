package stringandhashtable.algorithm;

public class Deduplicate {
	
	/*
	 *  Remove adjacent, repeated characters in a given string, leaving only one character for each group of such characters.
	 */

	public String deduplicate(String input) {
		if (input == null || input.length() == 0) {
			return input;
		}
		// change string to array as string in JAVA is unmutable
		char[] arrayInput = input.toCharArray();
		int slow = 1;
		for (int fast = 1; fast < arrayInput.length; fast++) {
			// slow and fast pointer iterates each elements in char array. 
			// If fast == slow, fast pointer keeps moving while slow pointer dont move
			// if fast != slow, copy fast value to slow++
			if (arrayInput[fast] != arrayInput[slow - 1]) {
				arrayInput[slow++] = arrayInput[fast];
			}
		}
		return new String(arrayInput, 0, slow);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
