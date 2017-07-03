package dynamicprogramming.algorithm;

import java.util.Arrays;

import sort.algorithm.RainbowSort;

public class LargestSubarraySum {
	
	/*
	 *  Given an unsorted integer array, find the subarray that has the greatest sum. Return the sum.
	 */
	
	public int sum (int[] array) {
		// assume array is not null and length is greater than 0
//		if (array == null || array.length == 0) {
//			return array[0];
//		}
		int cur = array[0];
		int longest = array[0];
		for (int i = 1; i < array.length; i++) {
			cur = Math.max(array[i], cur + array[i]);
			longest = Math.max(cur, longest);
		}
		return longest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LargestSubarraySum solution = new LargestSubarraySum();
		// test case 1
//		int[] array = null;
//		int result = solution.sum(array);
//		System.out.println(Arrays.toString(array));
//		// test case 2
//		array = new int[0];
//		result  = solution.sum(array);
//		System.out.println(Arrays.toString(array));
		// test case 3
		int[] array = new int[] {1, 1, 1, 1, 1};
		int result  = solution.sum(array);
		System.out.println(result);
		// test case 4
		array = new int[] {1, 1, 0, 0, 1, 1, 1};
		result = solution.sum(array);
		System.out.println(result);
		// test case 5
		array = new int[] {1, -1, 0, 1, -1, 0, 1};
		result = solution.sum(array);
		System.out.println(result);
	}

}
