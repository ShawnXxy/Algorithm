package stringandhashtable.algorithm;

import java.util.ArrayList;
import java.util.List;

public class CommonNumbersOfTwoSortedArray {
	
	/*
	 *  Find all numbers that appear in both of two sorted arrays (the two arrays are all sorted in ascending order).
	 *  
	 * 
	 */
	
//	public List<Integer> common(List<Integer> a, List<Integer> b) {
//		List<Integer> result = new ArrayList<>();
//		int i = 0;
//		int j = 0;
//		while (i < a.size() && j < b.size()) {
//			if (a.get(i) == b.get(j)) {
//				result.add(a.get(i));
//				i++;
//				j++;
//			} else if (a.get(i) < b.get(j)) {
//				i++; 
//			} else {
//				j++;
//			}
//		}
//		return result;
//	}
	
	public List<Integer> common(int[] a, int[] b) {
		List<Integer> result = new ArrayList<>();
		if (a == null || b == null || a.length == 0 || b.length == 0) {
			return result;
		}
		int i = 0;
		int j = 0;
		while (i < a.length && j < b.length) {
			if (a[i] == b[j]) {
				result.add(a[i]);
				i++;
				j++;
			} else if (a[i] < b[j]) {
				i++;
			} else {
				j++;
			}
		}
		return result;
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
