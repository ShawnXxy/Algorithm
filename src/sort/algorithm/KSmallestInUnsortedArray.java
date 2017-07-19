package sort.algorithm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KSmallestInUnsortedArray {
	
	public int[] kSmallest(int[] array, int k) {
		
		if (array == null || array.length == 0 || k > array.length) {
			return new int[0];
		}
		
		// Solution 1: minHeap
//		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
//		for (int i = 0; i < array.length; i++) {
//			minHeap.offer(array[i]);
//		}
//		int[] result = new int[k];
//		for (int i = 0; i < k; i++) {
//			result[i] = minHeap.poll();
//		}
//		return result;
		
		// Solution 2: maxHeap
		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, new Comparator<Integer>() {

			@Override
			public int compare(Integer one, Integer two) {
				// TODO Auto-generated method stub
				if (one.equals(two)) {
					return 0;
				}
				if (one > two) {
					return -1;
				} else {
					return 1;
				}
			}
			
		});
		for (int i = 0; i < array.length; i++) {
			if (maxHeap.size() < k) {
				maxHeap.offer(array[i]);
			} else {
				if (maxHeap.peek() > array[i]) {
					maxHeap.poll();
					maxHeap.offer(array[i]);
				}
			}
		}
		int[] result = new int[k];
		for (int i = k - 1; i >= 0; i--) {
			result[i] = maxHeap.poll();
		}
		return result;
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
