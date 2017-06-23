package dynamicprogramming.algorithm;

public class LongestAscendingSubarray {
	
	/*
	 *  Given an unsorted array, find the length of the longest subarray in which the numbers are in ascending order.
	 */

	public int longest(int[] array) {
		if (array == null || array.length == 0) {
			return 0;
		}
		// initialize to 1 as the length will be 1 if no ascending order
		int count = 1;
		int result = 1;
		for (int i = 1; i < array.length; i++) {
			if (array[i] > array[i - 1]) {
				count++;
				result = Math.max(count, result);
			} else {
				count = 1;
			}
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
