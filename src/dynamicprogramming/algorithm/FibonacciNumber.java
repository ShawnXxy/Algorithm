package dynamicprogramming.algorithm;

public class FibonacciNumber {

	public long fibonacci (int k) {
		
		// Solution 1: recursion
//		if (k <= 0) return 0;
//		if (k == 1) return 1;
//		return fibonacci(k - 1) + fibonacci(k - 2);
		
		// Solution 2: DP
		if (k <= 0) return 0;
		if (k == 1) return 1;
		long[] result = new long[k + 1];
		result[0] = 0;
		result[1] = 1;
		for (int i = 2; i <= k; i++) {
			result[i] = result[i - 1] + result[i - 2];
		}
		return result[k];
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FibonacciNumber solution = new FibonacciNumber();
		// test case 1:
		int k = 10;
		long result = solution.fibonacci(k);
		System.out.println(result);
		// test case 2:
		k = 0;
		result = solution.fibonacci(k);
		System.out.println(result);
		// test case 2:
		k = 1;
		result = solution.fibonacci(k);
		System.out.println(result);
	}

}
