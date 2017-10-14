package sort.algorithm;

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
}
