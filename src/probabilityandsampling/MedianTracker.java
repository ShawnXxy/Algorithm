package probabilityandsampling;

import java.util.Collections;
import java.util.PriorityQueue;

/*
 *  Given an unlimited flow of numbers, keep track of the median of all elements seen so far.
 *  
 *  Use a minHeap to store larger half of data flow and maxHeap for a smaller half;
 *   In such so the median will be either top of minHeap or maxHeap;
 *   
 *   if length of the data flow is even, minHeap and maxHeap are equal size; or assume the size of smaller half / maxHeap is larger:
 *   maxHeap.size() + 1 = minHeap.size()
 *   
 *   
 */

public class MedianTracker {
	private PriorityQueue<Integer> smallerHalf; // maxHeap
	private PriorityQueue<Integer> largerHalf; // minHeap;
	public MedianTracker() {
		largerHalf = new PriorityQueue<>();
		smallerHalf = new PriorityQueue<>(11, Collections.reverseOrder());
	}
	
	public void read (int value) {
		// push current reading value to smallerHalf / maxHeap first
		// compare value and top of smallerHalf to make sure smallerHalf save the smaller values
		if (smallerHalf.isEmpty() || value <= smallerHalf.size()) {
			smallerHalf.offer(value);
		} else {
			largerHalf.offer(value);
		}
		// if one half is too large
		if (smallerHalf.size() - largerHalf.size() >= 2) {
			largerHalf.offer(smallerHalf.poll());
		} else {
			smallerHalf.offer(largerHalf.poll());
		}
	}
	
	public Double median() {
		int size = smallerHalf.size() + largerHalf.size();
		if (size == 0) {
			return null;
		} else if (size % 2 != 0) {
			return (double) smallerHalf.peek();
		} else {
			return (smallerHalf.peek() + largerHalf.peek()) / 2.0;
		}
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
