package stringandhashtable.algorithm;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CommonNumbersOfTwoSortedArray {
	
	/*
	 *  Find all numbers that appear in both of two sorted arrays (the two arrays are all sorted in ascending order).
	 *  
	 * 
	 */
	
	public List<Integer> common(int[] A, int[] B) { 
		List<Integer> result = new ArrayList<>();
		
		// two pointer (if two arrays contains duplicate numbers)
//		if (A == null || B == null || A.length == 0 || B.length == 0) {
//			return result;
//		}
//		int a = 0; 
//		int b = 0;
//		while (a < A.length && b < B.length) {
//			if (A[a] == B[b]) {
//				result.add(A[a]);
//				a++;
//				b++;
//			} else if (A[a] < B[b]) {
//				a++;
//			} else {
//				b++;
//			}
//		}
		
		// HashSet (if no duplicate)
		Set<Integer> set = new HashSet<>();
		for (int i = 0; i < A.length; i++) {
			set.add(A[i]);
		}
		for (int b = 0; b < B.length; b++) {
			if (set.contains(B[b])) {
				result.add(B[b]);
			}
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CommonNumbersOfTwoSortedArray solution = new CommonNumbersOfTwoSortedArray();
		// test case 1
		int[] a = new int[0];
		int[] b = new int[0];
		List<Integer> result = solution.common(a, b);
		System.out.println(result);
		// test case 2
		a = new int[] {1, 2, 3, 4, 5};;
		b = new int[] {1, 2, 3, 4, 5};
		result = solution.common(a, b);
		System.out.println(result);
		// test case 3
		a = new int[] {1, 2, 2, 3, 4, 5, 5};;
		b = new int[] {2, 3, 4};
		result = solution.common(a, b);
		System.out.println(result);
	}

}
