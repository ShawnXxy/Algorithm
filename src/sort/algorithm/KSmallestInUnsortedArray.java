package sort.algorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KSmallestInUnsortedArray {
	
	public int[] kSmallest(int[] array) {
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		KSmallestInUnsortedArray solution = new KSmallestInUnsortedArray();
		// test case 1
		int[] array = null;
		array = solution.kSmallest(array, 6);
		System.out.println(Arrays.toString(array));
		// test case 2
		array = new int[0];
		array = solution.kSmallest(array, 3);
		System.out.println(Arrays.toString(array));
		// test case 3
		array = new int[] {4, 3, 2, 1};
		array = solution.kSmallest(array, 6);
		System.out.println(Arrays.toString(array));
		// test case 4
		array = new int[] {4, 3, 2, 1};
		array = solution.kSmallest(array, 3);
		System.out.println(Arrays.toString(array));
		// test case 4
		array = new int[] {4, 3, 3, 1, 7, 5, 4, 2, 1};
		array = solution.kSmallest(array, 6);
		System.out.println(Arrays.toString(array));
	}

}
