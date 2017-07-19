package stringandhashtable.algorithm;

public class RemoveSpace {
	
	/* 
	 * Given a string, remove all leading/trailing/duplicated empty spaces.
	 */

	public String remove(String input) {
		if (input == null) {
			return input;
		}
		int index = 0;
		char[] arrayInput = input.toCharArray();
		for (int i = 0; i < arrayInput.length; i++) {
			if (arrayInput[i] == ' ' && (i == 0 || arrayInput[i - 1] == ' ')) {
				continue;
			}
			arrayInput[index++] = arrayInput[i];
		}
		if (index != 0 && arrayInput[index - 1] == ' ') {
			return new String(arrayInput, 0, index - 1);
		}
		return new String(arrayInput, 0, index);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RemoveSpace solution = new RemoveSpace();
		// test case 1:
		String input = "   I    need a    job    !";
		String result = solution.remove(input);
		System.out.println(result);
	}

}
