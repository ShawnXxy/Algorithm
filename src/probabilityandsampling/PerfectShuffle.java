package probabilityandsampling;

public class PerfectShuffle {
	
	/*
	 * Given an array of integers (without any duplicates), shuffle the array such that all permutations are equally likely to be generated.
	 * 
	 * 
	 */

	public void shuffle (int[] cards) {
		if (cards == null || cards.length <= 1) {
			return;
		}
		// for each element at index of i, the probability should be 1 /  cards.length 
		// i = 0, p = 1;
		// i = 1, p = 1 / 2;
		// i = 2, p = 1 / 3;
		// ...
		// i = 51, p = 1 / 52;
		
		for (int i = 0; i < cards.length; i++) {
			int probIdx = (int) (Math.random() * i); 
			swap(cards, probIdx + 1, i);
		}
		
	}
	private void swap(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
