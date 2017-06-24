package depthfirstsearch.algorithm;

import java.util.ArrayList;
import java.util.List;

public class AllSubSetI {
	
	/*
	 * Given a set of characters represented by a String, return a list containing all subsets of the characters.
	 * 
	 * Time: O(2^n) as for n levels and two cases for each level (2 + 2^2 + 2 ^3 + 2^4 + ..... + 2^n)
	 * 				each level represents an element in input,
	 * 				each tree branch represents add or not add current element in to result as a subset
	 * Space: O(n) 
	 */
	
	public List<String> subset (String input) {
		List<String> result = new ArrayList<>();
		if (input == null ) {
			return result;
		}
//		char[] arrayInput = input.toCharArray();
		StringBuilder newString = new StringBuilder();
		helper(input, newString, 0, result);
		return result;
	}
	private void helper(String input, StringBuilder newString, int index, List<String> result) {
		result.add(newString.toString());
		for (int i = index; i < input.length(); i++) {
			newString.append(input.charAt(i));
			helper(input, newString, i + 1, result);
			newString.deleteCharAt(newString.length() - 1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
