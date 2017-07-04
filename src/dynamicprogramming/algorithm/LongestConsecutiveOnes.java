package dynamicprogramming.algorithm;

public class LongestConsecutiveOnes {
	
	/*
	 *  Given an array containing only 0s and 1s, find the length of the longest subarray of consecutive 1s.
	 */
	
	public int longest(int[] array) {
		if (array == null || array.length == 0) {
			return 0;
		}
		int cur = 0; 
		int longest = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 1) {
				cur++;
				longest = Math.max(cur, longest);
			} else {
				cur = 0;
			}
		}
		return longest;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LongestConsecutiveOnes solution = new LongestConsecutiveOnes();
		// test case 1: 
		int[] array = null;
		int result = solution.longest(array);
		System.out.println(result);
		// test case 2: 
		array = new int[0];
		result = solution.longest(array);
		System.out.println(result);
		// test case 3: 
		array = new int[] {0, 1, 0, 1, 0, 1};
		result = solution.longest(array);
		System.out.println(result);
		// test case 4: 
		array = new int[] {0, 1, 0, 1, 1, 1, 1, 1, 1, 0, 1};
		result = solution.longest(array);
		System.out.println(result);
		// test case 5: 
		array = new int[] {0, 0, 0};
		result = solution.longest(array);
		System.out.println(result);
	}

}
