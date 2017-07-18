package binarysearch.algorithm;

public class SearchInSortedMatrixI {

	/**
	 * Search in sorted matrix, each row of the matrix is sorted in ascending	/order, 
	 * and the first element of the row is equals to or larger than the last element of the previous row
	 * 
	 * Time: O(lognm) since n rows and m cols
	 * Space: O(1)
	 */

	public int[] search (int[][] matrix, int target) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return new int[] {-1, -1};
		}
		int rows = matrix.length;
		int cols = matrix[0].length;
		int start = 0;
		int end = rows * cols - 1;
		while (start <= end) {
			int mid = (start + end) / 2;
			int row = mid / cols;
			int col = mid % cols;
			if (matrix[row][col] == target) {
				return new int[] {row, col};
			} else if (matrix[row][col] < target) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return new int[] {-1, -1};
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchInSortedMatrixI solution = new SearchInSortedMatrixI();
		// test case 1:
		int[][] matrix = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		int target = 5;
		int[] result = solution.search(matrix, target);
		System.out.println(result);
	}

}
