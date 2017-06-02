package algorithm;

public class FibonacciNumber {

	public long fibonacci (int k) {
		
		// Solution 1: recursion
		if (k <= 0) return 0;
		if (k == 1) return 1;
		return fibonacci(k - 1) + fibonacci(k - 2);
		
		// Solution 2: DP
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
