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
	
	public int[] search(int[][] matrix, int target) {
		if (matrix == null || matrix.length ==0 || matrix[0].length == 0) {
			return new int[] {-1, -1};
		}
		int row = matrix.length;
		int col = matrix[0].length;
		int i = 0;
		int j = col - 1;
		while (i < row && j >= 0) {
			if (matrix[i][j] == target) {
				return new int[] {i, j};
			} else if (matrix[i][j] < target) {
				i++;
			} else {
				j--;
			}
		}
		return new int[] {-1, -1};
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchInSortedMatrixII solution = new SearchInSortedMatrixII();
		// test case 1:
		int[][] matrix = new int[][] {{1, 3, 5}, {2, 4, 6}, {17, 18, 19}};
		int target = 5;
		int[] result = solution.search(matrix, target);
		System.out.println(result);		
	}

}
