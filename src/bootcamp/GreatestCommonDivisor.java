package bootcamp;

public class GreatestCommonDivisor {
	public static void main(String[] args) {
		int a = 147, b = 105;
		while ( a != b) {
			if (a > b) {
				a = a - b;
			} else {
				b = b - a;
			}
		}
		System.out.println("GCD is " + a);
	}
}
