package algorithm;

import java.util.PriorityQueue;

public class KSmallestInUnsortedArray {
	
	public int[] kSmallest (int[] array, int k) {
		if (array == null || array.length == 0 || k == 0) {
			return new int[0];
		}
		
		// Solution 1: minHeap
		// Time: O(n) + O(klogn)
		// As head is a complete binary tree, the time cost to maintain a heap is logn
		PriorityQueue<Integer> minHeap = new PriorityQueue<>();
		for (int i = 0; i < array.length; i++) {
			minHeap.offer(array[i]);
		}
		int[] result = new int[k];
		for (int j = 0; j < k; j++) {
			result[j] = minHeap.poll();
		}
		return result;
		
		// Solution 2: maxHeap
		// Time: O(k) + (n - k)logn
//		PriorityQueue<Integer> maxHeap = new PriorityQueue<>(k, new Comparator<Integer>() {
//			@Override
//			public int compare (Integer obj1, Integer obj2) {
//				if (obj1.equals(obj2)) {
//					return 0;
//				} 
//				if (obj1 > obj2) {
//					return -1;
//				} else {
//					return 1;
//				}
//			}
//		});
//		for (int i = 0; i < array.length; i++) {
//			if (maxHeap.size() < k) {
//				maxHeap.offer(array[i]);
//			} else if (maxHeap.peek() > array[i]) {
//				maxHeap.poll();
//				maxHeap.offer(array[i]);
//			}
//		}
//		int[] result = new int[k];
//		for (int j = k - 1; j >= 0; j--) {
//			result[j] = maxHeap.poll();
//		}
//		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
