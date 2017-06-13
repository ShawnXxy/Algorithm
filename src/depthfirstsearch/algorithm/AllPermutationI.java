package depthfirstsearch.algorithm;

import java.util.ArrayList;
import java.util.List;

public class AllPermutationI {
	
	/*
	 * Given a string with no duplicate characters, return a list with all permutations of the characters.
	 * 
	 * Time: O(n^n)
	 *  Space: O(n)
	 */
	
	public List<String> permutation (String input) {
		List<String> result = new ArrayList<>();
		if (input == null) {
			return result;
		}
		char[] arrayInput = input.toCharArray();
		helper(arrayInput, 0, result);
		return result;
	}
	private void helper(char[] arrayInput, int index, List<String> result) {
		if (index == arrayInput.length) {
			result.add(new String(arrayInput));
		}
		for (int i = index; i < arrayInput.length; i++) {
			swap(arrayInput, index, i);
			helper(arrayInput, index + i, result);
			swap(arrayInput, index, i);
		}
	}
	private void swap(char[] array, int a, int b) {
		char temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
