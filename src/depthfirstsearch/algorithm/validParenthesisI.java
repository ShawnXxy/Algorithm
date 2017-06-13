package depthfirstsearch.algorithm;

import java.util.ArrayList;
import java.util.List;

public class validParenthesisI {
	
	/*
	 *  Given N pairs of parentheses ¡°()¡±, return a list with all the valid permutations.
	 *  
	 *  Time: O(2^n) as n levels with 2(add left or right) cases in each level;
	 *  Space: O(n)
	 */
	
	public List<String> parenthesis (int n) {
		List<String> result = new ArrayList<>();
		char[] cur = new char[2 * n];
		helper(n, n, 0, cur, result);
		return result;
	}
	// left / right means how many left / right parenthesis not added to result yet
	private void helper(int left, int right, int index, char[] cur, List<String> result) {
		if (left == 0 && right == 0) {
			result.add(new String(cur));
		}
		if (left > 0) {
			cur[index] = '(';
			helper(left - 1, right, index + 1, cur, result);
		}
		if (right > left) {
			cur[index] = ')';
			helper(left, right - 1, index + 1, cur, result);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
