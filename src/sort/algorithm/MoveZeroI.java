package sort.algorithm;

import java.util.Arrays;

public class MoveZeroI {

	// Move 0s to the end
	public int[] moveZero(int[] array) {
		if (array == null || array.length <= 1) {
			return array;
		}

		// Solution 1: order changed
		int nonZero;
		for (int i = 0; i < array.length; i++) {
			nonZero = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] != 0) {
					nonZero = j;
				}
			}
			swap(array, nonZero, i);
		}

		// Solution 2: order not changed
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				array[index++] = array[i];
			}
		}
		for (int j = index; j < array.length; j++) {
			array[j] = 0;
		}

		return array;
	}

	private void swap(int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MoveZeroI solution = new MoveZeroI();
		// test case 1
		int[] array = null;
		array = solution.moveZero(array);
		System.out.println(Arrays.toString(array));
		// test case 2
		array = new int[0];
		array = solution.moveZero(array);
		System.out.println(Arrays.toString(array));
		// test case 3
		array = new int[] { 0, 1, 2, 3, 4 };
		array = solution.moveZero(array);
		System.out.println(Arrays.toString(array));
		// test case 4
		array = new int[] { 4, 3, 2, 1, 0 };
		array = solution.moveZero(array);
		System.out.println(Arrays.toString(array));
		// test case 5
		array = new int[] { 2, 0, 4, 0, 1, 0, 5, 0, 3, 0 };
		array = solution.moveZero(array);
		System.out.println(Arrays.toString(array));
		// test case 6
		array = new int[] { 0, 0, 0, 0, 2, 0, 4, 0, 1, 0, 5, 0, 3, 0 };
		array = solution.moveZero(array);
		System.out.println(Arrays.toString(array));
		// test case 7
		array = new int[] { 2, 4, 1, 5, 3};
		array = solution.moveZero(array);
		System.out.println(Arrays.toString(array));
	}

}
