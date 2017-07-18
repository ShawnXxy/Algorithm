package dynamicprogramming.algorithm;

public class LargestCross {
	
	public int cross(int[][] matrix) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
			return -1;
		}
		int rows = matrix.length;
		int cols = matrix[0].length;
		int[][] leftUp = leftUp(matrix, rows, cols);
		int[][] rightDown = rightDown(matrix, rows, cols);
		return merge(leftUp, rightDown, rows, cols);
	}
	private int merge(int[][] one, int[][] two, int rows, int cols) {
		int result = 0;
		int[][] temp = new int[rows][cols];
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				temp[r][c] = Math.min(one[r][c], two[r][c]);
				result = Math.max(result, temp[r][c]);
			}
		}
		return result;
	}
	private int[][] leftUp(int[][] matrix, int rows, int cols) {
		int[][] left = new int[rows][cols];
		int[][] up = new int[rows][cols];
		for (int r = 0; r < rows; r++) {
			for (int c = 0; c < cols; c++) {
				if (matrix[r][c] == 1) {
					if (r == 0 && c == 0) { // start at top left corner
						left[r][c] = 1;
						up[r][c] = 1;
					} else if (r == 0) { // at first row, from left to right
						left[r][c] = left[r][c - 1] + 1;
						up[r][c] = 1;
					} else if (c == 0) { // at first col, from top to bottom
						left[r][c] = 1;
						up[r][c] = up[r - 1][c] + 1;
					} else {
						left[r][c] = left[r][c - 1] + 1;
						up[r][c] = up[r - 1][c] + 1;
					}
				}
			}
		}
		merge(left, up, rows, cols);
		return left;
	}
	private int[][] rightDown(int[][] matrix, int rows, int cols) {
		int[][] right = new int[rows][cols];
		int[][] down = new int[rows][cols];
		for (int r = rows - 1; r >= 0; r--) {
			for (int c = cols - 1; c >= 0; c--) {
				if (matrix[r][c] == 1) {
					if (r == rows - 1 && c == cols - 1) {
						right[r][c] = 1;
						down[r][c] = 1;
					} else if (r == rows - 1) {
						right[r][c] = right[r][c + 1] + 1;
						down[r][c] = 1;
					} else if (c == cols - 1) {
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
		// test case 1:
		int[][] matrix = new int[][] {
														{0, 1, 1, 1, 1}, 
														{1, 0, 1, 1, 0},
														{1, 1, 1, 1, 1},
														{1, 1, 1, 0, 0},
														{0, 0, 1, 0, 0}
														};
		int result = solution.cross(matrix);
		System.out.println(result);
	}

}
