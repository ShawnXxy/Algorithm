package bootcamp;

public class InnerProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2, -1, 5, 6, 7};
		int[] b = {-3, 0, 0, 4, 6};
		if (a.length != b.length) {
			System.out.println("Cannot calculate inner product of two vectors of different lengths.");
		} else {
			int innerProduct = 0;
			int n = a.length;
			for (int i = 0; i < n; i++) {
				innerProduct += (a[i] * b[i]);
			}
			System.out.println(innerProduct);
		}
	}

}
