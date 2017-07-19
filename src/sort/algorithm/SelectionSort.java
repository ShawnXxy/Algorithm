package sort.algorithm;

import java.util.Arrays;

/**
 * Complexity Analysis:
 * Space:
 * Time: O(n^2)
 * @author ShawnX
 *
 */
public class SelectionSort {
	
	public int[] sort (int[] array) {
		if (array == null || array.length == 0) {
			return array;
		}
		int min = 0;
		for (int i = 0; i < array.length; i++) {
			min = i;
			for (int j = i; j < array.length; j++) {
				if (array[min] > array[j]) {
					min = j;
				}
			}
			int temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}
		return array;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SelectionSort solution = new SelectionSort();
		// test case 1
		int[] array = null;
		array = solution.sort(array);
		System.out.println(Arrays.toString(array));
		// test case 2
		array = new int[0];
		array = solution.sort(array);
		System.out.println(Arrays.toString(array));
		// test case 3
		array = new int[] {1, 2, 3, 4};
		array = solution.sort(array);
		System.out.println(Arrays.toString(array));
		// test case 4
		array = new int[] {4, 3, 2, 1};
		array = solution.sort(array);
		System.out.println(Arrays.toString(array));
		// test case 5
		array = new int[] {2, 4, 1, 5, 3};
		array = solution.sort(array);
		System.out.println(Arrays.toString(array));
	}

	
}
