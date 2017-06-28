package probabilityandsampling;

public class Random7UsingRandom5 {
	
	private int random5() {
		return (int) (Math.random() * 5);
	}
	
	public int random7() {
		while (true) {
			int n = 5 * random5() + random5();
			if (n < 21) {
				return n % 7;
			}
		}
	}
	
		

}
