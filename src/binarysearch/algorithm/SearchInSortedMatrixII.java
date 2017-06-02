package binarysearch.algorithm;

public class SearchInSortedMatrixII {

	/**
	 * Write an efficient algorithm that searches for a value in an m x n matrix, return the occurrence of it.

				This matrix has the following properties:
				
				Integers in each row are sorted from left to right.
				Integers in each column are sorted from up to bottom.
				No duplicate integers in each row or column.
	 * @param args
	 * 
	 * Space O1
	 * Time O(m + n)
	 */
	
	public int[] search (int[][] matrix, int target) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return new int[] {-1, -1};
		}
		// search from top right corner where is smallest in column and largest in row
		int i = 0;
		int j = matrix[0].length - 1;
		while (i < matrix.length && j >= 0) {
			if (matrix[i][j] == target) {
				return new int[] {i, j};
			} else if (matrix[i][j] < target) {
				j++;
			} else {
				i--;
			}
		}
		return new int[] {-1, -1};
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
