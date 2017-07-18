package depthfirstsearch.algorithm;

import java.util.ArrayList;
import java.util.List;

public class ValidParenthesisI {
	
	/*
	 *  Given N pairs of parentheses ¡°()¡±, return a list with all the valid permutations.
	 *  
	 *  Time: O(2^n) as n levels with 2(add left or right) cases in each level;
	 *  Space: O(n)
	 */
	
	public List<String> parenthesis(int n) {
		List<String> result = new ArrayList<>();
		char[] cur = new char[n + n];
		helper(n, n, 0, result, cur);
		return result;
	}
	private void helper (int left, int right, int index, List<String> result, char[] cur) {
		if (left == 0 && right == 0) {
			result.add(new String(cur));
		}
		if (left != 0) {
			cur[index] = '{';
			helper(left - 1, right, index + 1, result, cur);
		}
		if (right > left) {
			cur[index] = '}';
			helper(left, right - 1, index + 1, result, cur);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ValidParenthesisI solution = new ValidParenthesisI();
		// test case 1:
		int n = 3;
		List<String> result = solution.parenthesis(n);
		System.out.println(result);
	}

}
