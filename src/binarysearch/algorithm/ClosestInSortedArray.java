package binarysearch.algorithm;

public class ClosestInSortedArray {
	
	public int closest (int[] array, int target) {
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
		ClosestInSortedArray solution = new ClosestInSortedArray();
		// test case 1:
		int[] array = new int[] {2, 4, 6, 8, 10};
		int target = 5;
		int result = solution.closest(array, target);
		System.out.println(result);
		// test case 2:
		array = new int[] {2, 4, 5, 6, 8, 10};
		target = 5;
		result = solution.closest(array, target);
		System.out.println(result);
	}

}
