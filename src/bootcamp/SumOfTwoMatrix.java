package bootcamp;

public class SumOfTwoMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = { {3, 2, 1},
							{3, 4, 4}
		};
		int[][] b = { {-1, 0, -1},
							{4, 2, 1}
		};
		if (a.length != b.length || a[0].length != b[0].length) {
			System.out.println("Cannot sum two matrices with different sizes.");
		} else {
			int m = a.length, n = a[0].length;
			int[][] c = new int[m][n];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < n; j++) {
					c[i][j] = a[i][j] + b[i][j];
				}
			}
			System.out.println(c);
		}
	}

}
