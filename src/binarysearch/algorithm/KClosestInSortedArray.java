package binarysearch.algorithm;

public class KClosestInSortedArray {
	
	/**
	 * Time: O(logn + k)
	 * 
	 */
	public int[] kClosest (int[] array, int target, int k) {
		if (array == null || array.length == 0) {
			return new int[0];
		}
		int left = closest(array, target);
		int right = left + 1;
		int[] result = new int[k];
		for (int i = 0; i < k; i++) {
			if (right >= array.length - 1 || left >= 0 && array[right] - target > target - array[left]) {
				result[i] = array[left--];
			} else {
				result[i] = array[right++];
			}
		}
		return result;
	}
	private int closest(int[] array, int target) {
		if (array == null || array.length == 0) {
			return -1;
		}
		int left = 0;
		int right = array.length - 1;
		while (left < right - 1) {
			int mid = (left + right) / 2;
			if (array[mid] == target) {
				return mid;
			} else if (array[mid] < target) {
				left = mid;
			} else {
				right = mid;
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
		KClosestInSortedArray solution = new KClosestInSortedArray();
		// test case 1:
		int[] array = null;
		int target = 4;
		int k = 2;
		int[] result = solution.kClosest(array, target, k);
		System.out.println(result);
		// test case 2:
		array = new int[] {1, 2, 3, 4, 5, 6};
		target = 4;
		k = 2;
		result = solution.kClosest(array, target, k);
		System.out.println(result);
	}

}
