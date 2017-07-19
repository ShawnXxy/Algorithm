package linkedlist.algorithm;

public class PartitionLinkedList {
	
	/**
	 * Given a linked list and a target value T, partition it such that all nodes less than T are listed before the nodes larger than or equal to target value T. The original relative order of the nodes in each of the two partitions should be preserved.
	 *
	 */
	
	class ListNode {
		public int key;
		public ListNode next;
		public ListNode (int key) {
			this.key = key;
			this.next = null;
		}
	}
	
	public ListNode partition (ListNode head, int target) {
		ListNode smallHead = new ListNode(0);
		ListNode largeHead = new ListNode(0);
		ListNode small = smallHead;
		ListNode large = largeHead;
		while (head != null && head.next != null) {
			if (head.key < target) {
				small.next = head;
				small = small.next;
			} else {
				large.next = head;
				large = large.next;
			}
			head = head.next;
		}
		small.next = largeHead.next;
		large.next = null;
		return smallHead.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
