package algorithm;

public class Power {
	
	public long power (int a, int b) {
		if (a == 0 && b == 0) {
			System.out.println("Error: No mathematical meaning as 0 power of 0");
		}
		if (a == 0) {
			return 0;
		}
		if (a == 1 || b == 0) {
			return 1;
		}
		if (b < 0) {
			return 1 / power(a, -b);
		}
		if (b == 1) {
			return a;
		}
		long half = power (a, b / 2);
		if (b % 2 ==0) {
			return half * half;
		} else {
			return half * half * a;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Power solution = new Power();
		// test case 1:
		int a = 2, b = 10;
		long result = solution.power(a, b);
		System.out.println("case 1 " + result);
		// test case 2:
		a = 0;
		b = 0;
		result = solution.power(a, b);
		System.out.println("case 2 " + result);
		// test case 3:
		a = 0;
		b = 1;
		result = solution.power(a, b);
		System.out.println("case 3 " + result);
		// test case 4:
		a = 23423;
		b = 0;
		result = solution.power(a, b);
		System.out.println("case 4 " + result);
		// test case 5:
		a = 100;
		b = -2;
		result = solution.power(a, b);
		System.out.println("case 5 " + result);
	}

}
