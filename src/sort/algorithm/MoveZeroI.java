package sort.algorithm;

import java.util.Arrays;

public class MoveZeroI {

	/*
	 * Move 0s to the end
	 */
	
	public int[] moveZero (int[] array) {
		if (array == null || array.length == 0) {
			return array;
		}
		
		// Solution 1: no orders
//		int index = 0;
//		for (int i = 0; i < array.length; i++) {
//			index = i;
//			for (int j = i; j < array.length; j++) {
//				if (array[j] != 0) { // if move zero to the beginning, array[j] == 0
//					index = j;
//				}
//			}
//			int temp = array[index];
//			array[index] = array[i];
//			array[i] = temp;
//		}
//		return array;
		
		// solution 2: ordered
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] != 0) {
				array[index] = array[i];
				index++;
			}
		}
		for (int j = index; j < array.length; j++) {
			array[j] = 0;
		}
		return array;
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
