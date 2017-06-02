package binarysearch.algorithm;

public class SearchInSortedMatrixI {

	/**
	 * Search in sorted matrix, each row of the matrix is sorted in ascending	/order, 
	 * and the first element of the row is equals to or larger than the last element of the previous row
	 * 
	 */

	public int[] search(int[][] matrix, int target) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return new int[] { -1, -1 };
		}
		int row = matrix.length;
		int col = matrix[0].length;
		int left = 0;
		int right = row * col - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			int i = mid / col;
			int j = mid % col;
			if (matrix[i][j] == target) {
				return new int[] { i, j };
			} else if (matrix[i][j] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return new int[] { -1, -1 };
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchInSortedMatrixI solution = new SearchInSortedMatrixI();
	}

}
