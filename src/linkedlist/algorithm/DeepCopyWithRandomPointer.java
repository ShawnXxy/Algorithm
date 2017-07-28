package linkedlist.algorithm;

import java.util.HashMap;
import java.util.Map;

public class DeepCopyWithRandomPointer {

	/*
	 * 	Each of the nodes in the linked list has another pointer pointing to a random node in the list or null. Make a deep copy of the original list.
	 */
	
	class RandomListNode {
		public int key;
		public RandomListNode next;
		public RandomListNode random;
		public RandomListNode (int key) {
			this.key = key;
		}
	}
	
	public RandomListNode copy (RandomListNode head) {
		if (head == null) {
			return head;
		}
		Map<RandomListNode, RandomListNode> map = new HashMap<>();
		RandomListNode dummy = new RandomListNode(0);
		RandomListNode cur = dummy;
		while (head != null) {
			if (!map.containsKey(head)) {
				map.put(head, new RandomListNode(head.key));
			}
			cur.next = map.get(head);
			if (head.random != null) {
				if (!map.containsKey(head.random)) {
					map.put(head.random, new RandomListNode(head.random.key));
				}
				cur.next.random = map.get(head.random);
			}
			head = head.next;
			cur =cur.next;
		}
		return dummy.next;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
