package dynamicprogramming.algorithm;

public class LongestAscendingSubarray {
	
	/*
	 *  Given an unsorted array, find the length of the longest subarray in which the numbers are in ascending order.
	 */

	public int longest(int[] array) {
		if (array == null || array.length == 0) {
			return 0;
		}
		int cur = 1;
		int result = 1;
		for (int i = 1; i < array.length; i++) {
			if (array[i] > array[i - 1]) {
				cur++;
				result = Math.max(result, cur);
			} else {
				cur = 1;
			}
		}
		return result;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestAscendingSubarray solution = new LongestAscendingSubarray();
		// test case 1:
		int[] array = new int[] {5, 4, 3, 2, 1, 0};
		int result = solution.longest(array);
		System.out.println(result);
		// test case 2:
		array = new int[] {0, 1, 2, 3, 4, 5, 6};
		result = solution.longest(array);
		System.out.println(result);
		// test case 3:
		array = new int[] {4, 1, 3, 2, 4, 5, 6};
		result = solution.longest(array);
		System.out.println(result);
		// test case 4:
		array = new int[0];
		result = solution.longest(array);
		System.out.println(result);
		// test case 5:
		array = null;
		result = solution.longest(array);
		System.out.println(result);
	}

}
