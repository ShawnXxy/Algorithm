package algorithm;

public class SpiralOrderI {
	
	/*
	 * Generate an N * N 2D array in spiral order clock-wise starting from the top left corner, using the numbers of 1, 2, 3, бн, N * N in increasing order.
	 */
	
	public int[][] spiralMatrix (int n) {
		int[][] result = new int[n][n];
		int start = 0;
		int end = n - 1;
		int number = 1;
		while (start < end) {
			// top left to right
			for (int i = start; i < end; i++) {
				result[start][i] = number++;
			}
			// right top to bottom
			for (int i = start; i < end; i++) {
				result[i][end] = number++;
			}
			// bottom right to left
			for (int i = end; i > start; i--) {
				result[end][i] = number++;
			}
			// left bottom to top
			for (int i = end; i > start; i--) {
				result[i][start] = number++;
			}
			start++;
			end--;
		}
		if (start == end) {
			result[start][end] = number++;
		}
		return result;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SpiralOrderI solution = new SpiralOrderI();
		// test case 1:
		int n = 10;
		int[][] result = solution.spiralMatrix(n);
		System.out.println(result);
	}

}
