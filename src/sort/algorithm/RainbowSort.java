package sort.algorithm;

import java.util.Arrays;

public class RainbowSort {
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RainbowSort solution = new RainbowSort();
		// test case 1
		int[] array = null;
		array = solution.raibowSort(array);
		System.out.println(Arrays.toString(array));
		// test case 2
		array = new int[0];
		array = solution.raibowSort(array);
		System.out.println(Arrays.toString(array));
		// test case 3
		array = new int[] {1, 1, 1, 1, 1};
		array = solution.raibowSort(array);
		System.out.println(Arrays.toString(array));
		// test case 4
		array = new int[] {1, 1, 0, 0, 1, 1, 1};
		array = solution.raibowSort(array);
		System.out.println(Arrays.toString(array));
		// test case 5
		array = new int[] {1, -1, 0, 1, -1, 0, 1};
		array = solution.raibowSort(array);
		System.out.println(Arrays.toString(array));
	}

}
