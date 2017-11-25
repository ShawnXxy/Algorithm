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
	
	public List<String> subset(String input) {
		List<String> result = new ArrayList<>();
		if (input == null || input.length() == 0) {
			return result;
		}
		StringBuilder newString = new StringBuilder();
		helper (input, result, newString, 0);
		return result;
	}
	private void helper(String input, List<String> result, StringBuilder newString, int index) {
	    
	    
		if (index == input.length()) {
			result.add(newString.toString());
			return;
		}
		
		// Solution 1:
//		for (int i = index; i < input.length(); i++) {
//			newString.append(input.charAt(i));
//			helper (input, result, newString, i + 1);
//			newString.deleteCharAt(newString.length() - 1);
//		}
		
		// Solution 2:
		// if insert current element
		helper(input, result, newString.append(input.charAt(index)), index + 1);
		newString.deleteCharAt(newString.length() - 1);
		// if not insert
		helper(input, result, newString, index + 1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AllSubSetI solution = new AllSubSetI();
		// test case 0:
		String input = "";
		List<String> result = solution.subset(input);
		System.out.println(result);
		// test case 1:
		input = "abc";
		result = solution.subset(input);
		System.out.println(result);
	}

}
