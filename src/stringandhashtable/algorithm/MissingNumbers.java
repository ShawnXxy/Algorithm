package stringandhashtable.algorithm;

import java.util.HashSet;
import java.util.Set;

public class MissingNumbers {
	
	/*
	 *  Given an integer array of size N - 1, containing all the numbers from 1 to N except one, find the missing number.
	 */
	
	public int number (int[] array) {
		
		// Solution 1: 
//		int sum = 0;
//		int n = array.length + 1;
//		for (int i = 0; i < array.length; i++) {
//			sum = sum + array[i];
//		}
//		int expected = (1 + n) * n / 2;
//		return expected - sum;
		
		// Solution 2:
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < array.length; i++) {
			set.add(array[i]);
		}
		int n = array.length + 1;
		for (int j = 1; j < n; j++) {
			if (!set.contains(j)) {
				return j;
			}
		}
		return n;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MissingNumbers solution = new MissingNumbers();
		// test case 1:
		int[] array = new int[] {1, 2, 3, 4, 6};
		int result = solution.number(array);
		System.out.println(result);
	}

}
