package binarysearch.algorithm;

import java.util.Dictionary;

public class SearchInUnknownSizedSortedArray {
	
	/**
	 * 
	 * Time: 
	 * 		In binarySearch(), O(log_2(%times%*n), in this case, O(log_2(5n));
	 * 		In search(), O(log_5(n))
	 */
	
	public int search (Dictionary dict, int target) {
		if (dict == null) {
			return -1;
		}
		int left = 0; 
		int right = left + 1;
		while (dict.get(right) != null && dict.get(right) < target) {
			left = right;
			right = 5 * right;
		}
		return binarySearch(dict, target, left, right);
	}
	private int binarySearch(Dictionary dict, int target, int left, int right) {
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (dict.get(mid) == null || dict.get(mid) > target) {
				right = mid - 1;
			} else if (dict.get(mid) < target) {
				left = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SearchInUnknownSizedSortedArray solution = new SearchInUnknownSizedSortedArray();
	}

}
