package tree.algorithm;

public class LargestNumberSmallerThanTarget {
	
	/*
	 * 	In a binary search tree, find the node containing the largest number smaller than the given target number.
	 * 	If there is no such number, return INT_MIN.
	 */
	
	class TreeNode {
		public int key;
		public TreeNode left;
		public TreeNode right;
		public TreeNode (int key) {
			this.key = key;
		}
	 }
	
	public int largestSmaller (TreeNode root, int target) {
		if (root == null) {
			return Integer.MIN_VALUE;
		}
		int result = Integer.MIN_VALUE;
		TreeNode cur = root;
		while (cur != null) {
			if (cur.key < target) {
				result = cur.key;
				cur = cur.right;
			} else {
				cur = cur.left;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
