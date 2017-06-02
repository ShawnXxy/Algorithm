package linkedlist.algorithm;

public class PartitionLinkedList {
	
	/**
	 * Given a linked list and a target value T, partition it such that all nodes less than T are listed before the nodes larger than or equal to target value T. The original relative order of the nodes in each of the two partitions should be preserved.
	 *
	 */
	
	class ListNode {
		public int value;
		public ListNode next;
		public ListNode (int value) {
			this.value = value;
			next = null;
		}
	}
	
	public ListNode partition (ListNode head, int target) {
		if (head == null || head.next == null) {
			return head;
		}
		ListNode smallHead = new ListNode(0);
		ListNode largeHead = new ListNode(0);
		ListNode smallCur = smallHead;
		ListNode largeCur = largeHead;
		while (head != null) {
			if (head.value < target) {
				smallCur.next = head;
				smallCur = smallCur.next;	
			} else {
				largeCur.next = head;
				largeCur = largeCur.next;
			}
			head = head.next;
		}
		smallCur.next = largeHead;
		largeCur.next = null;
		return smallHead.next;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
