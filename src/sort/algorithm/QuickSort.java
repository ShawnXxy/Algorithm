package sort.algorithm;

import java.util.Arrays;

public class QuickSort {
    public int[] sort(int[] array) {
        if (array == null || array.length == 0) {
            return array;
        }
        helper(array, 0, array.length - 1);
        return array;
    }

    private void helper(int[] array, int start, int end) {
        if (start < end) {
            int pivot = array[start];
            int i = start;
            int j = end;
            do {
                while (array[i] < pivot && i < end) {
                    i++;
                }
                while (array[j] > pivot && j > start) {
                    j--;
                }
                if (i <= j) {
                    swap(array, i, j);
                    i++;
                    j--;
                }
            } while (i <= j);
            if (start < j) {
                helper(array, start, j);
            }
            if (end > i) {
                helper(array, i, end);
            }

        }
    }

    private void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }
    
    public static void main(String[] args) {
    	QuickSort solution = new QuickSort();
		// test case 1
		int[] array = null;
		array = solution.sort(array);
		System.out.println(Arrays.toString(array));
		// test case 2
		array = new int[0];
		array = solution.sort(array);
		System.out.println(Arrays.toString(array));
		// test case 3
		array = new int[] { 1, 2, 3, 4 };
		array = solution.sort(array);
		System.out.println(Arrays.toString(array));
		// test case 4
		array = new int[] { 4, 3, 2, 1 };
		array = solution.sort(array);
		System.out.println(Arrays.toString(array));
		// test case 5
		array = new int[] { 2, 4, 1, 5, 3 };
		array = solution.sort(array);
		System.out.println(Arrays.toString(array));
    }
}
