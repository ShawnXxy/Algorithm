package dynamicprogramming.algorithm;

public class FibonacciNumber {

	public long fibonacci (int k) {
		
		// solution 1: recursion
//		if (k == 0) {
//			return 0;
//		}
//		if (k == 1) {
//			return 1;
//		}
//		return fibonacci(k - 2) + fibonacci(k - 1);
		
		
		// solution 2: DP
		if (k == 0) {
			return 0;
		}
		if (k == 1) {
			return 1;
		}
		int[] result = new int[k + 1];
		result[0] = 0;
		result[1] = 1;
		for (int i = 2; i <= k; i++) {
			result[i] = result[i - 2] + result[i - 1];
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
