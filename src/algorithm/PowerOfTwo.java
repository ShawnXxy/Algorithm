package algorithm;

public class PowerOfTwo {
	
	/*
	 *  Check if n is power of two
	 */
	
	public boolean isPowerOfTwo (int n) {
		int x = n;
		while (x % 2 == 0) {
			x = x / 2;
		}
		return x == 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
