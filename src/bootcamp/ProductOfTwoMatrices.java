package bootcamp;

public class ProductOfTwoMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] a = { {3, 2, 1},
						{3, 4, 4}
		};
		int[][] b = { {-1, 0},
						{4, 2},
						{3, 1}
		};
		if (a[0].length != b.length) {
		System.out.println("Cannot calculate product.");
		} else {
			int m = a.length, n = a[0].length, q = b[0].length;
			int[][] c = new int[m][n];
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < q; j++) {
					int t = 0;
					for (int k = 0; k < n; k++) {
						t += a[i][k] * b[k][j];
					}
					c[i][j] = t;
				}
			}
			for (int i = 0; i < m; i++) {
				for (int j = 0; j < q; j++) {
					System.out.println(c[i][j] + " ");
				}
				System.out.println(" ");
			}
		}
	}

}
