package bootcamp;

public class CheckGoldbach {
//Every even integer greater than 2 can be expressed as the sum of two primes
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Goldbach().check();
	}

}

class Goldbach {
	public void check() {
		for (int i = 4; i < 100000000; i += 2) {
			if (!checkEvenNumber(i)) {
				System.out.println("Congratulations! You won the Fields Prize");
				break;
			}
			if (i % 1000 == 0) {
				System.out.println("Holds <= " + i);
			}
		}
	}
	private boolean isPrime (int n) {
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
	private boolean checkEvenNumber (int n) {
		for (int i = 2; i <= n / 2 ; i++) {
			if (isPrime(i) && isPrime(n - i)) {
				return true;
			}
		}
		return false;
	}
}
