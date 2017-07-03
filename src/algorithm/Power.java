package algorithm;

public class Power {
	
	public long power (int a, int b) {
		if (b < 0) {
			return 1 / power (a, -b);
		} else if (b == 0 || a == 1) {
			return 1;
		} else if (a == 0) {
			return 0;
		}else {
			long half = power(a, b / 2);
			if (b % 2 == 0) {
				return half * half;
			} else {
				return half * half * a;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Power solution = new Power();
		// test case 1:
		int a = 23, b = 234;
		long result = solution.power(a, b);
		System.out.println(result);
	}

}
