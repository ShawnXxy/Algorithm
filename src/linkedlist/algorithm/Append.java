package linkedlist.algorithm;

public class Append {
	
	class ListNode {
		public int key;
		public ListNode next;
		public ListNode(int key) {
			this.key = key;
			next = null;
		}
	}
	
	public ListNode appendHead(ListNode head, int value) {
		ListNode newHead = new ListNode(value);
		newHead.next = head;
		return newHead;
	}
	
	public ListNode appendTail(ListNode head, int value) {
		ListNode newNode = new ListNode(value);
		if (head == null) {
			newNode.next = head;
			return newNode;
		}
		ListNode cur = head;
		while (cur.next != null) {
			cur = cur.next;
		}
		cur.next = newNode;
		return head;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
