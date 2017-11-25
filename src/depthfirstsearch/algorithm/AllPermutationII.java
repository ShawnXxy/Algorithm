package depthfirstsearch.algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class AllPermutationII {
	
	/*
	 *  Given a string with possible duplicate characters, return a list with all permutations of the characters.
	 */

	public List<String> permutation(String input) {
		List<String> result = new ArrayList<>();
		if (input == null || input.length() == 0) {
			return result;
		}
		char[] inputArray = input.toCharArray();
		helper(inputArray, 0, result);
		return result;
	}
	private void helper (char[] inputArray, int index, List<String> result) {
		if (index == inputArray.length - 1) {
			result.add(new String(inputArray));
		}
		HashSet<Character> used = new HashSet<>();
		for (int i = index; i < inputArray.length; i++) {
			if (!used.contains(inputArray[i])) {
				used.add(inputArray[i]);
				swap(inputArray, i, index);
				helper(inputArray, index + 1, result);
				swap(inputArray, i, index);
			}
		}
	}
	private void swap (char[] array, int a, int b) {
		char temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AllPermutationII solution = new AllPermutationII();
		// test case 1:
		String input = "abbc";
		List<String> result = solution.permutation(input);
		System.out.println(result);
	}

}
