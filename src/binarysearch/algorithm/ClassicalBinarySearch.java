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
		ClassicalBinarySearch solution = new ClassicalBinarySearch();
		// test case 1:
		int[] array = null;
		int target = 5;
		int result = solution.binarySearch(array, target);
		System.out.println(result);
		// test case 2:
		array = new int[0];
		target = 5;
		result = solution.binarySearch(array, target);
		System.out.println(result);
		// test case 3:
		array = new int[] {2, 4, 6, 8, 10};
		target = 5;
		result = solution.binarySearch(array, target);
		System.out.println(result);
		// test case 4:
		array = new int[] {2, 4, 5, 6, 8, 10};
		target = 5;
		result = solution.binarySearch(array, target);
		System.out.println(result);
	}

}
