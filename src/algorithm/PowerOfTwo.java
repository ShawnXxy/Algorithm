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
		PowerOfTwo solution = new PowerOfTwo();
		// test case 1:
		int n = 2;
		boolean result = solution.isPowerOfTwo(n);
		System.out.println(result);
		// test case 2:
		n = 2093945;
		result = solution.isPowerOfTwo(n);
		System.out.println(result);
	}

}
