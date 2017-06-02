package binarysearch.algorithm;

public class ClosestInSortedArray {
	
	public int closest(int[] array, int target) {
		if (array == null || array.length == 0) {
			return -1;
		}
		int left = 0;
		int right = array.length - 1;
		while (left < right - 1) {
			int mid = left + (right - left) / 2;
			if (array[mid] == target) {
				return mid;
			} else if (array[mid] < target) {
				left = mid; // cannot +1 because mid might be the closest one
			} else {
				right = mid; // cannot -1 because mid might be the closest one
			}
		}
		if (Math.abs(array[left] - target) < Math.abs(array[right] - target)) {
			return left;
		} else {
			return right;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
