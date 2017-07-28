package linkedlist.algorithm;

import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MergeKSortedLinkedList {

	/*
	 * 	Merge K sorted lists into one big sorted list in ascending order.
	 */
	
	class ListNode {
		public int key;
		public ListNode next;
		public ListNode (int key) {
			this.key = key;
		}
	}
	
	public ListNode merge (List<ListNode> listOfLists) {
		PriorityQueue<ListNode> minHeap = new PriorityQueue<>(11, new Comparator<ListNode>() {
			@Override
			public int compare (ListNode one, ListNode two) {
				if (one.key == two.key) {
					return 0;
				}
				if (one.key < two.key) {
					return -1;
				} else {
					return 1;
				}
			}
		});
		for (ListNode node : listOfLists) {
			minHeap.offer(node);
		}
		ListNode dummy = new ListNode(0);
		ListNode cur = dummy;
		while (!minHeap.isEmpty()) {
			cur.next = minHeap.poll();
			if (cur.next.next != null) {
				minHeap.offer(cur.next.next);
			}
			cur = cur.next;
		}
		return dummy.next;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
