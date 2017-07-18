package depthfirstsearch.algorithm;

import java.util.ArrayList;
import java.util.List;

public class NQueens {
	
	/*
	 * Get all valid ways of putting N Queens on an N * N chessboard so that no two Queens threaten each other.
	 */
	
	public List<List<Integer>> queen(int n) {
		List<List<Integer>> result = new ArrayList<>();
		List<Integer> cur = new ArrayList<>();
		helper(n, result, cur);
		return result;
	}
	private void helper(int n, List<List<Integer>> result, List<Integer> cur) {
		if (cur.size() == n) {
			result.add(new ArrayList<Integer>(cur));
			return;
		}
		for (int i = 0; i < n; i++) {
			if (valid(cur, i)) {
				cur.add(i);
				helper(n, result, cur);
				cur.remove(cur.size() - 1);
			}
		}
	}
	private boolean valid(List<Integer> cur, int col) {
		int row = cur.size();
		for (int i = 0; i < row; i++) {
			if (cur.get(i) == col || Math.abs(cur.get(i) - col) == row - i) {
				return false;
			}
		}
		return true;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NQueens solution = new NQueens();
		// test case 1:
		int n = 4;
		List<List<Integer>> result = solution.queen(n);
		System.out.println(result);
	}

}
