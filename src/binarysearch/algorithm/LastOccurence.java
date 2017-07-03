package binarysearch.algorithm;

public class LastOccurence {
	
	public int lastOccurence (int[] array, int target) {
		if (array == null || array.length == 0) {
			return -1;
		}
		int left = 0;
		int right = array.length - 1;
		while (left < right - 1) {
			int mid = left + (right - left) / 2;
			if (array[mid] == target) {
				left = mid;
			} else if (array[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		if (array[right] == target) {
			return right;
		}
		if (array[left] == target) {
			return left;
		}	
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LastOccurence solution = new LastOccurence();
		// test case 1:
		int[] array = new int[] {2, 4, 6, 8, 10};
		int target = 5;
		int result = solution.lastOccurence(array, target);
		System.out.println(result);
		// test case 2:
		array = new int[] {2, 4, 5, 8, 10};
		target = 5;
		result = solution.lastOccurence(array, target);
		System.out.println(result);
		// test case 3
		array = new int[] {2, 4, 5, 5, 5, 5, 5, 8, 10};
		target = 5;
		result = solution.lastOccurence(array, target);
		System.out.println(result);
		// test case 4
		array = new int[] {2, 4, 5, 5, 5, 5, 5, 8, 10};
		target = 6;
		result = solution.lastOccurence(array, target);
		System.out.println(result);
		// test case 5
		array = new int[0];
		target = 5;
		result = solution.lastOccurence(array, target);
		System.out.println(result);
		// test case 6
		array = null;
		target = 5;
		result = solution.lastOccurence(array, target);
		System.out.println(result);
	}

}
