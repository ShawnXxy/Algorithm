package bootcamp;

public class MyHelloWorld {
	public static void main(String[] args) {
//		System.out.println("Hello World!");
		
//		int x = 4;
//		int y = 3;
//		System.out.println("x + y = " + (x + y));
//		System.out.println("x - y = " + (x - y));
//		System.out.println("x * y = " + (x * y));
//		System.out.println("x / y = " + (x / y));
		
//		int x = 11;
//		int y = x;
//		System.out.println(y);
		
//		char x = 'a';
//		char y = '1';
//		char z = '!';
//		System.out.println("x  = " + x + "; y = " + y + "; z = " + z);
		
//		boolean x = true;
//		boolean y = false;
//		System.out.println("x  = " + x + "; y = " + y);
		
//		int x = 11;
//		int y = 11;
//		System.out.println((y == x));
		
//		int x = 1;
//		double y = (double) x;
//		System.out.println("x  = " + x + "; y = " + y);
		
//		double x = 1.9;
//		int y = (int) x;
//		System.out.println("" +  x + "; y = " + y);
		
//		int a = 2, b = 4, c = 8;
//		double result = (double) (a + b / c);
//		System.out.println(result);
		
//		int a = 2, b = 4, c = 8;
//		double result = a + (double) (b) / c;
//		System.out.println(result);
		
//		int a = 2, b = 4, c = 8;
//		double result = a + 1.0 * b / c;
//		System.out.println(result);
		
//		int x = 7;
//		if (x > 0) {
//			System.out.println("x > 0");
//		} else if (x > 5) {
//			System.out.println("x > 5");
//		} else if (x > 10) {
//			System.out.println("x > 10");
//		} else {
//			System.out.println("others");
//		}
		
//		int x = 11;
//		if (x > 0) {
//			System.out.println("x > 0");
//		} 
//		if (x > 5) {
//			System.out.println("x > 5");
//		}
//		if (x > 10) {
//			System.out.println("x > 10");
//		}
//		System.out.println("others");

//		for (int i = 0; i < 10; i++) {
//			System.out.println(i + " ");
//		}
		
//		for (int i = 0; i < 10; i += 3) {
//			System.out.println(i + " ");
//		}
		
//		int i;
//		for ( i = 0; i < 10; i += 3) {
//			System.out.println(i + " ");
//		}
//		System.out.println("The last i is: " +  i);
		
//		int i =  0;
//		while (i < 10) {
//			i = i + 1;
//			if (i == 5) {
//				continue;
//			}
//			System.out.println(i  + " ");
//		}
		
//		int i = 0;
//		for (i  = 0; i < 10; i++) {
//			if (i == 5) {
//				break;
//			}
//			System.out.println(i + " ");
//		}
		
		int [] arr = {2, 13, 5, 6, 7};
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}
		System.out.println(max);
	}
}
	