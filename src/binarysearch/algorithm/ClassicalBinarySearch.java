package binarysearch.algorithm;

public class ClassicalBinarySearch {
	
	/**
	 * Space: O(1)
	 * Time: O(logn)
	 * 
	 */
	
	public int binarySearch (int[] array, int target) {
		if (array == null || array.length == 0) {
			return -1;
		}
		int left = 0;
		int right = array.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;
			if (array[mid] == target) {
				return mid;
			} else if (array[mid] < target) {
				left = mid + 1; // must +1 to avoid dead loop if only one element in array so there won't be left = mid = right
			} else {
				right = mid - 1; // must -1 to avoid dead loop if only one element in array so there won't be left = mid = right
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
