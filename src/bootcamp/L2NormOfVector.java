package bootcamp;

public class L2NormOfVector {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2, -1, 5, 6, 7};
		double l2Norm = 0.0;
		for (int i : a) {
			l2Norm += i * i;
		}
		l2Norm = Math.sqrt(l2Norm);
		System.out.println(l2Norm);
	}

}
