package dynamicprogramming.algorithm;

public class LargestCross {
	
	public int largest (int[][] matrix) {
		int rows = matrix.length;
		int cols = matrix[0].length;
		if (rows == 0 || cols == 0) {
			return 0;
		}
		int[][] leftUp = leftUp (matrix, rows, cols);
		int[][] rightDown = rightDown(matrix, rows, cols);
		return merge(leftUp, rightDown, rows, cols);
	}
	private int merge(int[][] one, int[][] two, int rows, int cols) {
		int result = 0;
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				one[r][c] = Math.min(one[r][c], two[r][c]);
				result = Math.min(result, one[r][c]);
			}
		}
		return result;
	}
	private int[][] leftUp (int[][] matrix, int rows, int cols) {
		int[][] left = new int[rows][cols];
		int[][] up = new int[rows][cols];
		for (int r = 0; r <rows; r++) {
			for (int c = 0; c < cols; c++) {
				if (matrix[r][c] == 1) {
					if (r == 0 && c == 0) { // at left top corner
						left[r][c] = 1;
						up[r][c] = 1;
					} else if (r == 0) { // at first row
						up[r][c] = 1;
						left[r][c] = left[r][c - 1] + 1;
					} else if (c == 0) { // at first column
						up[r][c] = up[r - 1][c] + 1;
						left[r][c] = 1;
					} else {
						up[r][c] = up[r - 1][c] + 1;
						left[r][c] = left[r][c - 1] + 1;
					}
				}
			}
		}
		merge(left, up, rows, cols);
		return left;
	}
	private int[][] rightDown (int[][] matrix, int rows, int cols) {
		int[][] right = new int[rows][cols];
		int[][] down = new int[rows][cols];
		for (int r = rows - 1; r >= 0; r--) {
			for (int c = cols - 1; c >= 0; c--) {
				if (matrix[r][c] == 1) {
					if (r == rows - 1 && c == cols - 1) {
						right[r][c] = 1;
						down[r][c] = 1;
					} else if (r == rows - 1) { // at last row
						down[r][c] = 1;
						right[r][c] = right[r][c + 1] + 1;
					} else if (c == cols - 1) { // at last column
						right[r][c] = 1;
						down[r][c] = down[r + 1][c] + 1;
					} else {
						right[r][c] = right[r][c + 1] + 1;
						down[r][c] = down[r + 1][c] + 1;
					}
				}
			}
		}
		merge(right, down, rows, cols);
		return right;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargestCross solution = new LargestCross();
		
	}

}
