package stringandhashtable.algorithm;

import java.util.HashSet;

public class MissingNumbers {
	
	/*
	 *  Given an integer array of size N - 1, containing all the numbers from 1 to N except one, find the missing number.
	 */
	
	public int missingnumber (int[] array) {
		
		// Solution 1: 
//		int sum = 0;
//		// find sum of array
//		for (int i = 0; i < array.length; i++) {
//			sum = sum + array[i];
//		}
//		// array is from 1 to n - 1, so array.length = n - 1
//		// assume no missing number in the array, there should be n elements in the array, which is array.length + 1
//		// 等差数列求和
//		int expectSum = (1 + array.length + 1) * (array.length + 1) / 2;
//		return expectSum - sum;
		
		// Solution 2: Hashtable
		HashSet<Integer> set = new HashSet<>();
		// put each element in this array in Hashset
		for (int i = 0; i < array.length; i++) {
			set.add(array[i]);
		}
		// compare hashset and number series of 1 to N
		for (int j = 1; j < array.length + 1; j++) {
			if (!set.contains(j)) {
				return j;
			}
		}
		// if set doesnt contain any elements, the missing one should be the last one, which is array.length + 1
		return array.length + 1;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
