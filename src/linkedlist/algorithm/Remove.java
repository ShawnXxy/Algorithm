package linkedlist.algorithm;

public class Remove {
	
	class ListNode {
		public int key;
		public ListNode next;
		public ListNode(int key) {
			this.key = key;
			next = null;
		}
	}
	
	public ListNode remove(ListNode head, int value) {
		if (head == null) {
			return head;
		} else if (head.key == value) {
			return head.next;
		} else {
			ListNode cur = head;
			while (cur.next != null && cur.next.key != value) {
				cur = cur.next;
			}
			if (cur.next != null) {
				cur.next = cur.next.next;
			}
			return head;
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
