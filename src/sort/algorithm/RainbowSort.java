package sort.algorithm;

import java.util.Arrays;

public class RainbowSort {
	
	public int[] raibowSort (int[] array) {
		if (array == null || array.length <= 1) {
			return array;
		}
		int red = 0;
		int green = 0;
		int blue = array.length - 1;
		while (green <= blue) {
			if (array[green] == -1) {
				swap(array, red++, green++);
			} else if (array[green] == 0) {
				green++;
			} else {
				swap(array, green, blue--);
			}
		}
		return array;
	}
	private void swap (int[] array, int a, int b) {
		int temp = array[a];
		array[a] = array[b];
		array[b] = temp;
	}
	
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
