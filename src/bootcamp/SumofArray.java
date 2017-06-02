package bootcamp;

public class SumofArray {
	public static void main (String[] args) {
		int[] arr = {2, 13, 5, 6, 7};
		int sum = 0;
		for (int i: arr) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
