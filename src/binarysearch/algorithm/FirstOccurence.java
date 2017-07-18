package binarysearch.algorithm;

public class FirstOccurence {
	
	public int firstOccurence (int[] array, int target) {
		if (array == null || array.length == 0) {
			return -1;
		}
		int left = 0;
		int right = array.length - 1;
		while (left < right - 1) {
			int mid = (left + right) / 2;
			if (array[mid] == target) {
				right = mid;
			} else if (array[mid] < target) {
				left = mid;
			} else {
				right = mid;
			}
		}
		if (array[left] == target) {
			return left;
		} 
		if (array[right] == target){
			return right;
		}
		return -1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FirstOccurence solution = new FirstOccurence();
		// test case 1:
		int[] array = new int[] {2, 4, 6, 8, 10};
		int target = 5;
		int result = solution.firstOccurence(array, target);
		System.out.println(result);
		// test case 2:
		array = new int[] {2, 4, 5, 8, 10};
		target = 5;
		result = solution.firstOccurence(array, target);
		System.out.println(result);
		// test case 3
		array = new int[] {2, 4, 5, 5, 5, 5, 5, 8, 10};
		target = 5;
		result = solution.firstOccurence(array, target);
		System.out.println(result);
		// test case 4
		array = new int[] {2, 4, 5, 5, 5, 5, 5, 8, 10};
		target = 6;
		result = solution.firstOccurence(array, target);
		System.out.println(result);
		// test case 5
		array = new int[0];
		target = 5;
		result = solution.firstOccurence(array, target);
		System.out.println(result);
		// test case 6
		array = null;
		target = 5;
		result = solution.firstOccurence(array, target);
		System.out.println(result);
	}

}
