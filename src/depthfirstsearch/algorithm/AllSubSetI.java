package depthfirstsearch.algorithm;

import java.util.ArrayList;
import java.util.List;

public class AllSubSetI {
	
	public List<String> subset (String input) {
		List<String> result = new ArrayList<>();
		if (input == null || input.length() == 0) {
			return result;
		}
		char[] arrayInput = input.toCharArray();
		StringBuilder newString = new StringBuilder();
		helper(arrayInput, newString, 0, result);
		return result;
	}
	private void helper(char[] arrayInput, StringBuilder newString, int index, List<String> result) {
		if (index == arrayInput.length) {
			result.add(newString.toString());
		}
		for (int i = index; i < arrayInput.length; i++) {
			newString.append(arrayInput[i]);
			helper(arrayInput, newString, i + 1, result);
			newString.deleteCharAt(newString.length() - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
