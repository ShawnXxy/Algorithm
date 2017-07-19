package linkedlist.algorithm;

public class InsertNewNode {
	
	class ListNode {
		public int key;
		public ListNode next;
		public ListNode (int key) {
			this.key = key;
			this.next = null;
		}
	}
	
	public ListNode insert (ListNode head, int value) {
		ListNode newNode = new ListNode(value);
		if (head == null || head.key >= value) {
			newNode.next = head;
			return newNode;
		}
		ListNode cur = head;
		while (cur.next != null && cur.key < value) {
			cur = cur.next;
		}
		newNode.next = cur.next;
		cur.next = newNode;
		return head;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
