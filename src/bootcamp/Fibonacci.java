package bootcamp;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10;
		int a = 0, b = 1;
		for (int i = 3; i <= n; i++) {
			int t = a + b;
			a = b;
			b = t;
		}
		System.out.println(b);
	}

}
