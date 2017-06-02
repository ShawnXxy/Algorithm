package bootcamp;

public class CheckFermat {
//No three positive integers a, b, and c satisfy the equation a^n + b^n = c^n for nay integer value of n greater than 2
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Fermat().check(3);
	}

}

class Fermat {
	private static final int LIMIT = 1000;
	public void check (int n) {
		for (int i = 1; i < LIMIT; i++) {
			for (int j = 1; j < LIMIT; j++) {
				if (check(n, i ,j)) {
					System.out.println("Congratulations! You won the Fields prize.");
					return;
				}
			}
		}
		System.out.println("Fermat holds for n = " + n);
	}
	private boolean check (int n, int a, int b) {
		long c = (long) Math.pow(Math.pow(a, n) + Math.pow(b,  n), 1 / n);
		return Math.pow(c,  n) == Math.pow(a, n) + Math.pow(b,  n);
	}
}