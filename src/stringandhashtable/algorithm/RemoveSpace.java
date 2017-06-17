package stringandhashtable.algorithm;

public class RemoveSpace {
	
	/* 
	 * Given a string, remove all leading/trailing/duplicated empty spaces.
	 */

	public String remove(String input) {
		if (input == null || input.length() == 0) {
			return input;
		}
		char[] arrayInput = input.toCharArray();
		int slow = 0;
		for (int fast= 0; fast < arrayInput.length; fast++) {
			// remove the space when it appears at beginning or duplicate
			if (arrayInput[fast] == ' ' && (fast == 0 || arrayInput[fast - 1] == ' ')) {
				continue;
			}
			arrayInput[slow++] = arrayInput[fast];
		}
		// if space appears at the end
		if (slow != 0 && arrayInput[slow - 1] == ' ') {
			return new String(arrayInput, 0, slow - 1);
		}
		return new String(arrayInput, 0, slow);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
