package sort.algorithm;

import java.util.Arrays;

public class MoveZeroI {

	/*
	 * Move 0s to the end
	 */
	

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
