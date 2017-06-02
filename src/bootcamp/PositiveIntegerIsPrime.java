package bootcamp;

public class PositiveIntegerIsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 99;
		boolean isPrime = true;
		for (int i = 2; i <= x; i++)	{
			if (x % i == 0) {
				isPrime = false;
				break;
			}
		}
		System.out.println("Is prime? " + isPrime);
	}

}
